package net.fellter.vanillavsplus.custom_blocks.stained_glass;

import net.fellter.vanillavsplus.custom_blocks.glass.VerticalGlassStairsBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.Stainable;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.Direction;

public class VerticalStainedGlassStairsBlock extends VerticalGlassStairsBlock implements Stainable {
	private final DyeColor color;

	public VerticalStainedGlassStairsBlock(DyeColor color, Settings settings) {
		super(settings);
		this.color = color;
	}

	@Override
	public DyeColor getColor() {
		return color;
	}

	@Override
	protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
		if (stateFrom.getBlock() instanceof Stainable stainable) {
			return stainable.getColor() == color && super.isSideInvisible(state, stateFrom, direction);
		}

		return false;
	}
}
