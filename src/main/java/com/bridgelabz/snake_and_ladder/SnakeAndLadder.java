package com.bridgelabz.snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random random = new Random();

        int diceRoll = random.nextInt(6+1);
        System.out.println("Dice roll:"+diceRoll);
    }
}
