package com.filipotrebski.checkers;

import java.util.ArrayList;


public class Board {

    private ArrayList<BoardRow> checkersBoard = new ArrayList<BoardRow>();

    Figure getFigure(int row, int column) {
        return checkersBoard.get(row - 1).figures.get(column - 1);//-1 bo numerujemy od 0
    }

    void setFigure(int row, int col, Figure figure) {
        checkersBoard.get(row - 1).placeFigure(figure, col - 1);//aby odwrócić koordynaaty 8-i dla rzedu
        checkersBoard.get(row - 1).figures.remove(col);
    }

    void setUpTheBoard() {
        for (int i = 0; i < 8; i++) {
            checkersBoard.add(new BoardRow());
            checkersBoard.get(i).createEmptyRow();
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (i < 2) {
                        setFigure(i + 1, j + 1, new Pawn("black"));
                    } else if (i > 5) {
                        setFigure(i + 1, j + 1, new Pawn("white"));
                    }
                } else {
                    setFigure(i + 1, j + 1, new None());
                }
            }
            //checkersBoard.get(i).createEmptyRow();
        }
    }

    @Override
    public String toString() {
        String board = (" |-------------------------------------------------------------------------------|");
        for (int i = 0; i < checkersBoard.size(); i++) {
            for (int j = 0; j < checkersBoard.get(i).getFigures().size(); j++) {
                if (j == 0) {
                    board += "\n" + (checkersBoard.size() - i);
                    board += "|         |         |         |         |         |         |         |         |\n ";
                }
                board += ("|" + checkersBoard.get(i).figures.get(j).getFigureColor() + checkersBoard.get(i).figures.get(j).getFigureType() + "\u001B[0m");
                if (j == checkersBoard.get(i).figures.size() - 1) {
                    board += "|\n |         |         |         |         |         |         |         |         |\n ";
                    board += "|---------|---------|---------|---------|---------|---------|---------|---------|";
                }
            }
            //System.out.println("|\n |-------------------------------------------------------------|");

        }
        board += ("\n |    1    |    2    |    3    |    4    |    5    |    6    |    7    |    8    |");
        return board;
    }
}

