package net.fellter.vanillavsplus;

import net.fellter.vanillavsplus.registry.Args;
import net.fellter.vanillavsplus.registry.ModRegistries;

import net.fabricmc.api.ClientModInitializer;

public class VanillaVSPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Args.registerRegistryArgs();
		ModRegistries.registerFoliage();
		ModRegistries.registerTransparentBlocks();
		ModRegistries.registerTranslucentBlocks();
		ModRegistries.registerFuel();
		ModRegistries.registerOxidizables();
		ModRegistries.registerFlammables();
		ModRegistries.registerStrippableBlocks();
		ModRegistries.registerFlattenableBlocks();
		ModRegistries.registerTillableBlocks();
	}
}
