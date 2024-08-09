package net.fellter.vanillavsplus;

import net.fabricmc.api.ModInitializer;

import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.item.ModItemGroups;
import net.fellter.vanillavsplus.item.ModItems;
import net.fellter.vanillavsplus.registry.VVSPStrippableRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaVSPlus implements ModInitializer {

	public static final String MOD_ID = "vanillavsplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		VVSPStrippableRegistry.registerStrippableBlocks();
	}
}