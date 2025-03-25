package net.fellter.vanillavsplus.custom_blocks.ice;

import org.jetbrains.annotations.Nullable;

import net.fellter.vanillavsplus.block.VerticalStairsBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class VerticalIceStairsBlock extends VerticalStairsBlock {
	public VerticalIceStairsBlock(Settings settings) {
		super(settings);
	}

	public static BlockState getMeltedState() {
		return Blocks.WATER.getDefaultState();
	}

	public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
		if (!EnchantmentHelper.hasAnyEnchantmentsIn(tool, EnchantmentTags.PREVENTS_ICE_MELTING)) {
			if (world.getDimension().ultrawarm()) {
				world.removeBlock(pos, false);
				return;
			}

			BlockState blockState = world.getBlockState(pos.down());

			if (blockState.blocksMovement() || blockState.isLiquid()) {
				world.setBlockState(pos, getMeltedState());
			}
		} else {
			super.afterBreak(world, player, pos, state, blockEntity, tool);
		}
	}

	protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (world.getLightLevel(LightType.BLOCK, pos) > 11 - state.getOpacity()) {
			this.melt(state, world, pos);
		}
	}

	protected void melt(BlockState state, World world, BlockPos pos) {
		if (world.getDimension().ultrawarm()) {
			world.removeBlock(pos, false);
		} else {
			world.setBlockState(pos, getMeltedState());
			world.updateNeighbor(pos, getMeltedState().getBlock(), null);
		}
	}
}
