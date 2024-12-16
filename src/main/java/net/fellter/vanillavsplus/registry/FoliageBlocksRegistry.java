package net.fellter.vanillavsplus.registry;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.world.biome.GrassColors;

public class FoliageBlocksRegistry {
    public static void registerFoliage() {
        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return GrassColors.getDefaultColor();
            }
            return BiomeColors.getGrassColor(world, pos);
        }),
                ModBlocks.VERTICAL_GRASS_SLAB,
                ModBlocks.VERTICAL_GRASS_STAIRS
        );
    }
}
