package net.fellter.vanillavsplus.block;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.custom_blocks.concrete_powder.VerticalConcretePowderSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.concrete_powder.VerticalConcretePowderStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.copper.VerticalOxidizableSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.copper.VerticalOxidizableStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.falling.VerticalFallingSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.falling.VerticalFallingStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.flattenable.VerticalFlattenableSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.flattenable.VerticalFlattenableStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.glass.VerticalGlassSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.glass.VerticalGlassStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.redstone.VerticalRedstoneSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.redstone.VerticalRedstoneStairsBlock;
import net.fellter.vanillavsplus.custom_blocks.redstone_ore.VerticalRedstoneOreSlabBlock;
import net.fellter.vanillavsplus.custom_blocks.redstone_ore.VerticalRedstoneOreStairsBlock;
import net.fellter.vanillavsplus.registry.DatagenArgs;
import net.fellter.vanillavsplus.registry.RegistryArgs;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.client.data.TextureMap;
import net.minecraft.client.render.item.tint.GrassTintSource;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static net.fellter.vanillavsplus.datagen.ModModelProvider.*;

public class ModBlocks {
    
    public static Map<Block, DatagenArgs> DATAGEN_ARGS = new HashMap<>();
    public static Map<Block, RegistryArgs> REGISTRY_ARGS = new HashMap<>();

