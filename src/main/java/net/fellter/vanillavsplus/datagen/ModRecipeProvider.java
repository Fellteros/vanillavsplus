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
