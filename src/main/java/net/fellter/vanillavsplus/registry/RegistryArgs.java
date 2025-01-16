package net.fellter.vanillavsplus.registry;

import net.fellter.vanillavsplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class RegistryArgs {
    public Boolean transparent = false;
    public Boolean translucent = false;
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

    public RegistryArgs() {
    }

    public RegistryArgs copy(Block from) {
        if (!ModBlocks.REGISTRY_ARGS.containsKey(from)) {
            throw new NullPointerException("Couldn't find " + from.getName() + " in RegistryArgs source map.");
        } else {
            RegistryArgs args = ModBlocks.REGISTRY_ARGS.get(from);
            RegistryArgs newArgs = new RegistryArgs();
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

    public RegistryArgs flattenable(Block flattened) {
        this.flattened = flattened;
        return this;
    }

    public RegistryArgs foliageTinted() {
        this.foliageTinted = true;
        return this;
    }

    public RegistryArgs transparent() {
        this.transparent = true;
        return this;
    }

    public RegistryArgs translucent() {
        this.translucent = true;
        return this;
    }

    public RegistryArgs strippable(Block stripped) {
        this.stripped = stripped;
        return this;
    }

    public RegistryArgs flammable(Integer burn, Integer spread) {
        this.burn = burn;
        this.spread = spread;
        return this;
    }

    public RegistryArgs tillable(Block tilled) {
        this.tilled = tilled;
        return this;
    }

    public RegistryArgs tillableWithDrop(Block tilled, ItemConvertible tillDrop) {
        this.tilled = tilled;
        this.tillDrop = tillDrop;
        return this;
    }

    public RegistryArgs grassTinted() {
        this.grassTinted = true;
        return this;
    }

    public RegistryArgs oxidizable(Block exposed, Block weathered, Block oxidized, Block waxed, Block exposedWaxed, Block weatheredWaxed, Block oxidizedWaxed) {
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

    public RegistryArgs fuel() {
        this.fuel = true;
        return this;
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

