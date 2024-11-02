package net.fellter.vanillavsplus.item;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item VVSP_TITLE = registerItem("vvsp_title", Item::new);

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name), function.apply(new Item.Settings().registryKey(keyOfItem(name))));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name));
    }

    public static void registerModItems() {
        VanillaVSPlus.LOGGER.info("Registering Mod Items for " + VanillaVSPlus.MOD_ID);
    }
}
