package com.bridgelabz.snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {

    static int player1 = 0;
    static int player2 = 0;

    public static void main(String[] args) {

        Random random = new Random();
        int diceRoll1 = 0;
        int diceRoll2 = 0;
        int numDiceRoll1 = 0;
        int numDiceRoll2 = 0;

        while (player1 != 100 && player2 != 100) {

            diceRoll1 = random.nextInt(6 + 1);
            numDiceRoll1++;
            System.out.println("Number of time dice roll by player 1 is :" + numDiceRoll1);
            player1 = diceRoll1 + player1;
            System.out.println("Number obtain after dice roll by player 1 is :" + diceRoll1);

            diceRoll2 = random.nextInt(6 + 1);
            numDiceRoll2++;
            System.out.println("Number of time dice roll by player 2 is:" + numDiceRoll2);
            player2 = diceRoll2 + player2;
            System.out.println("Number obtain after dice roll by player 2 is :" + diceRoll2);

            if (player1 == 11 || player1 == 24 || player1 == 39 || player1 == 48 ||
                    player1 == 60 || player1 == 70 || player1 == 79 || player1 == 85) {
                System.out.println("Player 1 got a ladder :" + player1);
            } else if (player1 == 17 || player1 == 30 || player1 == 38 || player1 == 54 || player1 == 69 ||
                    player1 == 78 || player1 == 82) {
                System.out.println("Player 1 beaten by snake :" + player1);
            } else if (player2 == 11 || player2 == 24 || player2 == 39 || player2 == 48 ||
                    player2 == 60 || player2 == 70 || player2 == 79 || player2 == 85) {
                System.out.println("Player 2 got a ladder " + player2);
            } else if (player2 == 17 || player2 == 30 || player2 == 38 || player2 == 54 || player2 == 69 ||
                    player2 == 78 || player2 == 82) {
                System.out.println("Player 2 beaten by snake :" + player2);
            } else
                System.out.println("Not a snake or ladder..");


            if (player1 > 100) {
                player1 = player1 - diceRoll1;
            }
            if (player2 > 100) {
                player2 = player2 - diceRoll2;
            }
            System.out.println("player 1 :" + player1);
            System.out.println("player 2 :" + player2);

        }

    }
}
