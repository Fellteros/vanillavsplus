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
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), Blocks.OAK_PLANKS.getDefaultState()));
    public static final Block VERTICAL_OAK_LOG_SLAB = registerBlock("vertical_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_OAK_LOG_STAIRS = registerBlock("vertical_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.OAK_LOG.getDefaultState()));
    public static final Block VERTICAL_OAK_WOOD_SLAB = registerBlock("vertical_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block VERTICAL_OAK_WOOD_STAIRS = registerBlock("vertical_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD), Blocks.OAK_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_OAK_LOG_SLAB = registerBlock("vertical_str_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_OAK_LOG_STAIRS = registerBlock("vertical_str_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_OAK_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_OAK_WOOD_SLAB = registerBlock("vertical_str_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block VERTICAL_STR_OAK_WOOD_STAIRS = registerBlock("vertical_str_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD), Blocks.STRIPPED_OAK_WOOD.getDefaultState()));

    public static final Block VERTICAL_SPRUCE_SLAB = registerBlock("vertical_spruce_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block VERTICAL_SPRUCE_STAIRS = registerBlock("vertical_spruce_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS), Blocks.SPRUCE_PLANKS.getDefaultState()));
    public static final Block VERTICAL_SPRUCE_LOG_SLAB = registerBlock("vertical_spruce_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_SPRUCE_LOG_STAIRS = registerBlock("vertical_spruce_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.SPRUCE_LOG.getDefaultState()));
    public static final Block VERTICAL_SPRUCE_WOOD_SLAB = registerBlock("vertical_spruce_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block VERTICAL_SPRUCE_WOOD_STAIRS = registerBlock("vertical_spruce_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD), Blocks.SPRUCE_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_SPRUCE_LOG_SLAB = registerBlock("vertical_str_spruce_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_SPRUCE_LOG_STAIRS = registerBlock("vertical_str_spruce_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_SPRUCE_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_SPRUCE_WOOD_SLAB = registerBlock("vertical_str_spruce_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block VERTICAL_STR_SPRUCE_WOOD_STAIRS = registerBlock("vertical_str_spruce_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD), Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState()));

    public static final Block VERTICAL_BIRCH_SLAB = registerBlock("vertical_birch_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block VERTICAL_BIRCH_STAIRS = registerBlock("vertical_birch_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS), Blocks.BIRCH_PLANKS.getDefaultState()));
    public static final Block VERTICAL_BIRCH_LOG_SLAB = registerBlock("vertical_birch_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_BIRCH_LOG_STAIRS = registerBlock("vertical_birch_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.BIRCH_LOG.getDefaultState()));
    public static final Block VERTICAL_BIRCH_WOOD_SLAB = registerBlock("vertical_birch_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block VERTICAL_BIRCH_WOOD_STAIRS = registerBlock("vertical_birch_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD), Blocks.BIRCH_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_BIRCH_LOG_SLAB = registerBlock("vertical_str_birch_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_BIRCH_LOG_STAIRS = registerBlock("vertical_str_birch_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_BIRCH_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_BIRCH_WOOD_SLAB = registerBlock("vertical_str_birch_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block VERTICAL_STR_BIRCH_WOOD_STAIRS = registerBlock("vertical_str_birch_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD), Blocks.STRIPPED_BIRCH_WOOD.getDefaultState()));

    public static final Block VERTICAL_JUNGLE_SLAB = registerBlock("vertical_jungle_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block VERTICAL_JUNGLE_STAIRS = registerBlock("vertical_jungle_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS), Blocks.JUNGLE_PLANKS.getDefaultState()));
    public static final Block VERTICAL_JUNGLE_LOG_SLAB = registerBlock("vertical_jungle_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_JUNGLE_LOG_STAIRS = registerBlock("vertical_jungle_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.JUNGLE_LOG.getDefaultState()));
    public static final Block VERTICAL_JUNGLE_WOOD_SLAB = registerBlock("vertical_jungle_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block VERTICAL_JUNGLE_WOOD_STAIRS = registerBlock("vertical_jungle_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD), Blocks.JUNGLE_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_JUNGLE_LOG_SLAB = registerBlock("vertical_str_jungle_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_JUNGLE_LOG_STAIRS = registerBlock("vertical_str_jungle_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_JUNGLE_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_JUNGLE_WOOD_SLAB = registerBlock("vertical_str_jungle_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block VERTICAL_STR_JUNGLE_WOOD_STAIRS = registerBlock("vertical_str_jungle_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD), Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState()));

    public static final Block VERTICAL_ACACIA_SLAB = registerBlock("vertical_acacia_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block VERTICAL_ACACIA_STAIRS = registerBlock("vertical_acacia_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS), Blocks.ACACIA_PLANKS.getDefaultState()));
    public static final Block VERTICAL_ACACIA_LOG_SLAB = registerBlock("vertical_acacia_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_ACACIA_LOG_STAIRS = registerBlock("vertical_acacia_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.ACACIA_LOG.getDefaultState()));
    public static final Block VERTICAL_ACACIA_WOOD_SLAB = registerBlock("vertical_acacia_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block VERTICAL_ACACIA_WOOD_STAIRS = registerBlock("vertical_acacia_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD), Blocks.ACACIA_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_ACACIA_LOG_SLAB = registerBlock("vertical_str_acacia_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_ACACIA_LOG_STAIRS = registerBlock("vertical_str_acacia_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_ACACIA_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_ACACIA_WOOD_SLAB = registerBlock("vertical_str_acacia_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block VERTICAL_STR_ACACIA_WOOD_STAIRS = registerBlock("vertical_str_acacia_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD), Blocks.STRIPPED_ACACIA_WOOD.getDefaultState()));

    public static final Block VERTICAL_DARK_OAK_SLAB = registerBlock("vertical_dark_oak_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block VERTICAL_DARK_OAK_STAIRS = registerBlock("vertical_dark_oak_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS), Blocks.DARK_OAK_PLANKS.getDefaultState()));
    public static final Block VERTICAL_DARK_OAK_LOG_SLAB = registerBlock("vertical_dark_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_DARK_OAK_LOG_STAIRS = registerBlock("vertical_dark_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.DARK_OAK_LOG.getDefaultState()));
    public static final Block VERTICAL_DARK_OAK_WOOD_SLAB = registerBlock("vertical_dark_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block VERTICAL_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_dark_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD), Blocks.DARK_OAK_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_DARK_OAK_LOG_SLAB = registerBlock("vertical_str_dark_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_DARK_OAK_LOG_STAIRS = registerBlock("vertical_str_dark_oak_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_DARK_OAK_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_DARK_OAK_WOOD_SLAB = registerBlock("vertical_str_dark_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block VERTICAL_STR_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_str_dark_oak_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD), Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState()));

    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block VERTICAL_MANGROVE_STAIRS = registerBlock("vertical_mangrove_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS), Blocks.MANGROVE_PLANKS.getDefaultState()));
    public static final Block VERTICAL_MANGROVE_LOG_SLAB = registerBlock("vertical_mangrove_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_MANGROVE_LOG_STAIRS = registerBlock("vertical_mangrove_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.MANGROVE_LOG.getDefaultState()));
    public static final Block VERTICAL_MANGROVE_WOOD_SLAB = registerBlock("vertical_mangrove_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_MANGROVE_WOOD_STAIRS = registerBlock("vertical_mangrove_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.MANGROVE_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_MANGROVE_LOG_SLAB = registerBlock("vertical_str_mangrove_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_MANGROVE_LOG_STAIRS = registerBlock("vertical_str_mangrove_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_MANGROVE_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_MANGROVE_WOOD_SLAB = registerBlock("vertical_str_mangrove_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block VERTICAL_STR_MANGROVE_WOOD_STAIRS = registerBlock("vertical_str_mangrove_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF), Blocks.STRIPPED_MANGROVE_WOOD.getDefaultState()));

    public static final Block VERTICAL_CHERRY_SLAB = registerBlock("vertical_cherry_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block VERTICAL_CHERRY_STAIRS = registerBlock("vertical_cherry_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS), Blocks.CHERRY_PLANKS.getDefaultState()));
    public static final Block VERTICAL_CHERRY_LOG_SLAB = registerBlock("vertical_cherry_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block VERTICAL_CHERRY_LOG_STAIRS = registerBlock("vertical_cherry_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD), Blocks.CHERRY_LOG.getDefaultState()));
    public static final Block VERTICAL_CHERRY_WOOD_SLAB = registerBlock("vertical_cherry_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block VERTICAL_CHERRY_WOOD_STAIRS = registerBlock("vertical_cherry_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD), Blocks.CHERRY_WOOD.getDefaultState()));
    public static final Block VERTICAL_STR_CHERRY_LOG_SLAB = registerBlock("vertical_str_cherry_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block VERTICAL_STR_CHERRY_LOG_STAIRS = registerBlock("vertical_str_cherry_log_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD), Blocks.STRIPPED_CHERRY_LOG.getDefaultState()));
    public static final Block VERTICAL_STR_CHERRY_WOOD_SLAB = registerBlock("vertical_str_cherry_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block VERTICAL_STR_CHERRY_WOOD_STAIRS = registerBlock("vertical_str_cherry_wood_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD), Blocks.STRIPPED_CHERRY_WOOD.getDefaultState()));
    
    public static final Block BAMBOO_DEF = registerBlock("bamboo_def",
            new Block(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD)));

    public static final Block VERTICAL_BAMBOO_SLAB = registerBlock("vertical_bamboo_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_STAIRS = registerBlock("vertical_bamboo_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS), Blocks.BAMBOO_PLANKS.getDefaultState()));
    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB = registerBlock("vertical_bamboo_mosaic_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block VERTICAL_BAMBOO_MOSAIC_STAIRS = registerBlock("vertical_bamboo_mosaic_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS), Blocks.BAMBOO_PLANKS.getDefaultState()));
    public static final Block VERTICAL_BAMBOO_BLOCK_SLAB = registerBlock("vertical_bamboo_block_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_DEF)));
    public static final Block VERTICAL_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_bamboo_block_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(BAMBOO_DEF), Blocks.BAMBOO_BLOCK.getDefaultState()));
    public static final Block VERTICAL_STR_BAMBOO_BLOCK_SLAB = registerBlock("vertical_str_bamboo_block_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(BAMBOO_DEF)));
    public static final Block VERTICAL_STR_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_str_bamboo_block_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(BAMBOO_DEF), Blocks.STRIPPED_BAMBOO_BLOCK.getDefaultState()));

    public static final Block NETHER_DEF = registerBlock("nether_def",
            new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM)));

    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block VERTICAL_CRIMSON_STAIRS = registerBlock("vertical_crimson_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS), Blocks.CRIMSON_PLANKS.getDefaultState()));
    public static final Block VERTICAL_CRIMSON_STEM_SLAB = registerBlock("vertical_crimson_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_CRIMSON_STEM_STAIRS = registerBlock("vertical_crimson_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF), Blocks.CRIMSON_STEM.getDefaultState()));
    public static final Block VERTICAL_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_crimson_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_crimson_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD), Blocks.CRIMSON_HYPHAE.getDefaultState()));
    public static final Block VERTICAL_STR_CRIMSON_STEM_SLAB = registerBlock("vertical_str_crimson_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_STR_CRIMSON_STEM_STAIRS = registerBlock("vertical_str_crimson_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF), Blocks.STRIPPED_CRIMSON_STEM.getDefaultState()));
    public static final Block VERTICAL_STR_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_str_crimson_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_STR_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_str_crimson_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD), Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState()));

    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
    public static final Block VERTICAL_WARPED_STAIRS = registerBlock("vertical_warped_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS), Blocks.WARPED_PLANKS.getDefaultState()));
    public static final Block VERTICAL_WARPED_STEM_SLAB = registerBlock("vertical_warped_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_WARPED_STEM_STAIRS = registerBlock("vertical_warped_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF), Blocks.WARPED_STEM.getDefaultState()));
    public static final Block VERTICAL_WARPED_HYPHAE_SLAB = registerBlock("vertical_warped_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_HYPHAE_STAIRS = registerBlock("vertical_warped_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD), Blocks.WARPED_HYPHAE.getDefaultState()));
    public static final Block VERTICAL_STR_WARPED_STEM_SLAB = registerBlock("vertical_str_warped_stem_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block VERTICAL_STR_WARPED_STEM_STAIRS = registerBlock("vertical_str_warped_stem_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(NETHER_DEF), Blocks.STRIPPED_WARPED_STEM.getDefaultState()));
    public static final Block VERTICAL_STR_WARPED_HYPHAE_SLAB = registerBlock("vertical_str_warped_hyphae_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_STR_WARPED_HYPHAE_STAIRS = registerBlock("vertical_str_warped_hyphae_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD), Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState()));





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
