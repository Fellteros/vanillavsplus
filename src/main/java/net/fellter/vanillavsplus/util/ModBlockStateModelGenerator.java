package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.block.BlockSide;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairShape;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;

import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.client.render.model.json.ModelVariantOperator;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.AxisRotation;
import net.minecraft.util.math.Direction;

public class ModBlockStateModelGenerator {
	public static WeightedVariant varOf(Identifier id) {
		return BlockStateModelGenerator.createWeightedVariant(id);
	}

	public static void registerVerticalSlab(BlockStateModelGenerator bsmg, Block vertSlabBlock, Block fullBlock, TextureMap slabTextureMap) {
		Identifier identifier = ModModels.VERTICAL_SLAB_LEFT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.VERTICAL_SLAB_RIGHT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, varOf(identifier), varOf(identifier2), varOf(TextureMap.getId(fullBlock))));
		bsmg.registerParentedItemModel(vertSlabBlock, identifier2);
	}

	public static void registerVerticalSlab(BlockStateModelGenerator bsmg, Block vertSlabBlock, Identifier fullBlock, TextureMap slabTextureMap) {
		Identifier identifier = ModModels.VERTICAL_SLAB_LEFT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.VERTICAL_SLAB_RIGHT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, varOf(identifier), varOf(identifier2), varOf(fullBlock)));
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
		bsmg.blockStateCollector.accept(createVerticalStairsBlockState(vertStairsBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), varOf(identifier6), varOf(identifier7)));
		bsmg.registerParentedItemModel(vertStairsBlock, identifier);
	}

	public static void registerVerticalSlab15(BlockStateModelGenerator bsmg, Block vertSlabBlock, Block fullBlock, TextureMap slabTextureMap) {
		Identifier identifier = ModModels.VERTICAL_SLAB_LEFT_15.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.VERTICAL_SLAB_RIGHT_15.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, varOf(identifier), varOf(identifier2), varOf(TextureMap.getId(fullBlock))));
		bsmg.registerParentedItemModel(vertSlabBlock, identifier2);
	}

	public static void registerVerticalStairs15(BlockStateModelGenerator bsmg, Block vertStairsBlock, TextureMap textureMap) {
		Identifier identifier = ModModels.STRAIGHT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.INNER_TOP_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier3 = ModModels.INNER_BOTTOM_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier4 = ModModels.OUTER_TOP_LEFT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier5 = ModModels.OUTER_BOTTOM_LEFT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier6 = ModModels.OUTER_TOP_RIGHT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier7 = ModModels.OUTER_BOTTOM_RIGHT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalStairsBlockState(vertStairsBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), varOf(identifier6), varOf(identifier7)));
		bsmg.registerParentedItemModel(vertStairsBlock, identifier);
	}

	public static void registerVerticalSlab(BlockStateModelGenerator bsmg, Block vertSlabBlock, Block fullBlock, TextureMap slabTextureMap, TintSource tintSource) {
		Identifier identifier = ModModels.VERTICAL_SLAB_LEFT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.VERTICAL_SLAB_RIGHT.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, varOf(identifier), varOf(identifier2), varOf(TextureMap.getId(fullBlock))));
		bsmg.registerTintedItemModel(vertSlabBlock, identifier2, tintSource);
	}

	public static void registerVerticalStairs(BlockStateModelGenerator bsmg, Block vertStairsBlock, TextureMap textureMap, TintSource tintSource) {
		Identifier identifier = ModModels.STRAIGHT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.INNER_TOP.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier3 = ModModels.INNER_BOTTOM.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier4 = ModModels.OUTER_TOP_LEFT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier5 = ModModels.OUTER_BOTTOM_LEFT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier6 = ModModels.OUTER_TOP_RIGHT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier7 = ModModels.OUTER_BOTTOM_RIGHT.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalStairsBlockState(vertStairsBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), varOf(identifier6), varOf(identifier7)));
		bsmg.registerTintedItemModel(vertStairsBlock, identifier, tintSource);
	}

	public static void registerVerticalSlab15(BlockStateModelGenerator bsmg, Block vertSlabBlock, Block fullBlock, TextureMap slabTextureMap, TintSource tintSource) {
		Identifier identifier = ModModels.VERTICAL_SLAB_LEFT_15.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.VERTICAL_SLAB_RIGHT_15.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalSlabBlockState(vertSlabBlock, varOf(identifier), varOf(identifier2), varOf(TextureMap.getId(fullBlock))));
		bsmg.registerTintedItemModel(vertSlabBlock, ModModels.VERTICAL_SLAB_RIGHT_15.upload(vertSlabBlock, slabTextureMap, bsmg.modelCollector), tintSource);
	}

	public static void registerVerticalStairs15(BlockStateModelGenerator bsmg, Block vertStairsBlock, TextureMap textureMap, TintSource tintSource) {
		Identifier identifier = ModModels.STRAIGHT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier2 = ModModels.INNER_TOP_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier3 = ModModels.INNER_BOTTOM_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier4 = ModModels.OUTER_TOP_LEFT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier5 = ModModels.OUTER_BOTTOM_LEFT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier6 = ModModels.OUTER_TOP_RIGHT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		Identifier identifier7 = ModModels.OUTER_BOTTOM_RIGHT_15.upload(vertStairsBlock, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(createVerticalStairsBlockState(vertStairsBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), varOf(identifier6), varOf(identifier7)));
		bsmg.registerTintedItemModel(vertStairsBlock, identifier, tintSource);
	}

	private static BlockModelDefinitionCreator createVerticalSlabBlockState(Block vertSlabBlock, WeightedVariant vertSlabIdLeft, WeightedVariant vertSlabIdRight, WeightedVariant fullBlockId) {
		ModelVariantOperator r90 = ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90);
		ModelVariantOperator uvlock = ModelVariantOperator.UV_LOCK.withValue(true);
		return VariantsBlockModelDefinitionCreator.of(vertSlabBlock).with(BlockStateVariantMap.models(VerticalSlabBlock.FACING, VerticalSlabBlock.SINGLE)
				.register(Direction.NORTH, true, vertSlabIdLeft.apply(uvlock))
				.register(Direction.SOUTH, true, vertSlabIdRight.apply(uvlock))
				.register(Direction.EAST, true, vertSlabIdLeft.apply(uvlock).apply(r90))
				.register(Direction.WEST, true, vertSlabIdRight.apply(uvlock).apply(r90))
				.register(Direction.NORTH, false, fullBlockId.apply(uvlock))
				.register(Direction.SOUTH, false, fullBlockId.apply(uvlock))
				.register(Direction.EAST, false, fullBlockId.apply(uvlock))
				.register(Direction.WEST, false, fullBlockId.apply(uvlock)));
	}

	private static BlockModelDefinitionCreator createVerticalStairsBlockState(Block vertStairsBlock, WeightedVariant straight, WeightedVariant innerTopLeft, WeightedVariant innerBottomLeft, WeightedVariant outerTopLeft, WeightedVariant outerBottomLeft, WeightedVariant outerTopRight, WeightedVariant outerBottomRight) {
		ModelVariantOperator uvlock = ModelVariantOperator.UV_LOCK.withValue(true);
		ModelVariantOperator y90 = ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90);
		ModelVariantOperator y180 = ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R180);
		ModelVariantOperator y270 = ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R270);
		return VariantsBlockModelDefinitionCreator.of(vertStairsBlock).with(BlockStateVariantMap.models(VerticalStairsBlock.SIDE, VerticalStairsBlock.FACING, VerticalStairsBlock.SHAPE)
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock).apply(y90))

				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock).apply(y180))

				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock).apply(y270))

				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock))

				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock).apply(y270))

				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock))
				.register(BlockSide.LEFT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock))

				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock).apply(y90))
				.register(BlockSide.LEFT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock).apply(y90))

				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock).apply(y270))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock).apply(y180))
				.register(BlockSide.LEFT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock).apply(y180))

				//right
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock).apply(y270))

				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock))

				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock).apply(y90))

				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.STRAIGHT_RIGHT, straight.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_TOP_RIGHT, innerTopLeft.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_RIGHT, innerBottomLeft.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT, outerTopRight.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT, outerBottomRight.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_RIGHT_R90, outerTopRight.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_RIGHT_R90, outerBottomRight.apply(uvlock).apply(y180))

				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.NORTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock).apply(y90))

				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock).apply(y90))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.EAST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock).apply(y180))

				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock).apply(y180))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.SOUTH, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock).apply(y270))

				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.STRAIGHT_LEFT, straight.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_TOP_LEFT, innerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.INNER_BOTTOM_LEFT, innerBottomLeft.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT, outerTopLeft.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT, outerBottomLeft.apply(uvlock).apply(y270))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_TOP_LEFT_R90, outerTopLeft.apply(uvlock))
				.register(BlockSide.RIGHT, Direction.WEST, VerticalStairShape.OUTER_BOTTOM_LEFT_R90, outerBottomLeft.apply(uvlock)));
	}
}
