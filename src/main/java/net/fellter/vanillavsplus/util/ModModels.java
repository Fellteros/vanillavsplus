package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {

    public static final Model VERTICAL_SLAB_LEFT = block("vertical_slab_left", "_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model VERTICAL_SLAB_RIGHT = block("vertical_slab_right", "_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    
    public static final Model STRAIGHT_LEFT = block("straight_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model INNER_TOP_LEFT = block("inner_top_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model INNER_BOTTOM_LEFT = block("inner_bottom_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_TOP_LEFT = block("outer_top_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_BOTTOM_LEFT = block("outer_bottom_left", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_TOP_LEFT_R90 = block("outer_top_left_r90", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_BOTTOM_LEFT_R90 = block("outer_bottom_left_r90", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model STRAIGHT_RIGHT = block("straight_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model INNER_TOP_RIGHT = block("inner_top_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model INNER_BOTTOM_RIGHT = block("inner_bottom_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_TOP_RIGHT = block("outer_top_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_BOTTOM_RIGHT = block("outer_bottom_right", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_TOP_RIGHT_R90 = block("outer_top_right_r90", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model OUTER_BOTTOM_RIGHT_R90 = block("outer_bottom_right_r90", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);


    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(VanillaVSPlus.MOD_ID, "blockmodels/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(VanillaVSPlus.MOD_ID, "blockmodels/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
