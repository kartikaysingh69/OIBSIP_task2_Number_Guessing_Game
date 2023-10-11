import java.util.Random;
import java.util.Scanner;

public class NUMBER_GUESSING_GAME {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int playerScore = 0;

        System.out.println("Welcome to the Amazing Number Guessing Game!");

        boolean playMore = true;
        while (playMore) {
            int target = randomGenerator.nextInt(MAX_VALUE) + 1;
            int attemptsRemaining = MAX_ATTEMPTS;

            System.out.println("Try to guess the number between " + MIN_VALUE + " and " + MAX_VALUE + ". You have " + MAX_ATTEMPTS + " attempts.");

            boolean guessedCorrectly = false;
            while (attemptsRemaining > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = validateInput(inputScanner);

                if (userGuess == target) {
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < target) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }

                attemptsRemaining--;
                System.out.println("Attempts remaining: " + attemptsRemaining);
            }

            if (guessedCorrectly) {
                playerScore++;
                System.out.println("Congratulations! You've successfully guessed the number!");
            } else {
                System.out.println("Sorry, you're out of attempts. The number was: " + target);
            }

            System.out.println("Your current score: " + playerScore);
            System.out.print("Would you like to play again? (yes/no): ");
            String playAgainChoice = inputScanner.next();
            playMore = playAgainChoice.equalsIgnoreCase("yes");

            inputScanner.nextLine(); // Clear the buffer after reading the play again choice.
        }

        System.out.println("Thank you for playing the Amazing Number Guessing Game! Your final score: " + playerScore);
        inputScanner.close();
    }

    private static int validateInput(Scanner scanner) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value < MIN_VALUE || value > MAX_VALUE) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter an integer between " + MIN_VALUE + " and " + MAX_VALUE + ": ");
            }
        }
    }
}
