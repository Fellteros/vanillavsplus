package net.fellter.vanillavsplus.block;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.custom_blocks.concrete_powder.VerticalConcretePowderSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.concrete_powder.VerticalConcretePowderStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.copper.VerticalOxidizableSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.copper.VerticalOxidizableStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.flattenable.VerticalFlattenableSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.flattenable.VerticalFlattenableStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.glass.VerticalGlassSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.glass.VerticalGlassStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.redstone.VerticalRedstoneSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.redstone.VerticalRedstoneStairsBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.WorldView;

import java.util.function.Function;

public class ModBlocks {

    public static final Block LOG_DEF = registerBlock("log_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());

    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block VERTICAL_OAK_STAIRS = registerBlock("vertical_oak_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block VERTICAL_OAK_LOG_SLAB = registerBlock("vertical_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_OAK_LOG_STAIRS = registerBlock("vertical_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_OAK_WOOD_SLAB = registerBlock("vertical_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_OAK_WOOD_STAIRS = registerBlock("vertical_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_OAK_LOG_SLAB = registerBlock("vertical_str_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_OAK_LOG_STAIRS = registerBlock("vertical_str_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_OAK_WOOD_SLAB = registerBlock("vertical_str_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block VERTICAL_STR_OAK_WOOD_STAIRS = registerBlock("vertical_str_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block VERTICAL_SPRUCE_SLAB = registerBlock("vertical_spruce_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final Block VERTICAL_SPRUCE_STAIRS = registerBlock("vertical_spruce_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final Block VERTICAL_SPRUCE_LOG_SLAB = registerBlock("vertical_spruce_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_SPRUCE_LOG_STAIRS = registerBlock("vertical_spruce_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_SPRUCE_WOOD_SLAB = registerBlock("vertical_spruce_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block VERTICAL_SPRUCE_WOOD_STAIRS = registerBlock("vertical_spruce_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block VERTICAL_STR_SPRUCE_LOG_SLAB = registerBlock("vertical_str_spruce_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_SPRUCE_LOG_STAIRS = registerBlock("vertical_str_spruce_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_SPRUCE_WOOD_SLAB = registerBlock("vertical_str_spruce_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block VERTICAL_STR_SPRUCE_WOOD_STAIRS = registerBlock("vertical_str_spruce_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));

    public static final Block VERTICAL_BIRCH_SLAB = registerBlock("vertical_birch_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final Block VERTICAL_BIRCH_STAIRS = registerBlock("vertical_birch_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final Block VERTICAL_BIRCH_LOG_SLAB = registerBlock("vertical_birch_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_BIRCH_LOG_STAIRS = registerBlock("vertical_birch_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_BIRCH_WOOD_SLAB = registerBlock("vertical_birch_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block VERTICAL_BIRCH_WOOD_STAIRS = registerBlock("vertical_birch_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block VERTICAL_STR_BIRCH_LOG_SLAB = registerBlock("vertical_str_birch_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_BIRCH_LOG_STAIRS = registerBlock("vertical_str_birch_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_BIRCH_WOOD_SLAB = registerBlock("vertical_str_birch_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block VERTICAL_STR_BIRCH_WOOD_STAIRS = registerBlock("vertical_str_birch_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));

    public static final Block VERTICAL_JUNGLE_SLAB = registerBlock("vertical_jungle_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final Block VERTICAL_JUNGLE_STAIRS = registerBlock("vertical_jungle_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final Block VERTICAL_JUNGLE_LOG_SLAB = registerBlock("vertical_jungle_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_JUNGLE_LOG_STAIRS = registerBlock("vertical_jungle_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_JUNGLE_WOOD_SLAB = registerBlock("vertical_jungle_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block VERTICAL_JUNGLE_WOOD_STAIRS = registerBlock("vertical_jungle_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block VERTICAL_STR_JUNGLE_LOG_SLAB = registerBlock("vertical_str_jungle_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_JUNGLE_LOG_STAIRS = registerBlock("vertical_str_jungle_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_JUNGLE_WOOD_SLAB = registerBlock("vertical_str_jungle_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block VERTICAL_STR_JUNGLE_WOOD_STAIRS = registerBlock("vertical_str_jungle_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));

    public static final Block VERTICAL_ACACIA_SLAB = registerBlock("vertical_acacia_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final Block VERTICAL_ACACIA_STAIRS = registerBlock("vertical_acacia_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final Block VERTICAL_ACACIA_LOG_SLAB = registerBlock("vertical_acacia_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_ACACIA_LOG_STAIRS = registerBlock("vertical_acacia_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_ACACIA_WOOD_SLAB = registerBlock("vertical_acacia_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block VERTICAL_ACACIA_WOOD_STAIRS = registerBlock("vertical_acacia_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block VERTICAL_STR_ACACIA_LOG_SLAB = registerBlock("vertical_str_acacia_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_ACACIA_LOG_STAIRS = registerBlock("vertical_str_acacia_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_ACACIA_WOOD_SLAB = registerBlock("vertical_str_acacia_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block VERTICAL_STR_ACACIA_WOOD_STAIRS = registerBlock("vertical_str_acacia_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));

    public static final Block VERTICAL_DARK_OAK_SLAB = registerBlock("vertical_dark_oak_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final Block VERTICAL_DARK_OAK_STAIRS = registerBlock("vertical_dark_oak_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final Block VERTICAL_DARK_OAK_LOG_SLAB = registerBlock("vertical_dark_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_DARK_OAK_LOG_STAIRS = registerBlock("vertical_dark_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_DARK_OAK_WOOD_SLAB = registerBlock("vertical_dark_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block VERTICAL_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_dark_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block VERTICAL_STR_DARK_OAK_LOG_SLAB = registerBlock("vertical_str_dark_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_DARK_OAK_LOG_STAIRS = registerBlock("vertical_str_dark_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_DARK_OAK_WOOD_SLAB = registerBlock("vertical_str_dark_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block VERTICAL_STR_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_str_dark_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));

    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS));
    public static final Block VERTICAL_MANGROVE_STAIRS = registerBlock("vertical_mangrove_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS));
    public static final Block VERTICAL_MANGROVE_LOG_SLAB = registerBlock("vertical_mangrove_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_MANGROVE_LOG_STAIRS = registerBlock("vertical_mangrove_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_MANGROVE_WOOD_SLAB = registerBlock("vertical_mangrove_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_MANGROVE_WOOD_STAIRS = registerBlock("vertical_mangrove_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_MANGROVE_LOG_SLAB = registerBlock("vertical_str_mangrove_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_MANGROVE_LOG_STAIRS = registerBlock("vertical_str_mangrove_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_MANGROVE_WOOD_SLAB = registerBlock("vertical_str_mangrove_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block VERTICAL_STR_MANGROVE_WOOD_STAIRS = registerBlock("vertical_str_mangrove_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    public static final Block VERTICAL_CHERRY_SLAB = registerBlock("vertical_cherry_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS));
    public static final Block VERTICAL_CHERRY_STAIRS = registerBlock("vertical_cherry_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS));
    public static final Block VERTICAL_CHERRY_LOG_SLAB = registerBlock("vertical_cherry_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block VERTICAL_CHERRY_LOG_STAIRS = registerBlock("vertical_cherry_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block VERTICAL_CHERRY_WOOD_SLAB = registerBlock("vertical_cherry_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block VERTICAL_CHERRY_WOOD_STAIRS = registerBlock("vertical_cherry_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block VERTICAL_STR_CHERRY_LOG_SLAB = registerBlock("vertical_str_cherry_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block VERTICAL_STR_CHERRY_LOG_STAIRS = registerBlock("vertical_str_cherry_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block VERTICAL_STR_CHERRY_WOOD_SLAB = registerBlock("vertical_str_cherry_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block VERTICAL_STR_CHERRY_WOOD_STAIRS = registerBlock("vertical_str_cherry_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    
    public static final Block BAMBOO_DEF = registerBlock("bamboo_def", Block::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD));

    public static final Block VERTICAL_BAMBOO_SLAB = registerBlock("vertical_bamboo_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final Block VERTICAL_BAMBOO_STAIRS = registerBlock("vertical_bamboo_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB = registerBlock("vertical_bamboo_mosaic_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final Block VERTICAL_BAMBOO_MOSAIC_STAIRS = registerBlock("vertical_bamboo_mosaic_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final Block VERTICAL_BAMBOO_BLOCK_SLAB = registerBlock("vertical_bamboo_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF));
    public static final Block VERTICAL_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_bamboo_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF));
    public static final Block VERTICAL_STR_BAMBOO_BLOCK_SLAB = registerBlock("vertical_str_bamboo_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF));
    public static final Block VERTICAL_STR_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_str_bamboo_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF));

    public static final Block NETHER_DEF = registerBlock("nether_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final Block VERTICAL_CRIMSON_STAIRS = registerBlock("vertical_crimson_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final Block VERTICAL_CRIMSON_STEM_SLAB = registerBlock("vertical_crimson_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_CRIMSON_STEM_STAIRS = registerBlock("vertical_crimson_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_crimson_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block VERTICAL_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_crimson_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block VERTICAL_STR_CRIMSON_STEM_SLAB = registerBlock("vertical_str_crimson_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_STR_CRIMSON_STEM_STAIRS = registerBlock("vertical_str_crimson_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_STR_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_str_crimson_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block VERTICAL_STR_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_str_crimson_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));

    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS));
    public static final Block VERTICAL_WARPED_STAIRS = registerBlock("vertical_warped_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS));
    public static final Block VERTICAL_WARPED_STEM_SLAB = registerBlock("vertical_warped_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_WARPED_STEM_STAIRS = registerBlock("vertical_warped_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_WARPED_HYPHAE_SLAB = registerBlock("vertical_warped_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block VERTICAL_WARPED_HYPHAE_STAIRS = registerBlock("vertical_warped_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block VERTICAL_STR_WARPED_STEM_SLAB = registerBlock("vertical_str_warped_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_STR_WARPED_STEM_STAIRS = registerBlock("vertical_str_warped_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block VERTICAL_STR_WARPED_HYPHAE_SLAB = registerBlock("vertical_str_warped_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block VERTICAL_STR_WARPED_HYPHAE_STAIRS = registerBlock("vertical_str_warped_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).sounds(BlockSoundGroup.NETHER_WOOD));
    
    public static final Block VERTICAL_STONE_SLAB = registerBlock("vertical_stone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block VERTICAL_STONE_STAIRS = registerBlock("vertical_stone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block VERTICAL_COBBLESTONE_SLAB = registerBlock("vertical_cobblestone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block VERTICAL_COBBLESTONE_STAIRS = registerBlock("vertical_cobblestone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = registerBlock("vertical_mossy_cobblestone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_STAIRS = registerBlock("vertical_mossy_cobblestone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = registerBlock("vertical_smooth_stone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block VERTICAL_SMOOTH_STONE_STAIRS = registerBlock("vertical_smooth_stone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block VERTICAL_STONE_BRICKS_SLAB = registerBlock("vertical_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block VERTICAL_STONE_BRICKS_STAIRS = registerBlock("vertical_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block VERTICAL_CRACKED_STONE_BRICKS_SLAB = registerBlock("vertical_cracked_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block VERTICAL_CRACKED_STONE_BRICKS_STAIRS = registerBlock("vertical_cracked_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block VERTICAL_CHISELED_STONE_BRICKS_SLAB = registerBlock("vertical_chiseled_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS));
    public static final Block VERTICAL_CHISELED_STONE_BRICKS_STAIRS = registerBlock("vertical_chiseled_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS));
    public static final Block VERTICAL_MOSSY_STONE_BRICKS_SLAB = registerBlock("vertical_mossy_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
    public static final Block VERTICAL_MOSSY_STONE_BRICKS_STAIRS = registerBlock("vertical_mossy_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
    
    public static final Block VERTICAL_GRANITE_SLAB = registerBlock("vertical_granite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block VERTICAL_GRANITE_STAIRS = registerBlock("vertical_granite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = registerBlock("vertical_polished_granite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block VERTICAL_POLISHED_GRANITE_STAIRS = registerBlock("vertical_polished_granite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    
    public static final Block VERTICAL_DIORITE_SLAB = registerBlock("vertical_diorite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block VERTICAL_DIORITE_STAIRS = registerBlock("vertical_diorite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = registerBlock("vertical_polished_diorite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block VERTICAL_POLISHED_DIORITE_STAIRS = registerBlock("vertical_polished_diorite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    
    public static final Block VERTICAL_ANDESITE_SLAB = registerBlock("vertical_andesite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block VERTICAL_ANDESITE_STAIRS = registerBlock("vertical_andesite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = registerBlock("vertical_polished_andesite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block VERTICAL_POLISHED_ANDESITE_STAIRS = registerBlock("vertical_polished_andesite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));

    public static final Block VERTICAL_DEEPSLATE_SLAB = registerBlock("vertical_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block VERTICAL_DEEPSLATE_STAIRS = registerBlock("vertical_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = registerBlock("vertical_cobbled_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_STAIRS = registerBlock("vertical_cobbled_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block VERTICAL_CHISELED_DEEPSLATE_SLAB = registerBlock("vertical_chiseled_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block VERTICAL_CHISELED_DEEPSLATE_STAIRS = registerBlock("vertical_chiseled_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = registerBlock("vertical_polished_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_STAIRS = registerBlock("vertical_polished_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE));
    public static final Block VERTICAL_DEEPSLATE_BRICKS_SLAB = registerBlock("vertical_deepslate_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block VERTICAL_DEEPSLATE_BRICKS_STAIRS = registerBlock("vertical_deepslate_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("vertical_cracked_deepslate_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("vertical_cracked_deepslate_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block VERTICAL_DEEPSLATE_TILES_SLAB = registerBlock("vertical_deepslate_tiles_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block VERTICAL_DEEPSLATE_TILES_STAIRS = registerBlock("vertical_deepslate_tiles_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("vertical_cracked_deepslate_tiles_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("vertical_cracked_deepslate_tiles_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES));
    
    public static final Block VERTICAL_TUFF_SLAB = registerBlock("vertical_tuff_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block VERTICAL_TUFF_STAIRS = registerBlock("vertical_tuff_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block VERTICAL_CHISELED_TUFF_SLAB = registerBlock("vertical_chiseled_tuff_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block VERTICAL_CHISELED_TUFF_STAIRS = registerBlock("vertical_chiseled_tuff_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block VERTICAL_POLISHED_TUFF_SLAB = registerBlock("vertical_polished_tuff_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
    public static final Block VERTICAL_POLISHED_TUFF_STAIRS = registerBlock("vertical_polished_tuff_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
    public static final Block VERTICAL_TUFF_BRICKS_SLAB = registerBlock("vertical_tuff_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
    public static final Block VERTICAL_TUFF_BRICKS_STAIRS = registerBlock("vertical_tuff_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
    public static final Block VERTICAL_CHISELED_TUFF_BRICKS_SLAB = registerBlock("vertical_chiseled_tuff_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS));
    public static final Block VERTICAL_CHISELED_TUFF_BRICKS_STAIRS = registerBlock("vertical_chiseled_tuff_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS));
    
    public static final Block VERTICAL_BRICKS_SLAB = registerBlock("vertical_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BRICKS));
    public static final Block VERTICAL_BRICKS_STAIRS = registerBlock("vertical_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BRICKS));
    public static final Block VERTICAL_PACKED_MUD_SLAB = registerBlock("vertical_packed_mud_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block VERTICAL_PACKED_MUD_STAIRS = registerBlock("vertical_packed_mud_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block VERTICAL_MUD_BRICKS_SLAB = registerBlock("vertical_mud_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));
    public static final Block VERTICAL_MUD_BRICKS_STAIRS = registerBlock("vertical_mud_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));

    public static final Block VERTICAL_SANDSTONE_SLAB = registerBlock("vertical_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final Block VERTICAL_SANDSTONE_STAIRS = registerBlock("vertical_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final Block VERTICAL_CHISELED_SANDSTONE_SLAB = registerBlock("vertical_chiseled_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE));
    public static final Block VERTICAL_CHISELED_SANDSTONE_STAIRS = registerBlock("vertical_chiseled_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = registerBlock("vertical_smooth_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_STAIRS = registerBlock("vertical_smooth_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = registerBlock("vertical_cut_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block VERTICAL_CUT_SANDSTONE_STAIRS = registerBlock("vertical_cut_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));

    public static final Block VERTICAL_RED_SANDSTONE_SLAB = registerBlock("vertical_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final Block VERTICAL_RED_SANDSTONE_STAIRS = registerBlock("vertical_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final Block VERTICAL_CHISELED_RED_SANDSTONE_SLAB = registerBlock("vertical_chiseled_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE));
    public static final Block VERTICAL_CHISELED_RED_SANDSTONE_STAIRS = registerBlock("vertical_chiseled_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = registerBlock("vertical_smooth_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS = registerBlock("vertical_smooth_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = registerBlock("vertical_cut_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_STAIRS = registerBlock("vertical_cut_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));

    public static final Block VERTICAL_SEA_LANTERN_SLAB = registerBlock("vertical_sea_lantern_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block VERTICAL_SEA_LANTERN_STAIRS = registerBlock("vertical_sea_lantern_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block VERTICAL_PRISMARINE_SLAB = registerBlock("vertical_prismarine_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    public static final Block VERTICAL_PRISMARINE_STAIRS = registerBlock("vertical_prismarine_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    public static final Block VERTICAL_PRISMARINE_BRICKS_SLAB = registerBlock("vertical_prismarine_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block VERTICAL_PRISMARINE_BRICKS_STAIRS = registerBlock("vertical_prismarine_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = registerBlock("vertical_dark_prismarine_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final Block VERTICAL_DARK_PRISMARINE_STAIRS = registerBlock("vertical_dark_prismarine_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    
    public static final Block VERTICAL_NETHERRACK_SLAB = registerBlock("vertical_netherrack_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block VERTICAL_NETHERRACK_STAIRS = registerBlock("vertical_netherrack_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block VERTICAL_NETHER_BRICKS_SLAB = registerBlock("vertical_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block VERTICAL_NETHER_BRICKS_STAIRS = registerBlock("vertical_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block VERTICAL_CRACKED_NETHER_BRICKS_SLAB = registerBlock("vertical_cracked_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block VERTICAL_CRACKED_NETHER_BRICKS_STAIRS = registerBlock("vertical_cracked_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block VERTICAL_CHISELED_NETHER_BRICKS_SLAB = registerBlock("vertical_chiseled_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS));
    public static final Block VERTICAL_CHISELED_NETHER_BRICKS_STAIRS = registerBlock("vertical_chiseled_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS));
    public static final Block VERTICAL_RED_NETHER_BRICKS_SLAB = registerBlock("vertical_red_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final Block VERTICAL_RED_NETHER_BRICKS_STAIRS = registerBlock("vertical_red_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));

    public static final Block VERTICAL_BASALT_SLAB = registerBlock("vertical_basalt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block VERTICAL_BASALT_STAIRS = registerBlock("vertical_basalt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block VERTICAL_SMOOTH_BASALT_SLAB = registerBlock("vertical_smooth_basalt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block VERTICAL_SMOOTH_BASALT_STAIRS = registerBlock("vertical_smooth_basalt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block VERTICAL_POLISHED_BASALT_SLAB = registerBlock("vertical_polished_basalt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block VERTICAL_POLISHED_BASALT_STAIRS = registerBlock("vertical_polished_basalt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    
    public static final Block VERTICAL_BLACKSTONE_SLAB = registerBlock("vertical_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block VERTICAL_BLACKSTONE_STAIRS = registerBlock("vertical_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block VERTICAL_GILDED_BLACKSTONE_SLAB = registerBlock("vertical_gilded_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block VERTICAL_GILDED_BLACKSTONE_STAIRS = registerBlock("vertical_gilded_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock("vertical_chiseled_polished_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE));
    public static final Block VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS = registerBlock("vertical_chiseled_polished_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = registerBlock("vertical_polished_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_STAIRS = registerBlock("vertical_polished_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("vertical_polished_blackstone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("vertical_polished_blackstone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS));
    public static final Block VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("vertical_cracked_polished_blackstone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("vertical_cracked_polished_blackstone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    
    public static final Block VERTICAL_END_STONE_SLAB = registerBlock("vertical_end_stone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block VERTICAL_END_STONE_STAIRS = registerBlock("vertical_end_stone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block VERTICAL_END_STONE_BRICKS_SLAB = registerBlock("vertical_end_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));
    public static final Block VERTICAL_END_STONE_BRICKS_STAIRS = registerBlock("vertical_end_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));
    public static final Block VERTICAL_PURPUR_SLAB = registerBlock("vertical_purpur_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block VERTICAL_PURPUR_STAIRS = registerBlock("vertical_purpur_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block VERTICAL_PURPUR_PILLAR_SLAB = registerBlock("vertical_purpur_pillar_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR));
    public static final Block VERTICAL_PURPUR_PILLAR_STAIRS = registerBlock("vertical_purpur_pillar_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR));
    
    public static final Block VERTICAL_COAL_SLAB = registerBlock("vertical_coal_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block VERTICAL_COAL_STAIRS = registerBlock("vertical_coal_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block VERTICAL_IRON_SLAB = registerBlock("vertical_iron_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block VERTICAL_IRON_STAIRS = registerBlock("vertical_iron_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block VERTICAL_GOLD_SLAB = registerBlock("vertical_gold_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block VERTICAL_GOLD_STAIRS = registerBlock("vertical_gold_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block VERTICAL_REDSTONE_SLAB = registerBlock("vertical_redstone_slab", VerticalRedstoneSlabBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block VERTICAL_REDSTONE_STAIRS = registerBlock("vertical_redstone_stairs", VerticalRedstoneStairsBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block VERTICAL_EMERALD_SLAB = registerBlock("vertical_emerald_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block VERTICAL_EMERALD_STAIRS = registerBlock("vertical_emerald_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block VERTICAL_LAPIS_SLAB = registerBlock("vertical_lapis_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block VERTICAL_LAPIS_STAIRS = registerBlock("vertical_lapis_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block VERTICAL_DIAMOND_SLAB = registerBlock("vertical_diamond_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block VERTICAL_DIAMOND_STAIRS = registerBlock("vertical_diamond_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block VERTICAL_NETHERITE_SLAB = registerBlock("vertical_netherite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block VERTICAL_NETHERITE_STAIRS = registerBlock("vertical_netherite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));

    public static final Block VERTICAL_QUARTZ_SLAB = registerBlock("vertical_quartz_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block VERTICAL_QUARTZ_STAIRS = registerBlock("vertical_quartz_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block VERTICAL_CHISELED_QUARTZ_SLAB = registerBlock("vertical_chiseled_quartz_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final Block VERTICAL_CHISELED_QUARTZ_STAIRS = registerBlock("vertical_chiseled_quartz_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final Block VERTICAL_QUARTZ_BRICKS_SLAB = registerBlock("vertical_quartz_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block VERTICAL_QUARTZ_BRICKS_STAIRS = registerBlock("vertical_quartz_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block VERTICAL_QUARTZ_PILLAR_SLAB = registerBlock("vertical_quartz_pillar_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR));
    public static final Block VERTICAL_QUARTZ_PILLAR_STAIRS = registerBlock("vertical_quartz_pillar_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR));
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = registerBlock("vertical_smooth_quartz_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block VERTICAL_SMOOTH_QUARTZ_STAIRS = registerBlock("vertical_smooth_quartz_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));

    public static final Block VERTICAL_AMETHYST_SLAB = registerBlock("vertical_amethyst_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block VERTICAL_AMETHYST_STAIRS = registerBlock("vertical_amethyst_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));

    public static final Block VERTICAL_COPPER_SLAB = registerBlock("vertical_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block VERTICAL_COPPER_STAIRS = registerBlock("vertical_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block VERTICAL_EXPOSED_COPPER_SLAB = registerBlock("vertical_exposed_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block VERTICAL_EXPOSED_COPPER_STAIRS = registerBlock("vertical_exposed_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block VERTICAL_WEATHERED_COPPER_SLAB = registerBlock("vertical_weathered_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block VERTICAL_WEATHERED_COPPER_STAIRS = registerBlock("vertical_weathered_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block VERTICAL_OXIDIZED_COPPER_SLAB = registerBlock("vertical_oxidized_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final Block VERTICAL_OXIDIZED_COPPER_STAIRS = registerBlock("vertical_oxidized_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));

    public static final Block VERTICAL_CHISELED_COPPER_SLAB = registerBlock("vertical_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block VERTICAL_CHISELED_COPPER_STAIRS = registerBlock("vertical_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block VERTICAL_EXPOSED_CHISELED_COPPER_SLAB = registerBlock("vertical_exposed_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("vertical_exposed_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_WEATHERED_CHISELED_COPPER_SLAB = registerBlock("vertical_weathered_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("vertical_weathered_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("vertical_oxidized_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block VERTICAL_OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("vertical_oxidized_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));

    public static final Block VERTICAL_COPPER_GRATE_SLAB = registerBlock("vertical_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block VERTICAL_COPPER_GRATE_STAIRS = registerBlock("vertical_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block VERTICAL_EXPOSED_COPPER_GRATE_SLAB = registerBlock("vertical_exposed_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block VERTICAL_EXPOSED_COPPER_GRATE_STAIRS = registerBlock("vertical_exposed_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block VERTICAL_WEATHERED_COPPER_GRATE_SLAB = registerBlock("vertical_weathered_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block VERTICAL_WEATHERED_COPPER_GRATE_STAIRS = registerBlock("vertical_weathered_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block VERTICAL_OXIDIZED_COPPER_GRATE_SLAB = registerBlock("vertical_oxidized_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block VERTICAL_OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("vertical_oxidized_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));

    public static final Block VERTICAL_CUT_COPPER_SLAB = registerBlock("vertical_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block VERTICAL_CUT_COPPER_STAIRS = registerBlock("vertical_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = registerBlock("vertical_exposed_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_STAIRS = registerBlock("vertical_exposed_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = registerBlock("vertical_weathered_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_STAIRS = registerBlock("vertical_weathered_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = registerBlock("vertical_oxidized_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_STAIRS = registerBlock("vertical_oxidized_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));

    public static final Block VERTICAL_WAXED_COPPER_SLAB = registerBlock("vertical_waxed_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block VERTICAL_WAXED_COPPER_STAIRS = registerBlock("vertical_waxed_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_SLAB = registerBlock("vertical_waxed_exposed_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_STAIRS = registerBlock("vertical_waxed_exposed_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_SLAB = registerBlock("vertical_waxed_weathered_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_STAIRS = registerBlock("vertical_waxed_weathered_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_SLAB = registerBlock("vertical_waxed_oxidized_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("vertical_waxed_oxidized_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));

    public static final Block VERTICAL_WAXED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_exposed_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_exposed_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_weathered_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_weathered_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_oxidized_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_oxidized_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));

    public static final Block VERTICAL_WAXED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block VERTICAL_WAXED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_exposed_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_exposed_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_weathered_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_weathered_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_oxidized_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_oxidized_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));

    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_exposed_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_exposed_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_weathered_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_weathered_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_oxidized_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_oxidized_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    
    public static final Block VERTICAL_WHITE_WOOL_SLAB = registerBlock("vertical_white_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block VERTICAL_WHITE_WOOL_STAIRS = registerBlock("vertical_white_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block VERTICAL_LIGHT_GRAY_WOOL_SLAB = registerBlock("vertical_light_gray_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block VERTICAL_LIGHT_GRAY_WOOL_STAIRS = registerBlock("vertical_light_gray_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block VERTICAL_GRAY_WOOL_SLAB = registerBlock("vertical_gray_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block VERTICAL_GRAY_WOOL_STAIRS = registerBlock("vertical_gray_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block VERTICAL_BLACK_WOOL_SLAB = registerBlock("vertical_black_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block VERTICAL_BLACK_WOOL_STAIRS = registerBlock("vertical_black_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block VERTICAL_BROWN_WOOL_SLAB = registerBlock("vertical_brown_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block VERTICAL_BROWN_WOOL_STAIRS = registerBlock("vertical_brown_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block VERTICAL_RED_WOOL_SLAB = registerBlock("vertical_red_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block VERTICAL_RED_WOOL_STAIRS = registerBlock("vertical_red_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block VERTICAL_ORANGE_WOOL_SLAB = registerBlock("vertical_orange_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block VERTICAL_ORANGE_WOOL_STAIRS = registerBlock("vertical_orange_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block VERTICAL_YELLOW_WOOL_SLAB = registerBlock("vertical_yellow_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block VERTICAL_YELLOW_WOOL_STAIRS = registerBlock("vertical_yellow_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block VERTICAL_LIME_WOOL_SLAB = registerBlock("vertical_lime_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block VERTICAL_LIME_WOOL_STAIRS = registerBlock("vertical_lime_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block VERTICAL_GREEN_WOOL_SLAB = registerBlock("vertical_green_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block VERTICAL_GREEN_WOOL_STAIRS = registerBlock("vertical_green_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block VERTICAL_CYAN_WOOL_SLAB = registerBlock("vertical_cyan_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block VERTICAL_CYAN_WOOL_STAIRS = registerBlock("vertical_cyan_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block VERTICAL_LIGHT_BLUE_WOOL_SLAB = registerBlock("vertical_light_blue_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block VERTICAL_LIGHT_BLUE_WOOL_STAIRS = registerBlock("vertical_light_blue_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block VERTICAL_BLUE_WOOL_SLAB = registerBlock("vertical_blue_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block VERTICAL_BLUE_WOOL_STAIRS = registerBlock("vertical_blue_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block VERTICAL_PURPLE_WOOL_SLAB = registerBlock("vertical_purple_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block VERTICAL_PURPLE_WOOL_STAIRS = registerBlock("vertical_purple_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block VERTICAL_MAGENTA_WOOL_SLAB = registerBlock("vertical_magenta_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block VERTICAL_MAGENTA_WOOL_STAIRS = registerBlock("vertical_magenta_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block VERTICAL_PINK_WOOL_SLAB = registerBlock("vertical_pink_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block VERTICAL_PINK_WOOL_STAIRS = registerBlock("vertical_pink_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_WOOL));

    public static final Block VERTICAL_TERRACOTTA_SLAB = registerBlock("vertical_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block VERTICAL_TERRACOTTA_STAIRS = registerBlock("vertical_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block VERTICAL_WHITE_TERRACOTTA_SLAB = registerBlock("vertical_white_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block VERTICAL_WHITE_TERRACOTTA_STAIRS = registerBlock("vertical_white_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("vertical_light_gray_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("vertical_light_gray_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block VERTICAL_GRAY_TERRACOTTA_SLAB = registerBlock("vertical_gray_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block VERTICAL_GRAY_TERRACOTTA_STAIRS = registerBlock("vertical_gray_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block VERTICAL_BLACK_TERRACOTTA_SLAB = registerBlock("vertical_black_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block VERTICAL_BLACK_TERRACOTTA_STAIRS = registerBlock("vertical_black_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block VERTICAL_BROWN_TERRACOTTA_SLAB = registerBlock("vertical_brown_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block VERTICAL_BROWN_TERRACOTTA_STAIRS = registerBlock("vertical_brown_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block VERTICAL_RED_TERRACOTTA_SLAB = registerBlock("vertical_red_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block VERTICAL_RED_TERRACOTTA_STAIRS = registerBlock("vertical_red_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_TERRACOTTA_SLAB = registerBlock("vertical_orange_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_TERRACOTTA_STAIRS = registerBlock("vertical_orange_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_TERRACOTTA_SLAB = registerBlock("vertical_yellow_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_TERRACOTTA_STAIRS = registerBlock("vertical_yellow_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block VERTICAL_LIME_TERRACOTTA_SLAB = registerBlock("vertical_lime_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block VERTICAL_LIME_TERRACOTTA_STAIRS = registerBlock("vertical_lime_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block VERTICAL_GREEN_TERRACOTTA_SLAB = registerBlock("vertical_green_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block VERTICAL_GREEN_TERRACOTTA_STAIRS = registerBlock("vertical_green_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block VERTICAL_CYAN_TERRACOTTA_SLAB = registerBlock("vertical_cyan_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block VERTICAL_CYAN_TERRACOTTA_STAIRS = registerBlock("vertical_cyan_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("vertical_light_blue_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("vertical_light_blue_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block VERTICAL_BLUE_TERRACOTTA_SLAB = registerBlock("vertical_blue_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block VERTICAL_BLUE_TERRACOTTA_STAIRS = registerBlock("vertical_blue_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_TERRACOTTA_SLAB = registerBlock("vertical_purple_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_TERRACOTTA_STAIRS = registerBlock("vertical_purple_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_TERRACOTTA_SLAB = registerBlock("vertical_magenta_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_TERRACOTTA_STAIRS = registerBlock("vertical_magenta_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block VERTICAL_PINK_TERRACOTTA_SLAB = registerBlock("vertical_pink_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block VERTICAL_PINK_TERRACOTTA_STAIRS = registerBlock("vertical_pink_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));

    public static final Block VERTICAL_WHITE_CONCRETE_SLAB = registerBlock("vertical_white_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block VERTICAL_WHITE_CONCRETE_STAIRS = registerBlock("vertical_white_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("vertical_light_gray_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("vertical_light_gray_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block VERTICAL_GRAY_CONCRETE_SLAB = registerBlock("vertical_gray_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block VERTICAL_GRAY_CONCRETE_STAIRS = registerBlock("vertical_gray_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block VERTICAL_BLACK_CONCRETE_SLAB = registerBlock("vertical_black_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block VERTICAL_BLACK_CONCRETE_STAIRS = registerBlock("vertical_black_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block VERTICAL_BROWN_CONCRETE_SLAB = registerBlock("vertical_brown_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block VERTICAL_BROWN_CONCRETE_STAIRS = registerBlock("vertical_brown_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block VERTICAL_RED_CONCRETE_SLAB = registerBlock("vertical_red_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block VERTICAL_RED_CONCRETE_STAIRS = registerBlock("vertical_red_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block VERTICAL_ORANGE_CONCRETE_SLAB = registerBlock("vertical_orange_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block VERTICAL_ORANGE_CONCRETE_STAIRS = registerBlock("vertical_orange_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block VERTICAL_YELLOW_CONCRETE_SLAB = registerBlock("vertical_yellow_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block VERTICAL_YELLOW_CONCRETE_STAIRS = registerBlock("vertical_yellow_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block VERTICAL_LIME_CONCRETE_SLAB = registerBlock("vertical_lime_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block VERTICAL_LIME_CONCRETE_STAIRS = registerBlock("vertical_lime_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block VERTICAL_GREEN_CONCRETE_SLAB = registerBlock("vertical_green_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block VERTICAL_GREEN_CONCRETE_STAIRS = registerBlock("vertical_green_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block VERTICAL_CYAN_CONCRETE_SLAB = registerBlock("vertical_cyan_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block VERTICAL_CYAN_CONCRETE_STAIRS = registerBlock("vertical_cyan_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("vertical_light_blue_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("vertical_light_blue_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block VERTICAL_BLUE_CONCRETE_SLAB = registerBlock("vertical_blue_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block VERTICAL_BLUE_CONCRETE_STAIRS = registerBlock("vertical_blue_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block VERTICAL_PURPLE_CONCRETE_SLAB = registerBlock("vertical_purple_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block VERTICAL_PURPLE_CONCRETE_STAIRS = registerBlock("vertical_purple_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block VERTICAL_MAGENTA_CONCRETE_SLAB = registerBlock("vertical_magenta_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block VERTICAL_MAGENTA_CONCRETE_STAIRS = registerBlock("vertical_magenta_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block VERTICAL_PINK_CONCRETE_SLAB = registerBlock("vertical_pink_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block VERTICAL_PINK_CONCRETE_STAIRS = registerBlock("vertical_pink_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));

    public static final Block VERTICAL_WHITE_CONCRETE_POWDER_SLAB = registerBlock("vertical_white_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_WHITE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block VERTICAL_WHITE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_white_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_WHITE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("vertical_light_gray_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_STAIRS = registerBlock("vertical_light_gray_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_GRAY_CONCRETE_POWDER_SLAB = registerBlock("vertical_gray_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_GRAY_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_GRAY_CONCRETE_POWDER_STAIRS = registerBlock("vertical_gray_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_GRAY_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_BLACK_CONCRETE_POWDER_SLAB = registerBlock("vertical_black_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_BLACK_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block VERTICAL_BLACK_CONCRETE_POWDER_STAIRS = registerBlock("vertical_black_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_BLACK_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block VERTICAL_BROWN_CONCRETE_POWDER_SLAB = registerBlock("vertical_brown_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_BROWN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block VERTICAL_BROWN_CONCRETE_POWDER_STAIRS = registerBlock("vertical_brown_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_BROWN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block VERTICAL_RED_CONCRETE_POWDER_SLAB = registerBlock("vertical_red_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_RED_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block VERTICAL_RED_CONCRETE_POWDER_STAIRS = registerBlock("vertical_red_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_RED_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block VERTICAL_ORANGE_CONCRETE_POWDER_SLAB = registerBlock("vertical_orange_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_ORANGE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block VERTICAL_ORANGE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_orange_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_ORANGE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block VERTICAL_YELLOW_CONCRETE_POWDER_SLAB = registerBlock("vertical_yellow_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_YELLOW_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block VERTICAL_YELLOW_CONCRETE_POWDER_STAIRS = registerBlock("vertical_yellow_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_YELLOW_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block VERTICAL_LIME_CONCRETE_POWDER_SLAB = registerBlock("vertical_lime_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_LIME_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block VERTICAL_LIME_CONCRETE_POWDER_STAIRS = registerBlock("vertical_lime_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_LIME_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block VERTICAL_GREEN_CONCRETE_POWDER_SLAB = registerBlock("vertical_green_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_GREEN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block VERTICAL_GREEN_CONCRETE_POWDER_STAIRS = registerBlock("vertical_green_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_GREEN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block VERTICAL_CYAN_CONCRETE_POWDER_SLAB = registerBlock("vertical_cyan_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_CYAN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block VERTICAL_CYAN_CONCRETE_POWDER_STAIRS = registerBlock("vertical_cyan_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_CYAN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("vertical_light_blue_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_light_blue_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_BLUE_CONCRETE_POWDER_SLAB = registerBlock("vertical_blue_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_BLUE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_BLUE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_blue_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_BLUE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_PURPLE_CONCRETE_POWDER_SLAB = registerBlock("vertical_purple_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_PURPLE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block VERTICAL_PURPLE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_purple_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_PURPLE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block VERTICAL_MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("vertical_magenta_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_MAGENTA_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block VERTICAL_MAGENTA_CONCRETE_POWDER_STAIRS = registerBlock("vertical_magenta_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_MAGENTA_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block VERTICAL_PINK_CONCRETE_POWDER_SLAB = registerBlock("vertical_pink_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_PINK_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block VERTICAL_PINK_CONCRETE_POWDER_STAIRS = registerBlock("vertical_pink_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_PINK_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));

    public static final Block VERTICAL_WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_white_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_white_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_light_gray_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_light_gray_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_gray_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_gray_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_black_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_black_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_brown_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_brown_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_RED_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_red_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_red_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_orange_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_orange_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_yellow_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_yellow_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_lime_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_lime_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_green_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_green_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_cyan_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_cyan_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_light_blue_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_light_blue_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_blue_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_blue_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_purple_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_purple_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_magenta_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_magenta_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_pink_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_pink_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));

    public static final Block VERTICAL_GLASS_SLAB = registerBlock("vertical_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GLASS));
    public static final Block VERTICAL_GLASS_STAIRS = registerBlock("vertical_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GLASS));
    public static final Block VERTICAL_WHITE_STAINED_GLASS_SLAB = registerBlock("vertical_white_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block VERTICAL_WHITE_STAINED_GLASS_STAIRS = registerBlock("vertical_white_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block VERTICAL_LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("vertical_light_gray_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block VERTICAL_LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("vertical_light_gray_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block VERTICAL_GRAY_STAINED_GLASS_SLAB = registerBlock("vertical_gray_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block VERTICAL_GRAY_STAINED_GLASS_STAIRS = registerBlock("vertical_gray_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block VERTICAL_BLACK_STAINED_GLASS_SLAB = registerBlock("vertical_black_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block VERTICAL_BLACK_STAINED_GLASS_STAIRS = registerBlock("vertical_black_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block VERTICAL_BROWN_STAINED_GLASS_SLAB = registerBlock("vertical_brown_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block VERTICAL_BROWN_STAINED_GLASS_STAIRS = registerBlock("vertical_brown_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block VERTICAL_RED_STAINED_GLASS_SLAB = registerBlock("vertical_red_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block VERTICAL_RED_STAINED_GLASS_STAIRS = registerBlock("vertical_red_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block VERTICAL_ORANGE_STAINED_GLASS_SLAB = registerBlock("vertical_orange_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block VERTICAL_ORANGE_STAINED_GLASS_STAIRS = registerBlock("vertical_orange_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block VERTICAL_YELLOW_STAINED_GLASS_SLAB = registerBlock("vertical_yellow_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block VERTICAL_YELLOW_STAINED_GLASS_STAIRS = registerBlock("vertical_yellow_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block VERTICAL_LIME_STAINED_GLASS_SLAB = registerBlock("vertical_lime_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block VERTICAL_LIME_STAINED_GLASS_STAIRS = registerBlock("vertical_lime_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block VERTICAL_GREEN_STAINED_GLASS_SLAB = registerBlock("vertical_green_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block VERTICAL_GREEN_STAINED_GLASS_STAIRS = registerBlock("vertical_green_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block VERTICAL_CYAN_STAINED_GLASS_SLAB = registerBlock("vertical_cyan_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block VERTICAL_CYAN_STAINED_GLASS_STAIRS = registerBlock("vertical_cyan_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block VERTICAL_LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("vertical_light_blue_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block VERTICAL_LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("vertical_light_blue_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block VERTICAL_BLUE_STAINED_GLASS_SLAB = registerBlock("vertical_blue_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block VERTICAL_BLUE_STAINED_GLASS_STAIRS = registerBlock("vertical_blue_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block VERTICAL_PURPLE_STAINED_GLASS_SLAB = registerBlock("vertical_purple_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block VERTICAL_PURPLE_STAINED_GLASS_STAIRS = registerBlock("vertical_purple_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block VERTICAL_MAGENTA_STAINED_GLASS_SLAB = registerBlock("vertical_magenta_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block VERTICAL_MAGENTA_STAINED_GLASS_STAIRS = registerBlock("vertical_magenta_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block VERTICAL_PINK_STAINED_GLASS_SLAB = registerBlock("vertical_pink_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block VERTICAL_PINK_STAINED_GLASS_STAIRS = registerBlock("vertical_pink_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));

    
    public static final Block VERTICAL_GRASS_SLAB = registerBlock("vertical_grass_slab", settings -> new VerticalSlabBlock(settings) {
                private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
                    BlockPos blockPos = pos.up();
                    BlockState blockState = world.getBlockState(blockPos);
                    if (blockState.getFluidState().getLevel() == 8) {
                        return false;
                    } else {
                        return !VoxelShapes.isSideCovered(state.getCullingFace(Direction.UP), blockState.getCullingFace(Direction.DOWN), Direction.UP);
                    }
                }

                protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
                    if (!canSurvive(state, world, pos)) {
                        world.setBlockState(pos, ModBlocks.VERTICAL_DIRT_STAIRS.getStateWithProperties(state));
                    }
                }
            },
            AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN).ticksRandomly());
    public static final Block VERTICAL_GRASS_STAIRS = registerBlock("vertical_grass_stairs", settings -> new VerticalStairsBlock(settings) {
        private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
            BlockPos blockPos = pos.up();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.getFluidState().getLevel() == 8) {
                return false;
            } else {
                return !VoxelShapes.isSideCovered(state.getCullingFace(Direction.UP), blockState.getCullingFace(Direction.DOWN), Direction.UP);
            }
        }

        protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!canSurvive(state, world, pos)) {
                world.setBlockState(pos, ModBlocks.VERTICAL_DIRT_STAIRS.getStateWithProperties(state));
            }
        }
    },
            AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN).ticksRandomly());
    public static final Block VERTICAL_PODZOL_SLAB = registerBlock("vertical_podzol_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block VERTICAL_PODZOL_STAIRS = registerBlock("vertical_podzol_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block VERTICAL_MYCELIUM_SLAB = registerBlock("vertical_mycelium_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block VERTICAL_MYCELIUM_STAIRS = registerBlock("vertical_mycelium_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block VERTICAL_DIRT_SLAB = registerBlock("vertical_dirt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block VERTICAL_DIRT_STAIRS = registerBlock("vertical_dirt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block VERTICAL_DIRT_PATH_SLAB = registerBlock("vertical_dirt_path_slab", VerticalFlattenableSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block VERTICAL_DIRT_PATH_STAIRS = registerBlock("vertical_dirt_path_stairs", VerticalFlattenableStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block VERTICAL_COARSE_DIRT_SLAB = registerBlock("vertical_coarse_dirt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block VERTICAL_COARSE_DIRT_STAIRS = registerBlock("vertical_coarse_dirt_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block VERTICAL_ROOTED_DIRT_SLAB = registerBlock("vertical_rooted_dirt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block VERTICAL_ROOTED_DIRT_STAIRS = registerBlock("vertical_rooted_dirt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block VERTICAL_FARMLAND_SLAB = registerBlock("vertical_farmland_slab", VerticalFlattenableSlabBlock::new, AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block VERTICAL_FARMLAND_STAIRS = registerBlock("vertical_farmland_stairs", VerticalFlattenableStairsBlock::new, AbstractBlock.Settings.copy(Blocks.FARMLAND));
    

    

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function, AbstractBlock.Settings settings) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name));
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaVSPlus.MOD_ID, name));
    }

    public static void registerModBlocks() {
    }
}
