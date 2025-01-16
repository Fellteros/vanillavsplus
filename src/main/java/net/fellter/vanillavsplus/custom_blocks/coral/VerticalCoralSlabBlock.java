package net.fellter.vanillavsplus.custom_blocks.coral;

import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

public class VerticalCoralSlabBlock extends VerticalSlabBlock {
    private final Block dead;

    public VerticalCoralSlabBlock(Block dead, Settings settings) {
        super(settings);
        this.dead = dead;
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!this.isInWater(world, pos)) {
            world.setBlockState(pos, this.dead.getStateWithProperties(state), 2);
        }

    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (!this.isInWater(world, pos)) {
            tickView.scheduleBlockTick(pos, this, 60 + random.nextInt(40));
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected boolean isInWater(BlockView world, BlockPos pos) {
        Direction[] var3 = Direction.values();

        for (Direction direction : var3) {
            FluidState fluidState = world.getFluidState(pos.offset(direction));
            if (fluidState.isIn(FluidTags.WATER)) {
                return true;
            }
        }

        return false;
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        if (!this.isInWater(ctx.getWorld(), ctx.getBlockPos())) {
            ctx.getWorld().scheduleBlockTick(ctx.getBlockPos(), this, 60 + ctx.getWorld().getRandom().nextInt(40));
        }

        return super.getPlacementState(ctx);
    }


}
