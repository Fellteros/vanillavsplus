package net.fellter.vanillavsplus;

import net.fellter.vanillavsplus.registry.Args;
import net.fellter.vanillavsplus.registry.ModRegistries;

import net.fabricmc.api.ClientModInitializer;

public class VanillaVSPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Args.registerRegistryArgs();
		ModRegistries.registerTranslucentBlocks();
		ModRegistries.registerTransparentBlocks();
		ModRegistries.registerFoliage();
		ModRegistries.registerFuel();
		ModRegistries.registerOxidizables();
		ModRegistries.registerFlammables();
		ModRegistries.registerStrippableBlocks();
		ModRegistries.registerFlattenableBlocks();
		ModRegistries.registerTillableBlocks();
	}
}
