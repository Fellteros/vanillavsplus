package net.fellter.vanillavsplus.registry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import net.fellter.vanillavsplus.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.data.TextureMap;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.TagKey;

public final class Args {
	public List<TagKey<Block>> blockTags;
	public TextureMap textureMap;
	public Block parentBlock;
	public Block fullTextureBlock;
	public TintSource tintSource;
	public ArrayList<ItemConvertible> stonecuttingInput = new ArrayList<>();
	public Boolean y15 = false;
	public boolean transparent = false;
	public boolean translucent = false;
	public Block stripped;
	public Integer burn;
	public Integer spread;
	public Block exposed;
	public Block weathered;
	public Block oxidized;
	public Block waxed;
	public Block exposedWaxed;
	public Block weatheredWaxed;
	public Block oxidizedWaxed;
	public List<Block> oxidizables;
	public Boolean fuel = false;
	public Block tilled;
	public ItemConvertible tillDrop;
	public Boolean grassTinted = false;
	public Boolean foliageTinted;
	public Block flattened;

	public Args() {
	}

	public Args copy(Block from) {
		if (!ModBlocks.ARGS.containsKey(from)) {
			throw new NullPointerException("Couldn't find " + from.getName() + " in Args source map.");
		} else {
			Args args = ModBlocks.ARGS.get(from);
			Args newArgs = new Args();
			newArgs.blockTags = args.blockTags;
			newArgs.textureMap = args.textureMap;
			newArgs.parentBlock = args.parentBlock;
			newArgs.fullTextureBlock = args.fullTextureBlock;
			newArgs.tintSource = args.tintSource;
			newArgs.y15 = args.y15;
			newArgs.stonecuttingInput = args.stonecuttingInput;
			newArgs.transparent = args.transparent;
			newArgs.translucent = args.translucent;
			newArgs.stripped = args.stripped;
			newArgs.burn = args.burn;
			newArgs.spread = args.spread;
			newArgs.exposed = args.exposed;
			newArgs.weathered = args.weathered;
			newArgs.oxidized = args.oxidized;
			newArgs.waxed = args.waxed;
			newArgs.exposedWaxed = args.exposedWaxed;
			newArgs.weatheredWaxed = args.weatheredWaxed;
			newArgs.oxidizedWaxed = args.oxidizedWaxed;
			newArgs.oxidizables = args.oxidizables;
			newArgs.fuel = args.fuel;
			newArgs.tilled = args.tilled;
			newArgs.tillDrop = args.tillDrop;
			newArgs.grassTinted = args.grassTinted;
			newArgs.flattened = args.flattened;
			newArgs.foliageTinted = args.foliageTinted;
			return newArgs;
		}
	}

	public Args flattenable(Block flattened) {
		this.flattened = flattened;
		return this;
	}

	public Args foliageTinted() {
		this.foliageTinted = true;
		return this;
	}

	public Args transparent() {
		this.transparent = true;
		return this;
	}

	public Args translucent() {
		this.translucent = true;
		return this;
	}

	public Args strippable(Block stripped) {
		this.stripped = stripped;
		return this;
	}

	public Args flammable(Integer burn, Integer spread) {
		this.burn = burn;
		this.spread = spread;
		return this;
	}

	public Args tillable(Block tilled) {
		this.tilled = tilled;
		return this;
	}

	public Args tillableWithDrop(Block tilled, ItemConvertible tillDrop) {
		this.tilled = tilled;
		this.tillDrop = tillDrop;
		return this;
	}

	public Args grassTinted() {
		this.grassTinted = true;
		return this;
	}

	public Args oxidizable(Block exposed, Block weathered, Block oxidized, Block waxed, Block exposedWaxed, Block weatheredWaxed, Block oxidizedWaxed) {
		this.exposed = Objects.requireNonNull(exposed);
		this.weathered = Objects.requireNonNull(weathered);
		this.oxidized = Objects.requireNonNull(oxidized);
		this.waxed = Objects.requireNonNull(waxed);
		this.exposedWaxed = Objects.requireNonNull(exposedWaxed);
		this.weatheredWaxed = Objects.requireNonNull(weatheredWaxed);
		this.oxidizedWaxed = Objects.requireNonNull(oxidizedWaxed);
		this.oxidizables = List.of(exposed, weathered, oxidized, waxed, exposedWaxed, weatheredWaxed, oxidizedWaxed);
		return this;
	}

	public Args fuel() {
		this.fuel = true;
		return this;
	}

	@SafeVarargs
	public final Args blockTags(TagKey<Block>... blockTags) {
		this.blockTags = List.of(blockTags);
		return this;
	}

	public Args parentBlock(Block parentBlock) {
		this.parentBlock = parentBlock;
		this.fullTextureBlock = parentBlock;
		return this;
	}

	public Args parentBlock(Block parentBlock, Block fullTextureBlock) {
		this.parentBlock = parentBlock;
		this.fullTextureBlock = fullTextureBlock;
		return this;
	}

	public Args textureMap(TextureMap textureMap) {
		this.textureMap = textureMap;
		return this;
	}

	public Args stonecutting(ItemConvertible... input) {
		this.stonecuttingInput.add(this.parentBlock);
		this.stonecuttingInput.addAll(Arrays.asList(input));
		return this;
	}

	public Args stonecutting() {
		this.stonecuttingInput.add(this.parentBlock);
		return this;
	}

	public Args tintSource(TintSource tintSource) {
		this.tintSource = tintSource;
		return this;
	}

	public Args y15() {
		this.y15 = true;
		return this;
	}

	public static final class DatagenEntry<T> {
		private T value;

		public DatagenEntry(T value) {
			this.value = value;
		}

		public DatagenEntry<T> of(T value) {
			return new DatagenEntry<>(value);
		}

		public DatagenEntry<T> of() {
			return new DatagenEntry<>(null);
		}

		public T get() {
			if (value == null) {
				return null;
			}

			return value;
		}

		public void set(T value) {
			this.value = value;
		}
	}

	public static class RegistryProperty<T> {
		private T value;
		public RegistryProperty(T value) {
			this.value = value;
		}

		public RegistryProperty<?> of(T value) {
			return new RegistryProperty<>(value);
		}

		public T get() {
			if (value != null) return value;
			return null;
		}

		public void setValue(T value) {
			this.value = value;
		}
	}
}
