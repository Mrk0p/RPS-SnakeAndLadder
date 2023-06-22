package com.bridgelabz.snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int position = 0;

        System.out.println("player at start :");
        System.out.println(+position);

        Random random = new Random();
        int dice = random.nextInt(6+1);
        System.out.println("dice roll: "+dice);

        int userPosition = 0;
        int choies = random.nextInt(3);

        switch (choies) {
            case 0:
                System.out.println("No Play");
                break;

            case 1:
                System.out.println("Ladder");
                userPosition = userPosition + dice;
                break;

            default:
                System.out.println("Snake");
                userPosition = userPosition - dice;

                if (userPosition < 0) {
                    userPosition = 0;
                }
        }
        System.out.println("Present Position of the Player : " + userPosition);
    }
}
