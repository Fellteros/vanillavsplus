package net.fellter.vanillavsplus.util;

import net.fellter.vanillavsplus.VanillaVSPlus;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {

    public static final Model VERTICAL_SLAB = block("vertical_slab", TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM);



    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(VanillaVSPlus.MOD_ID, "blockmodels/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
