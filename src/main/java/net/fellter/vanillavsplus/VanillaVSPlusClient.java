package net.fellter.vanillavsplus;

import net.fellter.vanillavsplus.registry.ModRegistries;

import net.fabricmc.api.ClientModInitializer;

public class VanillaVSPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModRegistries.registerFoliage();
		ModRegistries.registerTransparentBlocks();
		ModRegistries.registerTranslucentBlocks();
	}
}
