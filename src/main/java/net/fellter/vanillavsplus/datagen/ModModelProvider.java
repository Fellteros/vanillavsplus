package net.fellter.vanillavsplus.datagen;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.fellter.vanillavsplus.item.ModItems;
import net.fellter.vanillavsplus.registry.Args;
import net.fellter.vanillavsplus.registry.DatagenArgs;

import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TextureMap;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import static net.fellter.vanillavsplus.util.ModBlockStateModelGenerator.*;

@Environment(EnvType.CLIENT)
public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator bsmg) {
		registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BROWN_MUSHROOM_SLAB, Identifier.of(VanillaVSPlus.MOD_ID, "block/brown_mushroom_block"), TextureMap.all(Blocks.BROWN_MUSHROOM_BLOCK));
		registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_MUSHROOM_SLAB, Identifier.of(VanillaVSPlus.MOD_ID, "block/red_mushroom_block"), TextureMap.all(Blocks.RED_MUSHROOM_BLOCK));

		Registries.BLOCK.forEach(block -> {
			if (Args.DATAGEN_ARGS.containsKey(block)) {
				DatagenArgs args = Args.DATAGEN_ARGS.get(block);

				if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaVSPlus.MOD_ID) && args.textureMap != null) {
					if (block instanceof VerticalStairsBlock && args.y15 && args.tintSource != null) {
						registerVerticalStairs15(bsmg, block, args.textureMap, args.tintSource);
					} else if (block instanceof VerticalStairsBlock && args.y15) {
						registerVerticalStairs15(bsmg, block, args.textureMap);
					} else if (block instanceof VerticalStairsBlock && args.tintSource != null) {
						registerVerticalStairs(bsmg, block, args.textureMap, args.tintSource);
					} else if (block instanceof VerticalStairsBlock) {
						registerVerticalStairs(bsmg, block, args.textureMap);
					} else if (block instanceof VerticalSlabBlock && args.y15 && args.tintSource != null && args.fullTextureBlock != null) {
						registerVerticalSlab15(bsmg, block, args.fullTextureBlock, args.textureMap, args.tintSource);
					} else if (block instanceof VerticalSlabBlock && args.y15 && args.tintSource != null && args.parentBlock != null) {
						registerVerticalSlab15(bsmg, block, args.parentBlock, args.textureMap, args.tintSource);
					} else if (block instanceof VerticalSlabBlock && args.y15 && args.fullTextureBlock != null) {
						registerVerticalSlab15(bsmg, block, args.fullTextureBlock, args.textureMap);
					} else if (block instanceof VerticalSlabBlock && args.y15 && args.parentBlock != null) {
						registerVerticalSlab15(bsmg, block, args.parentBlock, args.textureMap);
					} else if (block instanceof VerticalSlabBlock && args.tintSource != null && args.fullTextureBlock != null) {
						registerVerticalSlab(bsmg, block, args.fullTextureBlock, args.textureMap, args.tintSource);
					} else if (block instanceof VerticalSlabBlock && args.tintSource != null && args.parentBlock != null) {
						registerVerticalSlab(bsmg, block, args.parentBlock, args.textureMap, args.tintSource);
					} else if (block instanceof VerticalSlabBlock && args.fullTextureBlock != null) {
						registerVerticalSlab(bsmg, block, args.fullTextureBlock, args.textureMap);
					} else if (block instanceof VerticalSlabBlock && args.parentBlock != null) {
						registerVerticalSlab(bsmg, block, args.parentBlock, args.textureMap);
					}
				}
			}
		});
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.VVSP_TITLE, Models.GENERATED);
	}
}
