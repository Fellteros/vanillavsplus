package net.fellter.vanillavsplus.custom_blocks.stained_glass;

import net.fellter.vanillavsplus.custom_blocks.glass.VerticalGlassSlabBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.Stainable;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.Direction;

public class VerticalStainedGlassSlabBlock extends VerticalGlassSlabBlock implements Stainable {
	private final DyeColor color;

	public VerticalStainedGlassSlabBlock(DyeColor color, Settings settings) {
		super(settings);
		this.color = color;
	}

	@Override
	public DyeColor getColor() {
		return this.color;
	}

	@Override
	protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
		if (stateFrom.getBlock() instanceof Stainable stainable) {
			return stainable.getColor() == color && super.isSideInvisible(state, stateFrom, direction);
		}
		return false;
	}
}
