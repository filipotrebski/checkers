package com.filipotrebski.checkers.rules;

import com.filipotrebski.checkers.Board;
import org.junit.Assert;
import org.junit.Test;

public class OccupancyTestSuite {

    @Test
    public void testValidateRule() {
        //Given
        Board board = new Board();
        Occupancy occupancy = new Occupancy();
        board.setUpTheBoard();
        //When
        occupancy.validateRule();
        //Then
        Assert.assertTrue(occupancy.validateRule());
    }
}
