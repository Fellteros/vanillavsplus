package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
        public static final TagKey<Block> VERTICAL_STAIRS = createTag("vertical_stairs");
        public static final TagKey<Block> VERTICAL_SLABS = createTag("vertical_slabs");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaVSPlus.MOD_ID, name));
        }
}
