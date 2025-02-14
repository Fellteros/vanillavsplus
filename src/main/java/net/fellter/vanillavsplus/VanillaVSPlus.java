package net.fellter.vanillavsplus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.item.ModItemGroups;
import net.fellter.vanillavsplus.item.ModItems;

import net.fabricmc.api.ModInitializer;

public class VanillaVSPlus implements ModInitializer {
	public static final String MOD_ID = "vanillavsplus";
	public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla+ Verticals");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Initialized Vanilla+ Verticals");
	}
}
