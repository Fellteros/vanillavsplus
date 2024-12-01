package net.fellter.vanillavsplus.custom_blocks.glass;

import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class VerticalGlassStairsBlock extends VerticalStairsBlock {
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
}
