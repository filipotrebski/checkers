package com.filipotrebski.checkers;

import com.filipotrebski.checkers.rules.BasicRules;
import com.filipotrebski.checkers.rules.GameRules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckersApplication {

    public static void main(String[] args) {

        SpringApplication.run(CheckersApplication.class, args);

        GameRules gameRules = new BasicRules();
        gameRules.board.setUpTheBoard();

        System.out.println(gameRules.board.toString());
        gameRules.move(1,1,2,2);
        System.out.println("\n\n\n");
        System.out.println(gameRules.board.toString());
        gameRules.move(8,2,5,1);
        System.out.println("\n\n\n");
        System.out.println(gameRules.board.toString());
    }
}
