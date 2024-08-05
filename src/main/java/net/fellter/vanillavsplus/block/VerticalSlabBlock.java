package net.fellter.vanillavsplus.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
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
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class VerticalSlabBlock extends Block implements Waterloggable {
    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final EnumProperty<VerticalSlabType> VERTICAL_SLAB_TYPE = EnumProperty.of("vertical_slab_type", VerticalSlabType.class);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public VerticalSlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false).with(VERTICAL_SLAB_TYPE, VerticalSlabType.SINGLE).with(FACING, Direction.NORTH));
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }


    @Override
    public boolean canFillWithFluid(@Nullable PlayerEntity player, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.get(VERTICAL_SLAB_TYPE) == VerticalSlabType.SINGLE;
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

    protected FluidState getFluidState(BlockState state) {
        if (state.get(VERTICAL_SLAB_TYPE) == VerticalSlabType.DOUBLE) {
            return Fluids.EMPTY.getDefaultState();
        } else {
            return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
        }
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);
        Direction direction = ctx.getHorizontalPlayerFacing();
        if (blockState.isOf(this)) {
            return blockState.with(VERTICAL_SLAB_TYPE, VerticalSlabType.DOUBLE);
        } else {
            FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
            return blockPos.getX() > 0.5 ? Objects.requireNonNull(super.getPlacementState(ctx)).with(FACING, direction).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER) :
                    Objects.requireNonNull(super.getPlacementState(ctx)).with(FACING, direction.rotateClockwise(Direction.Axis.Y)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        }
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VerticalSlabType slabType = state.get(VERTICAL_SLAB_TYPE);
        Direction direction = state.get(FACING);
        VoxelShape voxelShape;
        return switch (slabType) {
            case DOUBLE -> Block.createCuboidShape(0, 0, 0, 16, 16, 16);
            case SINGLE -> {
                switch (direction) {
                    case WEST -> voxelShape = WEST_SHAPE.asCuboid();
                    case EAST -> voxelShape = EAST_SHAPE.asCuboid();
                    case SOUTH -> voxelShape = SOUTH_SHAPE.asCuboid();
                    case NORTH -> voxelShape = NORTH_SHAPE.asCuboid();
                    default -> throw new MatchException(null, null);
                }
                yield voxelShape;
            }
        };
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (state.get(VERTICAL_SLAB_TYPE) == VerticalSlabType.DOUBLE) {
            return VoxelShapes.fullCube();
        }
        return switch (direction) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> throw new MatchException(null, null);
        };
    }

    @Override
    public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        if (state.get(VERTICAL_SLAB_TYPE) == VerticalSlabType.DOUBLE) {
            return VoxelShapes.fullCube();
        }
        return switch (direction) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> throw new MatchException(null, null);
        };
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (state.get(VERTICAL_SLAB_TYPE) == VerticalSlabType.DOUBLE) {
            return VoxelShapes.fullCube();
        }
        return switch (direction) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> throw new MatchException(null, null);
        };
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, VERTICAL_SLAB_TYPE, FACING);
    }


}
