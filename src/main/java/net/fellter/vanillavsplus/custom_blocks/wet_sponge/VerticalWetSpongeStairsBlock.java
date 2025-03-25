package net.fellter.vanillavsplus.custom_blocks.wet_sponge;

import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;

import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class VerticalWetSpongeStairsBlock extends VerticalStairsBlock {
	public VerticalWetSpongeStairsBlock(Settings settings) {
		super(settings);
	}

	protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
		if (world.getDimension().ultrawarm()) {
			world.setBlockState(pos, ModBlocks.VERTICAL_SPONGE_STAIRS.getStateWithProperties(state), 3);
			world.syncWorldEvent(2009, pos, 0);
			world.playSound(null, pos, SoundEvents.BLOCK_WET_SPONGE_DRIES, SoundCategory.BLOCKS, 1.0F, (1.0F + world.getRandom().nextFloat() * 0.2F) * 0.7F);
		}
	}

	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		Direction direction = Direction.random(random);

		if (direction != Direction.UP) {
			BlockPos blockPos = pos.offset(direction);
			BlockState blockState = world.getBlockState(blockPos);

			if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
				double d = pos.getX();
				double e = pos.getY();
				double f = pos.getZ();

				if (direction == Direction.DOWN) {
					e -= 0.05;
					d += random.nextDouble();
					f += random.nextDouble();
				} else {
					e += random.nextDouble() * 0.8;

					if (direction.getAxis() == Direction.Axis.X) {
						f += random.nextDouble();

						if (direction == Direction.EAST) {
							++d;
						} else {
							d += 0.05;
						}
					} else {
						d += random.nextDouble();

						if (direction == Direction.SOUTH) {
							++f;
						} else {
							f += 0.05;
						}
					}
				}

				world.addParticleClient(ParticleTypes.DRIPPING_WATER, d, e, f, 0.0, 0.0, 0.0);
			}
		}
	}
}
