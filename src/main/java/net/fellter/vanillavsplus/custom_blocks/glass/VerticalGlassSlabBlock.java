package net.fellter.vanillavsplus.custom_blocks.glass;

import java.util.concurrent.ConcurrentHashMap;

import net.fellter.vanillavsplus.block.VerticalSlabBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.EmptyBlockView;

public class VerticalGlassSlabBlock extends VerticalSlabBlock {
	public VerticalGlassSlabBlock(Settings settings) {
		super(settings);
	}

	protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.empty();
	}

	protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
		return 1.0F;
	}

	protected boolean isTransparent(BlockState state) {
		return true;
	}

	protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
		ConcurrentHashMap<BlockState, VoxelShape> cached = new ConcurrentHashMap<>();
		VoxelShape stateCullingShape = cached.computeIfAbsent(state, s -> s.getOutlineShape(EmptyBlockView.INSTANCE, BlockPos.ORIGIN));
		VoxelShape stateFromCullingShape = cached.computeIfAbsent(state, s -> s.getOutlineShape(EmptyBlockView.INSTANCE, BlockPos.ORIGIN));
		return VoxelShapes.isSideCovered(stateCullingShape, stateFromCullingShape, direction);
	}
}
