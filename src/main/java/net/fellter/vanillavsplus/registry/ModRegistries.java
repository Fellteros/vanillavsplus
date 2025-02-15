
package net.fellter.vanillavsplus.registry;

import java.util.Map;
import java.util.Objects;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.FoliageColors;
import net.minecraft.world.biome.GrassColors;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.TillableBlockRegistry;
import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

public class ModRegistries {

	public static void registerFlammables() {
		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.burn != null && args.spread != null) {
					FlammableBlockRegistry.getDefaultInstance().add(block, args.burn, args.spread);
				}
			}
		});
	}

	public static final Map<Block, BlockState> FLATTENED_TO_BLOCK_MAP = Maps.newHashMap(new ImmutableMap.Builder<Block, BlockState>().build());

	public static void registerFlattenableBlocks() {

		flattenedToBlock(ModBlocks.VERTICAL_DIRT_PATH_SLAB, ModBlocks.VERTICAL_DIRT_SLAB);
		flattenedToBlock(ModBlocks.VERTICAL_DIRT_PATH_STAIRS, ModBlocks.VERTICAL_DIRT_STAIRS);
		flattenedToBlock(ModBlocks.VERTICAL_FARMLAND_SLAB, ModBlocks.VERTICAL_DIRT_SLAB);
		flattenedToBlock(ModBlocks.VERTICAL_FARMLAND_STAIRS, ModBlocks.VERTICAL_DIRT_STAIRS);

		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.flattened != null) {
					blockToFlattened(block, args.flattened);
				}
			}
		});
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

	public static void registerFoliage() {
		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID)) {
					if (args.grassTinted) {
						ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> {
									if (world == null || pos == null) {
										return GrassColors.getDefaultColor();
									}
									return BiomeColors.getGrassColor(world, pos);
								}), block
						);
					}
					if (args.foliageTinted) {
						ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> {
									if (world == null || pos == null) {
										return FoliageColors.DEFAULT;
									}
									return BiomeColors.getFoliageColor(world, pos);
								}), block
						);
					}
				}
			}
		});
	}


	public static void registerFuel() {
		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.fuel) {
					FuelRegistryEvents.BUILD.register((builder, context) -> builder.add(block, context.baseSmeltTime()));
				}
			}
		});
	}


	public static void registerOxidizables() {

		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.oxidizables != null) {
					OxidizableBlocksRegistry.registerOxidizableBlockPair(block, args.exposed);
					OxidizableBlocksRegistry.registerOxidizableBlockPair(args.exposed, args.weathered);
					OxidizableBlocksRegistry.registerOxidizableBlockPair(args.weathered, args.oxidized);

					OxidizableBlocksRegistry.registerWaxableBlockPair(block, args.waxed);
					OxidizableBlocksRegistry.registerWaxableBlockPair(args.exposed, args.exposedWaxed);
					OxidizableBlocksRegistry.registerWaxableBlockPair(args.weathered, args.weatheredWaxed);
					OxidizableBlocksRegistry.registerWaxableBlockPair(args.oxidized, args.oxidizedWaxed);
				}
			}
		});
	}


	public static void registerTillableBlocks() {
		TillableBlockRegistry.register(ModBlocks.VERTICAL_ROOTED_DIRT_SLAB, context -> true, HoeItem.createTillAndDropAction(ModBlocks.VERTICAL_DIRT_SLAB.getDefaultState(), Items.HANGING_ROOTS));
		TillableBlockRegistry.register(ModBlocks.VERTICAL_ROOTED_DIRT_STAIRS, context -> true, HoeItem.createTillAndDropAction(ModBlocks.VERTICAL_DIRT_STAIRS.getDefaultState(), Items.HANGING_ROOTS));
		TillableBlockRegistry.register(ModBlocks.VERTICAL_COARSE_DIRT_SLAB, context -> true, HoeItem.createTillAction(ModBlocks.VERTICAL_DIRT_SLAB.getDefaultState()));
		TillableBlockRegistry.register(ModBlocks.VERTICAL_COARSE_DIRT_STAIRS, context -> true, HoeItem.createTillAction(ModBlocks.VERTICAL_DIRT_STAIRS.getDefaultState()));

		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.tilled != null && args.tillDrop != null) {
					TillableBlockRegistry.register(block, HoeItem::canTillFarmland, HoeItem.createTillAndDropAction(args.tilled.getDefaultState(), args.tillDrop));
				}
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.tilled != null) {
					TillableBlockRegistry.register(block, HoeItem::canTillFarmland, HoeItem.createTillAction(args.tilled.getDefaultState()));
				}
			}
		});
	}

	public static void registerTranslucentBlocks() {
		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.translucent) {
					BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
				}
			}
		});
	}

	public static void registerTransparentBlocks() {
		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.transparent) {
					BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
				}
			}
		});
	}

	public static void register(Block input, Block stripped) {
		Block old = getRegistry().put(input, stripped);

		if (old != null) {
			VanillaVSPlus.LOGGER.debug("Replaced old stripping mapping from {} to {} with {}", input, old, stripped);
		}
	}

	private static Map<Block, Block> getRegistry() {
		return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
	}

	public static void registerStrippableBlocks() {

//            register(ModBlocks.VERTICAL_OAK_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_OAK_LOG_SLAB);
//            register(ModBlocks.VERTICAL_OAK_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_OAK_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_OAK_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_OAK_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_OAK_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_OAK_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_SPRUCE_LOG_SLAB);
//            register(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_SPRUCE_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_SPRUCE_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_SPRUCE_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_BIRCH_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_BIRCH_LOG_SLAB);
//            register(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_BIRCH_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_BIRCH_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_BIRCH_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_JUNGLE_LOG_SLAB);
//            register(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_JUNGLE_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_JUNGLE_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_JUNGLE_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_ACACIA_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_ACACIA_LOG_SLAB);
//            register(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_ACACIA_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_ACACIA_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_ACACIA_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_LOG_SLAB);
//            register(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_DARK_OAK_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_MANGROVE_LOG_SLAB);
//            register(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_MANGROVE_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_MANGROVE_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_MANGROVE_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_CHERRY_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_CHERRY_LOG_SLAB);
//            register(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_CHERRY_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_CHERRY_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_CHERRY_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_PALE_OAK_LOG_SLAB, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_LOG_SLAB);
//            register(ModBlocks.VERTICAL_PALE_OAK_LOG_STAIRS, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_LOG_STAIRS);
//            register(ModBlocks.VERTICAL_PALE_OAK_WOOD_SLAB, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_WOOD_SLAB);
//            register(ModBlocks.VERTICAL_PALE_OAK_WOOD_STAIRS, ModBlocks.VERTICAL_STRIPPED_PALE_OAK_WOOD_STAIRS);
//
//            register(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB, ModBlocks.VERTICAL_STRIPPED_BAMBOO_BLOCK_SLAB);
//            register(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS, ModBlocks.VERTICAL_STRIPPED_BAMBOO_BLOCK_STAIRS);
//
//            register(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB, ModBlocks.VERTICAL_STRIPPED_CRIMSON_STEM_SLAB);
//            register(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS, ModBlocks.VERTICAL_STRIPPED_CRIMSON_STEM_STAIRS);
//            register(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB, ModBlocks.VERTICAL_STRIPPED_CRIMSON_HYPHAE_SLAB);
//            register(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS, ModBlocks.VERTICAL_STRIPPED_CRIMSON_HYPHAE_STAIRS);
//
//            register(ModBlocks.VERTICAL_WARPED_STEM_SLAB, ModBlocks.VERTICAL_STRIPPED_WARPED_STEM_SLAB);
//            register(ModBlocks.VERTICAL_WARPED_STEM_STAIRS, ModBlocks.VERTICAL_STRIPPED_WARPED_STEM_STAIRS);
//            register(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB, ModBlocks.VERTICAL_STRIPPED_WARPED_HYPHAE_SLAB);
//            register(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS, ModBlocks.VERTICAL_STRIPPED_WARPED_HYPHAE_STAIRS);

		Registries.BLOCK.forEach(block -> {
			if (Args.REGISTRY_ARGS.containsKey(block)) {
				Identifier identifier = Registries.BLOCK.getId(block);
				RegistryArgs args = Args.REGISTRY_ARGS.get(block);
				if (identifier.getNamespace().equals(VanillaVSPlus.MOD_ID) && args.stripped != null) {
					register(block, args.stripped);
				}
			}
		});

	}
}
