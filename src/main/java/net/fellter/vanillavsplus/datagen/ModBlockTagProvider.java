package net.fellter.vanillavsplus.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.fellter.vanillavsplus.registry.Args;
import net.fellter.vanillavsplus.util.ModTags;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		Registries.BLOCK.stream().filter(VanillaVSPlus::isNamespaced).forEach(block -> {
			Identifier identifier = Registries.BLOCK.getId(block);
			if (block instanceof VerticalSlabBlock) getTagBuilder(ModTags.VERTICAL_SLABS).add(identifier);
			if (block instanceof VerticalStairsBlock) getTagBuilder(ModTags.VERTICAL_STAIRS).add(identifier);

			if (Args.DATAGEN_ARGS.containsKey(block) && Args.DATAGEN_ARGS.get(block).blockTags != null) {
				List<TagKey<Block>> key = Args.DATAGEN_ARGS.get(block).blockTags;

				for (TagKey<Block> blockTagKey : key) {
					getTagBuilder(blockTagKey).add(identifier);
				}
			}
		});
	}

	@Override
	public String getName() {
		return "Vanilla+ Verticals Block Tags";
	}
}
