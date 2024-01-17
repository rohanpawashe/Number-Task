import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Game!");

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            System.out.println("Round " + (rounds + 1));
            System.out.println("Guess the number between " + minRange + " and " + maxRange);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            rounds++;

            System.out.print("Do you want to play again? (Yes/No): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);

        System.out.println("Game over! You played " + rounds + " rounds.");
        System.out.println("Your total score is based on the total attempts: " + totalAttempts);
        scanner.close();
    }
}