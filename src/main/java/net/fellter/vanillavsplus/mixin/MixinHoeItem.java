package net.fellter.vanillavsplus.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Consumer;

@Mixin(HoeItem.class)
public abstract class MixinHoeItem {

    @ModifyReturnValue(method = "createTillAction", at = @At("RETURN"))
    private static Consumer<ItemUsageContext> fellter$createTillAction(Consumer<ItemUsageContext> original, BlockState stateTo) {
        return context -> {
            context.getWorld().setBlockState(context.getBlockPos(), stateTo.getBlock().getStateWithProperties(context.getWorld().getBlockState(context.getBlockPos())), 11);
            context.getWorld().emitGameEvent(GameEvent.BLOCK_CHANGE, context.getBlockPos(), GameEvent.Emitter.of(context.getPlayer(), stateTo));
        };
    }

    @ModifyReturnValue(method = "createTillAndDropAction", at = @At("RETURN"))
    private static Consumer<ItemUsageContext> fellter$createTillAndDropAction(Consumer<ItemUsageContext> original, BlockState result, ItemConvertible droppedItem) {
        return context -> {
            context.getWorld().setBlockState(context.getBlockPos(), result.getBlock().getStateWithProperties(context.getWorld().getBlockState(context.getBlockPos())), 11);
            context.getWorld().emitGameEvent(GameEvent.BLOCK_CHANGE, context.getBlockPos(), GameEvent.Emitter.of(context.getPlayer(), result));
            Block.dropStack(context.getWorld(), context.getBlockPos(), context.getSide(), new ItemStack(droppedItem));
        };
    }
}
