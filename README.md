# RPS-SnakeAndLadder

UC 1. Snake and Ladder game played with single player at start position 0

UC 2.  The Player rolls the dieto get a numberbetween 1 to 6.
 - Use ((RANDOM)) to get the number between 1 to 6

UC 3. The Player then checks fora Option. They are No Play, Ladder or Snake. 
- Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the same position
- In Case of Ladder the player moves ahead by thenumber of position received in the die
- In Case of Snake the player moves behind

UC 4. Repeat till the Player reaches the winning position 100. 
- Note In case the player position moves below 0, then the player restarts from 0

UC 5. Ensure the player gets to exact winning position 100. 
- Note in case the player position go above 100, the player stays in the same previous
position till the player gets the exact number that adds to 100.


UC 6. Report the number of times the dice was played to win the game and also the position
after every die role

UC 7. Play the game with 2 Player. In this case if a Player gets a Ladder then plays again.
Finally report which  Player won the game
