package com.filipotrebski.checkers.figures;

public enum FigureColor {
    BLACK("BLACK"),
    NONE("NONE"),
    WHITE("WHITE");

    private String color;

    FigureColor(String color) {
        this.color = color.toUpperCase();
    }

    public String getColor() {
        return this.color;
    }
}

