package net.fellter.vanillavsplus.block;

import net.minecraft.util.StringIdentifiable;

public enum BlockSide implements StringIdentifiable {
    LEFT("left"),
    RIGHT("right")
    ;

    private final String name;

    BlockSide(String name) {
        this.name = name;
    }

    @Override
    public String asString() {
        return name;
    }
}
