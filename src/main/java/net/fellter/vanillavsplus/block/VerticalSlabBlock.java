package net.fellter.vanillavsplus.block;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class VerticalSlabBlock extends Block implements Waterloggable {
    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final BooleanProperty SINGLE = BooleanProperty.of("single");
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public VerticalSlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false).with(SINGLE, true).with(FACING, Direction.NORTH));
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }


    @Override
    public boolean canFillWithFluid(@Nullable PlayerEntity player, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.get(SINGLE);
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
        if (!state.get(SINGLE)) {
            return Fluids.EMPTY.getDefaultState();
        } else {
            return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
        }
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos pos = ctx.getBlockPos();
        FluidState fluidState = ctx.getWorld().getFluidState(pos);
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockState state = ctx.getWorld().getBlockState(pos);
        BlockState state2 = Objects.requireNonNull(super.getPlacementState(ctx)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        if (state.isOf(this) && state.get(FACING) == ctx.getSide().getOpposite()) {
            return state.isOf(this) ? state2.with(SINGLE, false).with(WATERLOGGED, false) : super.getPlacementState(ctx);
        }

        if (direction == Direction.NORTH && ctx.getHitPos().z - pos.getZ() > 0.5) {
            return state2.with(FACING, Direction.SOUTH).with(SINGLE, true);
        } else if (direction == Direction.SOUTH && ctx.getHitPos().z - pos.getZ() < 0.5) {
            return state2.with(FACING, Direction.NORTH).with(SINGLE, true);
        } else if (direction == Direction.WEST && ctx.getHitPos().x - pos.getX() > 0.5) {
            return state2.with(FACING, Direction.EAST).with(SINGLE, true);
        } else if (direction == Direction.EAST && ctx.getHitPos().x - pos.getX() < 0.5) {
            return state2.with(FACING, Direction.WEST).with(SINGLE, true);
        } else {
            return state2.with(FACING, direction);
        }
    }

    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        Direction direction = state.get(FACING);
        if (context.getStack().isOf(this.asItem()) && state.get(SINGLE)) {
            if (context.canReplaceExisting()) {
                return context.getSide().getOpposite() == direction;
            }
        }
        return false;
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
        boolean type = state.get(SINGLE);
        Direction direction = state.get(FACING);
        VoxelShape voxelShape;
        if (type) {
            switch (direction) {
                case WEST -> voxelShape = WEST_SHAPE.asCuboid();
                case EAST -> voxelShape = EAST_SHAPE.asCuboid();
                case SOUTH -> voxelShape = SOUTH_SHAPE.asCuboid();
                case NORTH -> voxelShape = NORTH_SHAPE.asCuboid();
                default -> throw new MatchException(null, null);
            }
            return voxelShape;
        } else {
            return VoxelShapes.fullCube();
        }
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (!state.get(SINGLE)) {
            return VoxelShapes.fullCube();
        } else {
            return switch (direction) {
                case NORTH -> NORTH_SHAPE;
                case SOUTH -> SOUTH_SHAPE;
                case WEST -> WEST_SHAPE;
                case EAST -> EAST_SHAPE;
                default -> throw new MatchException(null, null);
            };
        }
    }

    @Override
    public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        if (!state.get(SINGLE)) {
            return VoxelShapes.fullCube();
        } else {
            return switch (direction) {
                case NORTH -> NORTH_SHAPE;
                case SOUTH -> SOUTH_SHAPE;
                case WEST -> WEST_SHAPE;
                case EAST -> EAST_SHAPE;
                default -> throw new MatchException(null, null);
            };
        }
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (state.get(SINGLE)) {
            return VoxelShapes.fullCube();
        } else {
            return switch (direction) {
                case NORTH -> NORTH_SHAPE;
                case SOUTH -> SOUTH_SHAPE;
                case WEST -> WEST_SHAPE;
                case EAST -> EAST_SHAPE;
                default -> throw new MatchException(null, null);

            };
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, SINGLE, FACING);
    }


}
