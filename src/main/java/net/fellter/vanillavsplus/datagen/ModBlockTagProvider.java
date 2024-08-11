package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.util.ModTags;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

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
        ;
    }
}
