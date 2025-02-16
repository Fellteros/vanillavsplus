package net.fellter.vanillavsplus.custom_blocks.sponge;

import org.jetbrains.annotations.Nullable;

import net.fellter.vanillavsplus.block.VerticalStairsBlock;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.block.WireOrientation;

public class VerticalSpongeStairsBlock extends VerticalStairsBlock {
	private final Block wet;

	public VerticalSpongeStairsBlock(Block wet, Settings settings) {
		super(settings);
		this.wet = wet;
	}

	protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
		if (!oldState.isOf(state.getBlock())) {
			this.update(world, pos);
		}
	}

	protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, @Nullable WireOrientation wireOrientation, boolean notify) {
		this.update(world, pos);
		super.neighborUpdate(state, world, pos, sourceBlock, wireOrientation, notify);
	}

	protected void update(World world, BlockPos pos) {
		if (this.absorbWater(world, pos)) {
			world.setBlockState(pos, wet.getStateWithProperties(world.getBlockState(pos)).with(WATERLOGGED, false), 2);
			world.playSound(null, pos, SoundEvents.BLOCK_SPONGE_ABSORB, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
	}

	private boolean absorbWater(World world, BlockPos pos) {
		return BlockPos.iterateRecursively(pos, 6, 65, (currentPos, queuer) -> {
			for (Direction direction : DIRECTIONS) {
				queuer.accept(currentPos.offset(direction));
			}
		}, (currentPos) -> {
			if (currentPos.equals(pos)) {
				return BlockPos.IterationState.ACCEPT;
			} else {
				BlockState blockState = world.getBlockState(currentPos);
				FluidState fluidState = world.getFluidState(currentPos);

				if (!fluidState.isIn(FluidTags.WATER)) {
					return BlockPos.IterationState.SKIP;
				} else {
					Block block = blockState.getBlock();

					if (block instanceof FluidDrainable fluidDrainable) {
						if (!fluidDrainable.tryDrainFluid(null, world, currentPos, blockState).isEmpty()) {
							return BlockPos.IterationState.ACCEPT;
						}
					}

					if (blockState.getBlock() instanceof FluidBlock) {
						world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), 3);
					} else {
						if (!blockState.isOf(Blocks.KELP) && !blockState.isOf(Blocks.KELP_PLANT) && !blockState.isOf(Blocks.SEAGRASS) && !blockState.isOf(Blocks.TALL_SEAGRASS)) {
							return BlockPos.IterationState.SKIP;
						}

						BlockEntity blockEntity = blockState.hasBlockEntity() ? world.getBlockEntity(currentPos) : null;
						dropStacks(blockState, world, currentPos, blockEntity);
						world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), 3);
					}

					return BlockPos.IterationState.ACCEPT;
				}
			}
		}) > 1;
	}
}
