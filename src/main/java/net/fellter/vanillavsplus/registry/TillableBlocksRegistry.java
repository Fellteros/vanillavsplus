package net.fellter.vanillavsplus.registry;

import net.fabricmc.fabric.api.registry.TillableBlockRegistry;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Items;

public class TillableBlocksRegistry {
    public static void registerTillableBlocks() {
        TillableBlockRegistry.register(ModBlocks.VERTICAL_DIRT_SLAB, HoeItem::canTillFarmland, HoeItem.createTillAction(ModBlocks.VERTICAL_FARMLAND_SLAB.getDefaultState()));
        TillableBlockRegistry.register(ModBlocks.VERTICAL_DIRT_STAIRS, HoeItem::canTillFarmland, HoeItem.createTillAction(ModBlocks.VERTICAL_FARMLAND_STAIRS.getDefaultState()));
        TillableBlockRegistry.register(ModBlocks.VERTICAL_GRASS_SLAB, HoeItem::canTillFarmland, HoeItem.createTillAction(ModBlocks.VERTICAL_FARMLAND_SLAB.getDefaultState()));
        TillableBlockRegistry.register(ModBlocks.VERTICAL_GRASS_STAIRS, HoeItem::canTillFarmland, HoeItem.createTillAction(ModBlocks.VERTICAL_FARMLAND_STAIRS.getDefaultState()));
        TillableBlockRegistry.register(ModBlocks.VERTICAL_ROOTED_DIRT_SLAB, context -> true, HoeItem.createTillAndDropAction(ModBlocks.VERTICAL_DIRT_SLAB.getDefaultState(), Items.HANGING_ROOTS));
        TillableBlockRegistry.register(ModBlocks.VERTICAL_ROOTED_DIRT_STAIRS, context -> true, HoeItem.createTillAndDropAction(ModBlocks.VERTICAL_DIRT_STAIRS.getDefaultState(), Items.HANGING_ROOTS));
        TillableBlockRegistry.register(ModBlocks.VERTICAL_COARSE_DIRT_SLAB, context -> true, HoeItem.createTillAction(ModBlocks.VERTICAL_DIRT_SLAB.getDefaultState()));
        TillableBlockRegistry.register(ModBlocks.VERTICAL_COARSE_DIRT_STAIRS, context -> true, HoeItem.createTillAction(ModBlocks.VERTICAL_DIRT_STAIRS.getDefaultState()));
    }
}
