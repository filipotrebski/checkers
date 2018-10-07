package com.filipotrebski.checkers;

public enum FigureColor {

    WHITE ("\u001B[37m"),
    BLACK ("\u001B[35m"),
    NONE ("");

    private String color;

    FigureColor(String color) {
        this.color = color.toUpperCase();
    }

    public String getColor() {
        return this.color;
    }
}

