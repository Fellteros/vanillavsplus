package net.fellter.vanillavsplus.custom_blocks.redstone_ore;

import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class VerticalRedstoneOreStairsBlock extends VerticalStairsBlock {
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public VerticalRedstoneOreStairsBlock(Settings settings) {
        super(settings);
    }



    protected void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        light(state, world, pos);
        super.onBlockBreakStart(state, world, pos, player);
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects()) {
            light(state, world, pos);
        }

        super.onSteppedOn(world, pos, state, entity);
    }

    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            spawnParticles(world, pos);
        } else {
            light(state, world, pos);
        }

        return stack.getItem() instanceof BlockItem && (new ItemPlacementContext(player, hand, stack, hit)).canPlace() ? ActionResult.PASS : ActionResult.SUCCESS;
    }

    private static void light(BlockState state, World world, BlockPos pos) {
        spawnParticles(world, pos);
        if (!(Boolean)state.get(LIT)) {
            world.setBlockState(pos, state.with(LIT, true), 3);
        }

    }

    protected boolean hasRandomTicks(BlockState state) {
        return state.get(LIT);
    }

    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            world.setBlockState(pos, state.with(LIT, false), 3);
        }

    }

    protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            this.dropExperienceWhenMined(world, pos, tool, UniformIntProvider.create(1, 5));
        }

    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            spawnParticles(world, pos);
        }

    }

    private static void spawnParticles(World world, BlockPos pos) {
        Random random = world.random;
        Direction[] var5 = Direction.values();

        for (Direction direction : var5) {
            BlockPos blockPos = pos.offset(direction);
            if (!world.getBlockState(blockPos).isOpaqueFullCube()) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5 + 0.5625 * (double) direction.getOffsetX() : (double) random.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5 + 0.5625 * (double) direction.getOffsetY() : (double) random.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5 + 0.5625 * (double) direction.getOffsetZ() : (double) random.nextFloat();
                world.addParticle(DustParticleEffect.DEFAULT, (double) pos.getX() + e, (double) pos.getY() + f, (double) pos.getZ() + g, 0.0, 0.0, 0.0);
            }
        }

    }

    protected void appendProperties(StateManager.@NotNull Builder<Block, BlockState> builder) {
        builder.add(LIT, FACING, SIDE, SHAPE, WATERLOGGED);
    }
}
