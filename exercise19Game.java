import java.util.Random;
import java.util.Scanner;

public class exercise19Game {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
            int userGuess;

            System.out.println("Welcome to the Guess the Number game!");

            do {
                System.out.print("Guess the number (between 1 and 100): ");
                userGuess = scanner.nextInt();

                if (userGuess > randomNumber) {
                    System.out.println("Too high, try again.");
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
                }
            } while (userGuess != randomNumber);

            scanner.close();
        }
    }

