package net.fellter.vanillavsplus.custom_blocks.y15;

import net.fellter.vanillavsplus.block.BlockSide;
import net.fellter.vanillavsplus.block.VerticalStairShape;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class VerticalY15StairsBlock extends VerticalStairsBlock {
	protected static final VoxelShape TOP_1_15 = Block.createCuboidShape(0.0, 8.0, 0.0, 8.0, 15.0, 8.0);
	protected static final VoxelShape TOP_4_15 = Block.createCuboidShape(0.0, 8.0, 8.0, 8.0, 15.0, 16.0);
	protected static final VoxelShape TOP_2_15 = Block.createCuboidShape(8.0, 8.0, 0.0, 16.0, 15.0, 8.0);
	protected static final VoxelShape TOP_3_15 = Block.createCuboidShape(8.0, 8.0, 8.0, 16.0, 15.0, 16.0);
	protected static final VoxelShape NORTH_BASE_15 = Block.createCuboidShape(0, 0, 0, 16, 15, 8);
	protected static final VoxelShape SOUTH_BASE_15 = Block.createCuboidShape(0, 0, 8, 16, 15, 16);
	protected static final VoxelShape WEST_BASE_15 = Block.createCuboidShape(0, 0, 0, 8, 15, 16);
	protected static final VoxelShape EAST_BASE_15 = Block.createCuboidShape(8, 0, 0, 16, 15, 16);

	public VerticalY15StairsBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
		Direction direction = state.get(FACING);
		VerticalStairShape stairShape = state.get(SHAPE);
		VoxelShape voxelShape;

		if (state.get(SIDE) == BlockSide.LEFT || state.get(SIDE) == BlockSide.RIGHT) {
			switch (direction) {
				case NORTH -> {
					switch (stairShape) {
						case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_4, TOP_4_15);
						case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_4, TOP_4_15, TOP_3_15);
						case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_4, TOP_4_15, BOTTOM_3);
						case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, TOP_4_15);
						case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_4);

						case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_3, TOP_3_15);
						case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_3, TOP_3_15, TOP_4_15);
						case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_3, TOP_3_15, BOTTOM_4);
						case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, TOP_3_15);
						case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_3);

						case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE_15, TOP_1_15);
						case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_1);
						case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE_15, TOP_2_15);
						case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_2);
						case null, default -> voxelShape = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
					}
				}
				case SOUTH -> {
					switch (stairShape) {
						case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_2, TOP_2_15);
						case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_2, TOP_2_15, TOP_1_15);
						case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_2, TOP_2_15, BOTTOM_1);
						case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, TOP_2_15);
						case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_2);

						case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_1, TOP_1_15);
						case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_1, TOP_1_15, TOP_2_15);
						case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_1, TOP_1_15, BOTTOM_2);
						case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, TOP_1_15);
						case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_1);

						case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE_15, TOP_3_15);
						case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_3);
						case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE_15, TOP_4_15);
						case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_4);
						case null, default -> voxelShape = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
					}
				}
				case EAST -> {
					switch (stairShape) {
						case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_1, TOP_1_15);
						case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_1, TOP_1_15, TOP_4_15);
						case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_1, TOP_1_15, BOTTOM_4);
						case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE_15, TOP_1_15);
						case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_1);

						case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_4, TOP_4_15);
						case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_4, TOP_4_15, TOP_1_15);
						case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_4, TOP_4_15, BOTTOM_1);
						case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE_15, TOP_4_15);
						case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE_15, BOTTOM_4);

						case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, TOP_2_15);
						case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_2);
						case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE_15, TOP_3_15);
						case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_3);
						case null, default -> voxelShape = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
					}
				}
				case WEST -> {
					switch (stairShape) {
						case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_3, TOP_3_15);
						case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_3, TOP_3_15, TOP_2_15);
						case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_3, TOP_3_15, BOTTOM_2);
						case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE_15, TOP_3_15);
						case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_3);

						case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_2, TOP_2_15);
						case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_2, TOP_2_15, TOP_3_15);
						case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_2, TOP_2_15, BOTTOM_3);
						case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE_15, TOP_2_15);
						case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE_15, BOTTOM_2);

						case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE_15, TOP_4_15);
						case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE_15, BOTTOM_4);
						case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, TOP_1_15);
						case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE_15, BOTTOM_1);
						case null, default -> voxelShape = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
					}
				}
				case null, default -> voxelShape = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
			}

			return voxelShape;
		} else {
			return Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
		}
	}

	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.getSidesShape(state, world, pos);
	}

	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.getSidesShape(state, world, pos);
	}
}
