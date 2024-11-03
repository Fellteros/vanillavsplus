package net.fellter.vanillavsplus;

import net.fabricmc.api.ClientModInitializer;
import net.fellter.vanillavsplus.registry.FoliageBlocksRegistry;
import net.fellter.vanillavsplus.registry.TransparentBlockRegistry;

public class VanillaVSBPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TransparentBlockRegistry.registerTransparentBlocks();
        FoliageBlocksRegistry.registerFoliage();
    }
}
