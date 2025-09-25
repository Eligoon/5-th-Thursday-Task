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

        // Call the displayMenu method to show the menu options
        menu.displayMenu();
    }
}