package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
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
    }

    public static CraftingRecipeJsonBuilder verticalSlabRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }

    public static CraftingRecipeJsonBuilder verticalStairsRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('#', input)
                .pattern("###")
                .pattern("## ")
                .pattern("#  ")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
}
