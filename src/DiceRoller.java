import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    // Method to roll a dice and return a random number between 1 and 6
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Random number between 1 and 6
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // To read user input
        boolean playing = true;

        System.out.println("🎲 Welcome to the Dice Roller!");

        while (playing) {
            // Roll the dice
            int diceValue = rollDice();
            System.out.println("You rolled a: " + diceValue);

            // Ask the user if they want to roll again
            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            // Exit the game if the user types "no"
            if (!response.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye!");
                playing = false;
            }
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}

