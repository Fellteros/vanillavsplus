package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.VERTICAL_OAK_SLAB)
                .add(ModBlocks.VERTICAL_OAK_STAIRS)

                .add(ModBlocks.VERTICAL_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_OAK_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_OAK_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_OAK_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_OAK_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_SPRUCE_SLAB)
                .add(ModBlocks.VERTICAL_SPRUCE_STAIRS)

                .add(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_SPRUCE_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_BIRCH_SLAB)
                .add(ModBlocks.VERTICAL_BIRCH_STAIRS)

                .add(ModBlocks.VERTICAL_BIRCH_LOG_SLAB)
                .add(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_BIRCH_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_BIRCH_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_JUNGLE_SLAB)
                .add(ModBlocks.VERTICAL_JUNGLE_STAIRS)

                .add(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_JUNGLE_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_ACACIA_SLAB)
                .add(ModBlocks.VERTICAL_ACACIA_STAIRS)

                .add(ModBlocks.VERTICAL_ACACIA_LOG_SLAB)
                .add(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_ACACIA_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_ACACIA_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_DARK_OAK_SLAB)
                .add(ModBlocks.VERTICAL_DARK_OAK_STAIRS)

                .add(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_MANGROVE_SLAB)
                .add(ModBlocks.VERTICAL_MANGROVE_STAIRS)

                .add(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_MANGROVE_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_CHERRY_SLAB)
                .add(ModBlocks.VERTICAL_CHERRY_STAIRS)

                .add(ModBlocks.VERTICAL_CHERRY_LOG_SLAB)
                .add(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS)

                .add(ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_CHERRY_LOG_STAIRS)

                .add(ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_CHERRY_WOOD_STAIRS)
                
                
                .add(ModBlocks.VERTICAL_BAMBOO_SLAB)
                .add(ModBlocks.VERTICAL_BAMBOO_STAIRS)

                .add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB)
                .add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS)

                .add(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB)
                .add(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS)

                .add(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB)
                .add(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_STAIRS)


                .add(ModBlocks.VERTICAL_CRIMSON_SLAB)
                .add(ModBlocks.VERTICAL_CRIMSON_STAIRS)

                .add(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB)
                .add(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS)

                .add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS)

                .add(ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB)
                .add(ModBlocks.VERTICAL_STR_CRIMSON_STEM_STAIRS)

                .add(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_STAIRS)
                .add(ModBlocks.VERTICAL_WARPED_SLAB)
                .add(ModBlocks.VERTICAL_WARPED_STAIRS)
                .add(ModBlocks.VERTICAL_WARPED_STEM_SLAB)
                .add(ModBlocks.VERTICAL_WARPED_STEM_STAIRS)
                .add(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS)
                .add(ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB)
                .add(ModBlocks.VERTICAL_STR_WARPED_STEM_STAIRS)
                .add(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_STAIRS)
        ;
        
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.VERTICAL_STONE_SLAB)
                .add(ModBlocks.VERTICAL_STONE_STAIRS)

                .add(ModBlocks.VERTICAL_COBBLESTONE_SLAB)
                .add(ModBlocks.VERTICAL_COBBLESTONE_STAIRS)

                .add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB)
                .add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_STAIRS)

                .add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB)
                .add(ModBlocks.VERTICAL_SMOOTH_STONE_STAIRS)

                .add(ModBlocks.VERTICAL_STONE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_STONE_BRICKS_STAIRS)

                .add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_STAIRS)

                .add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_STAIRS)

                .add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_GRANITE_STAIRS)
                .add(ModBlocks.VERTICAL_GRANITE_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_GRANITE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB)

                .add(ModBlocks.VERTICAL_DIORITE_STAIRS)
                .add(ModBlocks.VERTICAL_DIORITE_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_DIORITE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB)

                .add(ModBlocks.VERTICAL_ANDESITE_STAIRS)
                .add(ModBlocks.VERTICAL_ANDESITE_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_ANDESITE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB)

                .add(ModBlocks.VERTICAL_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_DEEPSLATE_SLAB)

                .add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB)

                .add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB)

                .add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_DEEPSLATE_TILES_STAIRS)
                .add(ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB)

                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS)
                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB)

                .add(ModBlocks.VERTICAL_TUFF_STAIRS)
                .add(ModBlocks.VERTICAL_TUFF_SLAB)

                .add(ModBlocks.VERTICAL_CHISELED_TUFF_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_TUFF_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_TUFF_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB)

                .add(ModBlocks.VERTICAL_TUFF_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_TUFF_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_PACKED_MUD_STAIRS)
                .add(ModBlocks.VERTICAL_PACKED_MUD_SLAB)

                .add(ModBlocks.VERTICAL_MUD_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_MUD_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_CUT_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB)

                .add(ModBlocks.VERTICAL_SEA_LANTERN_STAIRS)
                .add(ModBlocks.VERTICAL_SEA_LANTERN_SLAB)

                .add(ModBlocks.VERTICAL_PRISMARINE_STAIRS)
                .add(ModBlocks.VERTICAL_PRISMARINE_SLAB)

                .add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_DARK_PRISMARINE_STAIRS)
                .add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB)

                .add(ModBlocks.VERTICAL_NETHERRACK_STAIRS)
                .add(ModBlocks.VERTICAL_NETHERRACK_SLAB)

                .add(ModBlocks.VERTICAL_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_NETHER_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB)

                .add(ModBlocks.VERTICAL_BASALT_STAIRS)
                .add(ModBlocks.VERTICAL_BASALT_SLAB)

                .add(ModBlocks.VERTICAL_SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_BASALT_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_BASALT_SLAB)

                .add(ModBlocks.VERTICAL_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_BLACKSTONE_SLAB)

                .add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB)

                .add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB)

                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB)
        
        ;

        getOrCreateTagBuilder(ModTags.VERTICAL_STAIRS)
                .add(ModBlocks.VERTICAL_OAK_STAIRS)
                .add(ModBlocks.VERTICAL_OAK_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_OAK_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_OAK_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_OAK_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_SPRUCE_STAIRS)
                .add(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_SPRUCE_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_BIRCH_STAIRS)
                .add(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_BIRCH_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_BIRCH_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_JUNGLE_STAIRS)
                .add(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_JUNGLE_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_ACACIA_STAIRS)
                .add(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_ACACIA_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_ACACIA_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_DARK_OAK_STAIRS)
                .add(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_MANGROVE_STAIRS)
                .add(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_MANGROVE_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_CHERRY_STAIRS)
                .add(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_STR_CHERRY_LOG_STAIRS)
                .add(ModBlocks.VERTICAL_STR_CHERRY_WOOD_STAIRS)
                .add(ModBlocks.VERTICAL_BAMBOO_STAIRS)
                .add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS)
                .add(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS)
                .add(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_STAIRS)
                .add(ModBlocks.VERTICAL_CRIMSON_STAIRS)
                .add(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS)
                .add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS)
                .add(ModBlocks.VERTICAL_STR_CRIMSON_STEM_STAIRS)
                .add(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_STAIRS)
                .add(ModBlocks.VERTICAL_WARPED_STAIRS)
                .add(ModBlocks.VERTICAL_WARPED_STEM_STAIRS)
                .add(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS)
                .add(ModBlocks.VERTICAL_STR_WARPED_STEM_STAIRS)
                .add(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_STAIRS)
                .add(ModBlocks.VERTICAL_STONE_STAIRS)
                .add(ModBlocks.VERTICAL_COBBLESTONE_STAIRS)
                .add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_STAIRS)
                .add(ModBlocks.VERTICAL_SMOOTH_STONE_STAIRS)
                .add(ModBlocks.VERTICAL_STONE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_GRANITE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_GRANITE_STAIRS)
                .add(ModBlocks.VERTICAL_DIORITE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_DIORITE_STAIRS)
                .add(ModBlocks.VERTICAL_ANDESITE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_ANDESITE_STAIRS)
                .add(ModBlocks.VERTICAL_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_STAIRS)
                .add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_DEEPSLATE_TILES_STAIRS)
                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS)
                .add(ModBlocks.VERTICAL_TUFF_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_TUFF_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_TUFF_STAIRS)
                .add(ModBlocks.VERTICAL_TUFF_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_PACKED_MUD_STAIRS)
                .add(ModBlocks.VERTICAL_MUD_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CUT_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_SEA_LANTERN_STAIRS)
                .add(ModBlocks.VERTICAL_PRISMARINE_STAIRS)
                .add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_DARK_PRISMARINE_STAIRS)
                .add(ModBlocks.VERTICAL_NETHERRACK_STAIRS)
                .add(ModBlocks.VERTICAL_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.VERTICAL_BASALT_STAIRS)
                .add(ModBlocks.VERTICAL_SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_BASALT_STAIRS)
                .add(ModBlocks.VERTICAL_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_STAIRS)
                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS)
        ;

        getOrCreateTagBuilder(ModTags.VERTICAL_SLABS)
                .add(ModBlocks.VERTICAL_OAK_SLAB)
                .add(ModBlocks.VERTICAL_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_SPRUCE_SLAB)
                .add(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_BIRCH_SLAB)
                .add(ModBlocks.VERTICAL_BIRCH_LOG_SLAB)
                .add(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_JUNGLE_SLAB)
                .add(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_ACACIA_SLAB)
                .add(ModBlocks.VERTICAL_ACACIA_LOG_SLAB)
                .add(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_DARK_OAK_SLAB)
                .add(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_MANGROVE_SLAB)
                .add(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_CHERRY_SLAB)
                .add(ModBlocks.VERTICAL_CHERRY_LOG_SLAB)
                .add(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB)
                .add(ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB)
                .add(ModBlocks.VERTICAL_BAMBOO_SLAB)
                .add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB)
                .add(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB)
                .add(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB)
                .add(ModBlocks.VERTICAL_CRIMSON_SLAB)
                .add(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB)
                .add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB)
                .add(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_WARPED_SLAB)
                .add(ModBlocks.VERTICAL_WARPED_STEM_SLAB)
                .add(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB)
                .add(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB)
                .add(ModBlocks.VERTICAL_STONE_SLAB)
                .add(ModBlocks.VERTICAL_COBBLESTONE_SLAB)
                .add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB)
                .add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB)
                .add(ModBlocks.VERTICAL_STONE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_GRANITE_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB)
                .add(ModBlocks.VERTICAL_DIORITE_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB)
                .add(ModBlocks.VERTICAL_ANDESITE_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB)
                .add(ModBlocks.VERTICAL_DEEPSLATE_SLAB)
                .add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB)
                .add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB)
                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB)
                .add(ModBlocks.VERTICAL_TUFF_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_TUFF_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB)
                .add(ModBlocks.VERTICAL_TUFF_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_PACKED_MUD_SLAB)
                .add(ModBlocks.VERTICAL_MUD_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB)
                .add(ModBlocks.VERTICAL_SEA_LANTERN_SLAB)
                .add(ModBlocks.VERTICAL_PRISMARINE_SLAB)
                .add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB)
                .add(ModBlocks.VERTICAL_NETHERRACK_SLAB)
                .add(ModBlocks.VERTICAL_NETHER_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB)
                .add(ModBlocks.VERTICAL_BASALT_SLAB)
                .add(ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_BASALT_SLAB)
                .add(ModBlocks.VERTICAL_BLACKSTONE_SLAB)
                .add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB)
                .add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB)
                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB)
        ;
    }
}
