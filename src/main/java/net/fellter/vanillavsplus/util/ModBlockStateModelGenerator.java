package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.block.BlockSide;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairShape;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlockStateModelGenerator {


    public static void registerVerticalSlab(BlockStateModelGenerator bsmg, Block vertSlabBlock, Block fullBlock, TextureMap slabTextureMap) {
        Identifier identifier = ModModels.VERTICAL_SLAB_LEFT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
        Identifier identifier2 = ModModels.VERTICAL_SLAB_RIGHT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
        bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, identifier, identifier2, TextureMap.getId(fullBlock)));
        bsmg.registerParentedItemModel(vertSlabBlock, identifier2);
    }


    public static void registerVerticalStairs(BlockStateModelGenerator bsmg, Block vertStairsBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.STRAIGHT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
        Identifier identifier2 = ModModels.INNER_TOP.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
        Identifier identifier3 = ModModels.INNER_BOTTOM.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
        Identifier identifier4 = ModModels.OUTER_TOP_LEFT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
        Identifier identifier5 = ModModels.OUTER_BOTTOM_LEFT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
        Identifier identifier6 = ModModels.OUTER_TOP_RIGHT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
        Identifier identifier7 = ModModels.OUTER_BOTTOM_RIGHT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
        bsmg.blockStateCollector.accept(createVerticalStairsBlockState(vertStairsBlock, identifier, identifier2, identifier3, identifier4, identifier5, identifier6, identifier7));
        bsmg.registerParentedItemModel(vertStairsBlock, identifier);
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



    private static BlockStateSupplier createVerticalStairsBlockState(Block vertStairsBlock, Identifier straightLeft, Identifier innerTopLeft,
                                                                     Identifier innerBottomLeft, Identifier outerTopLeft, Identifier outerBottomLeft,
                                                                     Identifier outerTopRight, Identifier outerBottomRight) {
        VariantSetting<Boolean> uvlock = VariantSettings.UVLOCK;
        VariantSetting<VariantSettings.Rotation> y = VariantSettings.Y;
        VariantSetting<VariantSettings.Rotation> x = VariantSettings.X;
        VariantSetting<Identifier> model = VariantSettings.MODEL;
        return VariantsBlockStateSupplier.create(vertStairsBlock).coordinate(BlockStateVariantMap.create(VerticalStairsBlock.SIDE, VerticalStairsBlock.FACING, VerticalStairsBlock.SHAPE)
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))

                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))

                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))

                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R0))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R0))


                
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))

                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true))

                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))

                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))


                //right
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))

                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true))

                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R90))

                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.STRAIGHT_RIGHT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_TOP_RIGHT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT_R90, BlockStateVariant.create().put(model, outerTopRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, BlockStateVariant.create().put(model, outerBottomRight).put(uvlock, true).put(y, VariantSettings.Rotation.R180))





                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))

                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R90))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))

                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R180))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))

                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.STRAIGHT_LEFT, BlockStateVariant.create().put(model, straightLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_TOP_LEFT, BlockStateVariant.create().put(model, innerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_LEFT, BlockStateVariant.create().put(model, innerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R270))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT_R90, BlockStateVariant.create().put(model, outerTopLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R0))
                .register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, BlockStateVariant.create().put(model, outerBottomLeft).put(uvlock, true).put(y, VariantSettings.Rotation.R0)));
    }
}
