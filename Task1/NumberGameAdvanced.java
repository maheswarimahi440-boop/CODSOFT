import java.util.Random;
import java.util.Scanner;

public class NumberGameAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String playAgain;

        do {
            int randomNumber = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            int guess;

            System.out.println("\n New Game Started!");
            System.out.println("Guess a number between 1 and 100");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println(" Correct! Attempts: " + attempts);
                    break;
                } else if (guess > randomNumber) {
                    System.out.println(" Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("❌ Game Over! Number was: " + randomNumber);
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        sc.close();
    }
}