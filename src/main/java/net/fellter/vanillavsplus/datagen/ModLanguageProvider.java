package net.fellter.vanillavsplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.registry.Args;

import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.loader.impl.util.StringUtil;

public class ModLanguageProvider extends FabricLanguageProvider {
	public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
		Registries.BLOCK.forEach(block -> {
			if (Args.DATAGEN_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);

				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID)) {
					String[] var10000 = identifier.getPath().split("_");
					StringBuilder stringBuilder = new StringBuilder();
					String var10001;

					for (String string : var10000) {
						stringBuilder.append(StringUtil.capitalize(string)).append(" ");
					}

					var10001 = stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString();
					translationBuilder.add(block, var10001);
				}
			}
		});

		translationBuilder.add(RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(VanillaVSPlus.MOD_ID, "vvsp")), "Vanilla+ Verticals");
	}

	@Override
	public String getName() {
		return "Vanilla+ Verticals English Translations";
	}
}
