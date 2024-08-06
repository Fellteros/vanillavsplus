package net.fellter.vanillavsplus.item;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VVSP_TITLE = registerItem("vvsp_title", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaVSPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaVSPlus.LOGGER.info("Registering Mod Items for " + VanillaVSPlus.MOD_ID);
    }
}
