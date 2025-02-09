package net.fellter.vanillavsplus.mixin;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.state.property.Property;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ShovelItem.class)
public abstract class MixinShovelItem {
	@Shadow
	@Final
	protected static Map<Block, BlockState> PATH_STATES;

	@ModifyVariable(method = "useOnBlock", at = @At(value = "STORE"), ordinal = 1)
	private BlockState path(BlockState value, ItemUsageContext context) {
		BlockState state = PATH_STATES.get(context.getWorld().getBlockState(context.getBlockPos()).getBlock());
		BlockState stateFrom = context.getWorld().getBlockState(context.getBlockPos());

		if (state != null) {
			for (Property<?> property : state.getBlock().getStateManager().getProperties()) {
				state = withProperty(state, property, stateFrom);
			}

			return state;
		}

		return value;
	}

	@Unique
	private static <T extends Comparable<T>> BlockState withProperty(BlockState to, Property<T> property, BlockState from) {
		return to.with(property, from.get(property));
	}
}
