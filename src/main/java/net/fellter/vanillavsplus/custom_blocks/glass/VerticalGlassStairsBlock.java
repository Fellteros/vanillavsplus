package net.fellter.vanillavsplus.custom_blocks.glass;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.fellter.vanillavsplus.block.VerticalStairsBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.EmptyBlockView;

public class VerticalGlassStairsBlock extends VerticalStairsBlock {
    protected static final Map<BlockState, VoxelShape> CACHED = new ConcurrentHashMap<>();
    protected VoxelShape getCached(BlockState state) {
        return CACHED.computeIfAbsent(state, s -> s.getOutlineShape(EmptyBlockView.INSTANCE, BlockPos.ORIGIN));
    }

    public VerticalGlassStairsBlock(Settings settings) {
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
        VoxelShape stateCullingShape = getCached(state);
        VoxelShape stateFromCullingShape = getCached(stateFrom);
        return VoxelShapes.isSideCovered(stateCullingShape, stateFromCullingShape, direction);
    }
}
