package net.fellter.vanillavsplus;

import net.fabricmc.api.ClientModInitializer;
import net.fellter.vanillavsplus.registry.FoliageBlocksRegistry;
import net.fellter.vanillavsplus.registry.TransparentBlocksRegistry;

public class VanillaVSBPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TransparentBlocksRegistry.registerTransparentBlocks();
        FoliageBlocksRegistry.registerFoliage();
    }
}
