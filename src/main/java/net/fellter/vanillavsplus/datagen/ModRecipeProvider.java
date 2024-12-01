package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

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

            @Override
            public void generate() {

                verticalSlabRecipe(ModBlocks.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_OAK_STAIRS, Blocks.OAK_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_OAK_LOG_SLAB, Blocks.OAK_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_OAK_LOG_STAIRS, Blocks.OAK_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_OAK_WOOD_SLAB, Blocks.OAK_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_OAK_WOOD_STAIRS, Blocks.OAK_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_OAK_LOG_STAIRS, Blocks.STRIPPED_OAK_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB, Blocks.STRIPPED_OAK_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_OAK_WOOD_STAIRS, Blocks.STRIPPED_OAK_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_SPRUCE_SLAB, Blocks.SPRUCE_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SPRUCE_STAIRS, Blocks.SPRUCE_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS, Blocks.SPRUCE_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB, Blocks.SPRUCE_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS, Blocks.SPRUCE_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB, Blocks.STRIPPED_SPRUCE_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_SPRUCE_LOG_STAIRS, Blocks.STRIPPED_SPRUCE_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB, Blocks.STRIPPED_SPRUCE_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_STAIRS, Blocks.STRIPPED_SPRUCE_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_BIRCH_SLAB, Blocks.BIRCH_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BIRCH_STAIRS, Blocks.BIRCH_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BIRCH_LOG_SLAB, Blocks.BIRCH_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS, Blocks.BIRCH_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB, Blocks.BIRCH_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS, Blocks.BIRCH_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB, Blocks.STRIPPED_BIRCH_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_BIRCH_LOG_STAIRS, Blocks.STRIPPED_BIRCH_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB, Blocks.STRIPPED_BIRCH_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_BIRCH_WOOD_STAIRS, Blocks.STRIPPED_BIRCH_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_JUNGLE_SLAB, Blocks.JUNGLE_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_JUNGLE_STAIRS, Blocks.JUNGLE_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS, Blocks.JUNGLE_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB, Blocks.JUNGLE_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS, Blocks.JUNGLE_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB, Blocks.STRIPPED_JUNGLE_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_JUNGLE_LOG_STAIRS, Blocks.STRIPPED_JUNGLE_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB, Blocks.STRIPPED_JUNGLE_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_STAIRS, Blocks.STRIPPED_JUNGLE_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_ACACIA_SLAB, Blocks.ACACIA_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ACACIA_STAIRS, Blocks.ACACIA_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ACACIA_LOG_SLAB, Blocks.ACACIA_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS, Blocks.ACACIA_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB, Blocks.ACACIA_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS, Blocks.ACACIA_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB, Blocks.STRIPPED_ACACIA_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_ACACIA_LOG_STAIRS, Blocks.STRIPPED_ACACIA_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB, Blocks.STRIPPED_ACACIA_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_ACACIA_WOOD_STAIRS, Blocks.STRIPPED_ACACIA_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DARK_OAK_STAIRS, Blocks.DARK_OAK_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS, Blocks.DARK_OAK_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB, Blocks.DARK_OAK_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS, Blocks.DARK_OAK_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB, Blocks.STRIPPED_DARK_OAK_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_STAIRS, Blocks.STRIPPED_DARK_OAK_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB, Blocks.STRIPPED_DARK_OAK_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_STAIRS, Blocks.STRIPPED_DARK_OAK_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_MANGROVE_SLAB, Blocks.MANGROVE_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MANGROVE_STAIRS, Blocks.MANGROVE_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS, Blocks.MANGROVE_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB, Blocks.MANGROVE_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS, Blocks.MANGROVE_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB, Blocks.STRIPPED_MANGROVE_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_MANGROVE_LOG_STAIRS, Blocks.STRIPPED_MANGROVE_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB, Blocks.STRIPPED_MANGROVE_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_STAIRS, Blocks.STRIPPED_MANGROVE_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_CHERRY_SLAB, Blocks.CHERRY_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHERRY_STAIRS, Blocks.CHERRY_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHERRY_LOG_SLAB, Blocks.CHERRY_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS, Blocks.CHERRY_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB, Blocks.CHERRY_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS, Blocks.CHERRY_WOOD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB, Blocks.STRIPPED_CHERRY_LOG).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_CHERRY_LOG_STAIRS, Blocks.STRIPPED_CHERRY_LOG).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB, Blocks.STRIPPED_CHERRY_WOOD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_CHERRY_WOOD_STAIRS, Blocks.STRIPPED_CHERRY_WOOD).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_BAMBOO_SLAB, Blocks.BAMBOO_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BAMBOO_STAIRS, Blocks.BAMBOO_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS, Blocks.BAMBOO_MOSAIC).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB, Blocks.BAMBOO_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS, Blocks.BAMBOO_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB, Blocks.STRIPPED_BAMBOO_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_STAIRS, Blocks.STRIPPED_BAMBOO_BLOCK).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_CRIMSON_SLAB, Blocks.CRIMSON_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRIMSON_STAIRS, Blocks.CRIMSON_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS, Blocks.CRIMSON_STEM).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB, Blocks.CRIMSON_HYPHAE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_HYPHAE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB, Blocks.STRIPPED_CRIMSON_STEM).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_CRIMSON_STEM_STAIRS, Blocks.STRIPPED_CRIMSON_STEM).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB, Blocks.STRIPPED_CRIMSON_HYPHAE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_STAIRS, Blocks.STRIPPED_CRIMSON_HYPHAE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WARPED_SLAB, Blocks.WARPED_PLANKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WARPED_STAIRS, Blocks.WARPED_PLANKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WARPED_STEM_SLAB, Blocks.WARPED_STEM).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WARPED_STEM_STAIRS, Blocks.WARPED_STEM).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB, Blocks.WARPED_HYPHAE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS, Blocks.WARPED_HYPHAE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB, Blocks.STRIPPED_WARPED_STEM).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_WARPED_STEM_STAIRS, Blocks.STRIPPED_WARPED_STEM).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB, Blocks.STRIPPED_WARPED_HYPHAE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_STAIRS, Blocks.STRIPPED_WARPED_HYPHAE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_STONE_SLAB, Blocks.STONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STONE_STAIRS, Blocks.STONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_COBBLESTONE_SLAB, Blocks.COBBLESTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_COBBLESTONE_STAIRS, Blocks.COBBLESTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_STAIRS, Blocks.MOSSY_COBBLESTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_STONE_BRICKS_SLAB, Blocks.STONE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_STONE_BRICKS_STAIRS, Blocks.STONE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB, Blocks.CRACKED_STONE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_STAIRS, Blocks.CRACKED_STONE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB, Blocks.CHISELED_STONE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_STAIRS, Blocks.CHISELED_STONE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB, Blocks.MOSSY_STONE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_STAIRS, Blocks.MOSSY_STONE_BRICKS).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_GRANITE_SLAB, Blocks.GRANITE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRANITE_STAIRS, Blocks.GRANITE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_GRANITE_STAIRS, Blocks.POLISHED_GRANITE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_DIORITE_SLAB, Blocks.DIORITE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DIORITE_STAIRS, Blocks.DIORITE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_DIORITE_STAIRS, Blocks.POLISHED_DIORITE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_ANDESITE_SLAB, Blocks.ANDESITE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ANDESITE_STAIRS, Blocks.ANDESITE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_ANDESITE_STAIRS, Blocks.POLISHED_ANDESITE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_DEEPSLATE_SLAB, Blocks.DEEPSLATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DEEPSLATE_STAIRS, Blocks.DEEPSLATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_STAIRS, Blocks.COBBLED_DEEPSLATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB, Blocks.CHISELED_DEEPSLATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_STAIRS, Blocks.CHISELED_DEEPSLATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_STAIRS, Blocks.POLISHED_DEEPSLATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB, Blocks.DEEPSLATE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_STAIRS, Blocks.DEEPSLATE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB, Blocks.DEEPSLATE_TILES).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DEEPSLATE_TILES_STAIRS, Blocks.DEEPSLATE_TILES).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB, Blocks.CRACKED_DEEPSLATE_TILES).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_TUFF_SLAB, Blocks.TUFF).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_TUFF_STAIRS, Blocks.TUFF).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_TUFF_SLAB, Blocks.CHISELED_TUFF).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_TUFF_STAIRS, Blocks.CHISELED_TUFF).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, Blocks.POLISHED_TUFF).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_TUFF_STAIRS, Blocks.POLISHED_TUFF).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_TUFF_BRICKS_SLAB, Blocks.TUFF_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_TUFF_BRICKS_STAIRS, Blocks.TUFF_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB, Blocks.CHISELED_TUFF_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_STAIRS, Blocks.CHISELED_TUFF_BRICKS).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_BRICKS_SLAB, Blocks.BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BRICKS_STAIRS, Blocks.BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PACKED_MUD_SLAB, Blocks.PACKED_MUD).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PACKED_MUD_STAIRS, Blocks.PACKED_MUD).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MUD_BRICKS_SLAB, Blocks.MUD_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MUD_BRICKS_STAIRS, Blocks.MUD_BRICKS).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_SANDSTONE_SLAB, Blocks.SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SANDSTONE_STAIRS, Blocks.SANDSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB, Blocks.CHISELED_SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_SANDSTONE_STAIRS, Blocks.CHISELED_SANDSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB, Blocks.CHISELED_RED_SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_STAIRS, Blocks.CHISELED_RED_SANDSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS, Blocks.SMOOTH_RED_SANDSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_SEA_LANTERN_SLAB, Blocks.SEA_LANTERN).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SEA_LANTERN_STAIRS, Blocks.SEA_LANTERN).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PRISMARINE_SLAB, Blocks.PRISMARINE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PRISMARINE_STAIRS, Blocks.PRISMARINE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB, Blocks.PRISMARINE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PRISMARINE_BRICKS_STAIRS, Blocks.PRISMARINE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DARK_PRISMARINE_STAIRS, Blocks.DARK_PRISMARINE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_NETHERRACK_SLAB, Blocks.NETHERRACK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_NETHERRACK_STAIRS, Blocks.NETHERRACK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_NETHER_BRICKS_SLAB, Blocks.NETHER_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_NETHER_BRICKS_STAIRS, Blocks.NETHER_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB, Blocks.CRACKED_NETHER_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_STAIRS, Blocks.CRACKED_NETHER_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB, Blocks.CHISELED_NETHER_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_STAIRS, Blocks.CHISELED_NETHER_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB, Blocks.RED_NETHER_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_NETHER_BRICKS_STAIRS, Blocks.RED_NETHER_BRICKS).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_BASALT_SLAB, Blocks.BASALT).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BASALT_STAIRS, Blocks.BASALT).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_BASALT_STAIRS, Blocks.POLISHED_BASALT).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_BLACKSTONE_SLAB, Blocks.BLACKSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLACKSTONE_STAIRS, Blocks.BLACKSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GILDED_BLACKSTONE_STAIRS, Blocks.GILDED_BLACKSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB, Blocks.CHISELED_POLISHED_BLACKSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS, Blocks.CHISELED_POLISHED_BLACKSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_STAIRS, Blocks.POLISHED_BLACKSTONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_END_STONE_SLAB, Blocks.END_STONE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_END_STONE_STAIRS, Blocks.END_STONE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_END_STONE_BRICKS_SLAB, Blocks.END_STONE_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_END_STONE_BRICKS_STAIRS, Blocks.END_STONE_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPUR_SLAB, Blocks.PURPUR_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPUR_STAIRS, Blocks.PURPUR_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPUR_PILLAR_SLAB, Blocks.PURPUR_PILLAR).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPUR_PILLAR_STAIRS, Blocks.PURPUR_PILLAR).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_COAL_SLAB, Blocks.COAL_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_COAL_STAIRS, Blocks.COAL_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_IRON_SLAB, Blocks.IRON_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_IRON_STAIRS, Blocks.IRON_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GOLD_SLAB, Blocks.GOLD_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GOLD_STAIRS, Blocks.GOLD_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_REDSTONE_SLAB, Blocks.REDSTONE_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_REDSTONE_STAIRS, Blocks.REDSTONE_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_EMERALD_SLAB, Blocks.EMERALD_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_EMERALD_STAIRS, Blocks.EMERALD_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LAPIS_SLAB, Blocks.LAPIS_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LAPIS_STAIRS, Blocks.LAPIS_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DIAMOND_SLAB, Blocks.DIAMOND_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DIAMOND_STAIRS, Blocks.DIAMOND_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_NETHERITE_SLAB, Blocks.NETHERITE_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_NETHERITE_STAIRS, Blocks.NETHERITE_BLOCK).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_QUARTZ_SLAB, Blocks.QUARTZ_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_QUARTZ_SLAB, Blocks.CHISELED_QUARTZ_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_QUARTZ_STAIRS, Blocks.CHISELED_QUARTZ_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_QUARTZ_BRICKS_SLAB, Blocks.QUARTZ_BRICKS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_QUARTZ_BRICKS_STAIRS, Blocks.QUARTZ_BRICKS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_QUARTZ_PILLAR_SLAB, Blocks.QUARTZ_PILLAR).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_QUARTZ_PILLAR_STAIRS, Blocks.QUARTZ_PILLAR).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_SMOOTH_QUARTZ_STAIRS, Blocks.SMOOTH_QUARTZ).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_AMETHYST_SLAB, Blocks.AMETHYST_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_COPPER_SLAB, Blocks.COPPER_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_COPPER_STAIRS, Blocks.COPPER_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_EXPOSED_COPPER_SLAB, Blocks.EXPOSED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_EXPOSED_COPPER_STAIRS, Blocks.EXPOSED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WEATHERED_COPPER_SLAB, Blocks.WEATHERED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WEATHERED_COPPER_STAIRS, Blocks.WEATHERED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_OXIDIZED_COPPER_SLAB, Blocks.OXIDIZED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_OXIDIZED_COPPER_STAIRS, Blocks.OXIDIZED_COPPER).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_CHISELED_COPPER_SLAB, Blocks.CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CHISELED_COPPER_STAIRS, Blocks.CHISELED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_EXPOSED_CHISELED_COPPER_SLAB, Blocks.EXPOSED_CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_EXPOSED_CHISELED_COPPER_STAIRS, Blocks.EXPOSED_CHISELED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WEATHERED_CHISELED_COPPER_STAIRS, Blocks.WEATHERED_CHISELED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_OXIDIZED_CHISELED_COPPER_SLAB, Blocks.OXIDIZED_CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_OXIDIZED_CHISELED_COPPER_STAIRS, Blocks.OXIDIZED_CHISELED_COPPER).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_COPPER_GRATE_SLAB, Blocks.COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_COPPER_GRATE_STAIRS, Blocks.COPPER_GRATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_SLAB, Blocks.EXPOSED_COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_STAIRS, Blocks.EXPOSED_COPPER_GRATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_STAIRS, Blocks.WEATHERED_COPPER_GRATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_SLAB, Blocks.OXIDIZED_COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_STAIRS, Blocks.OXIDIZED_COPPER_GRATE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_CUT_COPPER_SLAB, Blocks.CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CUT_COPPER_STAIRS, Blocks.CUT_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_COPPER_SLAB, Blocks.WAXED_COPPER_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_COPPER_STAIRS, Blocks.WAXED_COPPER_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_STAIRS, Blocks.WAXED_EXPOSED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_STAIRS, Blocks.WAXED_WEATHERED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_SLAB, Blocks.WAXED_OXIDIZED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_COPPER).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_CHISELED_COPPER_SLAB, Blocks.WAXED_CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_CHISELED_COPPER_STAIRS, Blocks.WAXED_CHISELED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_SLAB, Blocks.WAXED_EXPOSED_CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CHISELED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_SLAB, Blocks.WAXED_WEATHERED_CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CHISELED_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CHISELED_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CHISELED_COPPER).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_COPPER_GRATE_SLAB, Blocks.WAXED_COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_COPPER_GRATE_STAIRS, Blocks.WAXED_COPPER_GRATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_SLAB, Blocks.WAXED_EXPOSED_COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_STAIRS, Blocks.WAXED_EXPOSED_COPPER_GRATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_SLAB, Blocks.WAXED_WEATHERED_COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_STAIRS, Blocks.WAXED_WEATHERED_COPPER_GRATE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_SLAB, Blocks.WAXED_OXIDIZED_COPPER_GRATE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS, Blocks.WAXED_OXIDIZED_COPPER_GRATE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_CUT_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WHITE_WOOL_SLAB, Blocks.WHITE_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_WOOL_STAIRS, Blocks.LIGHT_GRAY_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GRAY_WOOL_SLAB, Blocks.GRAY_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRAY_WOOL_STAIRS, Blocks.GRAY_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLACK_WOOL_SLAB, Blocks.BLACK_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLACK_WOOL_STAIRS, Blocks.BLACK_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BROWN_WOOL_SLAB, Blocks.BROWN_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BROWN_WOOL_STAIRS, Blocks.BROWN_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_RED_WOOL_SLAB, Blocks.RED_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_WOOL_STAIRS, Blocks.RED_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ORANGE_WOOL_STAIRS, Blocks.ORANGE_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_YELLOW_WOOL_STAIRS, Blocks.YELLOW_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIME_WOOL_SLAB, Blocks.LIME_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIME_WOOL_STAIRS, Blocks.LIME_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GREEN_WOOL_SLAB, Blocks.GREEN_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GREEN_WOOL_STAIRS, Blocks.GREEN_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CYAN_WOOL_SLAB, Blocks.CYAN_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CYAN_WOOL_STAIRS, Blocks.CYAN_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_WOOL_STAIRS, Blocks.LIGHT_BLUE_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLUE_WOOL_SLAB, Blocks.BLUE_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLUE_WOOL_STAIRS, Blocks.BLUE_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPLE_WOOL_STAIRS, Blocks.PURPLE_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MAGENTA_WOOL_STAIRS, Blocks.MAGENTA_WOOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PINK_WOOL_SLAB, Blocks.PINK_WOOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PINK_WOOL_STAIRS, Blocks.PINK_WOOL).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_TERRACOTTA_SLAB, Blocks.TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_TERRACOTTA_STAIRS, Blocks.TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_RED_CONCRETE_SLAB, Blocks.RED_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WHITE_CONCRETE_POWDER_SLAB, Blocks.WHITE_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WHITE_CONCRETE_POWDER_STAIRS, Blocks.WHITE_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_SLAB, Blocks.LIGHT_GRAY_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_STAIRS, Blocks.LIGHT_GRAY_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GRAY_CONCRETE_POWDER_SLAB, Blocks.GRAY_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRAY_CONCRETE_POWDER_STAIRS, Blocks.GRAY_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLACK_CONCRETE_POWDER_SLAB, Blocks.BLACK_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLACK_CONCRETE_POWDER_STAIRS, Blocks.BLACK_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BROWN_CONCRETE_POWDER_SLAB, Blocks.BROWN_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BROWN_CONCRETE_POWDER_STAIRS, Blocks.BROWN_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_RED_CONCRETE_POWDER_SLAB, Blocks.RED_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_CONCRETE_POWDER_STAIRS, Blocks.RED_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ORANGE_CONCRETE_POWDER_SLAB, Blocks.ORANGE_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ORANGE_CONCRETE_POWDER_STAIRS, Blocks.ORANGE_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_YELLOW_CONCRETE_POWDER_SLAB, Blocks.YELLOW_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_YELLOW_CONCRETE_POWDER_STAIRS, Blocks.YELLOW_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIME_CONCRETE_POWDER_SLAB, Blocks.LIME_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIME_CONCRETE_POWDER_STAIRS, Blocks.LIME_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GREEN_CONCRETE_POWDER_SLAB, Blocks.GREEN_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GREEN_CONCRETE_POWDER_STAIRS, Blocks.GREEN_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CYAN_CONCRETE_POWDER_SLAB, Blocks.CYAN_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CYAN_CONCRETE_POWDER_STAIRS, Blocks.CYAN_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_SLAB, Blocks.LIGHT_BLUE_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_STAIRS, Blocks.LIGHT_BLUE_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLUE_CONCRETE_POWDER_SLAB, Blocks.BLUE_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLUE_CONCRETE_POWDER_STAIRS, Blocks.BLUE_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPLE_CONCRETE_POWDER_SLAB, Blocks.PURPLE_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPLE_CONCRETE_POWDER_STAIRS, Blocks.PURPLE_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MAGENTA_CONCRETE_POWDER_SLAB, Blocks.MAGENTA_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MAGENTA_CONCRETE_POWDER_STAIRS, Blocks.MAGENTA_CONCRETE_POWDER).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PINK_CONCRETE_POWDER_SLAB, Blocks.PINK_CONCRETE_POWDER).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PINK_CONCRETE_POWDER_STAIRS, Blocks.PINK_CONCRETE_POWDER).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.WHITE_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WHITE_GLAZED_TERRACOTTA_STAIRS, Blocks.WHITE_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GRAY_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GRAY_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.BLACK_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLACK_GLAZED_TERRACOTTA_STAIRS, Blocks.BLACK_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.BROWN_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BROWN_GLAZED_TERRACOTTA_STAIRS, Blocks.BROWN_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_RED_GLAZED_TERRACOTTA_SLAB, Blocks.RED_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_GLAZED_TERRACOTTA_STAIRS, Blocks.RED_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.ORANGE_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ORANGE_GLAZED_TERRACOTTA_STAIRS, Blocks.ORANGE_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.YELLOW_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_YELLOW_GLAZED_TERRACOTTA_STAIRS, Blocks.YELLOW_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIME_GLAZED_TERRACOTTA_SLAB, Blocks.LIME_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIME_GLAZED_TERRACOTTA_STAIRS, Blocks.LIME_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GREEN_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GREEN_GLAZED_TERRACOTTA_STAIRS, Blocks.GREEN_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.CYAN_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CYAN_GLAZED_TERRACOTTA_STAIRS, Blocks.CYAN_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.BLUE_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.BLUE_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.PURPLE_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPLE_GLAZED_TERRACOTTA_STAIRS, Blocks.PURPLE_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.MAGENTA_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MAGENTA_GLAZED_TERRACOTTA_STAIRS, Blocks.MAGENTA_GLAZED_TERRACOTTA).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PINK_GLAZED_TERRACOTTA_SLAB, Blocks.PINK_GLAZED_TERRACOTTA).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PINK_GLAZED_TERRACOTTA_STAIRS, Blocks.PINK_GLAZED_TERRACOTTA).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_GLASS_SLAB, Blocks.GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GLASS_STAIRS, Blocks.GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_WHITE_STAINED_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_WHITE_STAINED_GLASS_STAIRS, Blocks.WHITE_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_STAIRS, Blocks.LIGHT_GRAY_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GRAY_STAINED_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRAY_STAINED_GLASS_STAIRS, Blocks.GRAY_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLACK_STAINED_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLACK_STAINED_GLASS_STAIRS, Blocks.BLACK_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BROWN_STAINED_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BROWN_STAINED_GLASS_STAIRS, Blocks.BROWN_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_RED_STAINED_GLASS_SLAB, Blocks.RED_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_RED_STAINED_GLASS_STAIRS, Blocks.RED_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_STAIRS, Blocks.ORANGE_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_STAIRS, Blocks.YELLOW_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIME_STAINED_GLASS_SLAB, Blocks.LIME_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIME_STAINED_GLASS_STAIRS, Blocks.LIME_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_GREEN_STAINED_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GREEN_STAINED_GLASS_STAIRS, Blocks.GREEN_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_CYAN_STAINED_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_CYAN_STAINED_GLASS_STAIRS, Blocks.CYAN_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_STAIRS, Blocks.LIGHT_BLUE_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_BLUE_STAINED_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_BLUE_STAINED_GLASS_STAIRS, Blocks.BLUE_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_STAIRS, Blocks.PURPLE_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_STAIRS, Blocks.MAGENTA_STAINED_GLASS).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PINK_STAINED_GLASS_SLAB, Blocks.PINK_STAINED_GLASS).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PINK_STAINED_GLASS_STAIRS, Blocks.PINK_STAINED_GLASS).offerTo(exporter);


                verticalSlabRecipe(ModBlocks.VERTICAL_GRASS_SLAB, Blocks.GRASS_BLOCK).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_GRASS_STAIRS, Blocks.GRASS_BLOCK).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_PODZOL_SLAB, Blocks.PODZOL).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_PODZOL_STAIRS, Blocks.PODZOL).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_MYCELIUM_SLAB, Blocks.MYCELIUM).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_MYCELIUM_STAIRS, Blocks.MYCELIUM).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DIRT_PATH_SLAB, Blocks.DIRT_PATH).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DIRT_PATH_STAIRS, Blocks.DIRT_PATH).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_DIRT_SLAB, Blocks.DIRT).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_DIRT_STAIRS, Blocks.DIRT).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_COARSE_DIRT_SLAB, Blocks.COARSE_DIRT).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_COARSE_DIRT_STAIRS, Blocks.COARSE_DIRT).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_ROOTED_DIRT_STAIRS, Blocks.ROOTED_DIRT).offerTo(exporter);

                verticalSlabRecipe(ModBlocks.VERTICAL_FARMLAND_SLAB, Blocks.FARMLAND).offerTo(exporter);
                verticalStairsRecipe(ModBlocks.VERTICAL_FARMLAND_STAIRS, Blocks.FARMLAND).offerTo(exporter);

            }
        };
    }




    @Override
    public String getName() {
        return "Recipes";
    }
}
