package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

import static net.fellter.vanillavsplus.util.ModBlockStateModelGenerator.registerVerticalSlab;
import static net.fellter.vanillavsplus.util.ModBlockStateModelGenerator.registerVerticalStairs;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS, TextureMap.all(Blocks.OAK_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OAK_STAIRS, TextureMap.all(Blocks.OAK_PLANKS));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_LOG_SLAB, Blocks.OAK_LOG, blockAndTopForEnds(Blocks.OAK_LOG), blockAndTopForEnds(Blocks.OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.OAK_LOG));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_WOOD_SLAB, Blocks.OAK_WOOD, TextureMap.all(Blocks.OAK_LOG), TextureMap.all(Blocks.OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_OAK_WOOD_STAIRS, TextureMap.all(Blocks.OAK_LOG));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG, blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG), blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB, Blocks.STRIPPED_OAK_WOOD, TextureMap.all(Blocks.STRIPPED_OAK_LOG), TextureMap.all(Blocks.STRIPPED_OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_OAK_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_OAK_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SPRUCE_SLAB, Blocks.SPRUCE_PLANKS, TextureMap.all(Blocks.SPRUCE_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SPRUCE_STAIRS, TextureMap.all(Blocks.SPRUCE_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, blockAndTopForEnds(Blocks.SPRUCE_LOG), blockAndTopForEnds(Blocks.SPRUCE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS, blockAndTopForEnds(Blocks.SPRUCE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB, Blocks.SPRUCE_WOOD, TextureMap.all(Blocks.SPRUCE_LOG), TextureMap.all(Blocks.SPRUCE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS, TextureMap.all(Blocks.SPRUCE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB, Blocks.STRIPPED_SPRUCE_LOG, blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG), blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_SPRUCE_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB, Blocks.STRIPPED_SPRUCE_WOOD, TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG), TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_SPRUCE_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BIRCH_SLAB, Blocks.BIRCH_PLANKS, TextureMap.all(Blocks.BIRCH_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BIRCH_STAIRS, TextureMap.all(Blocks.BIRCH_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, blockAndTopForEnds(Blocks.BIRCH_LOG), blockAndTopForEnds(Blocks.BIRCH_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BIRCH_LOG_STAIRS, blockAndTopForEnds(Blocks.BIRCH_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BIRCH_WOOD_SLAB, Blocks.BIRCH_WOOD, TextureMap.all(Blocks.BIRCH_LOG), TextureMap.all(Blocks.BIRCH_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS, TextureMap.all(Blocks.BIRCH_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB, Blocks.STRIPPED_BIRCH_LOG, blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG), blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_BIRCH_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB, Blocks.STRIPPED_BIRCH_WOOD, TextureMap.all(Blocks.STRIPPED_BIRCH_LOG), TextureMap.all(Blocks.STRIPPED_BIRCH_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_BIRCH_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_BIRCH_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_JUNGLE_SLAB, Blocks.JUNGLE_PLANKS, TextureMap.all(Blocks.JUNGLE_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_JUNGLE_STAIRS, TextureMap.all(Blocks.JUNGLE_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, blockAndTopForEnds(Blocks.JUNGLE_LOG), blockAndTopForEnds(Blocks.JUNGLE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS, blockAndTopForEnds(Blocks.JUNGLE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB, Blocks.JUNGLE_WOOD, TextureMap.all(Blocks.JUNGLE_LOG), TextureMap.all(Blocks.JUNGLE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS, TextureMap.all(Blocks.JUNGLE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB, Blocks.STRIPPED_JUNGLE_LOG, blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG), blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_JUNGLE_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB, Blocks.STRIPPED_JUNGLE_WOOD, TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG), TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_JUNGLE_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ACACIA_SLAB, Blocks.ACACIA_PLANKS, TextureMap.all(Blocks.ACACIA_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ACACIA_STAIRS, TextureMap.all(Blocks.ACACIA_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, blockAndTopForEnds(Blocks.ACACIA_LOG), blockAndTopForEnds(Blocks.ACACIA_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ACACIA_LOG_STAIRS, blockAndTopForEnds(Blocks.ACACIA_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_ACACIA_WOOD_SLAB, Blocks.ACACIA_WOOD, TextureMap.all(Blocks.ACACIA_LOG), TextureMap.all(Blocks.ACACIA_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS, TextureMap.all(Blocks.ACACIA_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB, Blocks.STRIPPED_ACACIA_LOG, blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG), blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_ACACIA_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB, Blocks.STRIPPED_ACACIA_WOOD, TextureMap.all(Blocks.STRIPPED_ACACIA_LOG), TextureMap.all(Blocks.STRIPPED_ACACIA_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_ACACIA_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_ACACIA_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS, TextureMap.all(Blocks.DARK_OAK_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DARK_OAK_STAIRS, TextureMap.all(Blocks.DARK_OAK_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, blockAndTopForEnds(Blocks.DARK_OAK_LOG), blockAndTopForEnds(Blocks.DARK_OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.DARK_OAK_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB, Blocks.DARK_OAK_WOOD, TextureMap.all(Blocks.DARK_OAK_LOG), TextureMap.all(Blocks.DARK_OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS, TextureMap.all(Blocks.DARK_OAK_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB, Blocks.STRIPPED_DARK_OAK_LOG, blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG), blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_DARK_OAK_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB, Blocks.STRIPPED_DARK_OAK_WOOD, TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG), TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MANGROVE_SLAB, Blocks.MANGROVE_PLANKS, TextureMap.all(Blocks.MANGROVE_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MANGROVE_STAIRS, TextureMap.all(Blocks.MANGROVE_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG, blockAndTopForEnds(Blocks.MANGROVE_LOG), blockAndTopForEnds(Blocks.MANGROVE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS, blockAndTopForEnds(Blocks.MANGROVE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB, Blocks.MANGROVE_WOOD, TextureMap.all(Blocks.MANGROVE_LOG), TextureMap.all(Blocks.MANGROVE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS, TextureMap.all(Blocks.MANGROVE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB, Blocks.STRIPPED_MANGROVE_LOG, blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG), blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_MANGROVE_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB, Blocks.STRIPPED_MANGROVE_WOOD, TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG), TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_MANGROVE_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHERRY_SLAB, Blocks.CHERRY_PLANKS, TextureMap.all(Blocks.CHERRY_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHERRY_STAIRS, TextureMap.all(Blocks.CHERRY_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHERRY_LOG_SLAB, Blocks.CHERRY_LOG, blockAndTopForEnds(Blocks.CHERRY_LOG), blockAndTopForEnds(Blocks.CHERRY_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHERRY_LOG_STAIRS, blockAndTopForEnds(Blocks.CHERRY_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CHERRY_WOOD_SLAB, Blocks.CHERRY_WOOD, TextureMap.all(Blocks.CHERRY_LOG), TextureMap.all(Blocks.CHERRY_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS, TextureMap.all(Blocks.CHERRY_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB, Blocks.STRIPPED_CHERRY_LOG, blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG), blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_CHERRY_LOG_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB, Blocks.STRIPPED_CHERRY_WOOD, TextureMap.all(Blocks.STRIPPED_CHERRY_LOG), TextureMap.all(Blocks.STRIPPED_CHERRY_LOG));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_CHERRY_WOOD_STAIRS, TextureMap.all(Blocks.STRIPPED_CHERRY_LOG));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BAMBOO_SLAB, Blocks.BAMBOO_PLANKS, TextureMap.all(Blocks.BAMBOO_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BAMBOO_STAIRS, TextureMap.all(Blocks.BAMBOO_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC, TextureMap.all(Blocks.BAMBOO_MOSAIC), TextureMap.all(Blocks.BAMBOO_MOSAIC));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS, TextureMap.all(Blocks.BAMBOO_MOSAIC));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB, Blocks.BAMBOO_BLOCK, blockAndTopForEnds(Blocks.BAMBOO_BLOCK), blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS, blockAndTopForEnds(Blocks.BAMBOO_BLOCK));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB, Blocks.STRIPPED_BAMBOO_BLOCK, blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK), blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRIMSON_SLAB, Blocks.CRIMSON_PLANKS, TextureMap.all(Blocks.CRIMSON_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRIMSON_STAIRS, TextureMap.all(Blocks.CRIMSON_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM, blockAndTopForEnds(Blocks.CRIMSON_STEM), blockAndTopForEnds(Blocks.CRIMSON_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS, blockAndTopForEnds(Blocks.CRIMSON_STEM));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB, Blocks.CRIMSON_HYPHAE, TextureMap.all(Blocks.CRIMSON_STEM), TextureMap.all(Blocks.CRIMSON_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS, TextureMap.all(Blocks.CRIMSON_STEM));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB, Blocks.STRIPPED_CRIMSON_STEM, blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM), blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_CRIMSON_STEM_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB, Blocks.STRIPPED_CRIMSON_HYPHAE, TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM), TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_STAIRS, TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM));


        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WARPED_SLAB, Blocks.WARPED_PLANKS, TextureMap.all(Blocks.WARPED_PLANKS));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WARPED_STAIRS, TextureMap.all(Blocks.WARPED_PLANKS));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WARPED_STEM_SLAB, Blocks.WARPED_STEM, blockAndTopForEnds(Blocks.WARPED_STEM), blockAndTopForEnds(Blocks.WARPED_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WARPED_STEM_STAIRS, blockAndTopForEnds(Blocks.WARPED_STEM));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB, Blocks.WARPED_HYPHAE, TextureMap.all(Blocks.WARPED_STEM), TextureMap.all(Blocks.WARPED_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS, TextureMap.all(Blocks.WARPED_STEM));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB, Blocks.STRIPPED_WARPED_STEM, blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM), blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_WARPED_STEM_STAIRS, blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM));

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB, Blocks.STRIPPED_WARPED_HYPHAE, TextureMap.all(Blocks.STRIPPED_WARPED_STEM), TextureMap.all(Blocks.STRIPPED_WARPED_STEM));
        registerVerticalStairs(bsmg, ModBlocks.VERTICAL_STR_WARPED_HYPHAE_STAIRS, TextureMap.all(Blocks.STRIPPED_WARPED_STEM));


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

    public static TextureMap blockSTB(Block block) {
        return new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_bottom"));
    }
}
