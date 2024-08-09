package net.fellter.vanillavsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        verticalSlabRecipe(ModBlocks.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS).offerTo(exporter);
        verticalSlabRecipe(ModBlocks.VERTICAL_OAK_LOG_SLAB, Blocks.OAK_LOG).offerTo(exporter);
        verticalSlabRecipe(ModBlocks.VERTICAL_OAK_WOOD_SLAB, Blocks.OAK_WOOD).offerTo(exporter);
        verticalSlabRecipe(ModBlocks.VERTICAL_STR_OAK_LOG_SLAB, Blocks.STRIPPED_OAK_LOG).offerTo(exporter);
        verticalSlabRecipe(ModBlocks.VERTICAL_STR_OAK_WOOD_SLAB, Blocks.STRIPPED_OAK_WOOD).offerTo(exporter);
    }

    public static CraftingRecipeJsonBuilder verticalSlabRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
}
