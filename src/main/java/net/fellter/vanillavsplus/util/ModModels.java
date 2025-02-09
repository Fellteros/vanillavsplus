package net.fellter.vanillavsplus.util;

import java.util.Optional;

import net.fellter.vanillavsplus.VanillaVSPlus;

import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.util.Identifier;

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

	public static final Model VERTICAL_SLAB_LEFT_15 = block15("vertical_slab_left_15", "_left_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
	public static final Model VERTICAL_SLAB_RIGHT_15 = block15("vertical_slab_right_15", "_right_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);

	public static final Model STRAIGHT_15 = block15("straight_15", "_straight_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
	public static final Model INNER_TOP_15 = block15("inner_top_15", "_inner_top_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
	public static final Model INNER_BOTTOM_15 = block15("inner_bottom_15", "_inner_bottom_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
	public static final Model OUTER_TOP_LEFT_15 = block15("outer_top_left_15", "_outer_top_left_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
	public static final Model OUTER_BOTTOM_LEFT_15 = block15("outer_bottom_left_15", "_outer_bottom_left_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
	public static final Model OUTER_TOP_RIGHT_15 = block15("outer_top_right_15", "_outer_top_right_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);
	public static final Model OUTER_BOTTOM_RIGHT_15 = block15("outer_bottom_right_15", "_outer_bottom_right_15", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);

	private static Model block15(String parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(Identifier.of(VanillaVSPlus.MOD_ID, "blockmodels/15/" + parent)), Optional.of(variant), requiredTextureKeys);
	}

	private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(Identifier.of(VanillaVSPlus.MOD_ID, "blockmodels/" + parent)), Optional.of(variant), requiredTextureKeys);
	}
}
