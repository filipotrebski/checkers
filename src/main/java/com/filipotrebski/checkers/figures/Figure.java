package com.filipotrebski.checkers.figures;

public abstract class Figure {

    private String figureType;
    private String figureColor;

    public Figure(String figureType, String figureColor) {
        FigureColor color = FigureColor.valueOf(figureColor.toUpperCase());
        FigureType type = FigureType.valueOf(figureType.toUpperCase());
        this.figureType = type.getType();
        this.figureColor = color.getColor();
    }

    public String getFigureColor() {
        return figureColor;
    }

    public String getFigureType() {

        return figureType;
    }

}
