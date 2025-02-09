package net.fellter.vanillavsplus.custom_blocks.y15;

import net.fellter.vanillavsplus.block.VerticalSlabBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class VerticalY15SlabBlock extends VerticalSlabBlock {
    public static final VoxelShape NORTH_SHAPE_15 = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 8.0);
    public static final VoxelShape SOUTH_SHAPE_15 = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 15.0, 16.0);
    public static final VoxelShape WEST_SHAPE_15 = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 15.0, 16.0);
    public static final VoxelShape EAST_SHAPE_15 = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 15.0, 16.0);

    public VerticalY15SlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getSidesShape(state, world, pos);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getSidesShape(state, world, pos);
    }

    @Override
    public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        boolean type = state.get(SINGLE);
        Direction direction = state.get(FACING);
        VoxelShape voxelShape;
        if (type) {
            switch (direction) {
                case WEST -> voxelShape = WEST_SHAPE_15.asCuboid();
                case EAST -> voxelShape = EAST_SHAPE_15.asCuboid();
                case SOUTH -> voxelShape = SOUTH_SHAPE_15.asCuboid();
                case NORTH -> voxelShape = NORTH_SHAPE_15.asCuboid();
                default -> throw new MatchException(null, null);
            }
            return voxelShape;
        } else {
            return Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
        }
    }
}
