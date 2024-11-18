package net.fellter.vanillavsplus;

import net.fabricmc.api.ModInitializer;

import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.item.ModItemGroups;
import net.fellter.vanillavsplus.item.ModItems;
import net.fellter.vanillavsplus.registry.FlammableBlocksRegistry;
import net.fellter.vanillavsplus.registry.FuelRegistry;
import net.fellter.vanillavsplus.registry.OxidizableBlockRegistry;
import net.fellter.vanillavsplus.registry.VVSPStrippableRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaVSPlus implements ModInitializer {
	public static final String MOD_ID = "vanillavsplus";
    public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla+ Verticals");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		FuelRegistry.registerFuel();
		OxidizableBlockRegistry.registerOxidizables();
		FlammableBlocksRegistry.registerFlammables();
		VVSPStrippableRegistry.registerStrippableBlocks();

	}
}