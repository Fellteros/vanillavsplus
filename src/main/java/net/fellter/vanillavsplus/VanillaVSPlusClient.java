package net.fellter.vanillavsplus;

import net.fabricmc.api.ClientModInitializer;
import net.fellter.vanillavsplus.registry.ModRegistries;

public class VanillaVSPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRegistries.registerTransparentBlocks();
        ModRegistries.registerTranslucentBlocks();
        ModRegistries.registerFoliage();
    }
}
