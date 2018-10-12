package com.filipotrebski.checkers.figures;

public enum FigureType {
    NONE ("NONE"),
    PAWN("PAWN"),
    QUEEN("QUEEN");

    private String type;

    FigureType(String type) {
        this.type = type.toUpperCase();
    }

    public String getType() {
        return this.type;
    }
}
