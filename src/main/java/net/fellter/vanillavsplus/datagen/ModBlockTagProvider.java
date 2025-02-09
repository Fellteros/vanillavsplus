package net.fellter.vanillavsplus.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.fellter.vanillavsplus.util.ModTags;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		Registries.BLOCK.forEach(block -> {
			if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaVSPlus.MOD_ID)) {
				if (block instanceof VerticalSlabBlock) getOrCreateTagBuilder(ModTags.VERTICAL_SLABS).add(block);
				if (block instanceof VerticalStairsBlock) getOrCreateTagBuilder(ModTags.VERTICAL_STAIRS).add(block);

				if (ModBlocks.ARGS.containsKey(block) && ModBlocks.ARGS.get(block).blockTags != null) {
					List<TagKey<Block>> key = ModBlocks.ARGS.get(block).blockTags;

					for (TagKey<Block> blockTagKey : key) {
						getOrCreateTagBuilder(blockTagKey).add(block);
					}
				}
			}
		});
	}

	@Override
	public String getName() {
		return "Vanilla+ Verticals Block Tags";
	}
}
