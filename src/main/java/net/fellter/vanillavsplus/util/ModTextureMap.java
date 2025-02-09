package net.fellter.vanillavsplus.util;

import net.minecraft.block.Block;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.util.Identifier;

public class ModTextureMap {
	public static TextureMap blockAndTopForEnds(Block block) {
		return new TextureMap()
				.put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
				.put(TextureKey.SIDE, TextureMap.getId(block))
				.put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_top"));
	}

	public static TextureMap sideAndTopForEnds(Block block) {
		return new TextureMap()
				.put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
				.put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"))
				.put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_top"));
	}

	public static TextureMap allWithSuffix(Block block, String suffix) {
		return new TextureMap()
				.put(TextureKey.ALL, TextureMap.getSubId(block, suffix));
	}

	public static TextureMap blockTB(Block block) {
		return new TextureMap()
				.put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
				.put(TextureKey.SIDE, TextureMap.getId(block))
				.put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_bottom"));
	}

	public static TextureMap blockSTB(Block block) {
		return new TextureMap()
				.put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
				.put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"))
				.put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_bottom"));
	}

	public static TextureMap blockSTB(Identifier block) {
		return new TextureMap()
				.put(TextureKey.TOP, Identifier.of(block + "_top"))
				.put(TextureKey.SIDE, Identifier.of(block + "_side"))
				.put(TextureKey.BOTTOM, Identifier.of(block + "_bottom"));
	}

	public static TextureMap custom(Block sideBlock, Block topBlock, Block bottomBlock, String sideSuffix, String topSuffix, String bottomSuffix) {
		return new TextureMap()
				.put(TextureKey.SIDE, TextureMap.getSubId(sideBlock, sideSuffix))
				.put(TextureKey.TOP, TextureMap.getSubId(topBlock, topSuffix))
				.put(TextureKey.BOTTOM, TextureMap.getSubId(bottomBlock, bottomSuffix));
	}
}
