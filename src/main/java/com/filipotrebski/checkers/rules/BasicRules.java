package com.filipotrebski.checkers.rules;


import com.filipotrebski.checkers.Board;

import java.util.ArrayList;
import java.util.List;

public class BasicRules implements GameRules {

    public static final String NONE = "NONE";
    private Board board;
    private List<Rule> rules = new ArrayList<>();

    public BasicRules(Board board) {
        this.board = board;
        rules.add(new Occupancy());
    }

    @Override
    public void move(int sourceRow, int sourceColumn, int destinationRow , int destinationColumn) {
        rules.get(0).validateRule();
        //TODO Uprzątnąć śmieci
//        sourceRow = updateRowCoordinates(sourceRow);
//        sourceColumn = updateColumnCoordinates(sourceColumn);
//        destinationRow = updateRowCoordinates(destinationRow);
//        destinationRow = updateColumnCoordinates(destinationColumn);
//        if(isMovePossible(sourceRow,sourceRow,destinationRow,destinationColumn)){
//            Figure figure = board.getFigure(sourceRow,sourceColumn);
//            board.setFigure(sourceRow, sourceColumn, new None());
//            board.setFigure(destinationRow, destinationColumn,figure);
//        } else {
//            System.out.println("Move is not possible");//dlaczego nie wyświetla?
//        }
    }

    public List<Rule> getRules() {
        return rules;
    }

    public Board getBoard() {
        return board;
    }
    //    @Override
//    public boolean isMovePossible(int row, int column, int destinationRow, int destinationColumn) {
//        if (board.getFigure(row, column).getFigureType().equals(NONE)) {
//            return false;
//        } else return isDestinationFree(row, column, destinationRow, destinationColumn);
//    }
//
//    @Override
//    public boolean isHitPossible(int row, int column, int destinationRow, int destinationColumn) {
//        int rowDiffidence = changeToPositiveInt((row - destinationRow));
//        int columnDifference  = changeToPositiveInt((column - destinationColumn));
//        int loopIterator = 0;
//        if (rowDiffidence > columnDifference) {
//            loopIterator = columnDifference;
//        } else {
//            loopIterator = rowDiffidence;
//        }
//        if(rowDiffidence > 0 && columnDifference > 0) {
//
//        }
//        return false;
//    }
//
//    @Override
//    public boolean isDestinationFree(int row, int column, int destinationRow, int destinationColumn) {
//        if (isHitPossible(row,column,destinationRow,destinationColumn)) {
//            return true;
//        }
//        return false;
//    }
}
