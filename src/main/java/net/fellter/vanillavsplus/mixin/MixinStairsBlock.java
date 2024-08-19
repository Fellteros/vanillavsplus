package net.fellter.vanillavsplus.mixin;

import net.fellter.vanillavsplus.block.BlockSide;
import net.fellter.vanillavsplus.block.VerticalStairShape;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(StairsBlock.class)
public abstract class MixinStairsBlock extends Block {

    @Shadow @Final public static DirectionProperty FACING;

    @Shadow @Final public static EnumProperty<BlockHalf> HALF;

    @Shadow @Final public static EnumProperty<StairShape> SHAPE;

    @Shadow @Final public static BooleanProperty WATERLOGGED;


    public MixinStairsBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH).with(HALF, BlockHalf.BOTTOM).with(SHAPE, StairShape.STRAIGHT).with(WATERLOGGED, false));
    }

    @Inject(method = "getPlacementState", at = @At("TAIL"), cancellable = true)
    public void getPlacementState(ItemPlacementContext ctx, CallbackInfoReturnable<BlockState> cir) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState upState = ctx.getWorld().getBlockState(blockPos.up());
        BlockState downState = ctx.getWorld().getBlockState(blockPos.down());
        Direction direction = ctx.getSide();
        FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
        BlockState blockState = this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing())
                .with(HALF, direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitPos().y - (double)blockPos.getY() > 0.5)) ? BlockHalf.BOTTOM : BlockHalf.TOP).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);



        if (isVerticalStairs(upState) || isVerticalStairs(downState)) {
            cir.setReturnValue(blockState.with(SHAPE, fellter$getStairShape(blockState, ctx.getWorld(), blockPos)));
        }
    }

    @Inject(method = "getStateForNeighborUpdate", at = @At("TAIL"), cancellable = true)
    private void getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos, CallbackInfoReturnable<BlockState> cir){
        BlockState upState = world.getBlockState(pos.up());
        BlockState downState = world.getBlockState(pos.down());

        if (isVerticalStairs(upState) || isVerticalStairs(downState)) {
            cir.setReturnValue(state.with(SHAPE, fellter$getStairShape(state, world, pos)));
        }

        if (!isVerticalStairs(upState) || !isVerticalStairs(downState)) {
            cir.setReturnValue(state.with(SHAPE, fellter$getStairShape(state, world, pos)));
        }


    }




    @Unique
    private static StairShape fellter$getStairShape(BlockState state, BlockView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        BlockState upState = world.getBlockState(pos.up());
        BlockState downState = world.getBlockState(pos.down());

        if ((state.get(SHAPE) == StairShape.STRAIGHT) || state.get(SHAPE) == StairShape.INNER_LEFT || state.get(SHAPE) == StairShape.INNER_RIGHT) {


            if (isVerticalStairs(upState) && !VerticalStairsBlock.isOuterShape(upState)) {
                if (isVerticalStairs(upState) && upState.get(FACING) == direction && state.get(HALF) == BlockHalf.BOTTOM) {
                    if (upState.get(VerticalStairsBlock.SIDE) == BlockSide.LEFT) {
                        return StairShape.INNER_LEFT;
                    }
                    return StairShape.INNER_RIGHT;
                }

                if (isVerticalStairs(upState) && upState.get(FACING) == direction.rotateYClockwise() && state.get(HALF) == BlockHalf.BOTTOM) {
                    if (upState.get(VerticalStairsBlock.SIDE) == BlockSide.LEFT) {
                        return StairShape.INNER_RIGHT;
                    }
                    return StairShape.STRAIGHT;
                }

                if (isVerticalStairs(upState) && upState.get(FACING) == direction.rotateYCounterclockwise() && state.get(HALF) == BlockHalf.BOTTOM) {
                    if (upState.get(VerticalStairsBlock.SIDE) == BlockSide.RIGHT) {
                        return StairShape.INNER_LEFT;
                    }
                    return StairShape.STRAIGHT;
                }
            }


            if (isVerticalStairs(downState) && !VerticalStairsBlock.isOuterShape(downState)) {
                if (isVerticalStairs(downState) && downState.get(FACING) == direction && state.get(HALF) == BlockHalf.TOP) {
                    if (downState.get(VerticalStairsBlock.SIDE) == BlockSide.LEFT) {
                        return StairShape.INNER_LEFT;
                    }
                    return StairShape.INNER_RIGHT;
                }

                if (isVerticalStairs(downState) && downState.get(FACING) == direction.rotateYClockwise() && state.get(HALF) == BlockHalf.TOP) {
                    if (downState.get(VerticalStairsBlock.SIDE) == BlockSide.LEFT) {
                        return StairShape.INNER_RIGHT;
                    }
                    return StairShape.STRAIGHT;
                }

                if (isVerticalStairs(downState) && downState.get(FACING) == direction.rotateYCounterclockwise() && state.get(HALF) == BlockHalf.TOP) {
                    if (downState.get(VerticalStairsBlock.SIDE) == BlockSide.RIGHT) {
                        return StairShape.INNER_LEFT;
                    }
                    return StairShape.STRAIGHT;
                }
            }
        }



        return StairShape.STRAIGHT;
    }


    @Inject(method = "getStairShape", at = @At("HEAD"), cancellable = true)
    private static void getStairShape(BlockState state, BlockView world, BlockPos pos, CallbackInfoReturnable<StairShape> cir) {
        BlockState upState = world.getBlockState(pos.up());
        BlockState downState = world.getBlockState(pos.down());

        if (isVerticalStairs(upState) || isVerticalStairs(downState)) {
            cir.setReturnValue(fellter$getStairShape(state, world, pos));
        } else if (!isVerticalStairs(upState) || !isVerticalStairs(downState)) {
            cir.setReturnValue(fellter$getStairShape(state, world, pos));
        }
    }





    @Unique
    private static boolean isVerticalStairs(BlockState state) {
        return state.getBlock() instanceof VerticalStairsBlock;
    }
}
