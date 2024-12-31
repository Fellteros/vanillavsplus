package net.fellter.vanillavsplus.custom_blocks.flattenable;

import net.fellter.vanillavsplus.custom_blocks.y15.VerticalY15StairsBlock;
import net.fellter.vanillavsplus.registry.ModRegistries;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

public class VerticalFlattenableStairsBlock extends VerticalY15StairsBlock {
    public VerticalFlattenableStairsBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (direction == Direction.UP) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        setToDirt(null, state, world, pos);
    }

    public void setToDirt(@Nullable Entity entity, BlockState from, World world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        BlockState state = pushEntitiesUpBeforeBlockChange(from, ModRegistries.FLATTENED_TO_BLOCK_MAP.get(blockState.getBlock()).getBlock().getStateWithProperties(blockState), world, pos);
        world.setBlockState(pos, state);
        world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(entity, state));
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (world.getBlockState(pos.up()).isSolid()) {
            world.scheduleBlockTick(pos, this, 1);
        }
    }


}
