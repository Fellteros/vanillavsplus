package net.fellter.vanillavsplus.registry;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.world.biome.FoliageColors;

public class FoliageBlocksRegistry {
    public static void registerFoliage() {
        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getGrassColor(world, pos);
        }),
                ModBlocks.VERTICAL_GRASS_SLAB,
                ModBlocks.VERTICAL_GRASS_STAIRS
        );

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(),
                ModBlocks.VERTICAL_GRASS_SLAB,
                ModBlocks.VERTICAL_GRASS_STAIRS);
    }
}
