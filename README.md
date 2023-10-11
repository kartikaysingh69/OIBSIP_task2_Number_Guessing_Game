## NUMBER GUESSING GAME

Welcome to the Number Guessing Game! This simple Java console application allows users to play a number guessing game where they try to guess a randomly generated number within a specified range.

### How to Play

1. The game generates a random number between `MIN_VALUE` and `MAX_VALUE` (inclusive), and the player's task is to guess this number.

2. The player has a limited number of attempts (`MAX_ATTEMPTS`) to guess the correct number.

3. After each guess, the game provides feedback on whether the guess is too high or too low.

4. The game continues until the player guesses the correct number or runs out of attempts.

### Features

- The game includes input validation to ensure that the user's input is a valid integer within the specified range.

- The player's score is tracked, and it increases each time the player successfully guesses the number.

- After each round, the player is given the option to play again.

### How to Run

1. Compile the Java file:

   ```bash
   javac NUMBER_GUESSING_GAME.java
   ```

2. Run the compiled program:

   ```bash
   java NUMBER_GUESSING_GAME
   ```

3. Follow the on-screen instructions to play the game.

### Game Logic

- The game uses the `Random` class to generate a random target number.

- The player's input is validated to ensure it is a valid integer within the specified range.

- After each round, the player is given the option to play again. The game loop continues until the player chooses not to play.

### Customization

- You can customize the game by modifying constants such as `MIN_VALUE`, `MAX_VALUE`, and `MAX_ATTEMPTS` in the source code.

- Feel free to enhance the game with additional features or improvements.

### Notes

- This game was created as a simple exercise to demonstrate basic Java programming concepts.

- The input validation ensures that the player enters a valid integer within the specified range, enhancing the robustness of the program.


Enjoy playing the Amazing Number Guessing Game! If you have any feedback or suggestions for improvement, feel free to contribute.
