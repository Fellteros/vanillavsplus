package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlockStateModelGenerator {


    public static void registerVerticalSlab(BlockStateModelGenerator bsmg, Block vertSlabBlock, Block fullBlock, TextureMap slabTextureMap) {
        Identifier identifier = ModModels.VERTICAL_SLAB_LEFT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
        Identifier identifier2 = ModModels.VERTICAL_SLAB_RIGHT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
        Identifier identifier3 = Models.CUBE_BOTTOM_TOP.upload(fullBlock, TextureMap.all(fullBlock), bsmg.modelCollector);
        bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, identifier, identifier2, identifier3));
        bsmg.registerParentedItemModel(vertSlabBlock, identifier);
    }




    private static BlockStateSupplier createVerticalSlabBlockState(Block vertSlabBlock, Identifier vertSlabIdLeft, Identifier vertSlabIdRight, Identifier fullBlockId) {
        VariantSetting<Boolean> uvlock = VariantSettings.UVLOCK;
        VariantSetting<VariantSettings.Rotation> y = VariantSettings.Y;
        return VariantsBlockStateSupplier.create(vertSlabBlock).coordinate(BlockStateVariantMap.create(VerticalSlabBlock.FACING, VerticalSlabBlock.SINGLE)
                .register(Direction.NORTH, true, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabIdLeft).put(uvlock, true))
                .register(Direction.SOUTH, true, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabIdRight).put(uvlock, true))
                .register(Direction.EAST, true, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabIdLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(Direction.WEST, true, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabIdRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(Direction.NORTH, false, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true))
                .register(Direction.SOUTH, false, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(Direction.EAST, false, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(Direction.WEST, false, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true).put(y, VariantSettings.Rotation.R270)));
    }
}
