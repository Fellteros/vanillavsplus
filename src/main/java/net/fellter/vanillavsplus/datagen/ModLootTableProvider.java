package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.state.property.Properties;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.VERTICAL_OAK_SLAB, vertSlabDrops(ModBlocks.VERTICAL_OAK_SLAB));
        addDrop(ModBlocks.VERTICAL_OAK_STAIRS);

        addDrop(ModBlocks.VERTICAL_OAK_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_OAK_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_OAK_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_OAK_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_OAK_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_OAK_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_OAK_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_OAK_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_SPRUCE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SPRUCE_SLAB));
        addDrop(ModBlocks.VERTICAL_SPRUCE_STAIRS);

        addDrop(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_SPRUCE_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_BIRCH_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BIRCH_SLAB));
        addDrop(ModBlocks.VERTICAL_BIRCH_STAIRS);

        addDrop(ModBlocks.VERTICAL_BIRCH_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BIRCH_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_BIRCH_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_BIRCH_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_JUNGLE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_JUNGLE_SLAB));
        addDrop(ModBlocks.VERTICAL_JUNGLE_STAIRS);

        addDrop(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_JUNGLE_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_ACACIA_SLAB, vertSlabDrops(ModBlocks.VERTICAL_ACACIA_SLAB));
        addDrop(ModBlocks.VERTICAL_ACACIA_STAIRS);

        addDrop(ModBlocks.VERTICAL_ACACIA_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_ACACIA_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_ACACIA_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_ACACIA_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_DARK_OAK_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DARK_OAK_SLAB));
        addDrop(ModBlocks.VERTICAL_DARK_OAK_STAIRS);

        addDrop(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_MANGROVE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_MANGROVE_SLAB));
        addDrop(ModBlocks.VERTICAL_MANGROVE_STAIRS);

        addDrop(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_MANGROVE_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_CHERRY_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHERRY_SLAB));
        addDrop(ModBlocks.VERTICAL_CHERRY_STAIRS);

        addDrop(ModBlocks.VERTICAL_CHERRY_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHERRY_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_CHERRY_LOG_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_CHERRY_WOOD_STAIRS);
        

        addDrop(ModBlocks.VERTICAL_BAMBOO_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BAMBOO_SLAB));
        addDrop(ModBlocks.VERTICAL_BAMBOO_STAIRS);

        addDrop(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB));
        addDrop(ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS);

        addDrop(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB));
        addDrop(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_STAIRS);



        addDrop(ModBlocks.VERTICAL_CRIMSON_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CRIMSON_SLAB));
        addDrop(ModBlocks.VERTICAL_CRIMSON_STAIRS);

        addDrop(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB));
        addDrop(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS);

        addDrop(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB));
        addDrop(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_CRIMSON_STEM_STAIRS);

        addDrop(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_STAIRS);


        addDrop(ModBlocks.VERTICAL_WARPED_SLAB, vertSlabDrops(ModBlocks.VERTICAL_WARPED_SLAB));
        addDrop(ModBlocks.VERTICAL_WARPED_STAIRS);
        addDrop(ModBlocks.VERTICAL_WARPED_STEM_SLAB, vertSlabDrops(ModBlocks.VERTICAL_WARPED_STEM_SLAB));
        addDrop(ModBlocks.VERTICAL_WARPED_STEM_STAIRS);
        addDrop(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB));
        addDrop(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS);
        addDrop(ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_WARPED_STEM_STAIRS);
        addDrop(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB));
        addDrop(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_STAIRS);
        
        addDrop(ModBlocks.VERTICAL_STONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STONE_SLAB));
        addDrop(ModBlocks.VERTICAL_STONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_COBBLESTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_COBBLESTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB));
        addDrop(ModBlocks.VERTICAL_SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_STONE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_STAIRS);
        
        addDrop(ModBlocks.VERTICAL_GRANITE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_GRANITE_SLAB));
        addDrop(ModBlocks.VERTICAL_GRANITE_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_GRANITE_STAIRS);

        addDrop(ModBlocks.VERTICAL_DIORITE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DIORITE_SLAB));
        addDrop(ModBlocks.VERTICAL_DIORITE_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_DIORITE_STAIRS);

        addDrop(ModBlocks.VERTICAL_ANDESITE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_ANDESITE_SLAB));
        addDrop(ModBlocks.VERTICAL_ANDESITE_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_ANDESITE_STAIRS);

        addDrop(ModBlocks.VERTICAL_DEEPSLATE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DEEPSLATE_SLAB));
        addDrop(ModBlocks.VERTICAL_DEEPSLATE_STAIRS);
        addDrop(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB));
        addDrop(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_STAIRS);
        addDrop(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB));
        addDrop(ModBlocks.VERTICAL_DEEPSLATE_TILES_STAIRS);
        addDrop(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB));
        addDrop(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS);

        addDrop(ModBlocks.VERTICAL_TUFF_SLAB, vertSlabDrops(ModBlocks.VERTICAL_TUFF_SLAB));
        addDrop(ModBlocks.VERTICAL_TUFF_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_TUFF_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_TUFF_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_TUFF_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_TUFF_STAIRS);
        addDrop(ModBlocks.VERTICAL_TUFF_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_TUFF_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_TUFF_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_STAIRS);

        addDrop(ModBlocks.VERTICAL_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_PACKED_MUD_SLAB, vertSlabDrops(ModBlocks.VERTICAL_PACKED_MUD_SLAB));
        addDrop(ModBlocks.VERTICAL_PACKED_MUD_STAIRS);
        addDrop(ModBlocks.VERTICAL_MUD_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_MUD_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_MUD_BRICKS_STAIRS);

        addDrop(ModBlocks.VERTICAL_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_SANDSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_SANDSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_CUT_SANDSTONE_STAIRS);

        addDrop(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_RED_SANDSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_STAIRS);
        
        addDrop(ModBlocks.VERTICAL_SEA_LANTERN_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SEA_LANTERN_SLAB));
        addDrop(ModBlocks.VERTICAL_SEA_LANTERN_STAIRS);
        addDrop(ModBlocks.VERTICAL_PRISMARINE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_PRISMARINE_SLAB));
        addDrop(ModBlocks.VERTICAL_PRISMARINE_STAIRS);
        addDrop(ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_PRISMARINE_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB));
        addDrop(ModBlocks.VERTICAL_DARK_PRISMARINE_STAIRS);
        
        addDrop(ModBlocks.VERTICAL_NETHERRACK_SLAB, vertSlabDrops(ModBlocks.VERTICAL_NETHERRACK_SLAB));
        addDrop(ModBlocks.VERTICAL_NETHERRACK_STAIRS);
        addDrop(ModBlocks.VERTICAL_NETHER_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_NETHER_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_NETHER_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_STAIRS);
        addDrop(ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_RED_NETHER_BRICKS_STAIRS);

        addDrop(ModBlocks.VERTICAL_BASALT_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BASALT_SLAB));
        addDrop(ModBlocks.VERTICAL_BASALT_STAIRS);
        addDrop(ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB, vertSlabDrops(ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.VERTICAL_SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_BASALT_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_BASALT_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_BASALT_STAIRS);

        addDrop(ModBlocks.VERTICAL_BLACKSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_BLACKSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_GILDED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB, vertSlabDrops(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS);

    }

    public LootTable.Builder vertSlabDrops(Block drop) {
        return LootTable.builder().pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                .with(this.applyExplosionDecay(drop, ItemEntry.builder(drop)
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.SINGLE, true))))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))
                                .conditionally(BlockStatePropertyLootCondition.builder(drop)
                                        .properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.SINGLE, false)))))));
    }
}
