package net.fellter.vanillavsplus.registry;

import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.block.Block;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class VVSPStrippableRegistry {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(VVSPStrippableRegistry.class);
    public static void register(Block input, Block stripped) {
        Block old = getRegistry().put(input, stripped);

        if (old != null) {
            LOGGER.debug("Replaced old stripping mapping from {} to {} with {}", input, old, stripped);
        }
    }

    private static Map<Block, Block> getRegistry() {
        return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
    }

    public static void registerStrippableBlocks() {
        register(ModBlocks.VERTICAL_OAK_LOG_SLAB, ModBlocks.VERTICAL_STR_OAK_LOG_SLAB);
        register(ModBlocks.VERTICAL_OAK_LOG_STAIRS, ModBlocks.VERTICAL_STR_OAK_LOG_STAIRS);
        register(ModBlocks.VERTICAL_OAK_WOOD_SLAB, ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB);
        register(ModBlocks.VERTICAL_OAK_WOOD_STAIRS, ModBlocks.VERTICAL_STR_OAK_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB, ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB);
        register(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS, ModBlocks.VERTICAL_STR_SPRUCE_LOG_STAIRS);
        register(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB, ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB);
        register(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS, ModBlocks.VERTICAL_STR_SPRUCE_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_BIRCH_LOG_SLAB, ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB);
        register(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS, ModBlocks.VERTICAL_STR_BIRCH_LOG_STAIRS);
        register(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB, ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB);
        register(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS, ModBlocks.VERTICAL_STR_BIRCH_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB, ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB);
        register(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS, ModBlocks.VERTICAL_STR_JUNGLE_LOG_STAIRS);
        register(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB, ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB);
        register(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS, ModBlocks.VERTICAL_STR_JUNGLE_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_ACACIA_LOG_SLAB, ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB);
        register(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS, ModBlocks.VERTICAL_STR_ACACIA_LOG_STAIRS);
        register(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB, ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB);
        register(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS, ModBlocks.VERTICAL_STR_ACACIA_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB, ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB);
        register(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS, ModBlocks.VERTICAL_STR_DARK_OAK_LOG_STAIRS);
        register(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB, ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB);
        register(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS, ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB, ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB);
        register(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS, ModBlocks.VERTICAL_STR_MANGROVE_LOG_STAIRS);
        register(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB, ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB);
        register(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS, ModBlocks.VERTICAL_STR_MANGROVE_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_CHERRY_LOG_SLAB, ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB);
        register(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS, ModBlocks.VERTICAL_STR_CHERRY_LOG_STAIRS);
        register(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB, ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB);
        register(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS, ModBlocks.VERTICAL_STR_CHERRY_WOOD_STAIRS);

        register(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB, ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB);
        register(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS, ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_STAIRS);

        register(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB, ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB);
        register(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS, ModBlocks.VERTICAL_STR_CRIMSON_STEM_STAIRS);
        register(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB, ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB);
        register(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS, ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_STAIRS);

        register(ModBlocks.VERTICAL_WARPED_STEM_SLAB, ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB);
        register(ModBlocks.VERTICAL_WARPED_STEM_STAIRS, ModBlocks.VERTICAL_STR_WARPED_STEM_STAIRS);
        register(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB, ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB);
        register(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS, ModBlocks.VERTICAL_STR_WARPED_HYPHAE_STAIRS);
    }

}
