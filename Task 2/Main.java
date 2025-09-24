import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Create a Scanner for input

        // Ask for user's name
        System.out.print("Please type your name: ");
        String name = scan.nextLine(); // Read full name input

        // Greet the user and ask for age
        System.out.print("Hello " + name + ", please enter your age: ");
        int age = scan.nextInt(); // Read age as integer

        int timeOfRetire = 67 - age; // Calculate years left until retirement

        // Display user's age
        System.out.println("Your age is: " + age);

        // Display years left until retirement
        System.out.println("You have " + timeOfRetire + " years left until retirement.");

        scan.close(); // Always close the Scanner when done
    }
}
