package net.fellter.vanillavsplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.fellter.vanillavsplus.block.VerticalSlabBlock;
import net.fellter.vanillavsplus.block.VerticalStairsBlock;
import net.fellter.vanillavsplus.registry.Args;
import net.fellter.vanillavsplus.registry.DatagenArgs;

import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
	public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generate() {
		Registries.BLOCK.stream().filter(VanillaVSPlus::isNamespaced).forEach(block -> {
			if (block.getLootTableKey().isPresent() && Args.DATAGEN_ARGS.containsKey(block)) {
				DatagenArgs datagenArgs = Args.DATAGEN_ARGS.get(block);

				//noinspection IfCanBeSwitch
				if (block instanceof VerticalSlabBlock && datagenArgs.needsSilkTouch) {
					addDrop(block, silkTouchDrops(block));
				} else if (block instanceof VerticalStairsBlock && datagenArgs.needsSilkTouch) {
					addDrop(block, dropsWithSilkTouch(block));
				} else if (block instanceof VerticalSlabBlock) {
					addDrop(block, vertSlabDrops(block));
				} else if (block instanceof VerticalStairsBlock) {
					addDrop(block);
				}
			}
		});
	}

	private LootTable.Builder vertSlabDrops(Block drop) {
		return LootTable.builder().pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
				.with(this.applyExplosionDecay(drop, vertSlabDropsEntry(drop))));
	}

	private LootTable.Builder silkTouchDrops(Block drop) {
		return LootTable.builder().pool(LootPool.builder()
				.conditionally(this.createSilkTouchCondition()).rolls(ConstantLootNumberProvider.create(1.0F))
				.with(vertSlabDropsEntry(drop)));
	}

	private LeafEntry.Builder<?> vertSlabDropsEntry(Block drop) {
		return ItemEntry.builder(drop)
				.apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F))
						.conditionally(BlockStatePropertyLootCondition.builder(drop)
								.properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.SINGLE, true))))
				.apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))
						.conditionally(BlockStatePropertyLootCondition.builder(drop)
								.properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.SINGLE, false))));
	}
}
