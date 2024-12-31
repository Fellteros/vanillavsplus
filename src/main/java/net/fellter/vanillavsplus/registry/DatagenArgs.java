package net.fellter.vanillavsplus.registry;

import net.minecraft.block.Block;
import net.minecraft.client.data.TextureMap;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.TagKey;

import java.util.List;

public final class DatagenArgs {
    public List<TagKey<Block>> blockTags;
    public TextureMap textureMap;
    public Block parentBlock;
    public Block fullTextureBlock;
    public TintSource tintSource;
    public Boolean y15 = false;

    public DatagenArgs() {
    }

    public DatagenArgs create() {
        return new DatagenArgs();
    }

    @SafeVarargs
    public final DatagenArgs blockTags(TagKey<Block> ... blockTags) {
        this.blockTags = List.of(blockTags);
        return this;
    }

    public DatagenArgs parentBlock(Block parentBlock) {
        this.parentBlock = parentBlock;
        this.fullTextureBlock = parentBlock;
        return this;
    }

    public DatagenArgs parentBlock(Block parentBlock, Block fullTextureBlock) {
        this.parentBlock = parentBlock;
        this.fullTextureBlock = fullTextureBlock;
        return this;
    }

    public DatagenArgs textureMap(TextureMap textureMap) {
        this.textureMap = textureMap;
        return this;
    }

    public DatagenArgs tintSource(TintSource tintSource) {
        this.tintSource = tintSource;
        return this;
    }

    public DatagenArgs y15() {
        this.y15 = true;
        return this;
    }

}
