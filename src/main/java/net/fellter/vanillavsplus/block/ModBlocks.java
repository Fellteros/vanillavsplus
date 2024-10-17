package net.fellter.vanillavsplus.block;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block LOG_DEF = registerBlock("log_def",
            new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_OAK_STAIRS = registerBlock("vertical_oak_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_OAK_LOG_SLAB = registerBlock("vertical_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_OAK_LOG_STAIRS = registerBlock("vertical_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_OAK_WOOD_SLAB = registerBlock("vertical_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block VERTICAL_OAK_WOOD_STAIRS = registerBlock("vertical_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block VERTICAL_STR_OAK_LOG_SLAB = registerBlock("vertical_str_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_OAK_LOG_STAIRS = registerBlock("vertical_str_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_OAK_WOOD_SLAB = registerBlock("vertical_str_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block VERTICAL_STR_OAK_WOOD_STAIRS = registerBlock("vertical_str_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block VERTICAL_SPRUCE_SLAB = registerBlock("vertical_spruce_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_STAIRS = registerBlock("vertical_spruce_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_LOG_SLAB = registerBlock("vertical_spruce_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_SPRUCE_LOG_STAIRS = registerBlock("vertical_spruce_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_SPRUCE_WOOD_SLAB = registerBlock("vertical_spruce_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block VERTICAL_SPRUCE_WOOD_STAIRS = registerBlock("vertical_spruce_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block VERTICAL_STR_SPRUCE_LOG_SLAB = registerBlock("vertical_str_spruce_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_SPRUCE_LOG_STAIRS = registerBlock("vertical_str_spruce_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_SPRUCE_WOOD_SLAB = registerBlock("vertical_str_spruce_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block VERTICAL_STR_SPRUCE_WOOD_STAIRS = registerBlock("vertical_str_spruce_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));

    public static final Block VERTICAL_BIRCH_SLAB = registerBlock("vertical_birch_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_STAIRS = registerBlock("vertical_birch_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_LOG_SLAB = registerBlock("vertical_birch_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_BIRCH_LOG_STAIRS = registerBlock("vertical_birch_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_BIRCH_WOOD_SLAB = registerBlock("vertical_birch_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block VERTICAL_BIRCH_WOOD_STAIRS = registerBlock("vertical_birch_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block VERTICAL_STR_BIRCH_LOG_SLAB = registerBlock("vertical_str_birch_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_BIRCH_LOG_STAIRS = registerBlock("vertical_str_birch_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_BIRCH_WOOD_SLAB = registerBlock("vertical_str_birch_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block VERTICAL_STR_BIRCH_WOOD_STAIRS = registerBlock("vertical_str_birch_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final Block VERTICAL_JUNGLE_SLAB = registerBlock("vertical_jungle_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_STAIRS = registerBlock("vertical_jungle_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_LOG_SLAB = registerBlock("vertical_jungle_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_JUNGLE_LOG_STAIRS = registerBlock("vertical_jungle_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_JUNGLE_WOOD_SLAB = registerBlock("vertical_jungle_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block VERTICAL_JUNGLE_WOOD_STAIRS = registerBlock("vertical_jungle_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block VERTICAL_STR_JUNGLE_LOG_SLAB = registerBlock("vertical_str_jungle_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_JUNGLE_LOG_STAIRS = registerBlock("vertical_str_jungle_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_JUNGLE_WOOD_SLAB = registerBlock("vertical_str_jungle_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block VERTICAL_STR_JUNGLE_WOOD_STAIRS = registerBlock("vertical_str_jungle_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));

    public static final Block VERTICAL_ACACIA_SLAB = registerBlock("vertical_acacia_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_STAIRS = registerBlock("vertical_acacia_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_LOG_SLAB = registerBlock("vertical_acacia_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_ACACIA_LOG_STAIRS = registerBlock("vertical_acacia_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_ACACIA_WOOD_SLAB = registerBlock("vertical_acacia_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block VERTICAL_ACACIA_WOOD_STAIRS = registerBlock("vertical_acacia_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block VERTICAL_STR_ACACIA_LOG_SLAB = registerBlock("vertical_str_acacia_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_ACACIA_LOG_STAIRS = registerBlock("vertical_str_acacia_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_ACACIA_WOOD_SLAB = registerBlock("vertical_str_acacia_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block VERTICAL_STR_ACACIA_WOOD_STAIRS = registerBlock("vertical_str_acacia_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));

    public static final Block VERTICAL_DARK_OAK_SLAB = registerBlock("vertical_dark_oak_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_STAIRS = registerBlock("vertical_dark_oak_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_LOG_SLAB = registerBlock("vertical_dark_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_DARK_OAK_LOG_STAIRS = registerBlock("vertical_dark_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_DARK_OAK_WOOD_SLAB = registerBlock("vertical_dark_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block VERTICAL_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_dark_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block VERTICAL_STR_DARK_OAK_LOG_SLAB = registerBlock("vertical_str_dark_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_DARK_OAK_LOG_STAIRS = registerBlock("vertical_str_dark_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_DARK_OAK_WOOD_SLAB = registerBlock("vertical_str_dark_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block VERTICAL_STR_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_str_dark_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));

    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_STAIRS = registerBlock("vertical_mangrove_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_LOG_SLAB = registerBlock("vertical_mangrove_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_MANGROVE_LOG_STAIRS = registerBlock("vertical_mangrove_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_MANGROVE_WOOD_SLAB = registerBlock("vertical_mangrove_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_MANGROVE_WOOD_STAIRS = registerBlock("vertical_mangrove_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_MANGROVE_LOG_SLAB = registerBlock("vertical_str_mangrove_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_MANGROVE_LOG_STAIRS = registerBlock("vertical_str_mangrove_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_MANGROVE_WOOD_SLAB = registerBlock("vertical_str_mangrove_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_MANGROVE_WOOD_STAIRS = registerBlock("vertical_str_mangrove_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    public static final Block VERTICAL_CHERRY_SLAB = registerBlock("vertical_cherry_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_STAIRS = registerBlock("vertical_cherry_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_LOG_SLAB = registerBlock("vertical_cherry_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block VERTICAL_CHERRY_LOG_STAIRS = registerBlock("vertical_cherry_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block VERTICAL_CHERRY_WOOD_SLAB = registerBlock("vertical_cherry_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block VERTICAL_CHERRY_WOOD_STAIRS = registerBlock("vertical_cherry_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block VERTICAL_STR_CHERRY_LOG_SLAB = registerBlock("vertical_str_cherry_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block VERTICAL_STR_CHERRY_LOG_STAIRS = registerBlock("vertical_str_cherry_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block VERTICAL_STR_CHERRY_WOOD_SLAB = registerBlock("vertical_str_cherry_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block VERTICAL_STR_CHERRY_WOOD_STAIRS = registerBlock("vertical_str_cherry_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    
    public static final Block BAMBOO_DEF = registerBlock("bamboo_def",
            new Block(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD)));

    public static final Block VERTICAL_BAMBOO_SLAB = registerBlock("vertical_bamboo_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_STAIRS = registerBlock("vertical_bamboo_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB = registerBlock("vertical_bamboo_mosaic_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_MOSAIC_STAIRS = registerBlock("vertical_bamboo_mosaic_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_BLOCK_SLAB = registerBlock("vertical_bamboo_block_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_DEF)));
    public static final Block VERTICAL_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_bamboo_block_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(BAMBOO_DEF)));
    public static final Block VERTICAL_STR_BAMBOO_BLOCK_SLAB = registerBlock("vertical_str_bamboo_block_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_DEF)));
    public static final Block VERTICAL_STR_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_str_bamboo_block_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(BAMBOO_DEF)));

    public static final Block NETHER_DEF = registerBlock("nether_def",
            new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM)));

    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_STAIRS = registerBlock("vertical_crimson_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_STEM_SLAB = registerBlock("vertical_crimson_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_CRIMSON_STEM_STAIRS = registerBlock("vertical_crimson_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_crimson_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_crimson_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_STR_CRIMSON_STEM_SLAB = registerBlock("vertical_str_crimson_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_STR_CRIMSON_STEM_STAIRS = registerBlock("vertical_str_crimson_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_STR_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_str_crimson_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_STR_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_str_crimson_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_STAIRS = registerBlock("vertical_warped_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_STEM_SLAB = registerBlock("vertical_warped_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_WARPED_STEM_STAIRS = registerBlock("vertical_warped_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_WARPED_HYPHAE_SLAB = registerBlock("vertical_warped_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_HYPHAE_STAIRS = registerBlock("vertical_warped_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_STR_WARPED_STEM_SLAB = registerBlock("vertical_str_warped_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_STR_WARPED_STEM_STAIRS = registerBlock("vertical_str_warped_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_STR_WARPED_HYPHAE_SLAB = registerBlock("vertical_str_warped_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_STR_WARPED_HYPHAE_STAIRS = registerBlock("vertical_str_warped_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    
    public static final Block VERTICAL_STONE_SLAB = registerBlock("vertical_stone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block VERTICAL_STONE_STAIRS = registerBlock("vertical_stone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block VERTICAL_COBBLESTONE_SLAB = registerBlock("vertical_cobblestone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));
    public static final Block VERTICAL_COBBLESTONE_STAIRS = registerBlock("vertical_cobblestone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = registerBlock("vertical_mossy_cobblestone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_STAIRS = registerBlock("vertical_mossy_cobblestone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = registerBlock("vertical_smooth_stone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block VERTICAL_SMOOTH_STONE_STAIRS = registerBlock("vertical_smooth_stone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block VERTICAL_STONE_BRICKS_SLAB = registerBlock("vertical_stone_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block VERTICAL_STONE_BRICKS_STAIRS = registerBlock("vertical_stone_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block VERTICAL_CRACKED_STONE_BRICKS_SLAB = registerBlock("vertical_cracked_stone_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block VERTICAL_CRACKED_STONE_BRICKS_STAIRS = registerBlock("vertical_cracked_stone_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block VERTICAL_CHISELED_STONE_BRICKS_SLAB = registerBlock("vertical_chiseled_stone_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block VERTICAL_CHISELED_STONE_BRICKS_STAIRS = registerBlock("vertical_chiseled_stone_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block VERTICAL_MOSSY_STONE_BRICKS_SLAB = registerBlock("vertical_mossy_stone_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS)));
    public static final Block VERTICAL_MOSSY_STONE_BRICKS_STAIRS = registerBlock("vertical_mossy_stone_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS)));
    
    public static final Block VERTICAL_GRANITE_SLAB = registerBlock("vertical_granite_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRANITE)));
    public static final Block VERTICAL_GRANITE_STAIRS = registerBlock("vertical_granite_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.GRANITE)));
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = registerBlock("vertical_polished_granite_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block VERTICAL_POLISHED_GRANITE_STAIRS = registerBlock("vertical_polished_granite_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    
    public static final Block VERTICAL_DIORITE_SLAB = registerBlock("vertical_diorite_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block VERTICAL_DIORITE_STAIRS = registerBlock("vertical_diorite_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = registerBlock("vertical_polished_diorite_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block VERTICAL_POLISHED_DIORITE_STAIRS = registerBlock("vertical_polished_diorite_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    
    public static final Block VERTICAL_ANDESITE_SLAB = registerBlock("vertical_andesite_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block VERTICAL_ANDESITE_STAIRS = registerBlock("vertical_andesite_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = registerBlock("vertical_polished_andesite_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block VERTICAL_POLISHED_ANDESITE_STAIRS = registerBlock("vertical_polished_andesite_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));

    public static final Block VERTICAL_DEEPSLATE_SLAB = registerBlock("vertical_deepslate_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block VERTICAL_DEEPSLATE_STAIRS = registerBlock("vertical_deepslate_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = registerBlock("vertical_cobbled_deepslate_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_STAIRS = registerBlock("vertical_cobbled_deepslate_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block VERTICAL_CHISELED_DEEPSLATE_SLAB = registerBlock("vertical_chiseled_deepslate_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block VERTICAL_CHISELED_DEEPSLATE_STAIRS = registerBlock("vertical_chiseled_deepslate_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = registerBlock("vertical_polished_deepslate_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_STAIRS = registerBlock("vertical_polished_deepslate_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final Block VERTICAL_DEEPSLATE_BRICKS_SLAB = registerBlock("vertical_deepslate_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block VERTICAL_DEEPSLATE_BRICKS_STAIRS = registerBlock("vertical_deepslate_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("vertical_cracked_deepslate_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("vertical_cracked_deepslate_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block VERTICAL_DEEPSLATE_TILES_SLAB = registerBlock("vertical_deepslate_tiles_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block VERTICAL_DEEPSLATE_TILES_STAIRS = registerBlock("vertical_deepslate_tiles_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("vertical_cracked_deepslate_tiles_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("vertical_cracked_deepslate_tiles_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    
    public static final Block VERTICAL_TUFF_SLAB = registerBlock("vertical_tuff_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
    public static final Block VERTICAL_TUFF_STAIRS = registerBlock("vertical_tuff_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
    public static final Block VERTICAL_CHISELED_TUFF_SLAB = registerBlock("vertical_chiseled_tuff_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block VERTICAL_CHISELED_TUFF_STAIRS = registerBlock("vertical_chiseled_tuff_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block VERTICAL_POLISHED_TUFF_SLAB = registerBlock("vertical_polished_tuff_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));
    public static final Block VERTICAL_POLISHED_TUFF_STAIRS = registerBlock("vertical_polished_tuff_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));
    public static final Block VERTICAL_TUFF_BRICKS_SLAB = registerBlock("vertical_tuff_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));
    public static final Block VERTICAL_TUFF_BRICKS_STAIRS = registerBlock("vertical_tuff_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));
    public static final Block VERTICAL_CHISELED_TUFF_BRICKS_SLAB = registerBlock("vertical_chiseled_tuff_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS)));
    public static final Block VERTICAL_CHISELED_TUFF_BRICKS_STAIRS = registerBlock("vertical_chiseled_tuff_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS)));
    
    public static final Block VERTICAL_BRICKS_SLAB = registerBlock("vertical_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block VERTICAL_BRICKS_STAIRS = registerBlock("vertical_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block VERTICAL_PACKED_MUD_SLAB = registerBlock("vertical_packed_mud_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block VERTICAL_PACKED_MUD_STAIRS = registerBlock("vertical_packed_mud_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block VERTICAL_MUD_BRICKS_SLAB = registerBlock("vertical_mud_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block VERTICAL_MUD_BRICKS_STAIRS = registerBlock("vertical_mud_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));

    public static final Block VERTICAL_SANDSTONE_SLAB = registerBlock("vertical_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block VERTICAL_SANDSTONE_STAIRS = registerBlock("vertical_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block VERTICAL_CHISELED_SANDSTONE_SLAB = registerBlock("vertical_chiseled_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE)));
    public static final Block VERTICAL_CHISELED_SANDSTONE_STAIRS = registerBlock("vertical_chiseled_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE)));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = registerBlock("vertical_smooth_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_STAIRS = registerBlock("vertical_smooth_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = registerBlock("vertical_cut_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block VERTICAL_CUT_SANDSTONE_STAIRS = registerBlock("vertical_cut_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));

    public static final Block VERTICAL_RED_SANDSTONE_SLAB = registerBlock("vertical_red_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block VERTICAL_RED_SANDSTONE_STAIRS = registerBlock("vertical_red_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block VERTICAL_CHISELED_RED_SANDSTONE_SLAB = registerBlock("vertical_chiseled_red_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE)));
    public static final Block VERTICAL_CHISELED_RED_SANDSTONE_STAIRS = registerBlock("vertical_chiseled_red_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE)));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = registerBlock("vertical_smooth_red_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS = registerBlock("vertical_smooth_red_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = registerBlock("vertical_cut_red_sandstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_STAIRS = registerBlock("vertical_cut_red_sandstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));

    public static final Block VERTICAL_SEA_LANTERN_SLAB = registerBlock("vertical_sea_lantern_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block VERTICAL_SEA_LANTERN_STAIRS = registerBlock("vertical_sea_lantern_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block VERTICAL_PRISMARINE_SLAB = registerBlock("vertical_prismarine_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE)));
    public static final Block VERTICAL_PRISMARINE_STAIRS = registerBlock("vertical_prismarine_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE)));
    public static final Block VERTICAL_PRISMARINE_BRICKS_SLAB = registerBlock("vertical_prismarine_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block VERTICAL_PRISMARINE_BRICKS_STAIRS = registerBlock("vertical_prismarine_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = registerBlock("vertical_dark_prismarine_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block VERTICAL_DARK_PRISMARINE_STAIRS = registerBlock("vertical_dark_prismarine_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    
    public static final Block VERTICAL_NETHERRACK_SLAB = registerBlock("vertical_netherrack_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block VERTICAL_NETHERRACK_STAIRS = registerBlock("vertical_netherrack_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block VERTICAL_NETHER_BRICKS_SLAB = registerBlock("vertical_nether_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block VERTICAL_NETHER_BRICKS_STAIRS = registerBlock("vertical_nether_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block VERTICAL_CRACKED_NETHER_BRICKS_SLAB = registerBlock("vertical_cracked_nether_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block VERTICAL_CRACKED_NETHER_BRICKS_STAIRS = registerBlock("vertical_cracked_nether_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block VERTICAL_CHISELED_NETHER_BRICKS_SLAB = registerBlock("vertical_chiseled_nether_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS)));
    public static final Block VERTICAL_CHISELED_NETHER_BRICKS_STAIRS = registerBlock("vertical_chiseled_nether_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS)));
    public static final Block VERTICAL_RED_NETHER_BRICKS_SLAB = registerBlock("vertical_red_nether_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block VERTICAL_RED_NETHER_BRICKS_STAIRS = registerBlock("vertical_red_nether_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));

    public static final Block VERTICAL_BASALT_SLAB = registerBlock("vertical_basalt_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block VERTICAL_BASALT_STAIRS = registerBlock("vertical_basalt_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block VERTICAL_SMOOTH_BASALT_SLAB = registerBlock("vertical_smooth_basalt_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block VERTICAL_SMOOTH_BASALT_STAIRS = registerBlock("vertical_smooth_basalt_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block VERTICAL_POLISHED_BASALT_SLAB = registerBlock("vertical_polished_basalt_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block VERTICAL_POLISHED_BASALT_STAIRS = registerBlock("vertical_polished_basalt_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    
    public static final Block VERTICAL_BLACKSTONE_SLAB = registerBlock("vertical_blackstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block VERTICAL_BLACKSTONE_STAIRS = registerBlock("vertical_blackstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block VERTICAL_GILDED_BLACKSTONE_SLAB = registerBlock("vertical_gilded_blackstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block VERTICAL_GILDED_BLACKSTONE_STAIRS = registerBlock("vertical_gilded_blackstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock("vertical_chiseled_polished_blackstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)));
    public static final Block VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS = registerBlock("vertical_chiseled_polished_blackstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = registerBlock("vertical_polished_blackstone_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_STAIRS = registerBlock("vertical_polished_blackstone_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("vertical_polished_blackstone_bricks_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("vertical_polished_blackstone_bricks_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    //FabricLoader.getInstance()

    


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaVSPlus.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
    }
}
