package net.fellter.vanillavsplus.datagen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.fellter.vanillavsplus.item.ModItems;
import net.fellter.vanillavsplus.registry.DatagenArgs;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.registry.Registries;

import static net.fellter.vanillavsplus.util.ModBlockStateModelGenerator.*;

@Environment(EnvType.CLIENT)
public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS, TextureMap.all(Blocks.OAK_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OAK_STAIRS, TextureMap.all(Blocks.OAK_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_LOG_SLAB, Blocks.OAK_LOG, blockAndTopForEnds(Blocks.OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_WOOD_SLAB, Blocks.OAK_WOOD, TextureMap.all(Blocks.OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OAK_WOOD_STAIRS, TextureMap.all(Blocks.OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG, blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_OAK_WOOD_SLAB, Blocks.STRIPPED_OAK_WOOD, TextureMap.all(Blocks.STRIPPED_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_OAK_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_OAK_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SPRUCE_SLAB, Blocks.SPRUCE_PLANKS, TextureMap.all(Blocks.SPRUCE_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SPRUCE_STAIRS, TextureMap.all(Blocks.SPRUCE_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, blockAndTopForEnds(Blocks.SPRUCE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS, blockAndTopForEnds(Blocks.SPRUCE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB, Blocks.SPRUCE_WOOD, TextureMap.all(Blocks.SPRUCE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS, TextureMap.all(Blocks.SPRUCE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_SPRUCE_LOG_SLAB, Blocks.STRIPPED_SPRUCE_LOG, blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_SPRUCE_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_SPRUCE_WOOD_SLAB, Blocks.STRIPPED_SPRUCE_WOOD, TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_SPRUCE_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BIRCH_SLAB, Blocks.BIRCH_PLANKS, TextureMap.all(Blocks.BIRCH_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BIRCH_STAIRS, TextureMap.all(Blocks.BIRCH_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, blockAndTopForEnds(Blocks.BIRCH_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BIRCH_LOG_STAIRS, blockAndTopForEnds(Blocks.BIRCH_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BIRCH_WOOD_SLAB, Blocks.BIRCH_WOOD, TextureMap.all(Blocks.BIRCH_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS, TextureMap.all(Blocks.BIRCH_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_BIRCH_LOG_SLAB, Blocks.STRIPPED_BIRCH_LOG, blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_BIRCH_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_BIRCH_WOOD_SLAB, Blocks.STRIPPED_BIRCH_WOOD, TextureMap.all(Blocks.STRIPPED_BIRCH_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_BIRCH_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_BIRCH_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_JUNGLE_SLAB, Blocks.JUNGLE_PLANKS, TextureMap.all(Blocks.JUNGLE_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_JUNGLE_STAIRS, TextureMap.all(Blocks.JUNGLE_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, blockAndTopForEnds(Blocks.JUNGLE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS, blockAndTopForEnds(Blocks.JUNGLE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB, Blocks.JUNGLE_WOOD, TextureMap.all(Blocks.JUNGLE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS, TextureMap.all(Blocks.JUNGLE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_JUNGLE_LOG_SLAB, Blocks.STRIPPED_JUNGLE_LOG, blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_JUNGLE_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_JUNGLE_WOOD_SLAB, Blocks.STRIPPED_JUNGLE_WOOD, TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_JUNGLE_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ACACIA_SLAB, Blocks.ACACIA_PLANKS, TextureMap.all(Blocks.ACACIA_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ACACIA_STAIRS, TextureMap.all(Blocks.ACACIA_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, blockAndTopForEnds(Blocks.ACACIA_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ACACIA_LOG_STAIRS, blockAndTopForEnds(Blocks.ACACIA_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ACACIA_WOOD_SLAB, Blocks.ACACIA_WOOD, TextureMap.all(Blocks.ACACIA_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS, TextureMap.all(Blocks.ACACIA_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_ACACIA_LOG_SLAB, Blocks.STRIPPED_ACACIA_LOG, blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_ACACIA_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_ACACIA_WOOD_SLAB, Blocks.STRIPPED_ACACIA_WOOD, TextureMap.all(Blocks.STRIPPED_ACACIA_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_ACACIA_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_ACACIA_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS, TextureMap.all(Blocks.DARK_OAK_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DARK_OAK_STAIRS, TextureMap.all(Blocks.DARK_OAK_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, blockAndTopForEnds(Blocks.DARK_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.DARK_OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB, Blocks.DARK_OAK_WOOD, TextureMap.all(Blocks.DARK_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS, TextureMap.all(Blocks.DARK_OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_LOG_SLAB, Blocks.STRIPPED_DARK_OAK_LOG, blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_WOOD_SLAB, Blocks.STRIPPED_DARK_OAK_WOOD, TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MANGROVE_SLAB, Blocks.MANGROVE_PLANKS, TextureMap.all(Blocks.MANGROVE_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MANGROVE_STAIRS, TextureMap.all(Blocks.MANGROVE_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG, blockAndTopForEnds(Blocks.MANGROVE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS, blockAndTopForEnds(Blocks.MANGROVE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB, Blocks.MANGROVE_WOOD, TextureMap.all(Blocks.MANGROVE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS, TextureMap.all(Blocks.MANGROVE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_MANGROVE_LOG_SLAB, Blocks.STRIPPED_MANGROVE_LOG, blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_MANGROVE_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_MANGROVE_WOOD_SLAB, Blocks.STRIPPED_MANGROVE_WOOD, TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_MANGROVE_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHERRY_SLAB, Blocks.CHERRY_PLANKS, TextureMap.all(Blocks.CHERRY_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHERRY_STAIRS, TextureMap.all(Blocks.CHERRY_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHERRY_LOG_SLAB, Blocks.CHERRY_LOG, blockAndTopForEnds(Blocks.CHERRY_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHERRY_LOG_STAIRS, blockAndTopForEnds(Blocks.CHERRY_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHERRY_WOOD_SLAB, Blocks.CHERRY_WOOD, TextureMap.all(Blocks.CHERRY_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS, TextureMap.all(Blocks.CHERRY_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_CHERRY_LOG_SLAB, Blocks.STRIPPED_CHERRY_LOG, blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_CHERRY_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_CHERRY_WOOD_SLAB, Blocks.STRIPPED_CHERRY_WOOD, TextureMap.all(Blocks.STRIPPED_CHERRY_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_CHERRY_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_CHERRY_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PALE_OAK_SLAB, Blocks.PALE_OAK_PLANKS, TextureMap.all(Blocks.PALE_OAK_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PALE_OAK_STAIRS, TextureMap.all(Blocks.PALE_OAK_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PALE_OAK_LOG_SLAB, Blocks.PALE_OAK_LOG, blockAndTopForEnds(Blocks.PALE_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PALE_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.PALE_OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PALE_OAK_WOOD_SLAB, Blocks.PALE_OAK_WOOD, TextureMap.all(Blocks.PALE_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PALE_OAK_WOOD_STAIRS, TextureMap.all(Blocks.PALE_OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_LOG_SLAB, Blocks.STRIPPED_PALE_OAK_LOG, blockAndTopForEnds(Blocks.STRIPPED_PALE_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_PALE_OAK_LOG));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_WOOD_SLAB, Blocks.STRIPPED_PALE_OAK_WOOD, TextureMap.all(Blocks.STRIPPED_PALE_OAK_LOG));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_PALE_OAK_LOG));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BAMBOO_SLAB, Blocks.BAMBOO_PLANKS, TextureMap.all(Blocks.BAMBOO_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BAMBOO_STAIRS, TextureMap.all(Blocks.BAMBOO_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC, TextureMap.all(Blocks.BAMBOO_MOSAIC));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS, TextureMap.all(Blocks.BAMBOO_MOSAIC));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB, Blocks.BAMBOO_BLOCK, blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS, blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_BAMBOO_BLOCK_SLAB, Blocks.STRIPPED_BAMBOO_BLOCK, blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_BAMBOO_BLOCK_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRIMSON_SLAB, Blocks.CRIMSON_PLANKS, TextureMap.all(Blocks.CRIMSON_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRIMSON_STAIRS, TextureMap.all(Blocks.CRIMSON_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM, blockAndTopForEnds(Blocks.CRIMSON_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS, blockAndTopForEnds(Blocks.CRIMSON_STEM));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB, Blocks.CRIMSON_HYPHAE, TextureMap.all(Blocks.CRIMSON_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS, TextureMap.all(Blocks.CRIMSON_STEM));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_CRIMSON_STEM_SLAB, Blocks.STRIPPED_CRIMSON_STEM, blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_CRIMSON_STEM_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_CRIMSON_HYPHAE_SLAB, Blocks.STRIPPED_CRIMSON_HYPHAE, TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_CRIMSON_HYPHAE_STAIRS, TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WARPED_SLAB, Blocks.WARPED_PLANKS, TextureMap.all(Blocks.WARPED_PLANKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WARPED_STAIRS, TextureMap.all(Blocks.WARPED_PLANKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WARPED_STEM_SLAB, Blocks.WARPED_STEM, blockAndTopForEnds(Blocks.WARPED_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WARPED_STEM_STAIRS, blockAndTopForEnds(Blocks.WARPED_STEM));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB, Blocks.WARPED_HYPHAE, TextureMap.all(Blocks.WARPED_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS, TextureMap.all(Blocks.WARPED_STEM));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_WARPED_STEM_SLAB, Blocks.STRIPPED_WARPED_STEM, blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_WARPED_STEM_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STRIPPED_WARPED_HYPHAE_SLAB, Blocks.STRIPPED_WARPED_HYPHAE, TextureMap.all(Blocks.STRIPPED_WARPED_STEM));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STRIPPED_WARPED_HYPHAE_STAIRS, TextureMap.all(Blocks.STRIPPED_WARPED_STEM));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STONE_SLAB, Blocks.STONE, TextureMap.all(Blocks.STONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STONE_STAIRS, TextureMap.all(Blocks.STONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COBBLESTONE_SLAB, Blocks.COBBLESTONE, TextureMap.all(Blocks.COBBLESTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COBBLESTONE_STAIRS, TextureMap.all(Blocks.COBBLESTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE, TextureMap.all(Blocks.MOSSY_COBBLESTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MOSSY_COBBLESTONE_STAIRS, TextureMap.all(Blocks.MOSSY_COBBLESTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE, TextureMap.all(Blocks.SMOOTH_STONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SMOOTH_STONE_STAIRS, TextureMap.all(Blocks.SMOOTH_STONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STONE_BRICKS_SLAB, Blocks.STONE_BRICKS, TextureMap.all(Blocks.STONE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STONE_BRICKS_STAIRS, TextureMap.all(Blocks.STONE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB, Blocks.CRACKED_STONE_BRICKS, TextureMap.all(Blocks.CRACKED_STONE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_STAIRS, TextureMap.all(Blocks.CRACKED_STONE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB, Blocks.CHISELED_STONE_BRICKS, TextureMap.all(Blocks.CHISELED_STONE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_STAIRS, TextureMap.all(Blocks.CHISELED_STONE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB, Blocks.MOSSY_STONE_BRICKS, TextureMap.all(Blocks.MOSSY_STONE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_STAIRS, TextureMap.all(Blocks.MOSSY_STONE_BRICKS));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRANITE_SLAB, Blocks.GRANITE, TextureMap.all(Blocks.GRANITE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRANITE_STAIRS, TextureMap.all(Blocks.GRANITE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE, TextureMap.all(Blocks.POLISHED_GRANITE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_GRANITE_STAIRS, TextureMap.all(Blocks.POLISHED_GRANITE));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DIORITE_SLAB, Blocks.DIORITE, TextureMap.all(Blocks.DIORITE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DIORITE_STAIRS, TextureMap.all(Blocks.DIORITE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE, TextureMap.all(Blocks.POLISHED_DIORITE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_DIORITE_STAIRS, TextureMap.all(Blocks.POLISHED_DIORITE));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ANDESITE_SLAB, Blocks.ANDESITE, TextureMap.all(Blocks.ANDESITE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ANDESITE_STAIRS, TextureMap.all(Blocks.ANDESITE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE, TextureMap.all(Blocks.POLISHED_ANDESITE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_ANDESITE_STAIRS, TextureMap.all(Blocks.POLISHED_ANDESITE));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_SLAB, Blocks.DEEPSLATE, blockAndTopForEnds(Blocks.DEEPSLATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_STAIRS, blockAndTopForEnds(Blocks.DEEPSLATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE, TextureMap.all(Blocks.COBBLED_DEEPSLATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COBBLED_DEEPSLATE_STAIRS, TextureMap.all(Blocks.COBBLED_DEEPSLATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB, Blocks.CHISELED_DEEPSLATE, TextureMap.all(Blocks.CHISELED_DEEPSLATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_DEEPSLATE_STAIRS, TextureMap.all(Blocks.CHISELED_DEEPSLATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE, TextureMap.all(Blocks.POLISHED_DEEPSLATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_DEEPSLATE_STAIRS, TextureMap.all(Blocks.POLISHED_DEEPSLATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB, Blocks.DEEPSLATE_BRICKS, TextureMap.all(Blocks.DEEPSLATE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_BRICKS_STAIRS, TextureMap.all(Blocks.DEEPSLATE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS, TextureMap.all(Blocks.CRACKED_DEEPSLATE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS, TextureMap.all(Blocks.CRACKED_DEEPSLATE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB, Blocks.DEEPSLATE_TILES, TextureMap.all(Blocks.DEEPSLATE_TILES));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_TILES_STAIRS, TextureMap.all(Blocks.DEEPSLATE_TILES));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB, Blocks.CRACKED_DEEPSLATE_TILES, TextureMap.all(Blocks.CRACKED_DEEPSLATE_TILES));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS, TextureMap.all(Blocks.CRACKED_DEEPSLATE_TILES));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_TUFF_SLAB, Blocks.TUFF, TextureMap.all(Blocks.TUFF));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_TUFF_STAIRS, TextureMap.all(Blocks.TUFF));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_TUFF_SLAB, Blocks.CHISELED_TUFF, blockAndTopForEnds(Blocks.CHISELED_TUFF));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_TUFF_STAIRS, blockAndTopForEnds(Blocks.CHISELED_TUFF));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, Blocks.POLISHED_TUFF, TextureMap.all(Blocks.POLISHED_TUFF));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_TUFF_STAIRS, TextureMap.all(Blocks.POLISHED_TUFF));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_TUFF_BRICKS_SLAB, Blocks.TUFF_BRICKS, TextureMap.all(Blocks.TUFF_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_TUFF_BRICKS_STAIRS, TextureMap.all(Blocks.TUFF_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB, Blocks.CHISELED_TUFF_BRICKS, blockAndTopForEnds(Blocks.CHISELED_TUFF_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_STAIRS, blockAndTopForEnds(Blocks.CHISELED_TUFF_BRICKS));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BRICKS_SLAB, Blocks.BRICKS, TextureMap.all(Blocks.BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BRICKS_STAIRS, TextureMap.all(Blocks.BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PACKED_MUD_SLAB, Blocks.PACKED_MUD, TextureMap.all(Blocks.PACKED_MUD));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PACKED_MUD_STAIRS, TextureMap.all(Blocks.PACKED_MUD));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MUD_BRICKS_SLAB, Blocks.MUD_BRICKS, TextureMap.all(Blocks.MUD_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MUD_BRICKS_STAIRS, TextureMap.all(Blocks.MUD_BRICKS));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SANDSTONE_SLAB, Blocks.SANDSTONE, blockTB(Blocks.SANDSTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SANDSTONE_STAIRS, blockTB(Blocks.SANDSTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB, Blocks.CHISELED_SANDSTONE, custom(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_SANDSTONE_STAIRS, custom(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE, allWithSuffix(Blocks.SANDSTONE, "_top"));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SMOOTH_SANDSTONE_STAIRS, allWithSuffix(Blocks.SANDSTONE, "_top"));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE, custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CUT_SANDSTONE_STAIRS, custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE, blockTB(Blocks.RED_SANDSTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_SANDSTONE_STAIRS, blockTB(Blocks.RED_SANDSTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB, Blocks.CHISELED_RED_SANDSTONE, custom(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_STAIRS, custom(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE, allWithSuffix(Blocks.RED_SANDSTONE, "_top"));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS, allWithSuffix(Blocks.RED_SANDSTONE, "_top"));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE, custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CUT_RED_SANDSTONE_STAIRS, custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SEA_LANTERN_SLAB, Blocks.SEA_LANTERN, TextureMap.all(Blocks.SEA_LANTERN));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SEA_LANTERN_STAIRS, TextureMap.all(Blocks.SEA_LANTERN));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PRISMARINE_SLAB, Blocks.PRISMARINE, TextureMap.all(Blocks.PRISMARINE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PRISMARINE_STAIRS, TextureMap.all(Blocks.PRISMARINE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB, Blocks.PRISMARINE_BRICKS, TextureMap.all(Blocks.PRISMARINE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PRISMARINE_BRICKS_STAIRS, TextureMap.all(Blocks.PRISMARINE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE, TextureMap.all(Blocks.DARK_PRISMARINE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DARK_PRISMARINE_STAIRS, TextureMap.all(Blocks.DARK_PRISMARINE));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_NETHERRACK_SLAB, Blocks.NETHERRACK, TextureMap.all(Blocks.NETHERRACK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_NETHERRACK_STAIRS, TextureMap.all(Blocks.NETHERRACK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_NETHER_BRICKS_SLAB, Blocks.NETHER_BRICKS, TextureMap.all(Blocks.NETHER_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_NETHER_BRICKS_STAIRS, TextureMap.all(Blocks.NETHER_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB, Blocks.CRACKED_NETHER_BRICKS, TextureMap.all(Blocks.CRACKED_NETHER_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_STAIRS, TextureMap.all(Blocks.CRACKED_NETHER_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB, Blocks.CHISELED_NETHER_BRICKS, TextureMap.all(Blocks.CHISELED_NETHER_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_STAIRS, TextureMap.all(Blocks.CHISELED_NETHER_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB, Blocks.RED_NETHER_BRICKS, TextureMap.all(Blocks.RED_NETHER_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_NETHER_BRICKS_STAIRS, TextureMap.all(Blocks.RED_NETHER_BRICKS));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BASALT_SLAB, Blocks.BASALT, sideAndTopForEnds(Blocks.BASALT));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BASALT_STAIRS, sideAndTopForEnds(Blocks.BASALT));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, TextureMap.all(Blocks.SMOOTH_BASALT));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SMOOTH_BASALT_STAIRS, TextureMap.all(Blocks.SMOOTH_BASALT));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT, sideAndTopForEnds(Blocks.POLISHED_BASALT));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_BASALT_STAIRS, sideAndTopForEnds(Blocks.POLISHED_BASALT));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLACKSTONE_SLAB, Blocks.BLACKSTONE, TextureMap.all(Blocks.BLACKSTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLACKSTONE_STAIRS, TextureMap.all(Blocks.BLACKSTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE, TextureMap.all(Blocks.GILDED_BLACKSTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GILDED_BLACKSTONE_STAIRS, TextureMap.all(Blocks.GILDED_BLACKSTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB, Blocks.CHISELED_POLISHED_BLACKSTONE, TextureMap.all(Blocks.CHISELED_POLISHED_BLACKSTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS, TextureMap.all(Blocks.CHISELED_POLISHED_BLACKSTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE, TextureMap.all(Blocks.POLISHED_BLACKSTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_BLACKSTONE_STAIRS, TextureMap.all(Blocks.POLISHED_BLACKSTONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS, TextureMap.all(Blocks.POLISHED_BLACKSTONE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS, TextureMap.all(Blocks.POLISHED_BLACKSTONE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, TextureMap.all(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS, TextureMap.all(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_END_STONE_SLAB, Blocks.END_STONE, TextureMap.all(Blocks.END_STONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_END_STONE_STAIRS, TextureMap.all(Blocks.END_STONE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_END_STONE_BRICKS_SLAB, Blocks.END_STONE_BRICKS, TextureMap.all(Blocks.END_STONE_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_END_STONE_BRICKS_STAIRS, TextureMap.all(Blocks.END_STONE_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPUR_SLAB, Blocks.PURPUR_BLOCK, TextureMap.all(Blocks.PURPUR_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPUR_STAIRS, TextureMap.all(Blocks.PURPUR_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPUR_PILLAR_SLAB, Blocks.PURPUR_PILLAR, blockAndTopForEnds(Blocks.PURPUR_PILLAR));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPUR_PILLAR_STAIRS, blockAndTopForEnds(Blocks.PURPUR_PILLAR));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COAL_SLAB, Blocks.COAL_BLOCK, TextureMap.all(Blocks.COAL_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COAL_STAIRS, TextureMap.all(Blocks.COAL_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_IRON_SLAB, Blocks.IRON_BLOCK, TextureMap.all(Blocks.IRON_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_IRON_STAIRS, TextureMap.all(Blocks.IRON_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GOLD_SLAB, Blocks.GOLD_BLOCK, TextureMap.all(Blocks.GOLD_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GOLD_STAIRS, TextureMap.all(Blocks.GOLD_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_REDSTONE_SLAB, Blocks.REDSTONE_BLOCK, TextureMap.all(Blocks.REDSTONE_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_REDSTONE_STAIRS, TextureMap.all(Blocks.REDSTONE_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_EMERALD_SLAB, Blocks.EMERALD_BLOCK, TextureMap.all(Blocks.EMERALD_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_EMERALD_STAIRS, TextureMap.all(Blocks.EMERALD_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LAPIS_SLAB, Blocks.LAPIS_BLOCK, TextureMap.all(Blocks.LAPIS_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LAPIS_STAIRS, TextureMap.all(Blocks.LAPIS_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DIAMOND_SLAB, Blocks.DIAMOND_BLOCK, TextureMap.all(Blocks.DIAMOND_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DIAMOND_STAIRS, TextureMap.all(Blocks.DIAMOND_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_NETHERITE_SLAB, Blocks.NETHERITE_BLOCK, TextureMap.all(Blocks.NETHERITE_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_NETHERITE_STAIRS, TextureMap.all(Blocks.NETHERITE_BLOCK));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_QUARTZ_SLAB, Blocks.QUARTZ_BLOCK, blockSTB(Blocks.QUARTZ_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_QUARTZ_STAIRS, blockSTB(Blocks.QUARTZ_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_QUARTZ_SLAB, Blocks.CHISELED_QUARTZ_BLOCK, blockAndTopForEnds(Blocks.CHISELED_QUARTZ_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_QUARTZ_STAIRS, blockAndTopForEnds(Blocks.CHISELED_QUARTZ_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_QUARTZ_BRICKS_SLAB, Blocks.QUARTZ_BRICKS, TextureMap.all(Blocks.QUARTZ_BRICKS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_QUARTZ_BRICKS_STAIRS, TextureMap.all(Blocks.QUARTZ_BRICKS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_QUARTZ_PILLAR_SLAB, Blocks.QUARTZ_PILLAR, blockAndTopForEnds(Blocks.QUARTZ_PILLAR));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_QUARTZ_PILLAR_STAIRS, blockAndTopForEnds(Blocks.QUARTZ_PILLAR));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ, allWithSuffix(Blocks.QUARTZ_BLOCK, "_bottom"));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SMOOTH_QUARTZ_STAIRS, allWithSuffix(Blocks.QUARTZ_BLOCK, "_bottom"));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_AMETHYST_SLAB, Blocks.AMETHYST_BLOCK, TextureMap.all(Blocks.AMETHYST_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_AMETHYST_STAIRS, TextureMap.all(Blocks.AMETHYST_BLOCK));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COPPER_SLAB, Blocks.COPPER_BLOCK, TextureMap.all(Blocks.COPPER_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COPPER_STAIRS, TextureMap.all(Blocks.COPPER_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_EXPOSED_COPPER_SLAB, Blocks.EXPOSED_COPPER, TextureMap.all(Blocks.EXPOSED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_EXPOSED_COPPER_STAIRS, TextureMap.all(Blocks.EXPOSED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WEATHERED_COPPER_SLAB, Blocks.WEATHERED_COPPER, TextureMap.all(Blocks.WEATHERED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WEATHERED_COPPER_STAIRS, TextureMap.all(Blocks.WEATHERED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OXIDIZED_COPPER_SLAB, Blocks.OXIDIZED_COPPER, TextureMap.all(Blocks.OXIDIZED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OXIDIZED_COPPER_STAIRS, TextureMap.all(Blocks.OXIDIZED_COPPER));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHISELED_COPPER_SLAB, Blocks.CHISELED_COPPER, TextureMap.all(Blocks.CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.CHISELED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_EXPOSED_CHISELED_COPPER_SLAB, Blocks.EXPOSED_CHISELED_COPPER, TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_EXPOSED_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER, TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WEATHERED_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OXIDIZED_CHISELED_COPPER_SLAB, Blocks.OXIDIZED_CHISELED_COPPER, TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OXIDIZED_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COPPER_GRATE_SLAB, Blocks.COPPER_GRATE, TextureMap.all(Blocks.COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.COPPER_GRATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_SLAB, Blocks.EXPOSED_COPPER_GRATE, TextureMap.all(Blocks.EXPOSED_COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_EXPOSED_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.EXPOSED_COPPER_GRATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE, TextureMap.all(Blocks.WEATHERED_COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WEATHERED_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.WEATHERED_COPPER_GRATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_SLAB, Blocks.OXIDIZED_COPPER_GRATE, TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OXIDIZED_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CUT_COPPER_SLAB, Blocks.CUT_COPPER, TextureMap.all(Blocks.CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, TextureMap.all(Blocks.CUT_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER, TextureMap.all(Blocks.EXPOSED_CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_STAIRS, TextureMap.all(Blocks.EXPOSED_CUT_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER, TextureMap.all(Blocks.WEATHERED_CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_STAIRS, TextureMap.all(Blocks.WEATHERED_CUT_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER, TextureMap.all(Blocks.OXIDIZED_CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_STAIRS, TextureMap.all(Blocks.OXIDIZED_CUT_COPPER));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_COPPER_SLAB, Blocks.COPPER_BLOCK, TextureMap.all(Blocks.COPPER_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_COPPER_STAIRS, TextureMap.all(Blocks.COPPER_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_SLAB, Blocks.EXPOSED_COPPER, TextureMap.all(Blocks.EXPOSED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_STAIRS, TextureMap.all(Blocks.EXPOSED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_SLAB, Blocks.WEATHERED_COPPER, TextureMap.all(Blocks.WEATHERED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_STAIRS, TextureMap.all(Blocks.WEATHERED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_SLAB, Blocks.OXIDIZED_COPPER, TextureMap.all(Blocks.OXIDIZED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_STAIRS, TextureMap.all(Blocks.OXIDIZED_COPPER));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_CHISELED_COPPER_SLAB, Blocks.CHISELED_COPPER, TextureMap.all(Blocks.CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.CHISELED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_SLAB, Blocks.EXPOSED_CHISELED_COPPER, TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.EXPOSED_CHISELED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER, TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.WEATHERED_CHISELED_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_SLAB, Blocks.OXIDIZED_CHISELED_COPPER, TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_CHISELED_COPPER_STAIRS, TextureMap.all(Blocks.OXIDIZED_CHISELED_COPPER));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_COPPER_GRATE_SLAB, Blocks.COPPER_GRATE, TextureMap.all(Blocks.COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.COPPER_GRATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_SLAB, Blocks.EXPOSED_COPPER_GRATE, TextureMap.all(Blocks.EXPOSED_COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.EXPOSED_COPPER_GRATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE, TextureMap.all(Blocks.WEATHERED_COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.WEATHERED_COPPER_GRATE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_SLAB, Blocks.OXIDIZED_COPPER_GRATE, TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_COPPER_GRATE_STAIRS, TextureMap.all(Blocks.OXIDIZED_COPPER_GRATE));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, Blocks.CUT_COPPER, TextureMap.all(Blocks.CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_CUT_COPPER_STAIRS, TextureMap.all(Blocks.CUT_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER, TextureMap.all(Blocks.EXPOSED_CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_STAIRS, TextureMap.all(Blocks.EXPOSED_CUT_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER, TextureMap.all(Blocks.WEATHERED_CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_STAIRS, TextureMap.all(Blocks.WEATHERED_CUT_COPPER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER, TextureMap.all(Blocks.OXIDIZED_CUT_COPPER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_STAIRS, TextureMap.all(Blocks.OXIDIZED_CUT_COPPER));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WHITE_WOOL_SLAB, Blocks.WHITE_WOOL, TextureMap.all(Blocks.WHITE_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WHITE_WOOL_STAIRS, TextureMap.all(Blocks.WHITE_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL, TextureMap.all(Blocks.LIGHT_GRAY_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_WOOL_STAIRS, TextureMap.all(Blocks.LIGHT_GRAY_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRAY_WOOL_SLAB, Blocks.GRAY_WOOL, TextureMap.all(Blocks.GRAY_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRAY_WOOL_STAIRS, TextureMap.all(Blocks.GRAY_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLACK_WOOL_SLAB, Blocks.BLACK_WOOL, TextureMap.all(Blocks.BLACK_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLACK_WOOL_STAIRS, TextureMap.all(Blocks.BLACK_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BROWN_WOOL_SLAB, Blocks.BROWN_WOOL, TextureMap.all(Blocks.BROWN_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BROWN_WOOL_STAIRS, TextureMap.all(Blocks.BROWN_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_WOOL_SLAB, Blocks.RED_WOOL, TextureMap.all(Blocks.RED_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_WOOL_STAIRS, TextureMap.all(Blocks.RED_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL, TextureMap.all(Blocks.ORANGE_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ORANGE_WOOL_STAIRS, TextureMap.all(Blocks.ORANGE_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL, TextureMap.all(Blocks.YELLOW_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_YELLOW_WOOL_STAIRS, TextureMap.all(Blocks.YELLOW_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIME_WOOL_SLAB, Blocks.LIME_WOOL, TextureMap.all(Blocks.LIME_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIME_WOOL_STAIRS, TextureMap.all(Blocks.LIME_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GREEN_WOOL_SLAB, Blocks.GREEN_WOOL, TextureMap.all(Blocks.GREEN_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GREEN_WOOL_STAIRS, TextureMap.all(Blocks.GREEN_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CYAN_WOOL_SLAB, Blocks.CYAN_WOOL, TextureMap.all(Blocks.CYAN_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CYAN_WOOL_STAIRS, TextureMap.all(Blocks.CYAN_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL, TextureMap.all(Blocks.LIGHT_BLUE_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_WOOL_STAIRS, TextureMap.all(Blocks.LIGHT_BLUE_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLUE_WOOL_SLAB, Blocks.BLUE_WOOL, TextureMap.all(Blocks.BLUE_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLUE_WOOL_STAIRS, TextureMap.all(Blocks.BLUE_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL, TextureMap.all(Blocks.PURPLE_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPLE_WOOL_STAIRS, TextureMap.all(Blocks.PURPLE_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL, TextureMap.all(Blocks.MAGENTA_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MAGENTA_WOOL_STAIRS, TextureMap.all(Blocks.MAGENTA_WOOL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PINK_WOOL_SLAB, Blocks.PINK_WOOL, TextureMap.all(Blocks.PINK_WOOL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PINK_WOOL_STAIRS, TextureMap.all(Blocks.PINK_WOOL));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_TERRACOTTA_SLAB, Blocks.TERRACOTTA, TextureMap.all(Blocks.TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_TERRACOTTA_STAIRS, TextureMap.all(Blocks.TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, TextureMap.all(Blocks.WHITE_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WHITE_TERRACOTTA_STAIRS, TextureMap.all(Blocks.WHITE_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, TextureMap.all(Blocks.LIGHT_GRAY_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_TERRACOTTA_STAIRS, TextureMap.all(Blocks.LIGHT_GRAY_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, TextureMap.all(Blocks.GRAY_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRAY_TERRACOTTA_STAIRS, TextureMap.all(Blocks.GRAY_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, TextureMap.all(Blocks.BLACK_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLACK_TERRACOTTA_STAIRS, TextureMap.all(Blocks.BLACK_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, TextureMap.all(Blocks.BROWN_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BROWN_TERRACOTTA_STAIRS, TextureMap.all(Blocks.BROWN_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, TextureMap.all(Blocks.RED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.RED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, TextureMap.all(Blocks.ORANGE_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ORANGE_TERRACOTTA_STAIRS, TextureMap.all(Blocks.ORANGE_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, TextureMap.all(Blocks.YELLOW_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_YELLOW_TERRACOTTA_STAIRS, TextureMap.all(Blocks.YELLOW_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, TextureMap.all(Blocks.LIME_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIME_TERRACOTTA_STAIRS, TextureMap.all(Blocks.LIME_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, TextureMap.all(Blocks.GREEN_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GREEN_TERRACOTTA_STAIRS, TextureMap.all(Blocks.GREEN_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, TextureMap.all(Blocks.CYAN_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CYAN_TERRACOTTA_STAIRS, TextureMap.all(Blocks.CYAN_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, TextureMap.all(Blocks.LIGHT_BLUE_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_TERRACOTTA_STAIRS, TextureMap.all(Blocks.LIGHT_BLUE_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, TextureMap.all(Blocks.BLUE_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLUE_TERRACOTTA_STAIRS, TextureMap.all(Blocks.BLUE_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, TextureMap.all(Blocks.PURPLE_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPLE_TERRACOTTA_STAIRS, TextureMap.all(Blocks.PURPLE_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, TextureMap.all(Blocks.MAGENTA_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MAGENTA_TERRACOTTA_STAIRS, TextureMap.all(Blocks.MAGENTA_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, TextureMap.all(Blocks.PINK_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PINK_TERRACOTTA_STAIRS, TextureMap.all(Blocks.PINK_TERRACOTTA));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, TextureMap.all(Blocks.WHITE_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WHITE_CONCRETE_STAIRS, TextureMap.all(Blocks.WHITE_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_STAIRS, TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, TextureMap.all(Blocks.GRAY_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRAY_CONCRETE_STAIRS, TextureMap.all(Blocks.GRAY_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, TextureMap.all(Blocks.BLACK_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLACK_CONCRETE_STAIRS, TextureMap.all(Blocks.BLACK_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, TextureMap.all(Blocks.BROWN_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BROWN_CONCRETE_STAIRS, TextureMap.all(Blocks.BROWN_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, TextureMap.all(Blocks.RED_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_CONCRETE_STAIRS, TextureMap.all(Blocks.RED_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, TextureMap.all(Blocks.ORANGE_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ORANGE_CONCRETE_STAIRS, TextureMap.all(Blocks.ORANGE_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, TextureMap.all(Blocks.YELLOW_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_YELLOW_CONCRETE_STAIRS, TextureMap.all(Blocks.YELLOW_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, TextureMap.all(Blocks.LIME_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIME_CONCRETE_STAIRS, TextureMap.all(Blocks.LIME_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, TextureMap.all(Blocks.GREEN_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GREEN_CONCRETE_STAIRS, TextureMap.all(Blocks.GREEN_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, TextureMap.all(Blocks.CYAN_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CYAN_CONCRETE_STAIRS, TextureMap.all(Blocks.CYAN_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_STAIRS, TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, TextureMap.all(Blocks.BLUE_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLUE_CONCRETE_STAIRS, TextureMap.all(Blocks.BLUE_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, TextureMap.all(Blocks.PURPLE_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPLE_CONCRETE_STAIRS, TextureMap.all(Blocks.PURPLE_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, TextureMap.all(Blocks.MAGENTA_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MAGENTA_CONCRETE_STAIRS, TextureMap.all(Blocks.MAGENTA_CONCRETE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, TextureMap.all(Blocks.PINK_CONCRETE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PINK_CONCRETE_STAIRS, TextureMap.all(Blocks.PINK_CONCRETE));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WHITE_CONCRETE_POWDER_SLAB, Blocks.WHITE_CONCRETE_POWDER, TextureMap.all(Blocks.WHITE_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WHITE_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.WHITE_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_SLAB, Blocks.LIGHT_GRAY_CONCRETE_POWDER, TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRAY_CONCRETE_POWDER_SLAB, Blocks.GRAY_CONCRETE_POWDER, TextureMap.all(Blocks.GRAY_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRAY_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.GRAY_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLACK_CONCRETE_POWDER_SLAB, Blocks.BLACK_CONCRETE_POWDER, TextureMap.all(Blocks.BLACK_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLACK_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.BLACK_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BROWN_CONCRETE_POWDER_SLAB, Blocks.BROWN_CONCRETE_POWDER, TextureMap.all(Blocks.BROWN_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BROWN_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.BROWN_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_CONCRETE_POWDER_SLAB, Blocks.RED_CONCRETE_POWDER, TextureMap.all(Blocks.RED_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.RED_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ORANGE_CONCRETE_POWDER_SLAB, Blocks.ORANGE_CONCRETE_POWDER, TextureMap.all(Blocks.ORANGE_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ORANGE_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.ORANGE_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_YELLOW_CONCRETE_POWDER_SLAB, Blocks.YELLOW_CONCRETE_POWDER, TextureMap.all(Blocks.YELLOW_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_YELLOW_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.YELLOW_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIME_CONCRETE_POWDER_SLAB, Blocks.LIME_CONCRETE_POWDER, TextureMap.all(Blocks.LIME_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIME_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.LIME_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GREEN_CONCRETE_POWDER_SLAB, Blocks.GREEN_CONCRETE_POWDER, TextureMap.all(Blocks.GREEN_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GREEN_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.GREEN_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CYAN_CONCRETE_POWDER_SLAB, Blocks.CYAN_CONCRETE_POWDER, TextureMap.all(Blocks.CYAN_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CYAN_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.CYAN_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_SLAB, Blocks.LIGHT_BLUE_CONCRETE_POWDER, TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLUE_CONCRETE_POWDER_SLAB, Blocks.BLUE_CONCRETE_POWDER, TextureMap.all(Blocks.BLUE_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLUE_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.BLUE_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPLE_CONCRETE_POWDER_SLAB, Blocks.PURPLE_CONCRETE_POWDER, TextureMap.all(Blocks.PURPLE_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPLE_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.PURPLE_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MAGENTA_CONCRETE_POWDER_SLAB, Blocks.MAGENTA_CONCRETE_POWDER, TextureMap.all(Blocks.MAGENTA_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MAGENTA_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.MAGENTA_CONCRETE_POWDER));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PINK_CONCRETE_POWDER_SLAB, Blocks.PINK_CONCRETE_POWDER, TextureMap.all(Blocks.PINK_CONCRETE_POWDER));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PINK_CONCRETE_POWDER_STAIRS, TextureMap.all(Blocks.PINK_CONCRETE_POWDER));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.WHITE_GLAZED_TERRACOTTA, TextureMap.all(Blocks.WHITE_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WHITE_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.WHITE_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, TextureMap.all(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GRAY_GLAZED_TERRACOTTA, TextureMap.all(Blocks.GRAY_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRAY_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.GRAY_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.BLACK_GLAZED_TERRACOTTA, TextureMap.all(Blocks.BLACK_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLACK_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.BLACK_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.BROWN_GLAZED_TERRACOTTA, TextureMap.all(Blocks.BROWN_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BROWN_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.BROWN_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_GLAZED_TERRACOTTA_SLAB, Blocks.RED_GLAZED_TERRACOTTA, TextureMap.all(Blocks.RED_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.RED_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.ORANGE_GLAZED_TERRACOTTA, TextureMap.all(Blocks.ORANGE_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ORANGE_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.ORANGE_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.YELLOW_GLAZED_TERRACOTTA, TextureMap.all(Blocks.YELLOW_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_YELLOW_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.YELLOW_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIME_GLAZED_TERRACOTTA_SLAB, Blocks.LIME_GLAZED_TERRACOTTA, TextureMap.all(Blocks.LIME_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIME_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.LIME_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GREEN_GLAZED_TERRACOTTA, TextureMap.all(Blocks.GREEN_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GREEN_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.GREEN_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.CYAN_GLAZED_TERRACOTTA, TextureMap.all(Blocks.CYAN_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CYAN_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.CYAN_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, TextureMap.all(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.BLUE_GLAZED_TERRACOTTA, TextureMap.all(Blocks.BLUE_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLUE_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.BLUE_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.PURPLE_GLAZED_TERRACOTTA, TextureMap.all(Blocks.PURPLE_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPLE_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.PURPLE_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.MAGENTA_GLAZED_TERRACOTTA, TextureMap.all(Blocks.MAGENTA_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MAGENTA_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.MAGENTA_GLAZED_TERRACOTTA));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PINK_GLAZED_TERRACOTTA_SLAB, Blocks.PINK_GLAZED_TERRACOTTA, TextureMap.all(Blocks.PINK_GLAZED_TERRACOTTA));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PINK_GLAZED_TERRACOTTA_STAIRS, TextureMap.all(Blocks.PINK_GLAZED_TERRACOTTA));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GLASS_SLAB, Blocks.GLASS, TextureMap.all(Blocks.GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GLASS_STAIRS, TextureMap.all(Blocks.GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WHITE_STAINED_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS, TextureMap.all(Blocks.WHITE_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WHITE_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.WHITE_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS, TextureMap.all(Blocks.LIGHT_GRAY_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_GRAY_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.LIGHT_GRAY_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRAY_STAINED_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS, TextureMap.all(Blocks.GRAY_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRAY_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.GRAY_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLACK_STAINED_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS, TextureMap.all(Blocks.BLACK_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLACK_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.BLACK_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BROWN_STAINED_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS, TextureMap.all(Blocks.BROWN_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BROWN_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.BROWN_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_STAINED_GLASS_SLAB, Blocks.RED_STAINED_GLASS, TextureMap.all(Blocks.RED_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.RED_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS, TextureMap.all(Blocks.ORANGE_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ORANGE_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.ORANGE_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS, TextureMap.all(Blocks.YELLOW_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_YELLOW_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.YELLOW_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIME_STAINED_GLASS_SLAB, Blocks.LIME_STAINED_GLASS, TextureMap.all(Blocks.LIME_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIME_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.LIME_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GREEN_STAINED_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS, TextureMap.all(Blocks.GREEN_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GREEN_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.GREEN_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CYAN_STAINED_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS, TextureMap.all(Blocks.CYAN_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CYAN_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.CYAN_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS, TextureMap.all(Blocks.LIGHT_BLUE_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LIGHT_BLUE_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.LIGHT_BLUE_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLUE_STAINED_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS, TextureMap.all(Blocks.BLUE_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLUE_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.BLUE_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS, TextureMap.all(Blocks.PURPLE_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PURPLE_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.PURPLE_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS, TextureMap.all(Blocks.MAGENTA_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MAGENTA_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.MAGENTA_STAINED_GLASS));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PINK_STAINED_GLASS_SLAB, Blocks.PINK_STAINED_GLASS, TextureMap.all(Blocks.PINK_STAINED_GLASS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PINK_STAINED_GLASS_STAIRS, TextureMap.all(Blocks.PINK_STAINED_GLASS));
//
//        //GRASS BLOCKS MADE MANUALLY
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PODZOL_SLAB, Blocks.PODZOL, custom(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PODZOL_STAIRS, custom(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MYCELIUM_SLAB, Blocks.MYCELIUM, custom(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MYCELIUM_STAIRS, custom(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
//
//        registerVerticalSlab15(bsmg, ModBlocks.VERTICAL_DIRT_PATH_SLAB, Blocks.DIRT_PATH, custom(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
//        registerVerticalStairs15(bsmg, ModBlocks.VERTICAL_DIRT_PATH_STAIRS, custom(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DIRT_SLAB, Blocks.DIRT, TextureMap.all(Blocks.DIRT));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DIRT_STAIRS, TextureMap.all(Blocks.DIRT));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COARSE_DIRT_SLAB, Blocks.COARSE_DIRT, TextureMap.all(Blocks.COARSE_DIRT));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COARSE_DIRT_STAIRS, TextureMap.all(Blocks.COARSE_DIRT));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT, TextureMap.all(Blocks.ROOTED_DIRT));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ROOTED_DIRT_STAIRS, TextureMap.all(Blocks.ROOTED_DIRT));
//
//        registerVerticalSlab15(bsmg, ModBlocks.VERTICAL_FARMLAND_SLAB, Blocks.FARMLAND, custom(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
//        registerVerticalStairs15(bsmg, ModBlocks.VERTICAL_FARMLAND_STAIRS, custom(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MUD_SLAB, Blocks.MUD, TextureMap.all(Blocks.MUD));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MUD_STAIRS, TextureMap.all(Blocks.MUD));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CLAY_SLAB, Blocks.CLAY, TextureMap.all(Blocks.CLAY));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CLAY_STAIRS, TextureMap.all(Blocks.CLAY));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GRAVEL_SLAB, Blocks.GRAVEL, TextureMap.all(Blocks.GRAVEL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GRAVEL_STAIRS, TextureMap.all(Blocks.GRAVEL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SAND_SLAB, Blocks.SAND, TextureMap.all(Blocks.SAND));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SAND_STAIRS, TextureMap.all(Blocks.SAND));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RED_SAND_SLAB, Blocks.RED_SAND, TextureMap.all(Blocks.RED_SAND));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RED_SAND_STAIRS, TextureMap.all(Blocks.RED_SAND));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ICE_SLAB, Blocks.ICE, TextureMap.all(Blocks.ICE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ICE_STAIRS, TextureMap.all(Blocks.ICE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PACKED_ICE_SLAB, Blocks.PACKED_ICE, TextureMap.all(Blocks.PACKED_ICE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PACKED_ICE_STAIRS, TextureMap.all(Blocks.PACKED_ICE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BLUE_ICE_SLAB, Blocks.BLUE_ICE, TextureMap.all(Blocks.BLUE_ICE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BLUE_ICE_STAIRS, TextureMap.all(Blocks.BLUE_ICE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SNOW_SLAB, Blocks.SNOW_BLOCK, TextureMap.all(Blocks.SNOW));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SNOW_STAIRS, TextureMap.all(Blocks.SNOW));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MOSS_SLAB, Blocks.MOSS_BLOCK, TextureMap.all(Blocks.MOSS_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MOSS_STAIRS, TextureMap.all(Blocks.MOSS_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_PALE_MOSS_SLAB, Blocks.PALE_MOSS_BLOCK, TextureMap.all(Blocks.PALE_MOSS_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_PALE_MOSS_STAIRS, TextureMap.all(Blocks.PALE_MOSS_BLOCK));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CALCITE_SLAB, Blocks.CALCITE, TextureMap.all(Blocks.CALCITE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CALCITE_STAIRS, TextureMap.all(Blocks.CALCITE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, TextureMap.all(Blocks.DRIPSTONE_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DRIPSTONE_STAIRS, TextureMap.all(Blocks.DRIPSTONE_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MAGMA_SLAB, Blocks.MAGMA_BLOCK, TextureMap.all(Identifier.ofVanilla("block/magma")));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MAGMA_STAIRS, TextureMap.all(Identifier.ofVanilla("block/magma")));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OBSIDIAN_SLAB, Blocks.OBSIDIAN, TextureMap.all(Blocks.OBSIDIAN));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OBSIDIAN_STAIRS, TextureMap.all(Blocks.OBSIDIAN));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN, TextureMap.all(Blocks.CRYING_OBSIDIAN));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRYING_OBSIDIAN_STAIRS, TextureMap.all(Blocks.CRYING_OBSIDIAN));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRIMSON_NYLIUM_SLAB, Blocks.CRIMSON_NYLIUM, custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRIMSON_NYLIUM_STAIRS, custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WARPED_NYLIUM_SLAB, Blocks.WARPED_NYLIUM, custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WARPED_NYLIUM_STAIRS, custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SOUL_SAND_SLAB, Blocks.SOUL_SAND, TextureMap.all(Blocks.SOUL_SAND));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SOUL_SAND_STAIRS, TextureMap.all(Blocks.SOUL_SAND));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SOUL_SOIL_SLAB, Blocks.SOUL_SOIL, TextureMap.all(Blocks.SOUL_SOIL));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SOUL_SOIL_STAIRS, TextureMap.all(Blocks.SOUL_SOIL));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BONE_BLOCK_SLAB, Blocks.BONE_BLOCK, sideAndTopForEnds(Blocks.BONE_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BONE_BLOCK_STAIRS, sideAndTopForEnds(Blocks.BONE_BLOCK));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COAL_ORE_SLAB, Blocks.COAL_ORE, TextureMap.all(Blocks.COAL_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COAL_ORE_STAIRS, TextureMap.all(Blocks.COAL_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_COAL_ORE_SLAB, Blocks.DEEPSLATE_COAL_ORE, TextureMap.all(Blocks.DEEPSLATE_COAL_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_COAL_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_COAL_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_IRON_ORE_SLAB, Blocks.IRON_ORE, TextureMap.all(Blocks.IRON_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_IRON_ORE_STAIRS, TextureMap.all(Blocks.IRON_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_IRON_ORE_SLAB, Blocks.DEEPSLATE_IRON_ORE, TextureMap.all(Blocks.DEEPSLATE_IRON_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_IRON_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_IRON_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_COPPER_ORE_SLAB, Blocks.COPPER_ORE, TextureMap.all(Blocks.COPPER_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_COPPER_ORE_STAIRS, TextureMap.all(Blocks.COPPER_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_COPPER_ORE_SLAB, Blocks.DEEPSLATE_COPPER_ORE, TextureMap.all(Blocks.DEEPSLATE_COPPER_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_COPPER_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_COPPER_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GOLD_ORE_SLAB, Blocks.GOLD_ORE, TextureMap.all(Blocks.GOLD_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GOLD_ORE_STAIRS, TextureMap.all(Blocks.GOLD_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_GOLD_ORE_SLAB, Blocks.DEEPSLATE_GOLD_ORE, TextureMap.all(Blocks.DEEPSLATE_GOLD_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_GOLD_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_GOLD_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_REDSTONE_ORE_SLAB, Blocks.REDSTONE_ORE, TextureMap.all(Blocks.REDSTONE_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_REDSTONE_ORE_STAIRS, TextureMap.all(Blocks.REDSTONE_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_REDSTONE_ORE_SLAB, Blocks.DEEPSLATE_REDSTONE_ORE, TextureMap.all(Blocks.DEEPSLATE_REDSTONE_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_REDSTONE_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_REDSTONE_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_EMERALD_ORE_SLAB, Blocks.EMERALD_ORE, TextureMap.all(Blocks.EMERALD_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_EMERALD_ORE_STAIRS, TextureMap.all(Blocks.EMERALD_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_EMERALD_ORE_SLAB, Blocks.DEEPSLATE_EMERALD_ORE, TextureMap.all(Blocks.DEEPSLATE_EMERALD_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_EMERALD_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_EMERALD_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_LAPIS_ORE_SLAB, Blocks.LAPIS_ORE, TextureMap.all(Blocks.LAPIS_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_LAPIS_ORE_STAIRS, TextureMap.all(Blocks.LAPIS_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_LAPIS_ORE_SLAB, Blocks.DEEPSLATE_LAPIS_ORE, TextureMap.all(Blocks.DEEPSLATE_LAPIS_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_LAPIS_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_LAPIS_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DIAMOND_ORE_SLAB, Blocks.DIAMOND_ORE, TextureMap.all(Blocks.DIAMOND_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DIAMOND_ORE_STAIRS, TextureMap.all(Blocks.DIAMOND_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DEEPSLATE_DIAMOND_ORE_SLAB, Blocks.DEEPSLATE_DIAMOND_ORE, TextureMap.all(Blocks.DEEPSLATE_DIAMOND_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DEEPSLATE_DIAMOND_ORE_STAIRS, TextureMap.all(Blocks.DEEPSLATE_DIAMOND_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_NETHER_GOLD_ORE_SLAB, Blocks.NETHER_GOLD_ORE, TextureMap.all(Blocks.NETHER_GOLD_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_NETHER_GOLD_ORE_STAIRS, TextureMap.all(Blocks.NETHER_GOLD_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_NETHER_QUARTZ_ORE_SLAB, Blocks.NETHER_QUARTZ_ORE, TextureMap.all(Blocks.NETHER_QUARTZ_ORE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_NETHER_QUARTZ_ORE_STAIRS, TextureMap.all(Blocks.NETHER_QUARTZ_ORE));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ANCIENT_DEBRIS_SLAB, Blocks.ANCIENT_DEBRIS, sideAndTopForEnds(Blocks.ANCIENT_DEBRIS));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ANCIENT_DEBRIS_STAIRS, sideAndTopForEnds(Blocks.ANCIENT_DEBRIS));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RAW_IRON_BLOCK_SLAB, Blocks.RAW_IRON_BLOCK, TextureMap.all(Blocks.RAW_IRON_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RAW_IRON_BLOCK_STAIRS, TextureMap.all(Blocks.RAW_IRON_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RAW_COPPER_BLOCK_SLAB, Blocks.RAW_COPPER_BLOCK, TextureMap.all(Blocks.RAW_COPPER_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RAW_COPPER_BLOCK_STAIRS, TextureMap.all(Blocks.RAW_COPPER_BLOCK));
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_RAW_GOLD_BLOCK_SLAB, Blocks.RAW_GOLD_BLOCK, TextureMap.all(Blocks.RAW_GOLD_BLOCK));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_RAW_GOLD_BLOCK_STAIRS, TextureMap.all(Blocks.RAW_GOLD_BLOCK));
//
//
//        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_GLOWSTONE_SLAB, Blocks.GLOWSTONE, TextureMap.all(Blocks.GLOWSTONE));
//        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_GLOWSTONE_STAIRS, TextureMap.all(Blocks.GLOWSTONE));

        Registries.BLOCK.forEach(block -> {
            if (ModBlocks.DATAGEN_ARGS.containsKey(block)) {
                DatagenArgs args = ModBlocks.DATAGEN_ARGS.get(block);
                if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaVSPlus.MOD_ID) && args.textureMap != null) {

                    if (block instanceof VerticalStairsBlock && args.y15 && args.tintSource != null) registerVerticalStairs15(bsmg, block, args.textureMap, args.tintSource);
                    else if (block instanceof VerticalStairsBlock && args.y15) registerVerticalStairs15(bsmg, block, args.textureMap);
                    else if (block instanceof VerticalStairsBlock && args.tintSource != null) registerVerticalStairs(bsmg, block, args.textureMap, args.tintSource);
                    else if (block instanceof VerticalStairsBlock) registerVerticalStairs(bsmg, block, args.textureMap);

                    else if (block instanceof VerticalSlabBlock && args.y15 && args.tintSource != null && args.fullTextureBlock != null) registerVerticalSlab15(bsmg, block, args.fullTextureBlock, args.textureMap, args.tintSource);
                    else if (block instanceof VerticalSlabBlock && args.y15 && args.tintSource != null && args.parentBlock != null) registerVerticalSlab15(bsmg, block, args.parentBlock, args.textureMap, args.tintSource);
                    else if (block instanceof VerticalSlabBlock && args.y15 && args.fullTextureBlock != null) registerVerticalSlab15(bsmg, block, args.fullTextureBlock, args.textureMap);
                    else if (block instanceof VerticalSlabBlock && args.y15 && args.parentBlock != null) registerVerticalSlab15(bsmg, block, args.parentBlock, args.textureMap);
                    else if (block instanceof VerticalSlabBlock && args.tintSource != null && args.fullTextureBlock != null) registerVerticalSlab(bsmg, block, args.fullTextureBlock, args.textureMap, args.tintSource);
                    else if (block instanceof VerticalSlabBlock && args.tintSource != null && args.parentBlock != null) registerVerticalSlab(bsmg, block, args.parentBlock, args.textureMap, args.tintSource);
                    else if (block instanceof VerticalSlabBlock && args.fullTextureBlock != null) registerVerticalSlab(bsmg, block, args.fullTextureBlock, args.textureMap);
                    else if (block instanceof VerticalSlabBlock && args.parentBlock != null) registerVerticalSlab(bsmg, block, args.parentBlock, args.textureMap);
                }
            }
        });

    }



    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VVSP_TITLE, Models.GENERATED);
    }

    public static TextureMap blockAndTopForEnds(Block block) {
        return new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.SIDE, TextureMap.getId(block))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_top"));
    }


    public static TextureMap sideAndTopForEnds(Block block) {
        return new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_top"));
    }

    public static TextureMap allWithSuffix(Block block, String suffix) {
        return new TextureMap()
                .put(TextureKey.ALL, TextureMap.getSubId(block, suffix));
    }

    public static TextureMap blockTB(Block block) {
        return new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.SIDE, TextureMap.getId(block))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_bottom"));
    }

    public static TextureMap blockSTB(Block block) {
        return new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_bottom"));
    }

    public static TextureMap custom(Block sideBlock, Block topBlock, Block bottomBlock, String sideSuffix, String topSuffix, String bottomSuffix) {
        return new TextureMap()
                .put(TextureKey.SIDE, TextureMap.getSubId(sideBlock, sideSuffix))
                .put(TextureKey.TOP, TextureMap.getSubId(topBlock, topSuffix))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(bottomBlock, bottomSuffix));
    }
}
