package com.bridgelabz.snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        int player = 0;
        int count = 0;

        System.out.println("Player Starting Position will be:~ ");
        System.out.println(+position);

        Random random = new Random();
        while (player!= 100) {
            count++;

            int dice = random.nextInt(6+1);
            System.out.println("dice roll result: "+dice);

            int cases = random.nextInt(3);

            switch (cases) {
                case 0:
                    System.out.println("No Play!!");
                    break;

                case 1:
                    System.out.println("Ladder!");
                    player = player+ dice;
                    if(player > 100)
                    {
                        player = dice;
                    }
                    break;

                default:
                    System.out.println("Snake!");
                    player = player - dice;
            }
            System.out.println("Position of the player: " + player);
        }
        System.out.println("Player roll dice "+count+" times to win.");

    }
}
