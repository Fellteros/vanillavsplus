package net.fellter.vanillavsplus.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class TransparentBlockRegistry {
    public static void registerTransparentBlocks() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.VERTICAL_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_COPPER_GRATE_STAIRS,
                ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_STAIRS,
                ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_STAIRS,
                ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_STAIRS,

                ModBlocks.VERTICAL_WAXED_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_WAXED_COPPER_GRATE_STAIRS,
                ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_STAIRS,
                ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_STAIRS,
                ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_SLAB,
                ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS
        );

    }
}
