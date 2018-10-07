package com.filipotrebski.checkers;

public class None extends Figure {

    public None() {
        super("None","None");
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
