package net.fellter.vanillavsplus;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fellter.vanillavsplus.datagen.ModBlockTagProvider;
import net.fellter.vanillavsplus.datagen.ModLootTableProvider;
import net.fellter.vanillavsplus.datagen.ModModelProvider;
import net.fellter.vanillavsplus.datagen.ModRecipeProvider;

public class VanillaVSPlusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockTagProvider::new);

	}
}
