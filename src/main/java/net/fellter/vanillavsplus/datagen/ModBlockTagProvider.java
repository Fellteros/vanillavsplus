package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.fellter.vanillavsplus.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

//        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
//                .add(ModBlocks.VERTICAL_OAK_SLAB)
//                .add(ModBlocks.VERTICAL_OAK_STAIRS)
//
//                .add(ModBlocks.VERTICAL_OAK_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_OAK_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_OAK_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_OAK_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_OAK_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_OAK_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_OAK_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_OAK_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_SPRUCE_SLAB)
//                .add(ModBlocks.VERTICAL_SPRUCE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_SPRUCE_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_SPRUCE_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_SPRUCE_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_SPRUCE_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_BIRCH_SLAB)
//                .add(ModBlocks.VERTICAL_BIRCH_STAIRS)
//
//                .add(ModBlocks.VERTICAL_BIRCH_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_BIRCH_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_BIRCH_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_BIRCH_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_BIRCH_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_JUNGLE_SLAB)
//                .add(ModBlocks.VERTICAL_JUNGLE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_JUNGLE_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_JUNGLE_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_JUNGLE_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_JUNGLE_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_ACACIA_SLAB)
//                .add(ModBlocks.VERTICAL_ACACIA_STAIRS)
//
//                .add(ModBlocks.VERTICAL_ACACIA_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_ACACIA_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_ACACIA_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_ACACIA_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_ACACIA_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_DARK_OAK_SLAB)
//                .add(ModBlocks.VERTICAL_DARK_OAK_STAIRS)
//
//                .add(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_DARK_OAK_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_DARK_OAK_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_DARK_OAK_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_DARK_OAK_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_MANGROVE_SLAB)
//                .add(ModBlocks.VERTICAL_MANGROVE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_MANGROVE_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_MANGROVE_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_MANGROVE_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_MANGROVE_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_CHERRY_SLAB)
//                .add(ModBlocks.VERTICAL_CHERRY_STAIRS)
//
//                .add(ModBlocks.VERTICAL_CHERRY_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_CHERRY_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_CHERRY_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_CHERRY_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_CHERRY_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_PALE_OAK_SLAB)
//                .add(ModBlocks.VERTICAL_PALE_OAK_STAIRS)
//
//                .add(ModBlocks.VERTICAL_PALE_OAK_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_PALE_OAK_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_PALE_OAK_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_PALE_OAK_WOOD_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_PALE_OAK_LOG_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_PALE_OAK_LOG_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_PALE_OAK_WOOD_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_PALE_OAK_WOOD_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_BAMBOO_SLAB)
//                .add(ModBlocks.VERTICAL_BAMBOO_STAIRS)
//
//                .add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB)
//                .add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS)
//
//                .add(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB)
//                .add(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_BAMBOO_BLOCK_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_BAMBOO_BLOCK_STAIRS)
//
//
//                .add(ModBlocks.VERTICAL_CRIMSON_SLAB)
//                .add(ModBlocks.VERTICAL_CRIMSON_STAIRS)
//
//                .add(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB)
//                .add(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS)
//
//                .add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB)
//                .add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_CRIMSON_STEM_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_CRIMSON_STEM_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STRIPPED_CRIMSON_HYPHAE_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_CRIMSON_HYPHAE_STAIRS)
//                .add(ModBlocks.VERTICAL_WARPED_SLAB)
//                .add(ModBlocks.VERTICAL_WARPED_STAIRS)
//                .add(ModBlocks.VERTICAL_WARPED_STEM_SLAB)
//                .add(ModBlocks.VERTICAL_WARPED_STEM_STAIRS)
//                .add(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB)
//                .add(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS)
//                .add(ModBlocks.VERTICAL_STRIPPED_WARPED_STEM_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_WARPED_STEM_STAIRS)
//                .add(ModBlocks.VERTICAL_STRIPPED_WARPED_HYPHAE_SLAB)
//                .add(ModBlocks.VERTICAL_STRIPPED_WARPED_HYPHAE_STAIRS)
//        ;
//
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//                .add(ModBlocks.VERTICAL_STONE_SLAB)
//                .add(ModBlocks.VERTICAL_STONE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_COBBLESTONE_SLAB)
//                .add(ModBlocks.VERTICAL_COBBLESTONE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB)
//                .add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB)
//                .add(ModBlocks.VERTICAL_SMOOTH_STONE_STAIRS)
//
//                .add(ModBlocks.VERTICAL_STONE_BRICKS_SLAB)
//                .add(ModBlocks.VERTICAL_STONE_BRICKS_STAIRS)
//
//                .add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB)
//                .add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_STAIRS)
//
//                .add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB)
//                .add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_STAIRS)
//
//                .add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_GRANITE_STAIRS)
//                .add(ModBlocks.VERTICAL_GRANITE_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_GRANITE_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB)
//
//                .add(ModBlocks.VERTICAL_DIORITE_STAIRS)
//                .add(ModBlocks.VERTICAL_DIORITE_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_DIORITE_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB)
//
//                .add(ModBlocks.VERTICAL_ANDESITE_STAIRS)
//                .add(ModBlocks.VERTICAL_ANDESITE_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_ANDESITE_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB)
//
//                .add(ModBlocks.VERTICAL_DEEPSLATE_STAIRS)
//                .add(ModBlocks.VERTICAL_DEEPSLATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_STAIRS)
//                .add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_DEEPSLATE_TILES_STAIRS)
//                .add(ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB)
//
//                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS)
//                .add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB)
//
//                .add(ModBlocks.VERTICAL_TUFF_STAIRS)
//                .add(ModBlocks.VERTICAL_TUFF_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_TUFF_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_TUFF_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_TUFF_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB)
//
//                .add(ModBlocks.VERTICAL_TUFF_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_TUFF_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_PACKED_MUD_STAIRS)
//                .add(ModBlocks.VERTICAL_PACKED_MUD_SLAB)
//
//                .add(ModBlocks.VERTICAL_MUD_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_MUD_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_CUT_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_RED_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_SEA_LANTERN_STAIRS)
//                .add(ModBlocks.VERTICAL_SEA_LANTERN_SLAB)
//
//                .add(ModBlocks.VERTICAL_PRISMARINE_STAIRS)
//                .add(ModBlocks.VERTICAL_PRISMARINE_SLAB)
//
//                .add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_DARK_PRISMARINE_STAIRS)
//                .add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB)
//
//                .add(ModBlocks.VERTICAL_NETHERRACK_STAIRS)
//                .add(ModBlocks.VERTICAL_NETHERRACK_SLAB)
//
//                .add(ModBlocks.VERTICAL_NETHER_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_NETHER_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_BASALT_STAIRS)
//                .add(ModBlocks.VERTICAL_BASALT_SLAB)
//
//                .add(ModBlocks.VERTICAL_SMOOTH_BASALT_STAIRS)
//                .add(ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_BASALT_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_BASALT_SLAB)
//
//                .add(ModBlocks.VERTICAL_BLACKSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_BLACKSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_END_STONE_STAIRS)
//                .add(ModBlocks.VERTICAL_END_STONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_END_STONE_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_END_STONE_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_PURPUR_STAIRS)
//                .add(ModBlocks.VERTICAL_PURPUR_SLAB)
//
//                .add(ModBlocks.VERTICAL_PURPUR_PILLAR_STAIRS)
//                .add(ModBlocks.VERTICAL_PURPUR_PILLAR_SLAB)
//
//                .add(ModBlocks.VERTICAL_COAL_STAIRS)
//                .add(ModBlocks.VERTICAL_COAL_SLAB)
//
//                .add(ModBlocks.VERTICAL_IRON_STAIRS)
//                .add(ModBlocks.VERTICAL_IRON_SLAB)
//
//                .add(ModBlocks.VERTICAL_GOLD_STAIRS)
//                .add(ModBlocks.VERTICAL_GOLD_SLAB)
//
//                .add(ModBlocks.VERTICAL_REDSTONE_STAIRS)
//                .add(ModBlocks.VERTICAL_REDSTONE_SLAB)
//
//                .add(ModBlocks.VERTICAL_EMERALD_STAIRS)
//                .add(ModBlocks.VERTICAL_EMERALD_SLAB)
//
//                .add(ModBlocks.VERTICAL_LAPIS_STAIRS)
//                .add(ModBlocks.VERTICAL_LAPIS_SLAB)
//
//                .add(ModBlocks.VERTICAL_DIAMOND_STAIRS)
//                .add(ModBlocks.VERTICAL_DIAMOND_SLAB)
//
//                .add(ModBlocks.VERTICAL_NETHERITE_STAIRS)
//                .add(ModBlocks.VERTICAL_NETHERITE_SLAB)
//
//                .add(ModBlocks.VERTICAL_QUARTZ_STAIRS)
//                .add(ModBlocks.VERTICAL_QUARTZ_SLAB)
//
//                .add(ModBlocks.VERTICAL_CHISELED_QUARTZ_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_QUARTZ_SLAB)
//
//                .add(ModBlocks.VERTICAL_QUARTZ_BRICKS_STAIRS)
//                .add(ModBlocks.VERTICAL_QUARTZ_BRICKS_SLAB)
//
//                .add(ModBlocks.VERTICAL_QUARTZ_PILLAR_STAIRS)
//                .add(ModBlocks.VERTICAL_QUARTZ_PILLAR_SLAB)
//
//                .add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_STAIRS)
//                .add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB)
//
//                .add(ModBlocks.VERTICAL_AMETHYST_STAIRS)
//                .add(ModBlocks.VERTICAL_AMETHYST_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_EXPOSED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_EXPOSED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WEATHERED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WEATHERED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_OXIDIZED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_OXIDIZED_COPPER_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_CHISELED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_EXPOSED_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_EXPOSED_CHISELED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WEATHERED_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WEATHERED_CHISELED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_OXIDIZED_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_OXIDIZED_CHISELED_COPPER_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_COPPER_GRATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_CUT_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_WAXED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_WAXED_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_CHISELED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_WAXED_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_COPPER_GRATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_SLAB)
//
//
//                .add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB)
//
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_STAIRS)
//                .add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB)
//
//                .add(
//                        ModBlocks.VERTICAL_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_WHITE_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_GRAY_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_BLACK_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_BROWN_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_RED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_ORANGE_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_YELLOW_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_LIME_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_GREEN_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_CYAN_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_BLUE_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_PURPLE_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_MAGENTA_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_PINK_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_WHITE_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_GRAY_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_BLACK_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_BROWN_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_RED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_ORANGE_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_YELLOW_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_LIME_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_GREEN_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_CYAN_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_BLUE_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_PURPLE_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_MAGENTA_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_PINK_TERRACOTTA_SLAB
//                )
//
//                .add(
//                        ModBlocks.VERTICAL_WHITE_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_GRAY_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_BLACK_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_BROWN_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_RED_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_ORANGE_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_YELLOW_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_LIME_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_GREEN_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_CYAN_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_BLUE_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_PURPLE_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_MAGENTA_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_PINK_CONCRETE_STAIRS,
//                        ModBlocks.VERTICAL_WHITE_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_GRAY_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_BLACK_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_BROWN_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_RED_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_ORANGE_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_YELLOW_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_LIME_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_GREEN_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_CYAN_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_BLUE_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_PURPLE_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_MAGENTA_CONCRETE_SLAB,
//                        ModBlocks.VERTICAL_PINK_CONCRETE_SLAB
//                )
//
//                .add(
//                        ModBlocks.VERTICAL_WHITE_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_GRAY_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_BLACK_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_BROWN_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_RED_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_ORANGE_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_YELLOW_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_LIME_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_GREEN_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_CYAN_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_BLUE_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_PURPLE_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_MAGENTA_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_PINK_GLAZED_TERRACOTTA_STAIRS,
//                        ModBlocks.VERTICAL_WHITE_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_GRAY_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_BLACK_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_BROWN_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_RED_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_ORANGE_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_YELLOW_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_LIME_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_GREEN_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_CYAN_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_BLUE_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_PURPLE_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_MAGENTA_GLAZED_TERRACOTTA_SLAB,
//                        ModBlocks.VERTICAL_PINK_GLAZED_TERRACOTTA_SLAB
//                )
//
//                .add(
//                        ModBlocks.VERTICAL_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_WHITE_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_GRAY_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_BLACK_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_BROWN_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_RED_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_LIME_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_GREEN_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_CYAN_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_BLUE_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_PINK_STAINED_GLASS_STAIRS,
//                        ModBlocks.VERTICAL_GLASS_SLAB,
//                        ModBlocks.VERTICAL_WHITE_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_GRAY_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_BLACK_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_BROWN_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_RED_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_LIME_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_GREEN_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_CYAN_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_BLUE_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_SLAB,
//                        ModBlocks.VERTICAL_PINK_STAINED_GLASS_SLAB
//                )
//
//                .add(
//                        ModBlocks.VERTICAL_ICE_SLAB,
//                        ModBlocks.VERTICAL_ICE_STAIRS,
//                        ModBlocks.VERTICAL_PACKED_ICE_SLAB,
//                        ModBlocks.VERTICAL_PACKED_ICE_STAIRS,
//                        ModBlocks.VERTICAL_BLUE_ICE_SLAB,
//                        ModBlocks.VERTICAL_BLUE_ICE_STAIRS,
//                        ModBlocks.VERTICAL_CALCITE_SLAB,
//                        ModBlocks.VERTICAL_CALCITE_STAIRS,
//                        ModBlocks.VERTICAL_DRIPSTONE_SLAB,
//                        ModBlocks.VERTICAL_DRIPSTONE_STAIRS,
//                        ModBlocks.VERTICAL_MAGMA_SLAB,
//                        ModBlocks.VERTICAL_MAGMA_STAIRS,
//                        ModBlocks.VERTICAL_OBSIDIAN_SLAB,
//                        ModBlocks.VERTICAL_OBSIDIAN_STAIRS,
//                        ModBlocks.VERTICAL_CRYING_OBSIDIAN_SLAB,
//                        ModBlocks.VERTICAL_CRYING_OBSIDIAN_STAIRS,
//                        ModBlocks.VERTICAL_CRIMSON_NYLIUM_SLAB,
//                        ModBlocks.VERTICAL_CRIMSON_NYLIUM_STAIRS,
//                        ModBlocks.VERTICAL_WARPED_NYLIUM_SLAB,
//                        ModBlocks.VERTICAL_WARPED_NYLIUM_STAIRS,
//                        ModBlocks.VERTICAL_BONE_BLOCK_SLAB,
//                        ModBlocks.VERTICAL_BONE_BLOCK_STAIRS,
//                        ModBlocks.VERTICAL_COAL_ORE_SLAB,
//                        ModBlocks.VERTICAL_COAL_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_COAL_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_COAL_ORE_STAIRS,
//                        ModBlocks.VERTICAL_IRON_ORE_SLAB,
//                        ModBlocks.VERTICAL_IRON_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_IRON_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_IRON_ORE_STAIRS,
//                        ModBlocks.VERTICAL_COPPER_ORE_SLAB,
//                        ModBlocks.VERTICAL_COPPER_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_COPPER_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_COPPER_ORE_STAIRS,
//                        ModBlocks.VERTICAL_GOLD_ORE_SLAB,
//                        ModBlocks.VERTICAL_GOLD_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_GOLD_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_GOLD_ORE_STAIRS,
//                        ModBlocks.VERTICAL_REDSTONE_ORE_SLAB,
//                        ModBlocks.VERTICAL_REDSTONE_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_REDSTONE_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_REDSTONE_ORE_STAIRS,
//                        ModBlocks.VERTICAL_EMERALD_ORE_SLAB,
//                        ModBlocks.VERTICAL_EMERALD_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_EMERALD_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_EMERALD_ORE_STAIRS,
//                        ModBlocks.VERTICAL_LAPIS_ORE_SLAB,
//                        ModBlocks.VERTICAL_LAPIS_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_LAPIS_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_LAPIS_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DIAMOND_ORE_SLAB,
//                        ModBlocks.VERTICAL_DIAMOND_ORE_STAIRS,
//                        ModBlocks.VERTICAL_DEEPSLATE_DIAMOND_ORE_SLAB,
//                        ModBlocks.VERTICAL_DEEPSLATE_DIAMOND_ORE_STAIRS,
//                        ModBlocks.VERTICAL_NETHER_GOLD_ORE_SLAB,
//                        ModBlocks.VERTICAL_NETHER_GOLD_ORE_STAIRS,
//                        ModBlocks.VERTICAL_NETHER_QUARTZ_ORE_SLAB,
//                        ModBlocks.VERTICAL_NETHER_QUARTZ_ORE_STAIRS,
//                        ModBlocks.VERTICAL_ANCIENT_DEBRIS_SLAB,
//                        ModBlocks.VERTICAL_ANCIENT_DEBRIS_STAIRS,
//                        ModBlocks.VERTICAL_RAW_IRON_BLOCK_SLAB,
//                        ModBlocks.VERTICAL_RAW_IRON_BLOCK_STAIRS,
//                        ModBlocks.VERTICAL_RAW_COPPER_BLOCK_SLAB,
//                        ModBlocks.VERTICAL_RAW_COPPER_BLOCK_STAIRS,
//                        ModBlocks.VERTICAL_RAW_GOLD_BLOCK_SLAB,
//                        ModBlocks.VERTICAL_RAW_GOLD_BLOCK_STAIRS,
//                        ModBlocks.VERTICAL_GLOWSTONE_SLAB,
//                        ModBlocks.VERTICAL_GLOWSTONE_STAIRS
//                )
//        ;
//
//        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
//                .add(
//                        ModBlocks.VERTICAL_WHITE_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_GRAY_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_BLACK_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_BROWN_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_RED_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_ORANGE_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_YELLOW_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_LIME_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_GREEN_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_CYAN_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_BLUE_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_PURPLE_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_MAGENTA_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_PINK_CONCRETE_POWDER_STAIRS,
//                        ModBlocks.VERTICAL_WHITE_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_GRAY_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_BLACK_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_BROWN_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_RED_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_ORANGE_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_YELLOW_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_LIME_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_GREEN_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_CYAN_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_BLUE_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_PURPLE_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_MAGENTA_CONCRETE_POWDER_SLAB,
//                        ModBlocks.VERTICAL_PINK_CONCRETE_POWDER_SLAB
//                )
//                .add(
//                        ModBlocks.VERTICAL_GRASS_STAIRS,
//                        ModBlocks.VERTICAL_GRASS_SLAB,
//                        ModBlocks.VERTICAL_PODZOL_STAIRS,
//                        ModBlocks.VERTICAL_PODZOL_SLAB,
//                        ModBlocks.VERTICAL_MYCELIUM_STAIRS,
//                        ModBlocks.VERTICAL_MYCELIUM_SLAB,
//                        ModBlocks.VERTICAL_DIRT_PATH_STAIRS,
//                        ModBlocks.VERTICAL_DIRT_PATH_SLAB,
//                        ModBlocks.VERTICAL_DIRT_SLAB,
//                        ModBlocks.VERTICAL_DIRT_STAIRS,
//                        ModBlocks.VERTICAL_COARSE_DIRT_SLAB,
//                        ModBlocks.VERTICAL_COARSE_DIRT_STAIRS,
//                        ModBlocks.VERTICAL_ROOTED_DIRT_SLAB,
//                        ModBlocks.VERTICAL_ROOTED_DIRT_STAIRS,
//                        ModBlocks.VERTICAL_FARMLAND_SLAB,
//                        ModBlocks.VERTICAL_FARMLAND_STAIRS,
//                        ModBlocks.VERTICAL_MUD_SLAB,
//                        ModBlocks.VERTICAL_MUD_STAIRS,
//                        ModBlocks.VERTICAL_CLAY_STAIRS,
//                        ModBlocks.VERTICAL_CLAY_SLAB,
//                        ModBlocks.VERTICAL_GRAVEL_STAIRS,
//                        ModBlocks.VERTICAL_GRAVEL_SLAB,
//                        ModBlocks.VERTICAL_SAND_STAIRS,
//                        ModBlocks.VERTICAL_SAND_SLAB,
//                        ModBlocks.VERTICAL_RED_SAND_STAIRS,
//                        ModBlocks.VERTICAL_RED_SAND_SLAB,
//                        ModBlocks.VERTICAL_SNOW_STAIRS,
//                        ModBlocks.VERTICAL_SNOW_SLAB,
//                        ModBlocks.VERTICAL_SOUL_SAND_SLAB,
//                        ModBlocks.VERTICAL_SOUL_SAND_STAIRS,
//                        ModBlocks.VERTICAL_SOUL_SOIL_SLAB,
//                        ModBlocks.VERTICAL_SOUL_SOIL_STAIRS
//                )
//        ;
//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
//                .add(
//                        ModBlocks.VERTICAL_MOSS_SLAB,
//                        ModBlocks.VERTICAL_MOSS_STAIRS,
//                        ModBlocks.VERTICAL_PALE_MOSS_SLAB,
//                        ModBlocks.VERTICAL_PALE_MOSS_STAIRS
//                );

        Registries.BLOCK.forEach(block -> {
            if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaVSPlus.MOD_ID)) {
                if (block instanceof VerticalSlabBlock) getOrCreateTagBuilder(ModTags.VERTICAL_SLABS).add(block);
                if (block instanceof VerticalStairsBlock) getOrCreateTagBuilder(ModTags.VERTICAL_STAIRS).add(block);
                if (ModBlocks.DATAGEN_ARGS.containsKey(block) && ModBlocks.DATAGEN_ARGS.get(block).blockTags != null) {
                    List<TagKey<Block>> key = ModBlocks.DATAGEN_ARGS.get(block).blockTags;
                    for (TagKey<Block> blockTagKey : key) {
                        getOrCreateTagBuilder(blockTagKey).add(block);
                    }
                }
            }
        });
    }
}
