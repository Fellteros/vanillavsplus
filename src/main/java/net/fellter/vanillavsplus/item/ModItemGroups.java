package net.fellter.vanillavsplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VVSP_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaVSPlus.MOD_ID, "vvsp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vanillavsplus"))
                    .icon(() -> new ItemStack(ModItems.VVSP_TITLE)).entries(((displayContext, entries) -> {

                        entries.add(ModBlocks.VERTICAL_OAK_SLAB);
                        entries.add(ModBlocks.VERTICAL_OAK_STAIRS);
                        entries.add(ModBlocks.VERTICAL_OAK_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_OAK_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_OAK_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_OAK_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_OAK_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_SPRUCE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SPRUCE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_SPRUCE_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_SPRUCE_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_SPRUCE_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_SPRUCE_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_SPRUCE_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_SPRUCE_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_SPRUCE_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_BIRCH_SLAB);
                        entries.add(ModBlocks.VERTICAL_BIRCH_STAIRS);
                        entries.add(ModBlocks.VERTICAL_BIRCH_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_BIRCH_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_BIRCH_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_BIRCH_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_BIRCH_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_BIRCH_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_BIRCH_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_BIRCH_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_JUNGLE_SLAB);
                        entries.add(ModBlocks.VERTICAL_JUNGLE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_JUNGLE_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_JUNGLE_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_JUNGLE_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_JUNGLE_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_JUNGLE_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_JUNGLE_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_JUNGLE_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_ACACIA_SLAB);
                        entries.add(ModBlocks.VERTICAL_ACACIA_STAIRS);
                        entries.add(ModBlocks.VERTICAL_ACACIA_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_ACACIA_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_ACACIA_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_ACACIA_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_ACACIA_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_ACACIA_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_ACACIA_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_ACACIA_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_DARK_OAK_SLAB);
                        entries.add(ModBlocks.VERTICAL_DARK_OAK_STAIRS);
                        entries.add(ModBlocks.VERTICAL_DARK_OAK_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_DARK_OAK_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_DARK_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_DARK_OAK_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_DARK_OAK_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_DARK_OAK_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_MANGROVE_SLAB);
                        entries.add(ModBlocks.VERTICAL_MANGROVE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_MANGROVE_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_MANGROVE_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_MANGROVE_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_MANGROVE_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_MANGROVE_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_MANGROVE_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_MANGROVE_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_CHERRY_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHERRY_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHERRY_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHERRY_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHERRY_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHERRY_WOOD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_CHERRY_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_CHERRY_LOG_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_CHERRY_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_CHERRY_WOOD_STAIRS);

                        entries.add(ModBlocks.VERTICAL_BAMBOO_SLAB);
                        entries.add(ModBlocks.VERTICAL_BAMBOO_STAIRS);
                        entries.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB);
                        entries.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_STAIRS);
                        entries.add(ModBlocks.VERTICAL_BAMBOO_BLOCK_SLAB);
                        entries.add(ModBlocks.VERTICAL_BAMBOO_BLOCK_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_BAMBOO_BLOCK_STAIRS);

                        entries.add(ModBlocks.VERTICAL_CRIMSON_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRIMSON_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CRIMSON_STEM_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRIMSON_STEM_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRIMSON_HYPHAE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_CRIMSON_STEM_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_CRIMSON_STEM_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_CRIMSON_HYPHAE_STAIRS);

                        entries.add(ModBlocks.VERTICAL_WARPED_SLAB);
                        entries.add(ModBlocks.VERTICAL_WARPED_STAIRS);
                        entries.add(ModBlocks.VERTICAL_WARPED_STEM_SLAB);
                        entries.add(ModBlocks.VERTICAL_WARPED_STEM_STAIRS);
                        entries.add(ModBlocks.VERTICAL_WARPED_HYPHAE_SLAB);
                        entries.add(ModBlocks.VERTICAL_WARPED_HYPHAE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_WARPED_STEM_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_WARPED_STEM_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_WARPED_HYPHAE_STAIRS);
                        
                        entries.add(ModBlocks.VERTICAL_STONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_STONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_COBBLESTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_STONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRACKED_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICKS_STAIRS);

                        entries.add(ModBlocks.VERTICAL_GRANITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_GRANITE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_GRANITE_STAIRS);

                        entries.add(ModBlocks.VERTICAL_DIORITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_DIORITE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_DIORITE_STAIRS);

                        entries.add(ModBlocks.VERTICAL_ANDESITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_ANDESITE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_STAIRS);

                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_TILES_SLAB);
                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_TILES_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRACKED_DEEPSLATE_TILES_STAIRS);

                        entries.add(ModBlocks.VERTICAL_TUFF_SLAB);
                        entries.add(ModBlocks.VERTICAL_TUFF_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_TUFF_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_TUFF_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_TUFF_STAIRS);
                        entries.add(ModBlocks.VERTICAL_TUFF_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_TUFF_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_TUFF_BRICKS_STAIRS);
                        
                        entries.add(ModBlocks.VERTICAL_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_PACKED_MUD_SLAB);
                        entries.add(ModBlocks.VERTICAL_PACKED_MUD_STAIRS);
                        entries.add(ModBlocks.VERTICAL_MUD_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_MUD_BRICKS_STAIRS);

                        entries.add(ModBlocks.VERTICAL_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CUT_SANDSTONE_STAIRS);

                        entries.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_STAIRS);
                        
                        entries.add(ModBlocks.VERTICAL_SEA_LANTERN_SLAB);
                        entries.add(ModBlocks.VERTICAL_SEA_LANTERN_STAIRS);
                        entries.add(ModBlocks.VERTICAL_PRISMARINE_SLAB);
                        entries.add(ModBlocks.VERTICAL_PRISMARINE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_PRISMARINE_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB);
                        entries.add(ModBlocks.VERTICAL_DARK_PRISMARINE_STAIRS);
                        
                        entries.add(ModBlocks.VERTICAL_NETHERRACK_SLAB);
                        entries.add(ModBlocks.VERTICAL_NETHERRACK_STAIRS);
                        entries.add(ModBlocks.VERTICAL_NETHER_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_NETHER_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRACKED_NETHER_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_NETHER_BRICKS_STAIRS);
                        entries.add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_RED_NETHER_BRICKS_STAIRS);

                        entries.add(ModBlocks.VERTICAL_BASALT_SLAB);
                        entries.add(ModBlocks.VERTICAL_BASALT_STAIRS);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_BASALT_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_BASALT_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BASALT_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BASALT_STAIRS);

                        entries.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_GILDED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHISELED_POLISHED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICKS_STAIRS);




                            })).build());

    public static void registerItemGroups() {
        VanillaVSPlus.LOGGER.info("Registering Item Groups for " + VanillaVSPlus.MOD_ID);
    }
}
