package net.fellter.vanillavsplus.custom_blocks.redstone;

import net.fellter.vanillavsplus.block.VerticalSlabBlock;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class VerticalRedstoneSlabBlock extends VerticalSlabBlock {
    public VerticalRedstoneSlabBlock(Settings settings) {
        super(settings);
    }

    protected boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    protected int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}
