package com.filipotrebski.checkers;

import java.util.ArrayList;
public class BoardRow {
    ArrayList<Figure> figures = new ArrayList<Figure>();


    public void createEmptyRow(){
        for (int i = 0; i < 8; i++){
            figures.add(new None());
        }
    }

    public void placeFigure(Figure figure, int column){
        figures.add(column,figure);
    }

    void getFigure(int index) {
        figures.get(index);
    } // index-1?

    public ArrayList<Figure> getFigures() {
        return figures;
    }
}
