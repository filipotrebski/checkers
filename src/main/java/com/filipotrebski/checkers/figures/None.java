package com.filipotrebski.checkers.figures;

public class None extends Figure {

    public None() {
        super(FigureType.NONE.getType(), FigureColor.NONE.getColor());
    }

    @Override
    public String getFigureType() {
        return "     ";
    }

    @Override
    public String getFigureColor() {
        return "    ";
    }
}
