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
                ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS,

                ModBlocks.VERTICAL_GRASS_SLAB,
                ModBlocks.VERTICAL_GRASS_STAIRS
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.VERTICAL_GLASS_SLAB,
                ModBlocks.VERTICAL_GLASS_STAIRS,
                ModBlocks.VERTICAL_WHITE_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_WHITE_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_GRAY_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_GRAY_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_BLACK_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_BLACK_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_BROWN_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_BROWN_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_RED_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_RED_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_LIME_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_LIME_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_GREEN_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_GREEN_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_CYAN_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_CYAN_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_BLUE_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_BLUE_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_STAIRS,
                ModBlocks.VERTICAL_PINK_STAINED_GLASS_SLAB,
                ModBlocks.VERTICAL_PINK_STAINED_GLASS_STAIRS,
                
                ModBlocks.VERTICAL_ICE_SLAB,
                ModBlocks.VERTICAL_ICE_STAIRS,
                ModBlocks.VERTICAL_PACKED_ICE_SLAB,
                ModBlocks.VERTICAL_PACKED_ICE_STAIRS,
                ModBlocks.VERTICAL_BLUE_ICE_SLAB,
                ModBlocks.VERTICAL_BLUE_ICE_STAIRS
                );

    }
}
