// A Java program to demonstrate random number generation
// using java.util.Random;
import java.util.Random;
import java.util.Scanner;
/**
* Calculate the time to microwave the users food.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-26
*/

public final class DiceGame {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private DiceGame() {
        throw new IllegalStateException("Utility class.");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {

        // Create scanner.
        final Scanner scanner = new Scanner(System.in);
        // create instance of Random class
        final Random rand = new Random();

        // Generate random integers in range 0 to 6.
        int rand_int = rand.nextInt(6);
        rand_int = rand_int + 1;
        // Set variables.
        int counter = 0;
        int inputAsInt = 0;
        // While loop.
        while (inputAsInt != rand_int) {
            try {
                counter = counter + 1;
                // Using scanner to get the input.
                System.out.println("Guess a number from 1-6?");

                final String input = scanner.nextLine();
                inputAsInt = Integer.parseInt(input);

                if (inputAsInt > 6 || inputAsInt < 1) {
                    System.out.println("Enter a valid guess.");
                } else if (inputAsInt > rand_int) {
                    System.out.println("Too high.");
                } else if (inputAsInt < rand_int) {
                    System.out.println("Too low.");
                } else {
                    // Print correct.
                    System.out.println("Correct!");
                }
            } catch (NumberFormatException error) {
                System.out.println("Please enter a valid option!"
                    + error.getMessage());
            }
        }
        // Print random integers
        System.out.println("You took " + counter + " guesses.");
    }
}
