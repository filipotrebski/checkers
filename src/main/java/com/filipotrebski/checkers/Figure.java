package com.filipotrebski.checkers;

abstract class Figure {

    private String figureType;
    private String figureColor;

    public Figure(String figureType, String figureColor) {
        //FigureColor color = FigureColor.valueOf(figureColor.toUpperCase());
        this.figureType = figureType;
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }

    public String getFigureType() {

        return figureType;
    }

}
