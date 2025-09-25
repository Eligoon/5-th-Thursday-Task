import java.util.Random;
import java.util.Scanner;

public class GuessANumber 
{
    private static int rnd_number;

    public static void main(String[] args) 
    {
        // Pick a random number between 1 and 100
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");

        Scanner scanner = new Scanner(System.in);
        makeAGuess(scanner);
    }

    private static void makeAGuess(Scanner scan) 
    {
        System.out.print("Enter your guess: ");

        if (scan.hasNextInt()) 
        {
            int guess = scan.nextInt();

            if (guess == rnd_number) {
                System.out.println("Your guess was correct!");
                return; // Exit recursion
            } else if (guess < rnd_number) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            makeAGuess(scan); // Recursive call
        } else {
            // Invalid input
            System.out.println("That's not a valid number. Please enter a number between 1 and 100.");
            scan.next();
            makeAGuess(scan); // Recursive call
        }
    }
}


// Create a Scanner object       
        // use hasNextDouble to check if input is numeric, 
        // if so...
    // Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively