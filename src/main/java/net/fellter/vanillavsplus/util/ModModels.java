package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {

    public static final Model VERTICAL_SLAB_LEFT = block("vertical_slab_left", "_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model VERTICAL_SLAB_RIGHT = block("vertical_slab_right", "_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    
    public static final Model STRAIGHT = block("straight", "_straight", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model INNER_TOP = block("inner_top", "_inner_top", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model INNER_BOTTOM = block("inner_bottom", "_inner_bottom", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_TOP_LEFT = block("outer_top_left", "_outer_top_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_BOTTOM_LEFT = block("outer_bottom_left", "_outer_bottom_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_TOP_RIGHT = block("outer_top_right", "_outer_top_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_BOTTOM_RIGHT = block("outer_bottom_right", "_outer_bottom_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);


    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(VanillaVSPlus.MOD_ID, "blockmodels/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(VanillaVSPlus.MOD_ID, "blockmodels/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
