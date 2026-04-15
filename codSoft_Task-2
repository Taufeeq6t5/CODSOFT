import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            String difficulty;
            int maxAttempts;

            while (true) {
                System.out.println("Choose difficulty: easy / medium / hard");
                difficulty = sc.next();

                if (difficulty.equalsIgnoreCase("easy")) {
                    maxAttempts = 8;
                    break;
                } else if (difficulty.equalsIgnoreCase("medium")) {
                    maxAttempts = 5;
                    break;
                } else if (difficulty.equalsIgnoreCase("hard")) {
                    maxAttempts = 3;
                    break;
                } else {
                    System.out.println("Invalid input! Please choose easy, medium, or hard.");
                }
            }

            int targetNum = rdm.nextInt(100) + 1;
            int attempts = 0;

            while (true) {
                System.out.print("Enter your guess (1-100): ");
                int guessNum = sc.nextInt();
                attempts++;

                if (guessNum < targetNum) {
                    System.out.println("Too low! Try again.");
                } else if (guessNum > targetNum) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    break;
                }

                if (attempts < maxAttempts) {
                    System.out.println("Attempts left: " + (maxAttempts - attempts));
                }

                if (attempts == maxAttempts) {
                    System.out.println("Game Over! The correct number was: " + targetNum);
                    break;
                }
            }

            while (true) {
                System.out.print("Do you want to play again? (yes/no): ");
                playAgain = sc.next();

                if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter only 'yes' or 'no'.");
                }
            }
            if (playAgain.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Thank you for playing!");
        sc.close();
    }
}
