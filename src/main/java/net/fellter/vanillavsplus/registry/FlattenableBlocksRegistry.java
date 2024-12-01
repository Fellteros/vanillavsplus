package net.fellter.vanillavsplus.registry;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor;
import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import java.util.Map;
import java.util.Objects;

public class FlattenableBlocksRegistry {
    public static final Map<Block, BlockState> FLATTENED_TO_BLOCK_MAP = Maps.newHashMap(new ImmutableMap.Builder<Block, BlockState>().build());

    public static void registerFlattenableBlocks() {
        blockToFlattened(ModBlocks.VERTICAL_GRASS_SLAB, ModBlocks.VERTICAL_DIRT_PATH_SLAB);
        blockToFlattened(ModBlocks.VERTICAL_GRASS_STAIRS, ModBlocks.VERTICAL_DIRT_PATH_STAIRS);
        blockToFlattened(ModBlocks.VERTICAL_PODZOL_SLAB, ModBlocks.VERTICAL_DIRT_PATH_SLAB);
        blockToFlattened(ModBlocks.VERTICAL_PODZOL_STAIRS, ModBlocks.VERTICAL_DIRT_PATH_STAIRS);
        blockToFlattened(ModBlocks.VERTICAL_MYCELIUM_SLAB, ModBlocks.VERTICAL_DIRT_PATH_SLAB);
        blockToFlattened(ModBlocks.VERTICAL_MYCELIUM_STAIRS, ModBlocks.VERTICAL_DIRT_PATH_STAIRS);
        blockToFlattened(ModBlocks.VERTICAL_DIRT_SLAB, ModBlocks.VERTICAL_DIRT_PATH_SLAB);
        blockToFlattened(ModBlocks.VERTICAL_DIRT_STAIRS, ModBlocks.VERTICAL_DIRT_PATH_STAIRS);
        blockToFlattened(ModBlocks.VERTICAL_COARSE_DIRT_SLAB, ModBlocks.VERTICAL_DIRT_PATH_SLAB);
        blockToFlattened(ModBlocks.VERTICAL_COARSE_DIRT_STAIRS, ModBlocks.VERTICAL_DIRT_PATH_STAIRS);
        blockToFlattened(ModBlocks.VERTICAL_ROOTED_DIRT_SLAB, ModBlocks.VERTICAL_DIRT_PATH_SLAB);
        blockToFlattened(ModBlocks.VERTICAL_ROOTED_DIRT_STAIRS, ModBlocks.VERTICAL_DIRT_PATH_STAIRS);

        flattenedToBlock(ModBlocks.VERTICAL_DIRT_PATH_SLAB, ModBlocks.VERTICAL_DIRT_SLAB);
        flattenedToBlock(ModBlocks.VERTICAL_DIRT_PATH_STAIRS, ModBlocks.VERTICAL_DIRT_STAIRS);
        flattenedToBlock(ModBlocks.VERTICAL_FARMLAND_SLAB, ModBlocks.VERTICAL_DIRT_SLAB);
        flattenedToBlock(ModBlocks.VERTICAL_FARMLAND_STAIRS, ModBlocks.VERTICAL_DIRT_STAIRS);
    }

    public static void blockToFlattened(Block input, Block flattened) {
        Objects.requireNonNull(input, "input block cannot be null");
        Objects.requireNonNull(flattened, "flattened block state cannot be null");
        BlockState old = ShovelItemAccessor.getPathStates().put(input, flattened.getDefaultState());
        if (old != null) {
            VanillaVSPlus.LOGGER.debug("Replaced old flattening mapping from {} to {} with {}", input, old, flattened);
        }
    }

    public static void flattenedToBlock(Block flattened, Block output) {
        Objects.requireNonNull(flattened, "flattened block cannot be null");
        Objects.requireNonNull(output, "output block cannot be null");
        BlockState old = FLATTENED_TO_BLOCK_MAP.put(flattened, output.getDefaultState());
        if (old != null) {
            VanillaVSPlus.LOGGER.debug("Replaced old block mapping from {} to {} with {}", flattened, old, output);
        }
    }
}
