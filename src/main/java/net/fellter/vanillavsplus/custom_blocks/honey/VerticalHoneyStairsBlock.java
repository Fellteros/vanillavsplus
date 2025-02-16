package net.fellter.vanillavsplus.custom_blocks.honey;

import net.fellter.vanillavsplus.block.VerticalStairsBlock;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.vehicle.AbstractBoatEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class VerticalHoneyStairsBlock extends VerticalStairsBlock {
	public VerticalHoneyStairsBlock(Settings settings) {
		super(settings);
	}

	private static boolean hasHoneyBlockEffects(Entity entity) {
		return entity instanceof LivingEntity || entity instanceof AbstractMinecartEntity || entity instanceof TntEntity || entity instanceof AbstractBoatEntity;
	}

	public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
		entity.playSound(SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 1.0F, 1.0F);

		if (!world.isClient) {
			world.sendEntityStatus(entity, (byte) 54);
		}

		if (entity.handleFallDamage(fallDistance, 0.2F, world.getDamageSources().fall())) {
			entity.playSound(this.soundGroup.getFallSound(), this.soundGroup.getVolume() * 0.5F, this.soundGroup.getPitch() * 0.75F);
		}
	}

	protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
		if (this.isSliding(pos, entity)) {
			this.triggerAdvancement(entity, pos);
			this.updateSlidingVelocity(entity);
			this.addCollisionEffects(world, entity);
		}

		super.onEntityCollision(state, world, pos, entity);
	}

	private static double method_65067(double d) {
		return d / 0.9800000190734863 + 0.08;
	}

	private static double method_65068() {
		return (-0.05 - 0.08) * 0.9800000190734863;
	}

	private boolean isSliding(BlockPos pos, Entity entity) {
		if (entity.isOnGround()) {
			return false;
		} else if (entity.getY() > (double) pos.getY() + 0.9375 - 1.0E-7) {
			return false;
		} else if (method_65067(entity.getVelocity().y) >= -0.08) {
			return false;
		} else {
			double d = Math.abs((double) pos.getX() + 0.5 - entity.getX());
			double e = Math.abs((double) pos.getZ() + 0.5 - entity.getZ());
			double f = 0.4375 + (double) (entity.getWidth() / 2.0F);
			return d + 1.0E-7 > f || e + 1.0E-7 > f;
		}
	}

	private void triggerAdvancement(Entity entity, BlockPos pos) {
		if (entity instanceof ServerPlayerEntity && entity.getWorld().getTime() % 20L == 0L) {
			Criteria.SLIDE_DOWN_BLOCK.trigger((ServerPlayerEntity) entity, entity.getWorld().getBlockState(pos));
		}
	}

	private void updateSlidingVelocity(Entity entity) {
		Vec3d vec3d = entity.getVelocity();

		if (method_65067(entity.getVelocity().y) < -0.13) {
			double d = -0.05 / method_65067(entity.getVelocity().y);
			entity.setVelocity(new Vec3d(vec3d.x * d, method_65068(), vec3d.z * d));
		} else {
			entity.setVelocity(new Vec3d(vec3d.x, method_65068(), vec3d.z));
		}

		entity.onLanding();
	}

	private void addCollisionEffects(World world, Entity entity) {
		if (hasHoneyBlockEffects(entity)) {
			if (world.random.nextInt(5) == 0) {
				entity.playSound(SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 1.0F, 1.0F);
			}

			if (!world.isClient && world.random.nextInt(5) == 0) {
				world.sendEntityStatus(entity, (byte) 53);
			}
		}
	}
}
