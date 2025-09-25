import java.util.ArrayList;

// Client class with the main method
public class Main 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList of actions (menu options)
        ArrayList<String> actions = new ArrayList<>();

        // Add action options to the list
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Create a GameMenu object and pass the list of actions to it
        GameMenu menu = new GameMenu(actions);

        // Prompt user and get choice
        String userChoice = menu.promptUser();

         // Convert user's string input to an integer
        int actionNumber;
        try 
        {
            actionNumber = Integer.parseInt(userChoice);
        } catch (NumberFormatException e) 
        {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
            return; // Exit if input is invalid
        }

         // Call the doAction method
        doAction(actionNumber);
    }

        // Handle the user's selected action
    public static void doAction(int action) 
    {
        switch (action) 
        {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid action. Please choose a number between 1 and 4.");
        }
    }
}