    public static final Block LOG_DEF = registerBlock("log_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());
    public static final Block BAMBOO_DEF = registerBlock("bamboo_def", Block::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block NETHER_DEF = registerBlock("nether_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), 
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.OAK_PLANKS)).parentBlock(Blocks.OAK_PLANKS));
    public static final Block VERTICAL_OAK_STAIRS = registerBlock("vertical_oak_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.OAK_PLANKS)).parentBlock(Blocks.OAK_PLANKS));
    public static final Block VERTICAL_STRIPPED_OAK_LOG_SLAB = registerBlock("vertical_stripped_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG)).parentBlock(Blocks.STRIPPED_OAK_LOG));
    public static final Block VERTICAL_STRIPPED_OAK_LOG_STAIRS = registerBlock("vertical_stripped_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG)).parentBlock(Blocks.STRIPPED_OAK_LOG));
    public static final Block VERTICAL_STRIPPED_OAK_WOOD_SLAB = registerBlock("vertical_stripped_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_OAK_LOG)).parentBlock(Blocks.STRIPPED_OAK_WOOD));
    public static final Block VERTICAL_STRIPPED_OAK_WOOD_STAIRS = registerBlock("vertical_stripped_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_OAK_LOG)).parentBlock(Blocks.STRIPPED_OAK_WOOD));
    public static final Block VERTICAL_OAK_LOG_SLAB = registerBlock("vertical_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF), 
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.OAK_LOG)).parentBlock(Blocks.OAK_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_OAK_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_OAK_LOG_STAIRS = registerBlock("vertical_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.OAK_LOG)).parentBlock(Blocks.OAK_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_OAK_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_OAK_WOOD_SLAB = registerBlock("vertical_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.OAK_LOG)).parentBlock(Blocks.OAK_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_OAK_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_OAK_WOOD_STAIRS = registerBlock("vertical_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.OAK_LOG)).parentBlock(Blocks.OAK_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_OAK_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_SPRUCE_SLAB = registerBlock("vertical_spruce_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS), 
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.SPRUCE_PLANKS)).parentBlock(Blocks.SPRUCE_PLANKS));
    public static final Block VERTICAL_SPRUCE_STAIRS = registerBlock("vertical_spruce_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.SPRUCE_PLANKS)).parentBlock(Blocks.SPRUCE_PLANKS));
    public static final Block VERTICAL_STRIPPED_SPRUCE_LOG_SLAB = registerBlock("vertical_stripped_spruce_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG)).parentBlock(Blocks.STRIPPED_SPRUCE_LOG));
    public static final Block VERTICAL_STRIPPED_SPRUCE_LOG_STAIRS = registerBlock("vertical_stripped_spruce_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG)).parentBlock(Blocks.STRIPPED_SPRUCE_LOG));
    public static final Block VERTICAL_STRIPPED_SPRUCE_WOOD_SLAB = registerBlock("vertical_stripped_spruce_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG)).parentBlock(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block VERTICAL_STRIPPED_SPRUCE_WOOD_STAIRS = registerBlock("vertical_stripped_spruce_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG)).parentBlock(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block VERTICAL_SPRUCE_LOG_SLAB = registerBlock("vertical_spruce_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF), 
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.SPRUCE_LOG)).parentBlock(Blocks.SPRUCE_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_SPRUCE_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_SPRUCE_LOG_STAIRS = registerBlock("vertical_spruce_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.SPRUCE_LOG)).parentBlock(Blocks.SPRUCE_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_SPRUCE_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_SPRUCE_WOOD_SLAB = registerBlock("vertical_spruce_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.SPRUCE_LOG)).parentBlock(Blocks.SPRUCE_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_SPRUCE_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_SPRUCE_WOOD_STAIRS = registerBlock("vertical_spruce_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.SPRUCE_LOG)).parentBlock(Blocks.SPRUCE_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_SPRUCE_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_BIRCH_SLAB = registerBlock("vertical_birch_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BIRCH_PLANKS)).parentBlock(Blocks.BIRCH_PLANKS));
    public static final Block VERTICAL_BIRCH_STAIRS = registerBlock("vertical_birch_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BIRCH_PLANKS)).parentBlock(Blocks.BIRCH_PLANKS));
    public static final Block VERTICAL_STRIPPED_BIRCH_LOG_SLAB = registerBlock("vertical_stripped_birch_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG)).parentBlock(Blocks.STRIPPED_BIRCH_LOG));
    public static final Block VERTICAL_STRIPPED_BIRCH_LOG_STAIRS = registerBlock("vertical_stripped_birch_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG)).parentBlock(Blocks.STRIPPED_BIRCH_LOG));
    public static final Block VERTICAL_STRIPPED_BIRCH_WOOD_SLAB = registerBlock("vertical_stripped_birch_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_BIRCH_LOG)).parentBlock(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block VERTICAL_STRIPPED_BIRCH_WOOD_STAIRS = registerBlock("vertical_stripped_birch_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_BIRCH_LOG)).parentBlock(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block VERTICAL_BIRCH_LOG_SLAB = registerBlock("vertical_birch_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.BIRCH_LOG)).parentBlock(Blocks.BIRCH_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_BIRCH_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_BIRCH_LOG_STAIRS = registerBlock("vertical_birch_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.BIRCH_LOG)).parentBlock(Blocks.BIRCH_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_BIRCH_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_BIRCH_WOOD_SLAB = registerBlock("vertical_birch_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BIRCH_LOG)).parentBlock(Blocks.BIRCH_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_BIRCH_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_BIRCH_WOOD_STAIRS = registerBlock("vertical_birch_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BIRCH_LOG)).parentBlock(Blocks.BIRCH_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_BIRCH_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_JUNGLE_SLAB = registerBlock("vertical_jungle_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.JUNGLE_PLANKS)).parentBlock(Blocks.JUNGLE_PLANKS));
    public static final Block VERTICAL_JUNGLE_STAIRS = registerBlock("vertical_jungle_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.JUNGLE_PLANKS)).parentBlock(Blocks.JUNGLE_PLANKS));
    public static final Block VERTICAL_STRIPPED_JUNGLE_LOG_SLAB = registerBlock("vertical_stripped_jungle_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG)).parentBlock(Blocks.STRIPPED_JUNGLE_LOG));
    public static final Block VERTICAL_STRIPPED_JUNGLE_LOG_STAIRS = registerBlock("vertical_stripped_jungle_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG)).parentBlock(Blocks.STRIPPED_JUNGLE_LOG));
    public static final Block VERTICAL_STRIPPED_JUNGLE_WOOD_SLAB = registerBlock("vertical_stripped_jungle_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG)).parentBlock(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block VERTICAL_STRIPPED_JUNGLE_WOOD_STAIRS = registerBlock("vertical_stripped_jungle_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG)).parentBlock(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block VERTICAL_JUNGLE_LOG_SLAB = registerBlock("vertical_jungle_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.JUNGLE_LOG)).parentBlock(Blocks.JUNGLE_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_JUNGLE_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_JUNGLE_LOG_STAIRS = registerBlock("vertical_jungle_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.JUNGLE_LOG)).parentBlock(Blocks.JUNGLE_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_JUNGLE_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_JUNGLE_WOOD_SLAB = registerBlock("vertical_jungle_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.JUNGLE_LOG)).parentBlock(Blocks.JUNGLE_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_JUNGLE_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_JUNGLE_WOOD_STAIRS = registerBlock("vertical_jungle_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.JUNGLE_LOG)).parentBlock(Blocks.JUNGLE_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_JUNGLE_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_ACACIA_SLAB = registerBlock("vertical_acacia_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.ACACIA_PLANKS)).parentBlock(Blocks.ACACIA_PLANKS));
    public static final Block VERTICAL_ACACIA_STAIRS = registerBlock("vertical_acacia_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.ACACIA_PLANKS)).parentBlock(Blocks.ACACIA_PLANKS));
    public static final Block VERTICAL_STRIPPED_ACACIA_LOG_SLAB = registerBlock("vertical_stripped_acacia_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG)).parentBlock(Blocks.STRIPPED_ACACIA_LOG));
    public static final Block VERTICAL_STRIPPED_ACACIA_LOG_STAIRS = registerBlock("vertical_stripped_acacia_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG)).parentBlock(Blocks.STRIPPED_ACACIA_LOG));
    public static final Block VERTICAL_STRIPPED_ACACIA_WOOD_SLAB = registerBlock("vertical_stripped_acacia_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_ACACIA_LOG)).parentBlock(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block VERTICAL_STRIPPED_ACACIA_WOOD_STAIRS = registerBlock("vertical_stripped_acacia_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_ACACIA_LOG)).parentBlock(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block VERTICAL_ACACIA_LOG_SLAB = registerBlock("vertical_acacia_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.ACACIA_LOG)).parentBlock(Blocks.ACACIA_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_ACACIA_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_ACACIA_LOG_STAIRS = registerBlock("vertical_acacia_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.ACACIA_LOG)).parentBlock(Blocks.ACACIA_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_ACACIA_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_ACACIA_WOOD_SLAB = registerBlock("vertical_acacia_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.ACACIA_LOG)).parentBlock(Blocks.ACACIA_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_ACACIA_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_ACACIA_WOOD_STAIRS = registerBlock("vertical_acacia_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.ACACIA_LOG)).parentBlock(Blocks.ACACIA_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_ACACIA_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_DARK_OAK_SLAB = registerBlock("vertical_dark_oak_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.DARK_OAK_PLANKS)).parentBlock(Blocks.DARK_OAK_PLANKS));
    public static final Block VERTICAL_DARK_OAK_STAIRS = registerBlock("vertical_dark_oak_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.DARK_OAK_PLANKS)).parentBlock(Blocks.DARK_OAK_PLANKS));
    public static final Block VERTICAL_STRIPPED_DARK_OAK_LOG_SLAB = registerBlock("vertical_stripped_dark_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG)).parentBlock(Blocks.STRIPPED_DARK_OAK_LOG));
    public static final Block VERTICAL_STRIPPED_DARK_OAK_LOG_STAIRS = registerBlock("vertical_stripped_dark_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG)).parentBlock(Blocks.STRIPPED_DARK_OAK_LOG));
    public static final Block VERTICAL_STRIPPED_DARK_OAK_WOOD_SLAB = registerBlock("vertical_stripped_dark_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG)).parentBlock(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block VERTICAL_STRIPPED_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_stripped_dark_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG)).parentBlock(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block VERTICAL_DARK_OAK_LOG_SLAB = registerBlock("vertical_dark_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.DARK_OAK_LOG)).parentBlock(Blocks.DARK_OAK_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_DARK_OAK_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_DARK_OAK_LOG_STAIRS = registerBlock("vertical_dark_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.DARK_OAK_LOG)).parentBlock(Blocks.DARK_OAK_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_DARK_OAK_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_DARK_OAK_WOOD_SLAB = registerBlock("vertical_dark_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.DARK_OAK_LOG)).parentBlock(Blocks.DARK_OAK_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_DARK_OAK_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_DARK_OAK_WOOD_STAIRS = registerBlock("vertical_dark_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.DARK_OAK_LOG)).parentBlock(Blocks.DARK_OAK_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_DARK_OAK_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.MANGROVE_PLANKS)).parentBlock(Blocks.MANGROVE_PLANKS));
    public static final Block VERTICAL_MANGROVE_STAIRS = registerBlock("vertical_mangrove_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.MANGROVE_PLANKS)).parentBlock(Blocks.MANGROVE_PLANKS));
    public static final Block VERTICAL_STRIPPED_MANGROVE_LOG_SLAB = registerBlock("vertical_stripped_mangrove_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG)).parentBlock(Blocks.STRIPPED_MANGROVE_LOG));
    public static final Block VERTICAL_STRIPPED_MANGROVE_LOG_STAIRS = registerBlock("vertical_stripped_mangrove_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG)).parentBlock(Blocks.STRIPPED_MANGROVE_LOG));
    public static final Block VERTICAL_STRIPPED_MANGROVE_WOOD_SLAB = registerBlock("vertical_stripped_mangrove_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG)).parentBlock(Blocks.STRIPPED_MANGROVE_WOOD));
    public static final Block VERTICAL_STRIPPED_MANGROVE_WOOD_STAIRS = registerBlock("vertical_stripped_mangrove_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG)).parentBlock(Blocks.STRIPPED_MANGROVE_WOOD));
    public static final Block VERTICAL_MANGROVE_LOG_SLAB = registerBlock("vertical_mangrove_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.MANGROVE_LOG)).parentBlock(Blocks.MANGROVE_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_MANGROVE_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_MANGROVE_LOG_STAIRS = registerBlock("vertical_mangrove_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.MANGROVE_LOG)).parentBlock(Blocks.MANGROVE_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_MANGROVE_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_MANGROVE_WOOD_SLAB = registerBlock("vertical_mangrove_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.MANGROVE_LOG)).parentBlock(Blocks.MANGROVE_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_MANGROVE_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_MANGROVE_WOOD_STAIRS = registerBlock("vertical_mangrove_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.MANGROVE_LOG)).parentBlock(Blocks.MANGROVE_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_MANGROVE_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_CHERRY_SLAB = registerBlock("vertical_cherry_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHERRY_PLANKS)).parentBlock(Blocks.CHERRY_PLANKS));
    public static final Block VERTICAL_CHERRY_STAIRS = registerBlock("vertical_cherry_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHERRY_PLANKS)).parentBlock(Blocks.CHERRY_PLANKS));
    public static final Block VERTICAL_STRIPPED_CHERRY_LOG_SLAB = registerBlock("vertical_stripped_cherry_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG)).parentBlock(Blocks.STRIPPED_CHERRY_LOG));
    public static final Block VERTICAL_STRIPPED_CHERRY_LOG_STAIRS = registerBlock("vertical_stripped_cherry_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG)).parentBlock(Blocks.STRIPPED_CHERRY_LOG));
    public static final Block VERTICAL_STRIPPED_CHERRY_WOOD_SLAB = registerBlock("vertical_stripped_cherry_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_CHERRY_LOG)).parentBlock(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block VERTICAL_STRIPPED_CHERRY_WOOD_STAIRS = registerBlock("vertical_stripped_cherry_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_CHERRY_LOG)).parentBlock(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block VERTICAL_CHERRY_LOG_SLAB = registerBlock("vertical_cherry_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHERRY_LOG)).parentBlock(Blocks.CHERRY_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CHERRY_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_CHERRY_LOG_STAIRS = registerBlock("vertical_cherry_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHERRY_LOG)).parentBlock(Blocks.CHERRY_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CHERRY_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_CHERRY_WOOD_SLAB = registerBlock("vertical_cherry_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHERRY_LOG)).parentBlock(Blocks.CHERRY_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CHERRY_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_CHERRY_WOOD_STAIRS = registerBlock("vertical_cherry_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHERRY_LOG)).parentBlock(Blocks.CHERRY_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CHERRY_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_PALE_OAK_SLAB = registerBlock("vertical_pale_oak_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.PALE_OAK_PLANKS)).parentBlock(Blocks.PALE_OAK_PLANKS));
    public static final Block VERTICAL_PALE_OAK_STAIRS = registerBlock("vertical_pale_oak_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.PALE_OAK_PLANKS)).parentBlock(Blocks.PALE_OAK_PLANKS));
    public static final Block VERTICAL_STRIPPED_PALE_OAK_LOG_SLAB = registerBlock("vertical_stripped_pale_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_PALE_OAK_LOG)).parentBlock(Blocks.STRIPPED_PALE_OAK_LOG));
    public static final Block VERTICAL_STRIPPED_PALE_OAK_LOG_STAIRS = registerBlock("vertical_stripped_pale_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_PALE_OAK_LOG)).parentBlock(Blocks.STRIPPED_PALE_OAK_LOG));
    public static final Block VERTICAL_STRIPPED_PALE_OAK_WOOD_SLAB = registerBlock("vertical_stripped_pale_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_PALE_OAK_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_PALE_OAK_LOG)).parentBlock(Blocks.STRIPPED_PALE_OAK_WOOD));
    public static final Block VERTICAL_STRIPPED_PALE_OAK_WOOD_STAIRS = registerBlock("vertical_stripped_pale_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_PALE_OAK_WOOD),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_PALE_OAK_LOG)).parentBlock(Blocks.STRIPPED_PALE_OAK_WOOD));
    public static final Block VERTICAL_PALE_OAK_LOG_SLAB = registerBlock("vertical_pale_oak_log_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.PALE_OAK_LOG)).parentBlock(Blocks.PALE_OAK_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_PALE_OAK_LOG_SLAB).flammable(5, 5));
    public static final Block VERTICAL_PALE_OAK_LOG_STAIRS = registerBlock("vertical_pale_oak_log_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.PALE_OAK_LOG)).parentBlock(Blocks.PALE_OAK_LOG),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_PALE_OAK_LOG_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_PALE_OAK_WOOD_SLAB = registerBlock("vertical_pale_oak_wood_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.PALE_OAK_LOG)).parentBlock(Blocks.PALE_OAK_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_PALE_OAK_WOOD_SLAB).flammable(5, 5));
    public static final Block VERTICAL_PALE_OAK_WOOD_STAIRS = registerBlock("vertical_pale_oak_wood_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(LOG_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.PALE_OAK_LOG)).parentBlock(Blocks.PALE_OAK_WOOD),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_PALE_OAK_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_BAMBOO_SLAB = registerBlock("vertical_bamboo_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BAMBOO_PLANKS)).parentBlock(Blocks.BAMBOO_PLANKS));
    public static final Block VERTICAL_BAMBOO_STAIRS = registerBlock("vertical_bamboo_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BAMBOO_PLANKS)).parentBlock(Blocks.BAMBOO_PLANKS));
    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB = registerBlock("vertical_bamboo_mosaic_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS), 
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BAMBOO_MOSAIC)).parentBlock(Blocks.BAMBOO_MOSAIC));
    public static final Block VERTICAL_BAMBOO_MOSAIC_STAIRS = registerBlock("vertical_bamboo_mosaic_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.BAMBOO_MOSAIC)).parentBlock(Blocks.BAMBOO_MOSAIC));
    public static final Block VERTICAL_STRIPPED_BAMBOO_BLOCK_SLAB = registerBlock("vertical_stripped_bamboo_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK)).parentBlock(Blocks.STRIPPED_BAMBOO_BLOCK));
    public static final Block VERTICAL_STRIPPED_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_stripped_bamboo_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK)).parentBlock(Blocks.STRIPPED_BAMBOO_BLOCK));
    public static final Block VERTICAL_BAMBOO_BLOCK_SLAB = registerBlock("vertical_bamboo_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF), 
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.BAMBOO_BLOCK)).parentBlock(Blocks.BAMBOO_BLOCK),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_PALE_OAK_WOOD_STAIRS).flammable(5, 5));
    public static final Block VERTICAL_BAMBOO_BLOCK_STAIRS = registerBlock("vertical_bamboo_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(BAMBOO_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.BAMBOO_BLOCK)).parentBlock(Blocks.BAMBOO_BLOCK),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_PALE_OAK_WOOD_STAIRS).flammable(5, 5));

    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRIMSON_PLANKS)).parentBlock(Blocks.CRIMSON_PLANKS));
    public static final Block VERTICAL_CRIMSON_STAIRS = registerBlock("vertical_crimson_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRIMSON_PLANKS)).parentBlock(Blocks.CRIMSON_PLANKS));
    public static final Block VERTICAL_STRIPPED_CRIMSON_STEM_SLAB = registerBlock("vertical_stripped_crimson_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM)).parentBlock(Blocks.STRIPPED_CRIMSON_STEM));
    public static final Block VERTICAL_STRIPPED_CRIMSON_STEM_STAIRS = registerBlock("vertical_stripped_crimson_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM)).parentBlock(Blocks.STRIPPED_CRIMSON_STEM));
    public static final Block VERTICAL_STRIPPED_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_stripped_crimson_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM)).parentBlock(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block VERTICAL_STRIPPED_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_stripped_crimson_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM)).parentBlock(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block VERTICAL_CRIMSON_STEM_SLAB = registerBlock("vertical_crimson_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CRIMSON_STEM)).parentBlock(Blocks.CRIMSON_STEM),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CRIMSON_STEM_SLAB));
    public static final Block VERTICAL_CRIMSON_STEM_STAIRS = registerBlock("vertical_crimson_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CRIMSON_STEM)).parentBlock(Blocks.CRIMSON_STEM),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CRIMSON_STEM_STAIRS));
    public static final Block VERTICAL_CRIMSON_HYPHAE_SLAB = registerBlock("vertical_crimson_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRIMSON_STEM)).parentBlock(Blocks.CRIMSON_HYPHAE),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CRIMSON_HYPHAE_SLAB));
    public static final Block VERTICAL_CRIMSON_HYPHAE_STAIRS = registerBlock("vertical_crimson_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRIMSON_STEM)).parentBlock(Blocks.CRIMSON_HYPHAE),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_CRIMSON_HYPHAE_STAIRS));

    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.WARPED_PLANKS)).parentBlock(Blocks.WARPED_PLANKS));
    public static final Block VERTICAL_WARPED_STAIRS = registerBlock("vertical_warped_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.WARPED_PLANKS)).parentBlock(Blocks.WARPED_PLANKS));
    public static final Block VERTICAL_STRIPPED_WARPED_STEM_SLAB = registerBlock("vertical_stripped_warped_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM)).parentBlock(Blocks.STRIPPED_WARPED_STEM));
    public static final Block VERTICAL_STRIPPED_WARPED_STEM_STAIRS = registerBlock("vertical_stripped_warped_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM)).parentBlock(Blocks.STRIPPED_WARPED_STEM));
    public static final Block VERTICAL_STRIPPED_WARPED_HYPHAE_SLAB = registerBlock("vertical_stripped_warped_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_WARPED_STEM)).parentBlock(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block VERTICAL_STRIPPED_WARPED_HYPHAE_STAIRS = registerBlock("vertical_stripped_warped_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.STRIPPED_WARPED_STEM)).parentBlock(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block VERTICAL_WARPED_STEM_SLAB = registerBlock("vertical_warped_stem_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.WARPED_STEM)).parentBlock(Blocks.WARPED_STEM),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_WARPED_STEM_SLAB));
    public static final Block VERTICAL_WARPED_STEM_STAIRS = registerBlock("vertical_warped_stem_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.WARPED_STEM)).parentBlock(Blocks.WARPED_STEM),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_WARPED_STEM_STAIRS));
    public static final Block VERTICAL_WARPED_HYPHAE_SLAB = registerBlock("vertical_warped_hyphae_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.WARPED_STEM)).parentBlock(Blocks.WARPED_HYPHAE),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_WARPED_HYPHAE_SLAB));
    public static final Block VERTICAL_WARPED_HYPHAE_STAIRS = registerBlock("vertical_warped_hyphae_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(NETHER_DEF),
            new DatagenArgs().blockTags(BlockTags.AXE_MINEABLE).textureMap(TextureMap.all(Blocks.WARPED_STEM)).parentBlock(Blocks.WARPED_HYPHAE),
            new RegistryArgs().strippable(VERTICAL_STRIPPED_WARPED_HYPHAE_STAIRS));

    public static final Block VERTICAL_STONE_SLAB = registerBlock("vertical_stone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.STONE)).parentBlock(Blocks.STONE));
    public static final Block VERTICAL_STONE_STAIRS = registerBlock("vertical_stone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.STONE)).parentBlock(Blocks.STONE));
    public static final Block VERTICAL_COBBLESTONE_SLAB = registerBlock("vertical_cobblestone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COBBLESTONE)).parentBlock(Blocks.COBBLESTONE));
    public static final Block VERTICAL_COBBLESTONE_STAIRS = registerBlock("vertical_cobblestone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COBBLESTONE)).parentBlock(Blocks.COBBLESTONE));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = registerBlock("vertical_mossy_cobblestone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MOSSY_COBBLESTONE)).parentBlock(Blocks.MOSSY_COBBLESTONE));
    public static final Block VERTICAL_MOSSY_COBBLESTONE_STAIRS = registerBlock("vertical_mossy_cobblestone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MOSSY_COBBLESTONE)).parentBlock(Blocks.MOSSY_COBBLESTONE));
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = registerBlock("vertical_smooth_stone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.SMOOTH_STONE)).parentBlock(Blocks.SMOOTH_STONE));
    public static final Block VERTICAL_SMOOTH_STONE_STAIRS = registerBlock("vertical_smooth_stone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.SMOOTH_STONE)).parentBlock(Blocks.SMOOTH_STONE));
    public static final Block VERTICAL_STONE_BRICKS_SLAB = registerBlock("vertical_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.STONE_BRICKS)).parentBlock(Blocks.STONE_BRICKS));
    public static final Block VERTICAL_STONE_BRICKS_STAIRS = registerBlock("vertical_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.STONE_BRICKS)).parentBlock(Blocks.STONE_BRICKS));
    public static final Block VERTICAL_CRACKED_STONE_BRICKS_SLAB = registerBlock("vertical_cracked_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_STONE_BRICKS)).parentBlock(Blocks.CRACKED_STONE_BRICKS));
    public static final Block VERTICAL_CRACKED_STONE_BRICKS_STAIRS = registerBlock("vertical_cracked_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_STONE_BRICKS)).parentBlock(Blocks.CRACKED_STONE_BRICKS));
    public static final Block VERTICAL_CHISELED_STONE_BRICKS_SLAB = registerBlock("vertical_chiseled_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_STONE_BRICKS)).parentBlock(Blocks.CHISELED_STONE_BRICKS));
    public static final Block VERTICAL_CHISELED_STONE_BRICKS_STAIRS = registerBlock("vertical_chiseled_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_STONE_BRICKS)).parentBlock(Blocks.CHISELED_STONE_BRICKS));
    public static final Block VERTICAL_MOSSY_STONE_BRICKS_SLAB = registerBlock("vertical_mossy_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MOSSY_STONE_BRICKS)).parentBlock(Blocks.MOSSY_STONE_BRICKS));
    public static final Block VERTICAL_MOSSY_STONE_BRICKS_STAIRS = registerBlock("vertical_mossy_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MOSSY_STONE_BRICKS)).parentBlock(Blocks.MOSSY_STONE_BRICKS));

    public static final Block VERTICAL_GRANITE_SLAB = registerBlock("vertical_granite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRANITE)).parentBlock(Blocks.GRANITE));
    public static final Block VERTICAL_GRANITE_STAIRS = registerBlock("vertical_granite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRANITE)).parentBlock(Blocks.GRANITE));
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = registerBlock("vertical_polished_granite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_GRANITE)).parentBlock(Blocks.POLISHED_GRANITE));
    public static final Block VERTICAL_POLISHED_GRANITE_STAIRS = registerBlock("vertical_polished_granite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_GRANITE)).parentBlock(Blocks.POLISHED_GRANITE));
    public static final Block VERTICAL_DIORITE_SLAB = registerBlock("vertical_diorite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIORITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DIORITE)).parentBlock(Blocks.DIORITE));
    public static final Block VERTICAL_DIORITE_STAIRS = registerBlock("vertical_diorite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIORITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DIORITE)).parentBlock(Blocks.DIORITE));
    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = registerBlock("vertical_polished_diorite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_DIORITE)).parentBlock(Blocks.POLISHED_DIORITE));
    public static final Block VERTICAL_POLISHED_DIORITE_STAIRS = registerBlock("vertical_polished_diorite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_DIORITE)).parentBlock(Blocks.POLISHED_DIORITE));
    public static final Block VERTICAL_ANDESITE_SLAB = registerBlock("vertical_andesite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ANDESITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ANDESITE)).parentBlock(Blocks.ANDESITE));
    public static final Block VERTICAL_ANDESITE_STAIRS = registerBlock("vertical_andesite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ANDESITE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ANDESITE)).parentBlock(Blocks.ANDESITE));
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = registerBlock("vertical_polished_andesite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_ANDESITE)).parentBlock(Blocks.POLISHED_ANDESITE));
    public static final Block VERTICAL_POLISHED_ANDESITE_STAIRS = registerBlock("vertical_polished_andesite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_ANDESITE)).parentBlock(Blocks.POLISHED_ANDESITE));
    
    public static final Block VERTICAL_DEEPSLATE_SLAB = registerBlock("vertical_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.DEEPSLATE)).parentBlock(Blocks.DEEPSLATE));
    public static final Block VERTICAL_DEEPSLATE_STAIRS = registerBlock("vertical_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.DEEPSLATE)).parentBlock(Blocks.DEEPSLATE));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = registerBlock("vertical_cobbled_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COBBLED_DEEPSLATE)).parentBlock(Blocks.COBBLED_DEEPSLATE));
    public static final Block VERTICAL_COBBLED_DEEPSLATE_STAIRS = registerBlock("vertical_cobbled_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COBBLED_DEEPSLATE)).parentBlock(Blocks.COBBLED_DEEPSLATE));
    public static final Block VERTICAL_CHISELED_DEEPSLATE_SLAB = registerBlock("vertical_chiseled_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_DEEPSLATE)).parentBlock(Blocks.CHISELED_DEEPSLATE));
    public static final Block VERTICAL_CHISELED_DEEPSLATE_STAIRS = registerBlock("vertical_chiseled_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_DEEPSLATE)).parentBlock(Blocks.CHISELED_DEEPSLATE));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = registerBlock("vertical_polished_deepslate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_DEEPSLATE)).parentBlock(Blocks.POLISHED_DEEPSLATE));
    public static final Block VERTICAL_POLISHED_DEEPSLATE_STAIRS = registerBlock("vertical_polished_deepslate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_DEEPSLATE)).parentBlock(Blocks.POLISHED_DEEPSLATE));
    public static final Block VERTICAL_DEEPSLATE_BRICKS_SLAB = registerBlock("vertical_deepslate_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_BRICKS)).parentBlock(Blocks.DEEPSLATE_BRICKS));
    public static final Block VERTICAL_DEEPSLATE_BRICKS_STAIRS = registerBlock("vertical_deepslate_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_BRICKS)).parentBlock(Blocks.DEEPSLATE_BRICKS));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("vertical_cracked_deepslate_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_BRICKS)).parentBlock(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("vertical_cracked_deepslate_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_BRICKS)).parentBlock(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block VERTICAL_DEEPSLATE_TILES_SLAB = registerBlock("vertical_deepslate_tiles_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_TILES)).parentBlock(Blocks.DEEPSLATE_TILES));
    public static final Block VERTICAL_DEEPSLATE_TILES_STAIRS = registerBlock("vertical_deepslate_tiles_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_TILES)).parentBlock(Blocks.DEEPSLATE_TILES));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("vertical_cracked_deepslate_tiles_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_TILES)).parentBlock(Blocks.CRACKED_DEEPSLATE_TILES));
    public static final Block VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("vertical_cracked_deepslate_tiles_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_DEEPSLATE_TILES)).parentBlock(Blocks.CRACKED_DEEPSLATE_TILES));
    
    public static final Block VERTICAL_TUFF_SLAB = registerBlock("vertical_tuff_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.TUFF)).parentBlock(Blocks.TUFF));
    public static final Block VERTICAL_TUFF_STAIRS = registerBlock("vertical_tuff_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.TUFF)).parentBlock(Blocks.TUFF));
    public static final Block VERTICAL_CHISELED_TUFF_SLAB = registerBlock("vertical_chiseled_tuff_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHISELED_TUFF)).parentBlock(Blocks.CHISELED_TUFF));
    public static final Block VERTICAL_CHISELED_TUFF_STAIRS = registerBlock("vertical_chiseled_tuff_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHISELED_TUFF)).parentBlock(Blocks.CHISELED_TUFF));
    public static final Block VERTICAL_POLISHED_TUFF_SLAB = registerBlock("vertical_polished_tuff_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_TUFF)).parentBlock(Blocks.POLISHED_TUFF));
    public static final Block VERTICAL_POLISHED_TUFF_STAIRS = registerBlock("vertical_polished_tuff_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_TUFF)).parentBlock(Blocks.POLISHED_TUFF));
    public static final Block VERTICAL_TUFF_BRICKS_SLAB = registerBlock("vertical_tuff_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.TUFF_BRICKS)).parentBlock(Blocks.TUFF_BRICKS));
    public static final Block VERTICAL_TUFF_BRICKS_STAIRS = registerBlock("vertical_tuff_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.TUFF_BRICKS)).parentBlock(Blocks.TUFF_BRICKS));
    public static final Block VERTICAL_CHISELED_TUFF_BRICKS_SLAB = registerBlock("vertical_chiseled_tuff_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHISELED_TUFF_BRICKS)).parentBlock(Blocks.CHISELED_TUFF_BRICKS));
    public static final Block VERTICAL_CHISELED_TUFF_BRICKS_STAIRS = registerBlock("vertical_chiseled_tuff_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHISELED_TUFF_BRICKS)).parentBlock(Blocks.CHISELED_TUFF_BRICKS));
    
    public static final Block VERTICAL_BRICKS_SLAB = registerBlock("vertical_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BRICKS)).parentBlock(Blocks.BRICKS));
    public static final Block VERTICAL_BRICKS_STAIRS = registerBlock("vertical_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BRICKS)).parentBlock(Blocks.BRICKS));
    public static final Block VERTICAL_PACKED_MUD_SLAB = registerBlock("vertical_packed_mud_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PACKED_MUD)).parentBlock(Blocks.PACKED_MUD));
    public static final Block VERTICAL_PACKED_MUD_STAIRS = registerBlock("vertical_packed_mud_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PACKED_MUD)).parentBlock(Blocks.PACKED_MUD));
    public static final Block VERTICAL_MUD_BRICKS_SLAB = registerBlock("vertical_mud_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MUD_BRICKS)).parentBlock(Blocks.MUD_BRICKS));
    public static final Block VERTICAL_MUD_BRICKS_STAIRS = registerBlock("vertical_mud_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MUD_BRICKS)).parentBlock(Blocks.MUD_BRICKS));

    public static final Block VERTICAL_SANDSTONE_SLAB = registerBlock("vertical_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockTB(Blocks.SANDSTONE)).parentBlock(Blocks.SANDSTONE));
    public static final Block VERTICAL_SANDSTONE_STAIRS = registerBlock("vertical_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockTB(Blocks.SANDSTONE)).parentBlock(Blocks.SANDSTONE));
    public static final Block VERTICAL_CHISELED_SANDSTONE_SLAB = registerBlock("vertical_chiseled_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CHISELED_SANDSTONE));
    public static final Block VERTICAL_CHISELED_SANDSTONE_STAIRS = registerBlock("vertical_chiseled_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CHISELED_SANDSTONE));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = registerBlock("vertical_smooth_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(allWithSuffix(Blocks.SANDSTONE, "_top")).parentBlock(Blocks.SANDSTONE_STAIRS));
    public static final Block VERTICAL_SMOOTH_SANDSTONE_STAIRS = registerBlock("vertical_smooth_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(allWithSuffix(Blocks.SANDSTONE, "_top")).parentBlock(Blocks.SANDSTONE_STAIRS));
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = registerBlock("vertical_cut_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CUT_SANDSTONE));
    public static final Block VERTICAL_CUT_SANDSTONE_STAIRS = registerBlock("vertical_cut_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CUT_SANDSTONE));

    public static final Block VERTICAL_RED_SANDSTONE_SLAB = registerBlock("vertical_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockTB(Blocks.RED_SANDSTONE)).parentBlock(Blocks.RED_SANDSTONE));
    public static final Block VERTICAL_RED_SANDSTONE_STAIRS = registerBlock("vertical_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockTB(Blocks.RED_SANDSTONE)).parentBlock(Blocks.RED_SANDSTONE));
    public static final Block VERTICAL_CHISELED_RED_SANDSTONE_SLAB = registerBlock("vertical_chiseled_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CHISELED_RED_SANDSTONE));
    public static final Block VERTICAL_CHISELED_RED_SANDSTONE_STAIRS = registerBlock("vertical_chiseled_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CHISELED_RED_SANDSTONE));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = registerBlock("vertical_smooth_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(allWithSuffix(Blocks.RED_SANDSTONE, "_top")).parentBlock(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS = registerBlock("vertical_smooth_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(allWithSuffix(Blocks.RED_SANDSTONE, "_top")).parentBlock(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = registerBlock("vertical_cut_red_sandstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CUT_RED_SANDSTONE));
    public static final Block VERTICAL_CUT_RED_SANDSTONE_STAIRS = registerBlock("vertical_cut_red_sandstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top")).parentBlock(Blocks.CUT_RED_SANDSTONE));

    public static final Block VERTICAL_SEA_LANTERN_SLAB = registerBlock("vertical_sea_lantern_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.SEA_LANTERN)).parentBlock(Blocks.SEA_LANTERN));
    public static final Block VERTICAL_SEA_LANTERN_STAIRS = registerBlock("vertical_sea_lantern_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.SEA_LANTERN)).parentBlock(Blocks.SEA_LANTERN));
    public static final Block VERTICAL_PRISMARINE_SLAB = registerBlock("vertical_prismarine_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PRISMARINE)).parentBlock(Blocks.PRISMARINE));
    public static final Block VERTICAL_PRISMARINE_STAIRS = registerBlock("vertical_prismarine_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PRISMARINE)).parentBlock(Blocks.PRISMARINE));
    public static final Block VERTICAL_PRISMARINE_BRICKS_SLAB = registerBlock("vertical_prismarine_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PRISMARINE_BRICKS)).parentBlock(Blocks.PRISMARINE_BRICKS));
    public static final Block VERTICAL_PRISMARINE_BRICKS_STAIRS = registerBlock("vertical_prismarine_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PRISMARINE_BRICKS)).parentBlock(Blocks.PRISMARINE_BRICKS));
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = registerBlock("vertical_dark_prismarine_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DARK_PRISMARINE)).parentBlock(Blocks.DARK_PRISMARINE));
    public static final Block VERTICAL_DARK_PRISMARINE_STAIRS = registerBlock("vertical_dark_prismarine_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DARK_PRISMARINE)).parentBlock(Blocks.DARK_PRISMARINE));

    public static final Block VERTICAL_NETHERRACK_SLAB = registerBlock("vertical_netherrack_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHERRACK)).parentBlock(Blocks.NETHERRACK));
    public static final Block VERTICAL_NETHERRACK_STAIRS = registerBlock("vertical_netherrack_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHERRACK)).parentBlock(Blocks.NETHERRACK));
    public static final Block VERTICAL_NETHER_BRICKS_SLAB = registerBlock("vertical_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHER_BRICKS)).parentBlock(Blocks.NETHER_BRICKS));
    public static final Block VERTICAL_NETHER_BRICKS_STAIRS = registerBlock("vertical_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHER_BRICKS)).parentBlock(Blocks.NETHER_BRICKS));
    public static final Block VERTICAL_CRACKED_NETHER_BRICKS_SLAB = registerBlock("vertical_cracked_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_NETHER_BRICKS)).parentBlock(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block VERTICAL_CRACKED_NETHER_BRICKS_STAIRS = registerBlock("vertical_cracked_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_NETHER_BRICKS)).parentBlock(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block VERTICAL_CHISELED_NETHER_BRICKS_SLAB = registerBlock("vertical_chiseled_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_NETHER_BRICKS)).parentBlock(Blocks.CHISELED_NETHER_BRICKS));
    public static final Block VERTICAL_CHISELED_NETHER_BRICKS_STAIRS = registerBlock("vertical_chiseled_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_NETHER_BRICKS)).parentBlock(Blocks.CHISELED_NETHER_BRICKS));
    public static final Block VERTICAL_RED_NETHER_BRICKS_SLAB = registerBlock("vertical_red_nether_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_NETHER_BRICKS)).parentBlock(Blocks.RED_NETHER_BRICKS));
    public static final Block VERTICAL_RED_NETHER_BRICKS_STAIRS = registerBlock("vertical_red_nether_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_NETHER_BRICKS)).parentBlock(Blocks.RED_NETHER_BRICKS));

    public static final Block VERTICAL_BASALT_SLAB = registerBlock("vertical_basalt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.BASALT)).parentBlock(Blocks.BASALT));
    public static final Block VERTICAL_BASALT_STAIRS = registerBlock("vertical_basalt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.BASALT)).parentBlock(Blocks.BASALT));
    public static final Block VERTICAL_SMOOTH_BASALT_SLAB = registerBlock("vertical_smooth_basalt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.SMOOTH_BASALT)).parentBlock(Blocks.SMOOTH_BASALT));
    public static final Block VERTICAL_SMOOTH_BASALT_STAIRS = registerBlock("vertical_smooth_basalt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.SMOOTH_BASALT)).parentBlock(Blocks.SMOOTH_BASALT));
    public static final Block VERTICAL_POLISHED_BASALT_SLAB = registerBlock("vertical_polished_basalt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.POLISHED_BASALT)).parentBlock(Blocks.POLISHED_BASALT));
    public static final Block VERTICAL_POLISHED_BASALT_STAIRS = registerBlock("vertical_polished_basalt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.POLISHED_BASALT)).parentBlock(Blocks.POLISHED_BASALT));

    public static final Block VERTICAL_BLACKSTONE_SLAB = registerBlock("vertical_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACKSTONE)).parentBlock(Blocks.BLACKSTONE));
    public static final Block VERTICAL_BLACKSTONE_STAIRS = registerBlock("vertical_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACKSTONE)).parentBlock(Blocks.BLACKSTONE));
    public static final Block VERTICAL_GILDED_BLACKSTONE_SLAB = registerBlock("vertical_gilded_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GILDED_BLACKSTONE)).parentBlock(Blocks.GILDED_BLACKSTONE));
    public static final Block VERTICAL_GILDED_BLACKSTONE_STAIRS = registerBlock("vertical_gilded_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GILDED_BLACKSTONE)).parentBlock(Blocks.GILDED_BLACKSTONE));
    public static final Block VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock("vertical_chiseled_polished_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_POLISHED_BLACKSTONE)).parentBlock(Blocks.CHISELED_POLISHED_BLACKSTONE));
    public static final Block VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS = registerBlock("vertical_chiseled_polished_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_POLISHED_BLACKSTONE)).parentBlock(Blocks.CHISELED_POLISHED_BLACKSTONE));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = registerBlock("vertical_polished_blackstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_BLACKSTONE)).parentBlock(Blocks.POLISHED_BLACKSTONE));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_STAIRS = registerBlock("vertical_polished_blackstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_BLACKSTONE)).parentBlock(Blocks.POLISHED_BLACKSTONE));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("vertical_polished_blackstone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_BLACKSTONE_BRICKS)).parentBlock(Blocks.POLISHED_BLACKSTONE_BRICKS));
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("vertical_polished_blackstone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.POLISHED_BLACKSTONE_BRICKS)).parentBlock(Blocks.POLISHED_BLACKSTONE_BRICKS));
    public static final Block VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("vertical_cracked_polished_blackstone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).parentBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("vertical_cracked_polished_blackstone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).parentBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    public static final Block VERTICAL_END_STONE_SLAB = registerBlock("vertical_end_stone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.END_STONE)).parentBlock(Blocks.END_STONE));
    public static final Block VERTICAL_END_STONE_STAIRS = registerBlock("vertical_end_stone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.END_STONE)).parentBlock(Blocks.END_STONE));
    public static final Block VERTICAL_END_STONE_BRICKS_SLAB = registerBlock("vertical_end_stone_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.END_STONE_BRICKS)).parentBlock(Blocks.END_STONE_BRICKS));
    public static final Block VERTICAL_END_STONE_BRICKS_STAIRS = registerBlock("vertical_end_stone_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.END_STONE_BRICKS)).parentBlock(Blocks.END_STONE_BRICKS));
    public static final Block VERTICAL_PURPUR_SLAB = registerBlock("vertical_purpur_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPUR_BLOCK)).parentBlock(Blocks.PURPUR_BLOCK));
    public static final Block VERTICAL_PURPUR_STAIRS = registerBlock("vertical_purpur_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPUR_BLOCK)).parentBlock(Blocks.PURPUR_BLOCK));
    public static final Block VERTICAL_PURPUR_PILLAR_SLAB = registerBlock("vertical_purpur_pillar_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.PURPUR_PILLAR)).parentBlock(Blocks.PURPUR_PILLAR));
    public static final Block VERTICAL_PURPUR_PILLAR_STAIRS = registerBlock("vertical_purpur_pillar_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.PURPUR_PILLAR)).parentBlock(Blocks.PURPUR_PILLAR));

    public static final Block VERTICAL_COAL_SLAB = registerBlock("vertical_coal_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COAL_BLOCK)).parentBlock(Blocks.COAL_BLOCK));
    public static final Block VERTICAL_COAL_STAIRS = registerBlock("vertical_coal_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COAL_BLOCK)).parentBlock(Blocks.COAL_BLOCK));
    public static final Block VERTICAL_IRON_SLAB = registerBlock("vertical_iron_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.IRON_BLOCK)).parentBlock(Blocks.IRON_BLOCK));
    public static final Block VERTICAL_IRON_STAIRS = registerBlock("vertical_iron_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.IRON_BLOCK)).parentBlock(Blocks.IRON_BLOCK));
    public static final Block VERTICAL_GOLD_SLAB = registerBlock("vertical_gold_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GOLD_BLOCK)).parentBlock(Blocks.GOLD_BLOCK));
    public static final Block VERTICAL_GOLD_STAIRS = registerBlock("vertical_gold_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GOLD_BLOCK)).parentBlock(Blocks.GOLD_BLOCK));
    public static final Block VERTICAL_REDSTONE_SLAB = registerBlock("vertical_redstone_slab", VerticalRedstoneSlabBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.REDSTONE_BLOCK)).parentBlock(Blocks.REDSTONE_BLOCK));
    public static final Block VERTICAL_REDSTONE_STAIRS = registerBlock("vertical_redstone_stairs", VerticalRedstoneStairsBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.REDSTONE_BLOCK)).parentBlock(Blocks.REDSTONE_BLOCK));
    public static final Block VERTICAL_EMERALD_SLAB = registerBlock("vertical_emerald_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EMERALD_BLOCK)).parentBlock(Blocks.EMERALD_BLOCK));
    public static final Block VERTICAL_EMERALD_STAIRS = registerBlock("vertical_emerald_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EMERALD_BLOCK)).parentBlock(Blocks.EMERALD_BLOCK));
    public static final Block VERTICAL_LAPIS_SLAB = registerBlock("vertical_lapis_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LAPIS_BLOCK)).parentBlock(Blocks.LAPIS_BLOCK));
    public static final Block VERTICAL_LAPIS_STAIRS = registerBlock("vertical_lapis_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LAPIS_BLOCK)).parentBlock(Blocks.LAPIS_BLOCK));
    public static final Block VERTICAL_DIAMOND_SLAB = registerBlock("vertical_diamond_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DIAMOND_BLOCK)).parentBlock(Blocks.DIAMOND_BLOCK));
    public static final Block VERTICAL_DIAMOND_STAIRS = registerBlock("vertical_diamond_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DIAMOND_BLOCK)).parentBlock(Blocks.DIAMOND_BLOCK));
    public static final Block VERTICAL_NETHERITE_SLAB = registerBlock("vertical_netherite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHERITE_BLOCK)).parentBlock(Blocks.NETHERITE_BLOCK));
    public static final Block VERTICAL_NETHERITE_STAIRS = registerBlock("vertical_netherite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHERITE_BLOCK)).parentBlock(Blocks.NETHERITE_BLOCK));

    public static final Block VERTICAL_QUARTZ_SLAB = registerBlock("vertical_quartz_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockSTB(Blocks.QUARTZ_BLOCK)).parentBlock(Blocks.QUARTZ_BLOCK));
    public static final Block VERTICAL_QUARTZ_STAIRS = registerBlock("vertical_quartz_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockSTB(Blocks.QUARTZ_BLOCK)).parentBlock(Blocks.QUARTZ_BLOCK));
    public static final Block VERTICAL_CHISELED_QUARTZ_SLAB = registerBlock("vertical_chiseled_quartz_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHISELED_QUARTZ_BLOCK)).parentBlock(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final Block VERTICAL_CHISELED_QUARTZ_STAIRS = registerBlock("vertical_chiseled_quartz_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.CHISELED_QUARTZ_BLOCK)).parentBlock(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final Block VERTICAL_QUARTZ_BRICKS_SLAB = registerBlock("vertical_quartz_bricks_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.QUARTZ_BRICKS)).parentBlock(Blocks.QUARTZ_BLOCK));
    public static final Block VERTICAL_QUARTZ_BRICKS_STAIRS = registerBlock("vertical_quartz_bricks_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.QUARTZ_BRICKS)).parentBlock(Blocks.QUARTZ_BLOCK));
    public static final Block VERTICAL_QUARTZ_PILLAR_SLAB = registerBlock("vertical_quartz_pillar_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.QUARTZ_PILLAR)).parentBlock(Blocks.QUARTZ_PILLAR));
    public static final Block VERTICAL_QUARTZ_PILLAR_STAIRS = registerBlock("vertical_quartz_pillar_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(blockAndTopForEnds(Blocks.QUARTZ_PILLAR)).parentBlock(Blocks.QUARTZ_PILLAR));
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = registerBlock("vertical_smooth_quartz_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(allWithSuffix(Blocks.QUARTZ_BLOCK, "_bottom")).parentBlock(Blocks.SMOOTH_QUARTZ));
    public static final Block VERTICAL_SMOOTH_QUARTZ_STAIRS = registerBlock("vertical_smooth_quartz_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(allWithSuffix(Blocks.QUARTZ_BLOCK, "_bottom")).parentBlock(Blocks.SMOOTH_QUARTZ));

    public static final Block VERTICAL_AMETHYST_SLAB = registerBlock("vertical_amethyst_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.AMETHYST_BLOCK)).parentBlock(Blocks.AMETHYST_BLOCK));
    public static final Block VERTICAL_AMETHYST_STAIRS = registerBlock("vertical_amethyst_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.AMETHYST_BLOCK)).parentBlock(Blocks.AMETHYST_BLOCK));

    public static final Block VERTICAL_WAXED_COPPER_SLAB = registerBlock("vertical_waxed_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_BLOCK)).parentBlock(Blocks.WAXED_COPPER_BLOCK, Blocks.COPPER_BLOCK));
    public static final Block VERTICAL_WAXED_COPPER_STAIRS = registerBlock("vertical_waxed_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_BLOCK)).parentBlock(Blocks.WAXED_COPPER_BLOCK, Blocks.COPPER_BLOCK));
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_SLAB = registerBlock("vertical_waxed_exposed_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER)).parentBlock(Blocks.WAXED_EXPOSED_COPPER, Blocks.EXPOSED_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_STAIRS = registerBlock("vertical_waxed_exposed_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER)).parentBlock(Blocks.WAXED_EXPOSED_COPPER, Blocks.EXPOSED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_SLAB = registerBlock("vertical_waxed_weathered_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER)).parentBlock(Blocks.WAXED_WEATHERED_COPPER, Blocks.WEATHERED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_STAIRS = registerBlock("vertical_waxed_weathered_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER)).parentBlock(Blocks.WAXED_WEATHERED_COPPER, Blocks.WEATHERED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_SLAB = registerBlock("vertical_waxed_oxidized_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER)).parentBlock(Blocks.WAXED_OXIDIZED_COPPER, Blocks.OXIDIZED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("vertical_waxed_oxidized_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER)).parentBlock(Blocks.WAXED_OXIDIZED_COPPER, Blocks.OXIDIZED_COPPER));

    public static final Block VERTICAL_WAXED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_COPPER)).parentBlock(Blocks.WAXED_CHISELED_COPPER, Blocks.CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_COPPER)).parentBlock(Blocks.WAXED_CHISELED_COPPER, Blocks.CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_exposed_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER)).parentBlock(Blocks.WAXED_EXPOSED_CHISELED_COPPER, Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_exposed_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER)).parentBlock(Blocks.WAXED_EXPOSED_CHISELED_COPPER, Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_weathered_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER)).parentBlock(Blocks.WAXED_WEATHERED_CHISELED_COPPER, Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_weathered_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER)).parentBlock(Blocks.WAXED_WEATHERED_CHISELED_COPPER, Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("vertical_waxed_oxidized_chiseled_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER)).parentBlock(Blocks.WAXED_OXIDIZED_CHISELED_COPPER, Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("vertical_waxed_oxidized_chiseled_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER)).parentBlock(Blocks.WAXED_OXIDIZED_CHISELED_COPPER, Blocks.OXIDIZED_CHISELED_COPPER));

    public static final Block VERTICAL_WAXED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_GRATE)).parentBlock(Blocks.WAXED_COPPER_GRATE, Blocks.COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WAXED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_GRATE)).parentBlock(Blocks.WAXED_COPPER_GRATE, Blocks.COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_exposed_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER_GRATE)).parentBlock(Blocks.WAXED_EXPOSED_COPPER_GRATE, Blocks.EXPOSED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WAXED_EXPOSED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_exposed_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER_GRATE)).parentBlock(Blocks.WAXED_EXPOSED_COPPER_GRATE, Blocks.EXPOSED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_weathered_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER_GRATE)).parentBlock(Blocks.WAXED_WEATHERED_COPPER_GRATE, Blocks.WEATHERED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WAXED_WEATHERED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_weathered_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER_GRATE)).parentBlock(Blocks.WAXED_WEATHERED_COPPER_GRATE, Blocks.WEATHERED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_SLAB = registerBlock("vertical_waxed_oxidized_copper_grate_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE)).parentBlock(Blocks.WAXED_OXIDIZED_COPPER_GRATE, Blocks.OXIDIZED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("vertical_waxed_oxidized_copper_grate_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE)).parentBlock(Blocks.WAXED_OXIDIZED_COPPER_GRATE, Blocks.OXIDIZED_COPPER_GRATE), new RegistryArgs().transparent());

    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CUT_COPPER)).parentBlock(Blocks.WAXED_CUT_COPPER, Blocks.CUT_COPPER));
    public static final Block VERTICAL_WAXED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CUT_COPPER)).parentBlock(Blocks.WAXED_CUT_COPPER, Blocks.CUT_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_exposed_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CUT_COPPER)).parentBlock(Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_exposed_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CUT_COPPER)).parentBlock(Blocks.WAXED_EXPOSED_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_weathered_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CUT_COPPER)).parentBlock(Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_weathered_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CUT_COPPER)).parentBlock(Blocks.WAXED_WEATHERED_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_oxidized_cut_copper_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CUT_COPPER)).parentBlock(Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_STAIRS = registerBlock("vertical_waxed_oxidized_cut_copper_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CUT_COPPER)).parentBlock(Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER));

    public static final Block VERTICAL_EXPOSED_COPPER_SLAB = registerBlock("vertical_exposed_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER)).parentBlock(Blocks.EXPOSED_COPPER));
    public static final Block VERTICAL_EXPOSED_COPPER_STAIRS = registerBlock("vertical_exposed_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER)).parentBlock(Blocks.EXPOSED_COPPER));
    public static final Block VERTICAL_WEATHERED_COPPER_SLAB = registerBlock("vertical_weathered_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER)).parentBlock(Blocks.WEATHERED_COPPER));
    public static final Block VERTICAL_WEATHERED_COPPER_STAIRS = registerBlock("vertical_weathered_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER)).parentBlock(Blocks.WEATHERED_COPPER));
    public static final Block VERTICAL_OXIDIZED_COPPER_SLAB = registerBlock("vertical_oxidized_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER)).parentBlock(Blocks.OXIDIZED_COPPER));
    public static final Block VERTICAL_OXIDIZED_COPPER_STAIRS = registerBlock("vertical_oxidized_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER)).parentBlock(Blocks.OXIDIZED_COPPER));
    public static final Block VERTICAL_COPPER_SLAB = registerBlock("vertical_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_BLOCK)).parentBlock(Blocks.COPPER_BLOCK),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_COPPER_SLAB, VERTICAL_WEATHERED_COPPER_SLAB, VERTICAL_OXIDIZED_COPPER_SLAB,
                    VERTICAL_WAXED_COPPER_SLAB, VERTICAL_WAXED_EXPOSED_COPPER_SLAB, VERTICAL_WAXED_WEATHERED_COPPER_SLAB, VERTICAL_WAXED_OXIDIZED_COPPER_SLAB));
    public static final Block VERTICAL_COPPER_STAIRS = registerBlock("vertical_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_BLOCK)).parentBlock(Blocks.COPPER_BLOCK),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_COPPER_STAIRS, VERTICAL_WEATHERED_COPPER_STAIRS, VERTICAL_OXIDIZED_COPPER_STAIRS,
                    VERTICAL_WAXED_COPPER_STAIRS, VERTICAL_WAXED_EXPOSED_COPPER_STAIRS, VERTICAL_WAXED_WEATHERED_COPPER_STAIRS, VERTICAL_WAXED_OXIDIZED_COPPER_STAIRS));

    public static final Block VERTICAL_EXPOSED_CHISELED_COPPER_SLAB = registerBlock("vertical_exposed_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER)).parentBlock(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("vertical_exposed_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER)).parentBlock(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block VERTICAL_WEATHERED_CHISELED_COPPER_SLAB = registerBlock("vertical_weathered_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER)).parentBlock(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("vertical_weathered_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER)).parentBlock(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block VERTICAL_OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("vertical_oxidized_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER)).parentBlock(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block VERTICAL_OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("vertical_oxidized_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER)).parentBlock(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block VERTICAL_CHISELED_COPPER_SLAB = registerBlock("vertical_chiseled_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_COPPER)).parentBlock(Blocks.CHISELED_COPPER),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_CHISELED_COPPER_SLAB, VERTICAL_WEATHERED_CHISELED_COPPER_SLAB, VERTICAL_OXIDIZED_CHISELED_COPPER_SLAB,
                    VERTICAL_WAXED_CHISELED_COPPER_SLAB, VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_SLAB, VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_SLAB, VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_SLAB));
    public static final Block VERTICAL_CHISELED_COPPER_STAIRS = registerBlock("vertical_chiseled_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CHISELED_COPPER)).parentBlock(Blocks.CHISELED_COPPER),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_CHISELED_COPPER_STAIRS, VERTICAL_WEATHERED_CHISELED_COPPER_STAIRS, VERTICAL_OXIDIZED_CHISELED_COPPER_STAIRS,
                    VERTICAL_WAXED_CHISELED_COPPER_STAIRS, VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_STAIRS, VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_STAIRS, VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_STAIRS));

    public static final Block VERTICAL_EXPOSED_COPPER_GRATE_SLAB = registerBlock("vertical_exposed_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER_GRATE)).parentBlock(Blocks.EXPOSED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_EXPOSED_COPPER_GRATE_STAIRS = registerBlock("vertical_exposed_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_COPPER_GRATE)).parentBlock(Blocks.EXPOSED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WEATHERED_COPPER_GRATE_SLAB = registerBlock("vertical_weathered_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER_GRATE)).parentBlock(Blocks.WEATHERED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_WEATHERED_COPPER_GRATE_STAIRS = registerBlock("vertical_weathered_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_COPPER_GRATE)).parentBlock(Blocks.WEATHERED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_OXIDIZED_COPPER_GRATE_SLAB = registerBlock("vertical_oxidized_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE)).parentBlock(Blocks.OXIDIZED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("vertical_oxidized_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE)).parentBlock(Blocks.OXIDIZED_COPPER_GRATE), new RegistryArgs().transparent());
    public static final Block VERTICAL_COPPER_GRATE_SLAB = registerBlock("vertical_copper_grate_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_GRATE)).parentBlock(Blocks.COPPER_GRATE),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_COPPER_GRATE_SLAB, VERTICAL_WEATHERED_COPPER_GRATE_SLAB, VERTICAL_OXIDIZED_COPPER_GRATE_SLAB,
                    VERTICAL_WAXED_COPPER_GRATE_SLAB, VERTICAL_WAXED_EXPOSED_COPPER_GRATE_SLAB, VERTICAL_WAXED_WEATHERED_COPPER_GRATE_SLAB, VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_SLAB).transparent());
    public static final Block VERTICAL_COPPER_GRATE_STAIRS = registerBlock("vertical_copper_grate_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_GRATE)).parentBlock(Blocks.COPPER_GRATE),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_COPPER_GRATE_STAIRS, VERTICAL_WEATHERED_COPPER_GRATE_STAIRS, VERTICAL_OXIDIZED_COPPER_GRATE_STAIRS,
                    VERTICAL_WAXED_COPPER_GRATE_STAIRS, VERTICAL_WAXED_EXPOSED_COPPER_GRATE_STAIRS, VERTICAL_WAXED_WEATHERED_COPPER_GRATE_STAIRS, VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS).transparent());

    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = registerBlock("vertical_exposed_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CUT_COPPER)).parentBlock(Blocks.EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_STAIRS = registerBlock("vertical_exposed_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EXPOSED_CUT_COPPER)).parentBlock(Blocks.EXPOSED_CUT_COPPER));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = registerBlock("vertical_weathered_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CUT_COPPER)).parentBlock(Blocks.WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_STAIRS = registerBlock("vertical_weathered_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WEATHERED_CUT_COPPER)).parentBlock(Blocks.WEATHERED_CUT_COPPER));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = registerBlock("vertical_oxidized_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CUT_COPPER)).parentBlock(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_STAIRS = registerBlock("vertical_oxidized_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OXIDIZED_CUT_COPPER)).parentBlock(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block VERTICAL_CUT_COPPER_SLAB = registerBlock("vertical_cut_copper_slab", (settings) -> new VerticalOxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CUT_COPPER)).parentBlock(Blocks.CUT_COPPER),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_CUT_COPPER_SLAB, VERTICAL_WEATHERED_CUT_COPPER_SLAB, VERTICAL_OXIDIZED_CUT_COPPER_SLAB,
                    VERTICAL_WAXED_CUT_COPPER_SLAB, VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB));
    public static final Block VERTICAL_CUT_COPPER_STAIRS = registerBlock("vertical_cut_copper_stairs", (settings) -> new VerticalOxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CUT_COPPER)).parentBlock(Blocks.CUT_COPPER),
            new RegistryArgs().oxidizable(VERTICAL_EXPOSED_CUT_COPPER_STAIRS, VERTICAL_WEATHERED_CUT_COPPER_STAIRS, VERTICAL_OXIDIZED_CUT_COPPER_STAIRS,
                    VERTICAL_WAXED_CUT_COPPER_STAIRS, VERTICAL_WAXED_EXPOSED_CUT_COPPER_STAIRS, VERTICAL_WAXED_WEATHERED_CUT_COPPER_STAIRS, VERTICAL_WAXED_OXIDIZED_CUT_COPPER_STAIRS));

    public static final Block VERTICAL_WHITE_WOOL_SLAB = registerBlock("vertical_white_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.WHITE_WOOL)).parentBlock(Blocks.WHITE_WOOL));
    public static final Block VERTICAL_WHITE_WOOL_STAIRS = registerBlock("vertical_white_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.WHITE_WOOL)).parentBlock(Blocks.WHITE_WOOL));
    public static final Block VERTICAL_LIGHT_GRAY_WOOL_SLAB = registerBlock("vertical_light_gray_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.LIGHT_GRAY_WOOL)).parentBlock(Blocks.LIGHT_GRAY_WOOL));
    public static final Block VERTICAL_LIGHT_GRAY_WOOL_STAIRS = registerBlock("vertical_light_gray_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.LIGHT_GRAY_WOOL)).parentBlock(Blocks.LIGHT_GRAY_WOOL));
    public static final Block VERTICAL_GRAY_WOOL_SLAB = registerBlock("vertical_gray_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.GRAY_WOOL)).parentBlock(Blocks.GRAY_WOOL));
    public static final Block VERTICAL_GRAY_WOOL_STAIRS = registerBlock("vertical_gray_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.GRAY_WOOL)).parentBlock(Blocks.GRAY_WOOL));
    public static final Block VERTICAL_BLACK_WOOL_SLAB = registerBlock("vertical_black_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL), 
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.BLACK_WOOL)).parentBlock(Blocks.BLACK_WOOL));
    public static final Block VERTICAL_BLACK_WOOL_STAIRS = registerBlock("vertical_black_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.BLACK_WOOL)).parentBlock(Blocks.BLACK_WOOL));
    public static final Block VERTICAL_BROWN_WOOL_SLAB = registerBlock("vertical_brown_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL), 
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.BROWN_WOOL)).parentBlock(Blocks.BROWN_WOOL));
    public static final Block VERTICAL_BROWN_WOOL_STAIRS = registerBlock("vertical_brown_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.BROWN_WOOL)).parentBlock(Blocks.BROWN_WOOL));
    public static final Block VERTICAL_RED_WOOL_SLAB = registerBlock("vertical_red_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.RED_WOOL)).parentBlock(Blocks.RED_WOOL));
    public static final Block VERTICAL_RED_WOOL_STAIRS = registerBlock("vertical_red_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.RED_WOOL)).parentBlock(Blocks.RED_WOOL));
    public static final Block VERTICAL_ORANGE_WOOL_SLAB = registerBlock("vertical_orange_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.ORANGE_WOOL)).parentBlock(Blocks.ORANGE_WOOL));
    public static final Block VERTICAL_ORANGE_WOOL_STAIRS = registerBlock("vertical_orange_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.ORANGE_WOOL)).parentBlock(Blocks.ORANGE_WOOL));
    public static final Block VERTICAL_YELLOW_WOOL_SLAB = registerBlock("vertical_yellow_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.YELLOW_WOOL)).parentBlock(Blocks.YELLOW_WOOL));
    public static final Block VERTICAL_YELLOW_WOOL_STAIRS = registerBlock("vertical_yellow_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.YELLOW_WOOL)).parentBlock(Blocks.YELLOW_WOOL));
    public static final Block VERTICAL_LIME_WOOL_SLAB = registerBlock("vertical_lime_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.LIME_WOOL)).parentBlock(Blocks.LIME_WOOL));
    public static final Block VERTICAL_LIME_WOOL_STAIRS = registerBlock("vertical_lime_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.LIME_WOOL)).parentBlock(Blocks.LIME_WOOL));
    public static final Block VERTICAL_GREEN_WOOL_SLAB = registerBlock("vertical_green_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.GREEN_WOOL)).parentBlock(Blocks.GREEN_WOOL));
    public static final Block VERTICAL_GREEN_WOOL_STAIRS = registerBlock("vertical_green_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.GREEN_WOOL)).parentBlock(Blocks.GREEN_WOOL));
    public static final Block VERTICAL_CYAN_WOOL_SLAB = registerBlock("vertical_cyan_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.CYAN_WOOL)).parentBlock(Blocks.CYAN_WOOL));
    public static final Block VERTICAL_CYAN_WOOL_STAIRS = registerBlock("vertical_cyan_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.CYAN_WOOL)).parentBlock(Blocks.CYAN_WOOL));
    public static final Block VERTICAL_LIGHT_BLUE_WOOL_SLAB = registerBlock("vertical_light_blue_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.LIGHT_BLUE_WOOL)).parentBlock(Blocks.LIGHT_BLUE_WOOL));
    public static final Block VERTICAL_LIGHT_BLUE_WOOL_STAIRS = registerBlock("vertical_light_blue_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.LIGHT_BLUE_WOOL)).parentBlock(Blocks.LIGHT_BLUE_WOOL));
    public static final Block VERTICAL_BLUE_WOOL_SLAB = registerBlock("vertical_blue_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.BLUE_WOOL)).parentBlock(Blocks.BLUE_WOOL));
    public static final Block VERTICAL_BLUE_WOOL_STAIRS = registerBlock("vertical_blue_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.BLUE_WOOL)).parentBlock(Blocks.BLUE_WOOL));
    public static final Block VERTICAL_PURPLE_WOOL_SLAB = registerBlock("vertical_purple_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL), 
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.PURPLE_WOOL)).parentBlock(Blocks.PURPLE_WOOL));
    public static final Block VERTICAL_PURPLE_WOOL_STAIRS = registerBlock("vertical_purple_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.PURPLE_WOOL)).parentBlock(Blocks.PURPLE_WOOL));
    public static final Block VERTICAL_MAGENTA_WOOL_SLAB = registerBlock("vertical_magenta_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.MAGENTA_WOOL)).parentBlock(Blocks.MAGENTA_WOOL));
    public static final Block VERTICAL_MAGENTA_WOOL_STAIRS = registerBlock("vertical_magenta_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.MAGENTA_WOOL)).parentBlock(Blocks.MAGENTA_WOOL));
    public static final Block VERTICAL_PINK_WOOL_SLAB = registerBlock("vertical_pink_wool_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.PINK_WOOL)).parentBlock(Blocks.PINK_WOOL));
    public static final Block VERTICAL_PINK_WOOL_STAIRS = registerBlock("vertical_pink_wool_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_WOOL),
            new DatagenArgs().blockTags().textureMap(TextureMap.all(Blocks.PINK_WOOL)).parentBlock(Blocks.PINK_WOOL));
    
    public static final Block VERTICAL_TERRACOTTA_SLAB = registerBlock("vertical_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.TERRACOTTA)).parentBlock(Blocks.TERRACOTTA));
    public static final Block VERTICAL_TERRACOTTA_STAIRS = registerBlock("vertical_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.TERRACOTTA)).parentBlock(Blocks.TERRACOTTA));
    public static final Block VERTICAL_WHITE_TERRACOTTA_SLAB = registerBlock("vertical_white_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.WHITE_TERRACOTTA)).parentBlock(Blocks.WHITE_TERRACOTTA));
    public static final Block VERTICAL_WHITE_TERRACOTTA_STAIRS = registerBlock("vertical_white_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.WHITE_TERRACOTTA)).parentBlock(Blocks.WHITE_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("vertical_light_gray_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_TERRACOTTA)).parentBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("vertical_light_gray_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_TERRACOTTA)).parentBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block VERTICAL_GRAY_TERRACOTTA_SLAB = registerBlock("vertical_gray_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.GRAY_TERRACOTTA)).parentBlock(Blocks.GRAY_TERRACOTTA));
    public static final Block VERTICAL_GRAY_TERRACOTTA_STAIRS = registerBlock("vertical_gray_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.GRAY_TERRACOTTA)).parentBlock(Blocks.GRAY_TERRACOTTA));
    public static final Block VERTICAL_BLACK_TERRACOTTA_SLAB = registerBlock("vertical_black_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.BLACK_TERRACOTTA)).parentBlock(Blocks.BLACK_TERRACOTTA));
    public static final Block VERTICAL_BLACK_TERRACOTTA_STAIRS = registerBlock("vertical_black_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.BLACK_TERRACOTTA)).parentBlock(Blocks.BLACK_TERRACOTTA));
    public static final Block VERTICAL_BROWN_TERRACOTTA_SLAB = registerBlock("vertical_brown_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.BROWN_TERRACOTTA)).parentBlock(Blocks.BROWN_TERRACOTTA));
    public static final Block VERTICAL_BROWN_TERRACOTTA_STAIRS = registerBlock("vertical_brown_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.BROWN_TERRACOTTA)).parentBlock(Blocks.BROWN_TERRACOTTA));
    public static final Block VERTICAL_RED_TERRACOTTA_SLAB = registerBlock("vertical_red_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.RED_TERRACOTTA)).parentBlock(Blocks.RED_TERRACOTTA));
    public static final Block VERTICAL_RED_TERRACOTTA_STAIRS = registerBlock("vertical_red_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.RED_TERRACOTTA)).parentBlock(Blocks.RED_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_TERRACOTTA_SLAB = registerBlock("vertical_orange_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.ORANGE_TERRACOTTA)).parentBlock(Blocks.ORANGE_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_TERRACOTTA_STAIRS = registerBlock("vertical_orange_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.ORANGE_TERRACOTTA)).parentBlock(Blocks.ORANGE_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_TERRACOTTA_SLAB = registerBlock("vertical_yellow_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.YELLOW_TERRACOTTA)).parentBlock(Blocks.YELLOW_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_TERRACOTTA_STAIRS = registerBlock("vertical_yellow_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.YELLOW_TERRACOTTA)).parentBlock(Blocks.YELLOW_TERRACOTTA));
    public static final Block VERTICAL_LIME_TERRACOTTA_SLAB = registerBlock("vertical_lime_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.LIME_TERRACOTTA)).parentBlock(Blocks.LIME_TERRACOTTA));
    public static final Block VERTICAL_LIME_TERRACOTTA_STAIRS = registerBlock("vertical_lime_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.LIME_TERRACOTTA)).parentBlock(Blocks.LIME_TERRACOTTA));
    public static final Block VERTICAL_GREEN_TERRACOTTA_SLAB = registerBlock("vertical_green_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.GREEN_TERRACOTTA)).parentBlock(Blocks.GREEN_TERRACOTTA));
    public static final Block VERTICAL_GREEN_TERRACOTTA_STAIRS = registerBlock("vertical_green_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.GREEN_TERRACOTTA)).parentBlock(Blocks.GREEN_TERRACOTTA));
    public static final Block VERTICAL_CYAN_TERRACOTTA_SLAB = registerBlock("vertical_cyan_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.CYAN_TERRACOTTA)).parentBlock(Blocks.CYAN_TERRACOTTA));
    public static final Block VERTICAL_CYAN_TERRACOTTA_STAIRS = registerBlock("vertical_cyan_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.CYAN_TERRACOTTA)).parentBlock(Blocks.CYAN_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("vertical_light_blue_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_TERRACOTTA)).parentBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("vertical_light_blue_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_TERRACOTTA)).parentBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block VERTICAL_BLUE_TERRACOTTA_SLAB = registerBlock("vertical_blue_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.BLUE_TERRACOTTA)).parentBlock(Blocks.BLUE_TERRACOTTA));
    public static final Block VERTICAL_BLUE_TERRACOTTA_STAIRS = registerBlock("vertical_blue_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.BLUE_TERRACOTTA)).parentBlock(Blocks.BLUE_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_TERRACOTTA_SLAB = registerBlock("vertical_purple_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.PURPLE_TERRACOTTA)).parentBlock(Blocks.PURPLE_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_TERRACOTTA_STAIRS = registerBlock("vertical_purple_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.PURPLE_TERRACOTTA)).parentBlock(Blocks.PURPLE_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_TERRACOTTA_SLAB = registerBlock("vertical_magenta_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.MAGENTA_TERRACOTTA)).parentBlock(Blocks.MAGENTA_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_TERRACOTTA_STAIRS = registerBlock("vertical_magenta_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.MAGENTA_TERRACOTTA)).parentBlock(Blocks.MAGENTA_TERRACOTTA));
    public static final Block VERTICAL_PINK_TERRACOTTA_SLAB = registerBlock("vertical_pink_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.PINK_TERRACOTTA)).parentBlock(Blocks.PINK_TERRACOTTA));
    public static final Block VERTICAL_PINK_TERRACOTTA_STAIRS = registerBlock("vertical_pink_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE, BlockTags.TERRACOTTA).textureMap(TextureMap.all(Blocks.PINK_TERRACOTTA)).parentBlock(Blocks.PINK_TERRACOTTA));

    public static final Block VERTICAL_WHITE_CONCRETE_SLAB = registerBlock("vertical_white_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WHITE_CONCRETE)).parentBlock(Blocks.WHITE_CONCRETE));
    public static final Block VERTICAL_WHITE_CONCRETE_STAIRS = registerBlock("vertical_white_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WHITE_CONCRETE)).parentBlock(Blocks.WHITE_CONCRETE));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("vertical_light_gray_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE)).parentBlock(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("vertical_light_gray_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE)).parentBlock(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block VERTICAL_GRAY_CONCRETE_SLAB = registerBlock("vertical_gray_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRAY_CONCRETE)).parentBlock(Blocks.GRAY_CONCRETE));
    public static final Block VERTICAL_GRAY_CONCRETE_STAIRS = registerBlock("vertical_gray_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRAY_CONCRETE)).parentBlock(Blocks.GRAY_CONCRETE));
    public static final Block VERTICAL_BLACK_CONCRETE_SLAB = registerBlock("vertical_black_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACK_CONCRETE)).parentBlock(Blocks.BLACK_CONCRETE));
    public static final Block VERTICAL_BLACK_CONCRETE_STAIRS = registerBlock("vertical_black_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACK_CONCRETE)).parentBlock(Blocks.BLACK_CONCRETE));
    public static final Block VERTICAL_BROWN_CONCRETE_SLAB = registerBlock("vertical_brown_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BROWN_CONCRETE)).parentBlock(Blocks.BROWN_CONCRETE));
    public static final Block VERTICAL_BROWN_CONCRETE_STAIRS = registerBlock("vertical_brown_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BROWN_CONCRETE)).parentBlock(Blocks.BROWN_CONCRETE));
    public static final Block VERTICAL_RED_CONCRETE_SLAB = registerBlock("vertical_red_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_CONCRETE)).parentBlock(Blocks.RED_CONCRETE));
    public static final Block VERTICAL_RED_CONCRETE_STAIRS = registerBlock("vertical_red_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_CONCRETE)).parentBlock(Blocks.RED_CONCRETE));
    public static final Block VERTICAL_ORANGE_CONCRETE_SLAB = registerBlock("vertical_orange_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ORANGE_CONCRETE)).parentBlock(Blocks.ORANGE_CONCRETE));
    public static final Block VERTICAL_ORANGE_CONCRETE_STAIRS = registerBlock("vertical_orange_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ORANGE_CONCRETE)).parentBlock(Blocks.ORANGE_CONCRETE));
    public static final Block VERTICAL_YELLOW_CONCRETE_SLAB = registerBlock("vertical_yellow_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.YELLOW_CONCRETE)).parentBlock(Blocks.YELLOW_CONCRETE));
    public static final Block VERTICAL_YELLOW_CONCRETE_STAIRS = registerBlock("vertical_yellow_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.YELLOW_CONCRETE)).parentBlock(Blocks.YELLOW_CONCRETE));
    public static final Block VERTICAL_LIME_CONCRETE_SLAB = registerBlock("vertical_lime_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIME_CONCRETE)).parentBlock(Blocks.LIME_CONCRETE));
    public static final Block VERTICAL_LIME_CONCRETE_STAIRS = registerBlock("vertical_lime_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIME_CONCRETE)).parentBlock(Blocks.LIME_CONCRETE));
    public static final Block VERTICAL_GREEN_CONCRETE_SLAB = registerBlock("vertical_green_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GREEN_CONCRETE)).parentBlock(Blocks.GREEN_CONCRETE));
    public static final Block VERTICAL_GREEN_CONCRETE_STAIRS = registerBlock("vertical_green_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GREEN_CONCRETE)).parentBlock(Blocks.GREEN_CONCRETE));
    public static final Block VERTICAL_CYAN_CONCRETE_SLAB = registerBlock("vertical_cyan_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CYAN_CONCRETE)).parentBlock(Blocks.CYAN_CONCRETE));
    public static final Block VERTICAL_CYAN_CONCRETE_STAIRS = registerBlock("vertical_cyan_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CYAN_CONCRETE)).parentBlock(Blocks.CYAN_CONCRETE));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("vertical_light_blue_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE)).parentBlock(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("vertical_light_blue_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE)).parentBlock(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block VERTICAL_BLUE_CONCRETE_SLAB = registerBlock("vertical_blue_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_CONCRETE)).parentBlock(Blocks.BLUE_CONCRETE));
    public static final Block VERTICAL_BLUE_CONCRETE_STAIRS = registerBlock("vertical_blue_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_CONCRETE)).parentBlock(Blocks.BLUE_CONCRETE));
    public static final Block VERTICAL_PURPLE_CONCRETE_SLAB = registerBlock("vertical_purple_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPLE_CONCRETE)).parentBlock(Blocks.PURPLE_CONCRETE));
    public static final Block VERTICAL_PURPLE_CONCRETE_STAIRS = registerBlock("vertical_purple_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPLE_CONCRETE)).parentBlock(Blocks.PURPLE_CONCRETE));
    public static final Block VERTICAL_MAGENTA_CONCRETE_SLAB = registerBlock("vertical_magenta_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MAGENTA_CONCRETE)).parentBlock(Blocks.MAGENTA_CONCRETE));
    public static final Block VERTICAL_MAGENTA_CONCRETE_STAIRS = registerBlock("vertical_magenta_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MAGENTA_CONCRETE)).parentBlock(Blocks.MAGENTA_CONCRETE));
    public static final Block VERTICAL_PINK_CONCRETE_SLAB = registerBlock("vertical_pink_concrete_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PINK_CONCRETE)).parentBlock(Blocks.PINK_CONCRETE));
    public static final Block VERTICAL_PINK_CONCRETE_STAIRS = registerBlock("vertical_pink_concrete_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PINK_CONCRETE)).parentBlock(Blocks.PINK_CONCRETE));

    public static final Block VERTICAL_WHITE_CONCRETE_POWDER_SLAB = registerBlock("vertical_white_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_WHITE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.WHITE_CONCRETE_POWDER)).parentBlock(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block VERTICAL_WHITE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_white_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_WHITE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.WHITE_CONCRETE_POWDER)).parentBlock(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("vertical_light_gray_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).parentBlock(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_STAIRS = registerBlock("vertical_light_gray_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE_POWDER)).parentBlock(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_GRAY_CONCRETE_POWDER_SLAB = registerBlock("vertical_gray_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_GRAY_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.GRAY_CONCRETE_POWDER)).parentBlock(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_GRAY_CONCRETE_POWDER_STAIRS = registerBlock("vertical_gray_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_GRAY_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.GRAY_CONCRETE_POWDER)).parentBlock(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block VERTICAL_BLACK_CONCRETE_POWDER_SLAB = registerBlock("vertical_black_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_BLACK_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.BLACK_CONCRETE_POWDER)).parentBlock(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block VERTICAL_BLACK_CONCRETE_POWDER_STAIRS = registerBlock("vertical_black_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_BLACK_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.BLACK_CONCRETE_POWDER)).parentBlock(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block VERTICAL_BROWN_CONCRETE_POWDER_SLAB = registerBlock("vertical_brown_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_BROWN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.BROWN_CONCRETE_POWDER)).parentBlock(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block VERTICAL_BROWN_CONCRETE_POWDER_STAIRS = registerBlock("vertical_brown_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_BROWN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.BROWN_CONCRETE_POWDER)).parentBlock(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block VERTICAL_RED_CONCRETE_POWDER_SLAB = registerBlock("vertical_red_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_RED_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.RED_CONCRETE_POWDER)).parentBlock(Blocks.RED_CONCRETE_POWDER));
    public static final Block VERTICAL_RED_CONCRETE_POWDER_STAIRS = registerBlock("vertical_red_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_RED_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.RED_CONCRETE_POWDER)).parentBlock(Blocks.RED_CONCRETE_POWDER));
    public static final Block VERTICAL_ORANGE_CONCRETE_POWDER_SLAB = registerBlock("vertical_orange_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_ORANGE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.ORANGE_CONCRETE_POWDER)).parentBlock(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block VERTICAL_ORANGE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_orange_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_ORANGE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.ORANGE_CONCRETE_POWDER)).parentBlock(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block VERTICAL_YELLOW_CONCRETE_POWDER_SLAB = registerBlock("vertical_yellow_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_YELLOW_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.YELLOW_CONCRETE_POWDER)).parentBlock(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block VERTICAL_YELLOW_CONCRETE_POWDER_STAIRS = registerBlock("vertical_yellow_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_YELLOW_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.YELLOW_CONCRETE_POWDER)).parentBlock(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block VERTICAL_LIME_CONCRETE_POWDER_SLAB = registerBlock("vertical_lime_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_LIME_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.LIME_CONCRETE_POWDER)).parentBlock(Blocks.LIME_CONCRETE_POWDER));
    public static final Block VERTICAL_LIME_CONCRETE_POWDER_STAIRS = registerBlock("vertical_lime_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_LIME_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.LIME_CONCRETE_POWDER)).parentBlock(Blocks.LIME_CONCRETE_POWDER));
    public static final Block VERTICAL_GREEN_CONCRETE_POWDER_SLAB = registerBlock("vertical_green_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_GREEN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.GREEN_CONCRETE_POWDER)).parentBlock(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block VERTICAL_GREEN_CONCRETE_POWDER_STAIRS = registerBlock("vertical_green_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_GREEN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.GREEN_CONCRETE_POWDER)).parentBlock(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block VERTICAL_CYAN_CONCRETE_POWDER_SLAB = registerBlock("vertical_cyan_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_CYAN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.CYAN_CONCRETE_POWDER)).parentBlock(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block VERTICAL_CYAN_CONCRETE_POWDER_STAIRS = registerBlock("vertical_cyan_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_CYAN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.CYAN_CONCRETE_POWDER)).parentBlock(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("vertical_light_blue_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE_POWDER)).parentBlock(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_light_blue_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE_POWDER)).parentBlock(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_BLUE_CONCRETE_POWDER_SLAB = registerBlock("vertical_blue_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_BLUE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.BLUE_CONCRETE_POWDER)).parentBlock(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_BLUE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_blue_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_BLUE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.BLUE_CONCRETE_POWDER)).parentBlock(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block VERTICAL_PURPLE_CONCRETE_POWDER_SLAB = registerBlock("vertical_purple_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_PURPLE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.PURPLE_CONCRETE_POWDER)).parentBlock(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block VERTICAL_PURPLE_CONCRETE_POWDER_STAIRS = registerBlock("vertical_purple_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_PURPLE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.PURPLE_CONCRETE_POWDER)).parentBlock(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block VERTICAL_MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("vertical_magenta_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_MAGENTA_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.MAGENTA_CONCRETE_POWDER)).parentBlock(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block VERTICAL_MAGENTA_CONCRETE_POWDER_STAIRS = registerBlock("vertical_magenta_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_MAGENTA_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.MAGENTA_CONCRETE_POWDER)).parentBlock(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block VERTICAL_PINK_CONCRETE_POWDER_SLAB = registerBlock("vertical_pink_concrete_powder_slab", settings -> new VerticalConcretePowderSlabBlock(settings, ModBlocks.VERTICAL_PINK_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.PINK_CONCRETE_POWDER)).parentBlock(Blocks.PINK_CONCRETE_POWDER));
    public static final Block VERTICAL_PINK_CONCRETE_POWDER_STAIRS = registerBlock("vertical_pink_concrete_powder_stairs", settings -> new VerticalConcretePowderStairsBlock(settings, ModBlocks.VERTICAL_PINK_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE, BlockTags.CONCRETE_POWDER).textureMap(TextureMap.all(Blocks.PINK_CONCRETE_POWDER)).parentBlock(Blocks.PINK_CONCRETE_POWDER));

    public static final Block VERTICAL_WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_white_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WHITE_GLAZED_TERRACOTTA)).parentBlock(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_white_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WHITE_GLAZED_TERRACOTTA)).parentBlock(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_light_gray_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).parentBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_light_gray_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).parentBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_gray_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRAY_GLAZED_TERRACOTTA)).parentBlock(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_gray_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRAY_GLAZED_TERRACOTTA)).parentBlock(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_black_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACK_GLAZED_TERRACOTTA)).parentBlock(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_black_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACK_GLAZED_TERRACOTTA)).parentBlock(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_brown_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BROWN_GLAZED_TERRACOTTA)).parentBlock(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_brown_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BROWN_GLAZED_TERRACOTTA)).parentBlock(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_RED_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_red_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_GLAZED_TERRACOTTA)).parentBlock(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_red_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_GLAZED_TERRACOTTA)).parentBlock(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_orange_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ORANGE_GLAZED_TERRACOTTA)).parentBlock(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_orange_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ORANGE_GLAZED_TERRACOTTA)).parentBlock(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_yellow_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.YELLOW_GLAZED_TERRACOTTA)).parentBlock(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_yellow_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.YELLOW_GLAZED_TERRACOTTA)).parentBlock(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_lime_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIME_GLAZED_TERRACOTTA)).parentBlock(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_lime_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIME_GLAZED_TERRACOTTA)).parentBlock(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_green_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GREEN_GLAZED_TERRACOTTA)).parentBlock(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_green_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GREEN_GLAZED_TERRACOTTA)).parentBlock(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_cyan_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CYAN_GLAZED_TERRACOTTA)).parentBlock(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_cyan_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CYAN_GLAZED_TERRACOTTA)).parentBlock(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_light_blue_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).parentBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_light_blue_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).parentBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_blue_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_GLAZED_TERRACOTTA)).parentBlock(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_blue_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_GLAZED_TERRACOTTA)).parentBlock(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_purple_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPLE_GLAZED_TERRACOTTA)).parentBlock(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_purple_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPLE_GLAZED_TERRACOTTA)).parentBlock(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_magenta_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MAGENTA_GLAZED_TERRACOTTA)).parentBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_magenta_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MAGENTA_GLAZED_TERRACOTTA)).parentBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("vertical_pink_glazed_terracotta_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PINK_GLAZED_TERRACOTTA)).parentBlock(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block VERTICAL_PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("vertical_pink_glazed_terracotta_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PINK_GLAZED_TERRACOTTA)).parentBlock(Blocks.PINK_GLAZED_TERRACOTTA));

    public static final Block VERTICAL_GLASS_SLAB = registerBlock("vertical_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GLASS)).parentBlock(Blocks.GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_GLASS_STAIRS = registerBlock("vertical_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GLASS)).parentBlock(Blocks.GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_WHITE_STAINED_GLASS_SLAB = registerBlock("vertical_white_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WHITE_STAINED_GLASS)).parentBlock(Blocks.WHITE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_WHITE_STAINED_GLASS_STAIRS = registerBlock("vertical_white_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.WHITE_STAINED_GLASS)).parentBlock(Blocks.WHITE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("vertical_light_gray_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_STAINED_GLASS)).parentBlock(Blocks.LIGHT_GRAY_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("vertical_light_gray_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_GRAY_STAINED_GLASS)).parentBlock(Blocks.LIGHT_GRAY_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_GRAY_STAINED_GLASS_SLAB = registerBlock("vertical_gray_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRAY_STAINED_GLASS)).parentBlock(Blocks.GRAY_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_GRAY_STAINED_GLASS_STAIRS = registerBlock("vertical_gray_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GRAY_STAINED_GLASS)).parentBlock(Blocks.GRAY_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_BLACK_STAINED_GLASS_SLAB = registerBlock("vertical_black_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACK_STAINED_GLASS)).parentBlock(Blocks.BLACK_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_BLACK_STAINED_GLASS_STAIRS = registerBlock("vertical_black_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLACK_STAINED_GLASS)).parentBlock(Blocks.BLACK_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_BROWN_STAINED_GLASS_SLAB = registerBlock("vertical_brown_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BROWN_STAINED_GLASS)).parentBlock(Blocks.BROWN_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_BROWN_STAINED_GLASS_STAIRS = registerBlock("vertical_brown_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BROWN_STAINED_GLASS)).parentBlock(Blocks.BROWN_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_RED_STAINED_GLASS_SLAB = registerBlock("vertical_red_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_STAINED_GLASS)).parentBlock(Blocks.RED_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_RED_STAINED_GLASS_STAIRS = registerBlock("vertical_red_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RED_STAINED_GLASS)).parentBlock(Blocks.RED_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_ORANGE_STAINED_GLASS_SLAB = registerBlock("vertical_orange_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ORANGE_STAINED_GLASS)).parentBlock(Blocks.ORANGE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_ORANGE_STAINED_GLASS_STAIRS = registerBlock("vertical_orange_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ORANGE_STAINED_GLASS)).parentBlock(Blocks.ORANGE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_YELLOW_STAINED_GLASS_SLAB = registerBlock("vertical_yellow_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.YELLOW_STAINED_GLASS)).parentBlock(Blocks.YELLOW_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_YELLOW_STAINED_GLASS_STAIRS = registerBlock("vertical_yellow_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.YELLOW_STAINED_GLASS)).parentBlock(Blocks.YELLOW_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_LIME_STAINED_GLASS_SLAB = registerBlock("vertical_lime_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIME_STAINED_GLASS)).parentBlock(Blocks.LIME_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_LIME_STAINED_GLASS_STAIRS = registerBlock("vertical_lime_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIME_STAINED_GLASS)).parentBlock(Blocks.LIME_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_GREEN_STAINED_GLASS_SLAB = registerBlock("vertical_green_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GREEN_STAINED_GLASS)).parentBlock(Blocks.GREEN_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_GREEN_STAINED_GLASS_STAIRS = registerBlock("vertical_green_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GREEN_STAINED_GLASS)).parentBlock(Blocks.GREEN_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_CYAN_STAINED_GLASS_SLAB = registerBlock("vertical_cyan_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CYAN_STAINED_GLASS)).parentBlock(Blocks.CYAN_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_CYAN_STAINED_GLASS_STAIRS = registerBlock("vertical_cyan_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CYAN_STAINED_GLASS)).parentBlock(Blocks.CYAN_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("vertical_light_blue_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_STAINED_GLASS)).parentBlock(Blocks.LIGHT_BLUE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("vertical_light_blue_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LIGHT_BLUE_STAINED_GLASS)).parentBlock(Blocks.LIGHT_BLUE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_BLUE_STAINED_GLASS_SLAB = registerBlock("vertical_blue_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_STAINED_GLASS)).parentBlock(Blocks.BLUE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_BLUE_STAINED_GLASS_STAIRS = registerBlock("vertical_blue_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_STAINED_GLASS)).parentBlock(Blocks.BLUE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_PURPLE_STAINED_GLASS_SLAB = registerBlock("vertical_purple_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPLE_STAINED_GLASS)).parentBlock(Blocks.PURPLE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_PURPLE_STAINED_GLASS_STAIRS = registerBlock("vertical_purple_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PURPLE_STAINED_GLASS)).parentBlock(Blocks.PURPLE_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_MAGENTA_STAINED_GLASS_SLAB = registerBlock("vertical_magenta_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MAGENTA_STAINED_GLASS)).parentBlock(Blocks.MAGENTA_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_MAGENTA_STAINED_GLASS_STAIRS = registerBlock("vertical_magenta_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.MAGENTA_STAINED_GLASS)).parentBlock(Blocks.MAGENTA_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_PINK_STAINED_GLASS_SLAB = registerBlock("vertical_pink_stained_glass_slab", VerticalGlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PINK_STAINED_GLASS)).parentBlock(Blocks.PINK_STAINED_GLASS), new RegistryArgs().translucent());
    public static final Block VERTICAL_PINK_STAINED_GLASS_STAIRS = registerBlock("vertical_pink_stained_glass_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS),
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PINK_STAINED_GLASS)).parentBlock(Blocks.PINK_STAINED_GLASS), new RegistryArgs().translucent());

    public static final Block VERTICAL_DIRT_PATH_SLAB = registerBlock("vertical_dirt_path_slab", VerticalFlattenableSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", "")).parentBlock(Blocks.DIRT_PATH).y15());
    public static final Block VERTICAL_DIRT_PATH_STAIRS = registerBlock("vertical_dirt_path_stairs", VerticalFlattenableStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT_PATH),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", "")).parentBlock(Blocks.DIRT_PATH).y15());
    public static final Block VERTICAL_FARMLAND_SLAB = registerBlock("vertical_farmland_slab", VerticalFlattenableSlabBlock::new, AbstractBlock.Settings.copy(Blocks.FARMLAND),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", "")).parentBlock(Blocks.FARMLAND).y15());
    public static final Block VERTICAL_FARMLAND_STAIRS = registerBlock("vertical_farmland_stairs", VerticalFlattenableStairsBlock::new, AbstractBlock.Settings.copy(Blocks.FARMLAND),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", "")).parentBlock(Blocks.FARMLAND).y15());
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
            }, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN).ticksRandomly(),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).parentBlock(Blocks.GRASS_BLOCK).tintSource(new GrassTintSource()), new RegistryArgs().grassTinted().tillable(VERTICAL_FARMLAND_SLAB).flattenable(VERTICAL_DIRT_PATH_SLAB).transparent());
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
    }, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN).ticksRandomly(),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).parentBlock(Blocks.GRASS_BLOCK).tintSource(new GrassTintSource()), new RegistryArgs().grassTinted().tillable(VERTICAL_FARMLAND_STAIRS).flattenable(VERTICAL_DIRT_PATH_STAIRS).transparent());
    public static final Block VERTICAL_PODZOL_SLAB = registerBlock("vertical_podzol_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PODZOL), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", "")).parentBlock(Blocks.PODZOL),
            new RegistryArgs().flattenable(VERTICAL_DIRT_PATH_SLAB));
    public static final Block VERTICAL_PODZOL_STAIRS = registerBlock("vertical_podzol_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PODZOL), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", "")).parentBlock(Blocks.PODZOL),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_STAIRS));
    public static final Block VERTICAL_MYCELIUM_SLAB = registerBlock("vertical_mycelium_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MYCELIUM),
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", "")).parentBlock(Blocks.MYCELIUM),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_SLAB));
    public static final Block VERTICAL_MYCELIUM_STAIRS = registerBlock("vertical_mycelium_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MYCELIUM), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(custom(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", "")).parentBlock(Blocks.MYCELIUM),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_STAIRS));
    public static final Block VERTICAL_DIRT_SLAB = registerBlock("vertical_dirt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.DIRT)).parentBlock(Blocks.DIRT),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_SLAB));
    public static final Block VERTICAL_DIRT_STAIRS = registerBlock("vertical_dirt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.DIRT)).parentBlock(Blocks.DIRT),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_STAIRS));
    public static final Block VERTICAL_COARSE_DIRT_SLAB = registerBlock("vertical_coarse_dirt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.COARSE_DIRT)).parentBlock(Blocks.COARSE_DIRT),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_SLAB));
    public static final Block VERTICAL_COARSE_DIRT_STAIRS = registerBlock("vertical_coarse_dirt_stairs", VerticalGlassStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.COARSE_DIRT)).parentBlock(Blocks.COARSE_DIRT),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_STAIRS));
    public static final Block VERTICAL_ROOTED_DIRT_SLAB = registerBlock("vertical_rooted_dirt_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.ROOTED_DIRT)).parentBlock(Blocks.ROOTED_DIRT),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_SLAB));
    public static final Block VERTICAL_ROOTED_DIRT_STAIRS = registerBlock("vertical_rooted_dirt_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.ROOTED_DIRT)).parentBlock(Blocks.ROOTED_DIRT),
            new RegistryArgs().tillable(VERTICAL_DIRT_PATH_STAIRS));

    public static final Block VERTICAL_MUD_SLAB = registerBlock("vertical_mud_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MUD), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.MUD)).parentBlock(Blocks.MUD));
    public static final Block VERTICAL_MUD_STAIRS = registerBlock("vertical_mud_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MUD), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.MUD)).parentBlock(Blocks.MUD));
    public static final Block VERTICAL_CLAY_SLAB = registerBlock("vertical_clay_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CLAY), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.CLAY)).parentBlock(Blocks.CLAY));
    public static final Block VERTICAL_CLAY_STAIRS = registerBlock("vertical_clay_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CLAY), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.CLAY)).parentBlock(Blocks.CLAY));

    public static final Block VERTICAL_GRAVEL_SLAB = registerBlock("vertical_gravel_slab", VerticalFallingSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAVEL), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.GRAVEL)).parentBlock(Blocks.GRAVEL));
    public static final Block VERTICAL_GRAVEL_STAIRS = registerBlock("vertical_gravel_stairs", VerticalFallingStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GRAVEL), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.GRAVEL)).parentBlock(Blocks.GRAVEL));
    public static final Block VERTICAL_SAND_SLAB = registerBlock("vertical_sand_slab", VerticalFallingSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SAND), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SAND)).parentBlock(Blocks.SAND));
    public static final Block VERTICAL_SAND_STAIRS = registerBlock("vertical_sand_stairs", VerticalFallingStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SAND), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SAND)).parentBlock(Blocks.SAND));
    public static final Block VERTICAL_RED_SAND_SLAB = registerBlock("vertical_red_sand_slab", VerticalFallingSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SAND), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.RED_SAND)).parentBlock(Blocks.RED_SAND));
    public static final Block VERTICAL_RED_SAND_STAIRS = registerBlock("vertical_red_sand_stairs", VerticalFallingStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SAND), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.RED_SAND)).parentBlock(Blocks.RED_SAND));

    public static final Block VERTICAL_ICE_SLAB = registerBlock("vertical_ice_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ICE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ICE)).parentBlock(Blocks.ICE));
    public static final Block VERTICAL_ICE_STAIRS = registerBlock("vertical_ice_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ICE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.ICE)).parentBlock(Blocks.ICE));
    public static final Block VERTICAL_PACKED_ICE_SLAB = registerBlock("vertical_packed_ice_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_ICE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PACKED_ICE)).parentBlock(Blocks.PACKED_ICE));
    public static final Block VERTICAL_PACKED_ICE_STAIRS = registerBlock("vertical_packed_ice_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_ICE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.PACKED_ICE)).parentBlock(Blocks.PACKED_ICE));
    public static final Block VERTICAL_BLUE_ICE_SLAB = registerBlock("vertical_blue_ice_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_ICE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_ICE)).parentBlock(Blocks.BLUE_ICE));
    public static final Block VERTICAL_BLUE_ICE_STAIRS = registerBlock("vertical_blue_ice_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_ICE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.BLUE_ICE)).parentBlock(Blocks.BLUE_ICE));
    public static final Block VERTICAL_SNOW_SLAB = registerBlock("vertical_snow_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SNOW)).parentBlock(Blocks.SNOW_BLOCK));
    public static final Block VERTICAL_SNOW_STAIRS = registerBlock("vertical_snow_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SNOW)).parentBlock(Blocks.SNOW_BLOCK));

    public static final Block VERTICAL_MOSS_SLAB = registerBlock("vertical_moss_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.HOE_MINEABLE).textureMap(TextureMap.all(Blocks.MOSS_BLOCK)).parentBlock(Blocks.MOSS_BLOCK));
    public static final Block VERTICAL_MOSS_STAIRS = registerBlock("vertical_moss_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.HOE_MINEABLE).textureMap(TextureMap.all(Blocks.MOSS_BLOCK)).parentBlock(Blocks.MOSS_BLOCK));
    public static final Block VERTICAL_PALE_MOSS_SLAB = registerBlock("vertical_pale_moss_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_MOSS_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.HOE_MINEABLE).textureMap(TextureMap.all(Blocks.PALE_MOSS_BLOCK)).parentBlock(Blocks.PALE_MOSS_BLOCK));
    public static final Block VERTICAL_PALE_MOSS_STAIRS = registerBlock("vertical_pale_moss_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_MOSS_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.HOE_MINEABLE).textureMap(TextureMap.all(Blocks.PALE_MOSS_BLOCK)).parentBlock(Blocks.PALE_MOSS_BLOCK));
    public static final Block VERTICAL_CALCITE_SLAB = registerBlock("vertical_calcite_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CALCITE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CALCITE)).parentBlock(Blocks.CALCITE));
    public static final Block VERTICAL_CALCITE_STAIRS = registerBlock("vertical_calcite_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CALCITE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CALCITE)).parentBlock(Blocks.CALCITE));
    public static final Block VERTICAL_DRIPSTONE_SLAB = registerBlock("vertical_dripstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DRIPSTONE_BLOCK)).parentBlock(Blocks.DRIPSTONE_BLOCK));
    public static final Block VERTICAL_DRIPSTONE_STAIRS = registerBlock("vertical_dripstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DRIPSTONE_BLOCK)).parentBlock(Blocks.DRIPSTONE_BLOCK));

    public static final Block VERTICAL_MAGMA_SLAB = registerBlock("vertical_magma_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Identifier.ofVanilla("block/magma"))).parentBlock(Blocks.MAGMA_BLOCK));
    public static final Block VERTICAL_MAGMA_STAIRS = registerBlock("vertical_magma_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Identifier.ofVanilla("block/magma"))).parentBlock(Blocks.MAGMA_BLOCK));
    public static final Block VERTICAL_OBSIDIAN_SLAB = registerBlock("vertical_obsidian_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.OBSIDIAN), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OBSIDIAN)).parentBlock(Blocks.OBSIDIAN));
    public static final Block VERTICAL_OBSIDIAN_STAIRS = registerBlock("vertical_obsidian_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.OBSIDIAN), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.OBSIDIAN)).parentBlock(Blocks.OBSIDIAN));
    public static final Block VERTICAL_CRYING_OBSIDIAN_SLAB = registerBlock("vertical_crying_obsidian_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRYING_OBSIDIAN)).parentBlock(Blocks.CRYING_OBSIDIAN));
    public static final Block VERTICAL_CRYING_OBSIDIAN_STAIRS = registerBlock("vertical_crying_obsidian_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.CRYING_OBSIDIAN)).parentBlock(Blocks.CRYING_OBSIDIAN));

    public static final Block VERTICAL_CRIMSON_NYLIUM_SLAB = registerBlock("vertical_crimson_nylium_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", "")).parentBlock(Blocks.CRIMSON_NYLIUM));
    public static final Block VERTICAL_CRIMSON_NYLIUM_STAIRS = registerBlock("vertical_crimson_nylium_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", "")).parentBlock(Blocks.CRIMSON_NYLIUM));
    public static final Block VERTICAL_WARPED_NYLIUM_SLAB = registerBlock("vertical_warped_nylium_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", "")).parentBlock(Blocks.WARPED_NYLIUM));
    public static final Block VERTICAL_WARPED_NYLIUM_STAIRS = registerBlock("vertical_warped_nylium_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", "")).parentBlock(Blocks.WARPED_NYLIUM));
    public static final Block VERTICAL_SOUL_SAND_SLAB = registerBlock("vertical_soul_sand_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SAND), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SOUL_SAND)).parentBlock(Blocks.SOUL_SAND));
    public static final Block VERTICAL_SOUL_SAND_STAIRS = registerBlock("vertical_soul_sand_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SAND), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SOUL_SAND)).parentBlock(Blocks.SOUL_SAND));
    public static final Block VERTICAL_SOUL_SOIL_SLAB = registerBlock("vertical_soul_soil_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SOUL_SOIL)).parentBlock(Blocks.SOUL_SOIL));
    public static final Block VERTICAL_SOUL_SOIL_STAIRS = registerBlock("vertical_soul_soil_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL), 
            new DatagenArgs().blockTags(BlockTags.SHOVEL_MINEABLE).textureMap(TextureMap.all(Blocks.SOUL_SOIL)).parentBlock(Blocks.SOUL_SOIL));
    public static final Block VERTICAL_BONE_BLOCK_SLAB = registerBlock("vertical_bone_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.BONE_BLOCK)).parentBlock(Blocks.BONE_BLOCK));
    public static final Block VERTICAL_BONE_BLOCK_STAIRS = registerBlock("vertical_bone_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.BONE_BLOCK)).parentBlock(Blocks.BONE_BLOCK));

    public static final Block VERTICAL_COAL_ORE_SLAB = registerBlock("vertical_coal_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COAL_ORE)).parentBlock(Blocks.COAL_ORE));
    public static final Block VERTICAL_COAL_ORE_STAIRS = registerBlock("vertical_coal_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COAL_ORE)).parentBlock(Blocks.COAL_ORE));
    public static final Block VERTICAL_DEEPSLATE_COAL_ORE_SLAB = registerBlock("vertical_deepslate_coal_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_COAL_ORE)).parentBlock(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block VERTICAL_DEEPSLATE_COAL_ORE_STAIRS = registerBlock("vertical_deepslate_coal_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_COAL_ORE)).parentBlock(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block VERTICAL_IRON_ORE_SLAB = registerBlock("vertical_iron_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.IRON_ORE)).parentBlock(Blocks.IRON_ORE));
    public static final Block VERTICAL_IRON_ORE_STAIRS = registerBlock("vertical_iron_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.IRON_ORE)).parentBlock(Blocks.IRON_ORE));
    public static final Block VERTICAL_DEEPSLATE_IRON_ORE_SLAB = registerBlock("vertical_deepslate_iron_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_IRON_ORE)).parentBlock(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block VERTICAL_DEEPSLATE_IRON_ORE_STAIRS = registerBlock("vertical_deepslate_iron_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_IRON_ORE)).parentBlock(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block VERTICAL_COPPER_ORE_SLAB = registerBlock("vertical_copper_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.COPPER_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_ORE)).parentBlock(Blocks.COPPER_ORE));
    public static final Block VERTICAL_COPPER_ORE_STAIRS = registerBlock("vertical_copper_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.COPPER_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.COPPER_ORE)).parentBlock(Blocks.COPPER_ORE));
    public static final Block VERTICAL_DEEPSLATE_COPPER_ORE_SLAB = registerBlock("vertical_deepslate_copper_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_COPPER_ORE)).parentBlock(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block VERTICAL_DEEPSLATE_COPPER_ORE_STAIRS = registerBlock("vertical_deepslate_copper_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_COPPER_ORE)).parentBlock(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block VERTICAL_GOLD_ORE_SLAB = registerBlock("vertical_gold_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GOLD_ORE)).parentBlock(Blocks.GOLD_ORE));
    public static final Block VERTICAL_GOLD_ORE_STAIRS = registerBlock("vertical_gold_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GOLD_ORE)).parentBlock(Blocks.GOLD_ORE));
    public static final Block VERTICAL_DEEPSLATE_GOLD_ORE_SLAB = registerBlock("vertical_deepslate_gold_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_GOLD_ORE)).parentBlock(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block VERTICAL_DEEPSLATE_GOLD_ORE_STAIRS = registerBlock("vertical_deepslate_gold_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_GOLD_ORE)).parentBlock(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block VERTICAL_REDSTONE_ORE_SLAB = registerBlock("vertical_redstone_ore_slab", VerticalRedstoneOreSlabBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.REDSTONE_ORE)).parentBlock(Blocks.REDSTONE_ORE));
    public static final Block VERTICAL_REDSTONE_ORE_STAIRS = registerBlock("vertical_redstone_ore_stairs", VerticalRedstoneOreStairsBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.REDSTONE_ORE)).parentBlock(Blocks.REDSTONE_ORE));
    public static final Block VERTICAL_DEEPSLATE_REDSTONE_ORE_SLAB = registerBlock("vertical_deepslate_redstone_ore_slab", VerticalRedstoneOreSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_REDSTONE_ORE)).parentBlock(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block VERTICAL_DEEPSLATE_REDSTONE_ORE_STAIRS = registerBlock("vertical_deepslate_redstone_ore_stairs", VerticalRedstoneOreStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_REDSTONE_ORE)).parentBlock(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block VERTICAL_EMERALD_ORE_SLAB = registerBlock("vertical_emerald_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EMERALD_ORE)).parentBlock(Blocks.EMERALD_ORE));
    public static final Block VERTICAL_EMERALD_ORE_STAIRS = registerBlock("vertical_emerald_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.EMERALD_ORE)).parentBlock(Blocks.EMERALD_ORE));
    public static final Block VERTICAL_DEEPSLATE_EMERALD_ORE_SLAB = registerBlock("vertical_deepslate_emerald_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_EMERALD_ORE)).parentBlock(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block VERTICAL_DEEPSLATE_EMERALD_ORE_STAIRS = registerBlock("vertical_deepslate_emerald_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_EMERALD_ORE)).parentBlock(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block VERTICAL_LAPIS_ORE_SLAB = registerBlock("vertical_lapis_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LAPIS_ORE)).parentBlock(Blocks.LAPIS_ORE));
    public static final Block VERTICAL_LAPIS_ORE_STAIRS = registerBlock("vertical_lapis_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.LAPIS_ORE)).parentBlock(Blocks.LAPIS_ORE));
    public static final Block VERTICAL_DEEPSLATE_LAPIS_ORE_SLAB = registerBlock("vertical_deepslate_lapis_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_LAPIS_ORE)).parentBlock(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block VERTICAL_DEEPSLATE_LAPIS_ORE_STAIRS = registerBlock("vertical_deepslate_lapis_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_LAPIS_ORE)).parentBlock(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block VERTICAL_DIAMOND_ORE_SLAB = registerBlock("vertical_diamond_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DIAMOND_ORE)).parentBlock(Blocks.DIAMOND_ORE));
    public static final Block VERTICAL_DIAMOND_ORE_STAIRS = registerBlock("vertical_diamond_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DIAMOND_ORE)).parentBlock(Blocks.DIAMOND_ORE));
    public static final Block VERTICAL_DEEPSLATE_DIAMOND_ORE_SLAB = registerBlock("vertical_deepslate_diamond_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_DIAMOND_ORE)).parentBlock(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block VERTICAL_DEEPSLATE_DIAMOND_ORE_STAIRS = registerBlock("vertical_deepslate_diamond_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.DEEPSLATE_DIAMOND_ORE)).parentBlock(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block VERTICAL_NETHER_GOLD_ORE_SLAB = registerBlock("vertical_nether_gold_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHER_GOLD_ORE)).parentBlock(Blocks.NETHER_GOLD_ORE));
    public static final Block VERTICAL_NETHER_GOLD_ORE_STAIRS = registerBlock("vertical_nether_gold_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHER_GOLD_ORE)).parentBlock(Blocks.NETHER_GOLD_ORE));
    public static final Block VERTICAL_NETHER_QUARTZ_ORE_SLAB = registerBlock("vertical_nether_quartz_ore_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHER_QUARTZ_ORE)).parentBlock(Blocks.NETHER_QUARTZ_ORE));
    public static final Block VERTICAL_NETHER_QUARTZ_ORE_STAIRS = registerBlock("vertical_nether_quartz_ore_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.NETHER_QUARTZ_ORE)).parentBlock(Blocks.NETHER_QUARTZ_ORE));
    public static final Block VERTICAL_ANCIENT_DEBRIS_SLAB = registerBlock("vertical_ancient_debris_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.ANCIENT_DEBRIS)).parentBlock(Blocks.ANCIENT_DEBRIS));
    public static final Block VERTICAL_ANCIENT_DEBRIS_STAIRS = registerBlock("vertical_ancient_debris_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(sideAndTopForEnds(Blocks.ANCIENT_DEBRIS)).parentBlock(Blocks.ANCIENT_DEBRIS));
    
    public static final Block VERTICAL_RAW_IRON_BLOCK_SLAB = registerBlock("vertical_raw_iron_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RAW_IRON_BLOCK)).parentBlock(Blocks.RAW_IRON_BLOCK));
    public static final Block VERTICAL_RAW_IRON_BLOCK_STAIRS = registerBlock("vertical_raw_iron_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RAW_IRON_BLOCK)).parentBlock(Blocks.RAW_IRON_BLOCK));
    public static final Block VERTICAL_RAW_COPPER_BLOCK_SLAB = registerBlock("vertical_raw_copper_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RAW_COPPER_BLOCK)).parentBlock(Blocks.RAW_COPPER_BLOCK));
    public static final Block VERTICAL_RAW_COPPER_BLOCK_STAIRS = registerBlock("vertical_raw_copper_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RAW_COPPER_BLOCK)).parentBlock(Blocks.RAW_COPPER_BLOCK));
    public static final Block VERTICAL_RAW_GOLD_BLOCK_SLAB = registerBlock("vertical_raw_gold_block_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RAW_COPPER_BLOCK)).parentBlock(Blocks.RAW_COPPER_BLOCK));
    public static final Block VERTICAL_RAW_GOLD_BLOCK_STAIRS = registerBlock("vertical_raw_gold_block_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.RAW_COPPER_BLOCK)).parentBlock(Blocks.RAW_COPPER_BLOCK));
    
    public static final Block VERTICAL_GLOWSTONE_SLAB = registerBlock("vertical_glowstone_slab", VerticalSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GLOWSTONE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GLOWSTONE)).parentBlock(Blocks.GLOWSTONE));
    public static final Block VERTICAL_GLOWSTONE_STAIRS = registerBlock("vertical_glowstone_stairs", VerticalStairsBlock::new, AbstractBlock.Settings.copy(Blocks.GLOWSTONE), 
            new DatagenArgs().blockTags(BlockTags.PICKAXE_MINEABLE).textureMap(TextureMap.all(Blocks.GLOWSTONE)).parentBlock(Blocks.GLOWSTONE));
    



    private static Block registerBlock(String name, @NotNull Function<AbstractBlock.Settings, Block> function, AbstractBlock.@NotNull Settings settings) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }
    
    private static Block registerBlock(String name, @NotNull Function<AbstractBlock.Settings, Block> function, AbstractBlock.@NotNull Settings settings, DatagenArgs datagenArgs) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        DATAGEN_ARGS.put(block, datagenArgs);
        Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }
    
    private static Block registerBlock(String name, @NotNull Function<AbstractBlock.Settings, Block> function, AbstractBlock.@NotNull Settings settings, DatagenArgs datagenArgs, RegistryArgs registryArgs) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        DATAGEN_ARGS.put(block, datagenArgs);
        REGISTRY_ARGS.put(block, registryArgs);
        Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name));
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaVSPlus.MOD_ID, name));
    }

    private static final List<Block> EXCLUDED_FROM_DATAGEN = List.of(LOG_DEF, NETHER_DEF, BAMBOO_DEF);

    private static void validate() {
        Registries.BLOCK.forEach(block -> {
            Identifier identifier = Registries.BLOCK.getId(block);
            if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && !EXCLUDED_FROM_DATAGEN.contains(block)) {
                if (!DATAGEN_ARGS.containsKey(block)) {
                    throw new IllegalStateException("Couldn't validate DatagenArgs for " + identifier.getPath());
                }
            }
        });
    }

    public static void registerModBlocks() {
        validate();
    }
}
