package com.filipotrebski.checkers.rules;

import com.filipotrebski.checkers.Board;

public interface GameRules {

    Board board = new Board();

    public void move(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn);//implements move
    public boolean isMovePossible(int row, int column, int destinationRow, int destinationColumn);//checking here if this move can be executed
    public boolean isHitPossible(int row, int column, int destinationRow, int destinationColumn);//checking here if hit of figure is possible
    public boolean isDestinationFree(int row, int column, int destinationRow, int destinationColumn);//checking here if destination is not taken
    default int changeToPositiveInt(int value){
        if (value < 0){
            value *= -1;
        }
        return value;
    }
    default int updateRowCoordinates(int givenRow) {
        // konieczna zamiana rzędu -> numeracja planszy (8 -> 1)jest odwrotna niż numeracja
        // komórek w ArrayList (0 -> 7)
        givenRow = 8 - givenRow;
        return givenRow;
    }

    default int updateColumnCoordinates(int givenColumn) {
        givenColumn = givenColumn - 1;
        return givenColumn;
    }

}
