package net.fellter.vanillavsplus.custom_blocks.glass;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

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
//        VanillaVSPlus.LOGGER.info("Side of glass slab covered: {}", VoxelShapes.isSideCovered(state.getCullingFace(direction.getOpposite()), stateFrom.getCullingFace(direction), direction));
        return VoxelShapes.isSideCovered(state.getCullingFace(direction.getOpposite()), stateFrom.getCullingFace(direction), direction);
    }
}
