import java.util.ArrayList;
import java.util.Scanner;

// Entity class that represents a game menu
public class GameMenu 
{
    // Instance variable to store the list of actions
    private ArrayList<String> actions = new ArrayList<>();

    // Constructor that takes an ArrayList of actions and assigns it to the instance variable
    public GameMenu(ArrayList<String> actions) 
    {
        this.actions = actions;
    }

    // Method to display the menu actions one by one
    public void displayMenu() 
    {
        // Use a for-each loop to iterate through the actions list
        for (String action : actions) 
        {
            // Print each action to the console
            System.out.println(action);
        }
    }

    // Prompt the user, show the menu, and return input
     public String promptUser() 
     {
        System.out.println("Type a number to choose an action:");
        displayMenu();

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        return choice;
    }
}
