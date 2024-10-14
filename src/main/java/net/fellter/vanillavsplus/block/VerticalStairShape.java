package net.fellter.vanillavsplus.block;

import net.minecraft.util.StringIdentifiable;

import java.util.ArrayList;
import java.util.List;

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

    public static final VerticalStairShape[] TOP_SHAPES = new VerticalStairShape[]{INNER_TOP_LEFT, INNER_TOP_RIGHT, OUTER_TOP_LEFT, OUTER_TOP_RIGHT, OUTER_TOP_LEFT_R90, OUTER_TOP_RIGHT_R90};
    public static final VerticalStairShape[] BOTTOM_SHAPES = new VerticalStairShape[]{INNER_BOTTOM_LEFT, INNER_BOTTOM_RIGHT, OUTER_BOTTOM_LEFT, OUTER_BOTTOM_RIGHT, OUTER_BOTTOM_LEFT_R90, OUTER_BOTTOM_RIGHT_R90};
    public static final VerticalStairShape[] INNER_SHAPES = new VerticalStairShape[]{INNER_TOP_LEFT, INNER_TOP_RIGHT, INNER_BOTTOM_LEFT, INNER_BOTTOM_RIGHT};
    public static final VerticalStairShape[] OUTER_SHAPES = new VerticalStairShape[]{OUTER_TOP_LEFT, OUTER_TOP_RIGHT, OUTER_BOTTOM_LEFT, OUTER_BOTTOM_RIGHT};
    public static final VerticalStairShape[] STRAIGHT_SHAPES = new VerticalStairShape[]{STRAIGHT_LEFT, STRAIGHT_RIGHT};
    public static final VerticalStairShape[] LEFT_SHAPES = new VerticalStairShape[]{STRAIGHT_LEFT, INNER_TOP_LEFT, INNER_BOTTOM_LEFT, OUTER_TOP_LEFT, OUTER_BOTTOM_LEFT, OUTER_TOP_LEFT_R90, OUTER_BOTTOM_LEFT_R90};
    public static final VerticalStairShape[] RIGHT_SHAPES = new VerticalStairShape[]{STRAIGHT_RIGHT, INNER_TOP_RIGHT, INNER_BOTTOM_RIGHT, OUTER_TOP_RIGHT, OUTER_BOTTOM_RIGHT, OUTER_TOP_RIGHT_R90, OUTER_BOTTOM_RIGHT_R90};

    @Override
    public String asString() {
        return name;
    }
}
