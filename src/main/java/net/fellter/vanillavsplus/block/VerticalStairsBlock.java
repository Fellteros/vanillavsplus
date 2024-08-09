package net.fellter.vanillavsplus.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class VerticalStairsBlock extends Block implements Waterloggable {
    public static final EnumProperty<VerticalStairShape> SHAPE = EnumProperty.of("vertical_stair_shape", VerticalStairShape.class);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final EnumProperty<BlockSide> SIDE = EnumProperty.of("block_side", BlockSide.class);
    protected static final VoxelShape NORTH_BASE = Block.createCuboidShape(0, 0, 0, 16, 16, 8);
    protected static final VoxelShape SOUTH_BASE = Block.createCuboidShape(0, 0, 8, 16, 16, 16);
    protected static final VoxelShape WEST_BASE = Block.createCuboidShape(0, 0, 0, 8, 16, 16);
    protected static final VoxelShape EAST_BASE = Block.createCuboidShape(8, 0, 0, 16, 16, 16);
    //       E
    //   | 2 | 3 |
    // N |   |   | S
    //   | 1 | 4 |
    //       W
    protected static final VoxelShape BOTTOM_1 = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
    protected static final VoxelShape BOTTOM_4 = Block.createCuboidShape(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
    protected static final VoxelShape TOP_1 = Block.createCuboidShape(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
    protected static final VoxelShape TOP_4 = Block.createCuboidShape(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape BOTTOM_2 = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
    protected static final VoxelShape BOTTOM_3 = Block.createCuboidShape(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
    protected static final VoxelShape TOP_2 = Block.createCuboidShape(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape TOP_3 = Block.createCuboidShape(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
    private final Block baseBlock;

    public VerticalStairsBlock(Settings settings, BlockState baseBlockState) {
        super(settings);
        this.baseBlock = baseBlockState.getBlock();
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(SIDE, BlockSide.LEFT).with(SHAPE, VerticalStairShape.STRAIGHT_LEFT));
    }



    @Override
    public float getBlastResistance() {
        return this.baseBlock.getBlastResistance();
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        VerticalStairShape stairShape = state.get(SHAPE);
        VoxelShape voxelShape;
        if (state.get(SIDE) == BlockSide.LEFT || state.get(SIDE) == BlockSide.RIGHT) {
            switch (direction) {
                case NORTH -> {
                    switch (stairShape) {
                        case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_4, TOP_4);
                        case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_4, TOP_4, TOP_3);
                        case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_4, TOP_4, BOTTOM_3);
                        case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE, TOP_4);
                        case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_4);

                        case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_3, TOP_3);
                        case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_3, TOP_3, TOP_4);
                        case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_3, TOP_3, BOTTOM_4);
                        case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE, TOP_3);
                        case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_3);

                        case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE, TOP_1);
                        case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_1);
                        case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE, TOP_2);
                        case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_2);
                        case null, default -> voxelShape = VoxelShapes.fullCube();
                    }
                }
                case SOUTH -> {
                    switch (stairShape) {
                        case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_2, TOP_2);
                        case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_2, TOP_2, TOP_1);
                        case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_2, TOP_2, BOTTOM_1);
                        case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE, TOP_2);
                        case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_2);

                        case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_1, TOP_1);
                        case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_1, TOP_1, TOP_2);
                        case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_1, TOP_1, BOTTOM_2);
                        case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE, TOP_1);
                        case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_1);

                        case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE, TOP_3);
                        case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_3);
                        case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE, TOP_4);
                        case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_4);
                        case null, default -> voxelShape = VoxelShapes.fullCube();
                    }
                }
                case EAST -> {
                    switch (stairShape) {
                        case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_1, TOP_1);
                        case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_1, TOP_1, TOP_4);
                        case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_1, TOP_1, BOTTOM_4);
                        case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE, TOP_1);
                        case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_1);

                        case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_4, TOP_4);
                        case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_4, TOP_4, TOP_1);
                        case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_4, TOP_4, BOTTOM_1);
                        case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE, TOP_4);
                        case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(EAST_BASE, BOTTOM_4);

                        case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE, TOP_2);
                        case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_2);
                        case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE, TOP_3);
                        case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_3);
                        case null, default -> voxelShape = VoxelShapes.fullCube();
                    }
                }
                case WEST -> {
                    switch (stairShape) {
                        case STRAIGHT_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_3, TOP_3);
                        case INNER_TOP_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_3, TOP_3, TOP_2);
                        case INNER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_3, TOP_3, BOTTOM_2);
                        case OUTER_TOP_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE, TOP_3);
                        case OUTER_BOTTOM_LEFT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_3);

                        case STRAIGHT_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_2, TOP_2);
                        case INNER_TOP_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_2, TOP_2, TOP_3);
                        case INNER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_2, TOP_2, BOTTOM_3);
                        case OUTER_TOP_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE, TOP_2);
                        case OUTER_BOTTOM_RIGHT -> voxelShape = VoxelShapes.union(WEST_BASE, BOTTOM_2);

                        case OUTER_TOP_LEFT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE, TOP_4);
                        case OUTER_BOTTOM_LEFT_R90 -> voxelShape = VoxelShapes.union(NORTH_BASE, BOTTOM_4);
                        case OUTER_TOP_RIGHT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE, TOP_1);
                        case OUTER_BOTTOM_RIGHT_R90 -> voxelShape = VoxelShapes.union(SOUTH_BASE, BOTTOM_1);
                        case null, default -> voxelShape = VoxelShapes.fullCube();
                    }
                }
                case null, default -> voxelShape = VoxelShapes.fullCube();
            }
            return voxelShape;
        } else {
            return VoxelShapes.fullCube();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockPos blockPos = ctx.getBlockPos();
        FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
        BlockState blockState = this.getDefaultState()
                .with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER).with(FACING, direction);
        if (direction == Direction.NORTH && ctx.getHitPos().x - blockPos.getX() < 0.5) {
            return blockState.with(SIDE, BlockSide.LEFT).with(SHAPE, getVerticalStairShape(blockState.with(SIDE, BlockSide.LEFT), ctx.getWorld(), blockPos));
        } else if (direction == Direction.SOUTH && ctx.getHitPos().x - blockPos.getX() > 0.5) {
            return blockState.with(SIDE, BlockSide.LEFT).with(SHAPE, getVerticalStairShape(blockState.with(SIDE, BlockSide.LEFT), ctx.getWorld(), blockPos));
        } else if (direction == Direction.WEST && ctx.getHitPos().z - blockPos.getZ() > 0.5) {
            return blockState.with(SIDE, BlockSide.LEFT).with(SHAPE, getVerticalStairShape(blockState.with(SIDE, BlockSide.LEFT), ctx.getWorld(), blockPos));
        } else if (direction == Direction.EAST && ctx.getHitPos().z - blockPos.getZ() < 0.5) {
            return blockState.with(SIDE, BlockSide.LEFT).with(SHAPE, getVerticalStairShape(blockState.with(SIDE, BlockSide.LEFT), ctx.getWorld(), blockPos));
        } else {
            return blockState.with(SIDE, BlockSide.RIGHT).with(SHAPE, getVerticalStairShape(blockState.with(SIDE, BlockSide.RIGHT), ctx.getWorld(), blockPos));
        }
    }


    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return direction.getAxis().isHorizontal()
                ? state.with(SHAPE, getVerticalStairShape(state, world, pos))
                : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    private static VerticalStairShape getVerticalStairShape(BlockState state, BlockView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        //vepredu od schodu
        BlockState blockState1 = world.getBlockState(pos.offset(direction.getOpposite()));
        //vzadu od schodu
        BlockState blockState2 = world.getBlockState(pos.offset(direction));
        //vpravo od schodu
        BlockState blockState3 = world.getBlockState(pos.offset(direction.rotateYClockwise()));
        //vlevo od schodu
        BlockState blockState4 = world.getBlockState(pos.offset(direction.rotateYCounterclockwise()));


        //vpredu right
        if (isStairs(blockState1) && state.get(SIDE) == BlockSide.RIGHT && blockState1.get(FACING) == direction.rotateYClockwise()) {
            if (blockState1.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.INNER_TOP_RIGHT;
            }
            return VerticalStairShape.INNER_BOTTOM_RIGHT;
        }

        //vpravo right
        if (isStairs(blockState3) && state.get(SIDE) == BlockSide.RIGHT && blockState3.get(FACING) == direction) {
            if (blockState3.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.OUTER_TOP_RIGHT;
            }
            return VerticalStairShape.OUTER_BOTTOM_RIGHT;
        }

        //vzadu right
        if (isStairs(blockState2) && state.get(SIDE) == BlockSide.RIGHT && blockState2.get(FACING) == direction.rotateYClockwise()) {
            if (blockState2.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.OUTER_TOP_LEFT_R90;
            }
            return VerticalStairShape.OUTER_BOTTOM_LEFT_R90;
        }

        //vlevo right
        if (isStairs(blockState4) && state.get(SIDE) == BlockSide.RIGHT && blockState4.get(FACING) == direction) {
            if (blockState4.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.INNER_TOP_RIGHT;
            }
            return VerticalStairShape.INNER_BOTTOM_RIGHT;
        }

        //vpredu left
        if (isStairs(blockState1) && state.get(SIDE) == BlockSide.LEFT && blockState1.get(FACING) == direction.rotateYCounterclockwise()) {
            if (blockState1.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.INNER_TOP_LEFT;
            }
            return VerticalStairShape.INNER_BOTTOM_LEFT;
        }

        //vpravo left
        if (isStairs(blockState3) && state.get(SIDE) == BlockSide.LEFT && blockState3.get(FACING) == direction) {
            if (blockState3.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.INNER_TOP_LEFT;
            }
            return VerticalStairShape.INNER_BOTTOM_LEFT;
        }

        //vzadu left
        if (isStairs(blockState2) && state.get(SIDE) == BlockSide.LEFT && blockState2.get(FACING) == direction.rotateYCounterclockwise()) {
            if (blockState2.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.OUTER_TOP_RIGHT_R90;
            }
            return VerticalStairShape.OUTER_BOTTOM_RIGHT_R90;
        }

        //vlevo left
        if (isStairs(blockState4) && state.get(SIDE) == BlockSide.LEFT && blockState4.get(FACING) == direction) {
            if (blockState4.get(StairsBlock.HALF) == BlockHalf.TOP) {
                return VerticalStairShape.OUTER_TOP_LEFT;
            }
            return VerticalStairShape.OUTER_BOTTOM_LEFT;
        }

        return state.get(SIDE) == BlockSide.LEFT ? VerticalStairShape.STRAIGHT_LEFT : VerticalStairShape.STRAIGHT_RIGHT;
    }


    public static boolean isStairs(BlockState state) {
        return state.getBlock() instanceof StairsBlock;
    }

    @Override
    public boolean canFillWithFluid(@Nullable PlayerEntity player, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return true;
    }

    @Override
    public ItemStack tryDrainFluid(@Nullable PlayerEntity player, WorldAccess world, BlockPos pos, BlockState state) {
        if (state.get(WATERLOGGED)) {
            world.setBlockState(pos, state.with(WATERLOGGED, false), 3);
            if (!state.canPlaceAt(world, pos)) {
                world.breakBlock(pos, true);
            }
            return new ItemStack(Items.WATER_BUCKET);
        } else {
            return ItemStack.EMPTY;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, SIDE, SHAPE, WATERLOGGED);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }
}
