package net.fellter.vanillavsplus.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.Optional;

@Mixin(AxeItem.class)
public class MixinAxeItem {

	@Shadow
	@Final
	protected static Map<Block, Block> STRIPPED_BLOCKS;

	@Inject(method = "tryStrip", at = @At(value = "HEAD"), cancellable = true)
	private void fellter$tryStrip(World world, BlockPos pos, PlayerEntity player, BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {
		Optional<BlockState> optional = this.fellter$getStrippedState(state);
		if (optional.isPresent()) {
			world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
			cir.setReturnValue(optional);
		}
	}

	@Unique
	private Optional<BlockState> fellter$getStrippedState(BlockState blockState) {
		return Optional.ofNullable(STRIPPED_BLOCKS.get(blockState.getBlock())).map(block ->
				block.getStateWithProperties(blockState));
	}
}