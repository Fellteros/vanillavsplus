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
                        entries.add(ModBlocks.VERTICAL_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB);
                        entries.add(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB);




                            })).build());

    public static void registerItemGroups() {
        VanillaVSPlus.LOGGER.info("Registering Item Groups for " + VanillaVSPlus.MOD_ID);
    }
}
