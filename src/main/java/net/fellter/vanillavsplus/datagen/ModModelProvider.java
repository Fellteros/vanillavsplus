package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.fellter.vanillavsplus.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

import static net.fellter.vanillavsplus.util.ModBlockStateModelGenerator.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {

        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS, TextureMap.all(Blocks.OAK_PLANKS));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_LOG_SLAB, Blocks.OAK_LOG, blockAndTopForEnds(Blocks.OAK_LOG), blockAndTopForEnds(Blocks.OAK_LOG));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_OAK_WOOD_SLAB, Blocks.OAK_WOOD, TextureMap.all(Blocks.OAK_LOG), TextureMap.all(Blocks.OAK_LOG));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG, blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG), blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG));
        registerVerticalSlab(bsmg, ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB, Blocks.STRIPPED_OAK_WOOD, TextureMap.all(Blocks.STRIPPED_OAK_LOG), TextureMap.all(Blocks.STRIPPED_OAK_LOG));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VVSP_TITLE, Models.GENERATED);
    }

    public static TextureMap blockAndTopForEnds(Block block) {
        return new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.SIDE, TextureMap.getId(block))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_top"));
    }
}
