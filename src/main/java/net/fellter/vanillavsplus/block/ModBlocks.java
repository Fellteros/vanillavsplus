package net.fellter.vanillavsplus.block;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_OAK_LOG_SLAB = registerBlock("vertical_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_OAK_WOOD_SLAB = registerBlock("vertical_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block VERTICAL_STR_OAK_LOG_SLAB = registerBlock("vertical_str_oak_log_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block VERTICAL_STR_OAK_WOOD_SLAB = registerBlock("vertical_str_oak_wood_slab",
            new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));


    public static final Block VERTICAL_OAK_STAIRS = registerBlock("vertical_oak_stairs",
            new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), Blocks.OAK_PLANKS.getDefaultState()));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaVSPlus.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
    }
}
