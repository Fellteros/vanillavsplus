package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlockStateModelGenerator {


    public static void registerVerticalSlab(BlockStateModelGenerator bsmg, Block vertSlabBlock, Block fullBlock, TextureMap slabTextureMap) {
        Identifier identifier = ModModels.VERTICAL_SLAB.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
        Identifier identifier2 = Models.CUBE_BOTTOM_TOP.upload(fullBlock, TextureMap.all(fullBlock), bsmg.modelCollector);
        bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, identifier, identifier2));
        bsmg.registerParentedItemModel(vertSlabBlock, identifier);
    }




    private static BlockStateSupplier createVerticalSlabBlockState(Block vertSlabBlock, Identifier vertSlabId, Identifier fullBlockId) {
        VariantSetting<Boolean> uvlock = VariantSettings.UVLOCK;
        VariantSetting<VariantSettings.Rotation> y = VariantSettings.Y;
        return VariantsBlockStateSupplier.create(vertSlabBlock).coordinate(BlockStateVariantMap.create(VerticalSlabBlock.FACING, VerticalSlabBlock.VERTICAL_SLAB_TYPE)
                .register(Direction.NORTH, VerticalSlabType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabId).put(uvlock, true))
                .register(Direction.SOUTH, VerticalSlabType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabId).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(Direction.EAST, VerticalSlabType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabId).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(Direction.WEST, VerticalSlabType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, vertSlabId).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, VerticalSlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true))
                .register(Direction.SOUTH, VerticalSlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(Direction.EAST, VerticalSlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(Direction.WEST, VerticalSlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullBlockId).put(uvlock, true).put(y, VariantSettings.Rotation.R270)));
    }
}
