package net.fellter.vanillavsplus.block;

import net.minecraft.util.StringIdentifiable;

public enum VerticalStairShape implements StringIdentifiable {
    STRAIGHT_LEFT("straight_left"),
    STRAIGHT_RIGHT("straight_right"),
    INNER_TOP_LEFT("inner_top_left"),
    INNER_TOP_RIGHT("inner_top_right"),
    INNER_BOTTOM_LEFT("inner_bottom_left"),
    INNER_BOTTOM_RIGHT("inner_bottom_right"),
    OUTER_TOP_LEFT("outer_top_left"),
    OUTER_TOP_RIGHT("outer_top_right"),
    OUTER_BOTTOM_LEFT("outer_bottom_left"),
    OUTER_BOTTOM_RIGHT("outer_bottom_right"),
    OUTER_TOP_LEFT_R90("outer_top_left_r90"),
    OUTER_BOTTOM_LEFT_R90("outer_bottom_left_r90"),
    OUTER_TOP_RIGHT_R90("outer_top_right_r90"),
    OUTER_BOTTOM_RIGHT_R90("outer_bottom_right_r90")
    ;

    private final String name;

    VerticalStairShape(String name) {
        this.name = name;
    }

    @Override
    public String asString() {
        return name;
    }
}
