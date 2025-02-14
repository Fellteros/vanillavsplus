package net.fellter.vanillavsplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.fellter.vanillavsplus.registry.Args;
import net.fellter.vanillavsplus.registry.DatagenArgs;

import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
		return new RecipeGenerator(registryLookup, exporter) {
			public CraftingRecipeJsonBuilder verticalSlabRecipe(ItemConvertible output, ItemConvertible input) {
				return ShapedRecipeJsonBuilder.create(registries.getOrThrow(RegistryKeys.ITEM), RecipeCategory.BUILDING_BLOCKS, output, 6)
						.input('#', input)
						.pattern("#")
						.pattern("#")
						.pattern("#")
						.criterion(hasItem(input), conditionsFromItem(input))
						.showNotification(true);
			}

			public CraftingRecipeJsonBuilder verticalStairsRecipe(ItemConvertible output, ItemConvertible input) {
				return ShapedRecipeJsonBuilder.create(registries.getOrThrow(RegistryKeys.ITEM), RecipeCategory.BUILDING_BLOCKS, output, 4)
						.input('#', input)
						.pattern("###")
						.pattern("## ")
						.pattern("#  ")
						.criterion(hasItem(input), conditionsFromItem(input))
						.showNotification(true);
			}

			public void offerStonecuttingRecipe(ItemConvertible output, ItemConvertible input) {
				this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input, 1);
			}

			public void offerStonecuttingRecipe(ItemConvertible output, ItemConvertible input, int count) {
				this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output, input, count);
			}

			@Override
			public void generate() {
				Registries.BLOCK.forEach(block -> {
					if (Args.DATAGEN_ARGS.containsKey(block)) {
						DatagenArgs args = Args.DATAGEN_ARGS.get(block);

						if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaVSPlus.MOD_ID) && args.parentBlock != null) {
							if (block instanceof VerticalSlabBlock && args.stonecuttingInput != null) {
								for (ItemConvertible item : args.stonecuttingInput) {
									offerStonecuttingRecipe(block, item, 2);
								}
							}

							if (block instanceof VerticalStairsBlock && args.stonecuttingInput != null) {
								for (ItemConvertible item : args.stonecuttingInput) {
									offerStonecuttingRecipe(block, item);
								}
							}

							if (block instanceof VerticalSlabBlock) {
								verticalSlabRecipe(block, args.parentBlock).offerTo(exporter);
							}

							if (block instanceof VerticalStairsBlock) {
								verticalStairsRecipe(block, args.parentBlock).offerTo(exporter);
							}
						}
					}
				});
			}
		};
	}

	@Override
	public String getName() {
		return "Vanilla+ Verticals Recipes";
	}
}
