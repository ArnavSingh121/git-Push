import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }
    }
}
