import java.util.ArrayList;

class Team
{
	private String teamName; // The name of the team
	private int rank; // The team's rank
	private ArrayList<String> playerNames = new ArrayList<>(); // List of players in the team

	// Constructor to initialize a team with a name
	public Team(String teamName)
	{
		this.teamName = teamName;
	}

	// Setter method to assign a rank to the team
	public void setRank(int rank)
	{
		this.rank = rank;
	}

	// Method to add a player to the team
	public void addPlayer(String playerName)
	{
		playerNames.add(playerName);
	}

	// Returns a string representation of the team (name, rank, and list of players)
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		result.append("Hold: ").append(this.teamName).append(" : ").append(this.rank).append("\n"); // "Hold" could be a typo for "Team"
		result.append("Players:\n");
		for (String player : playerNames)
		{
			result.append(player).append("\n"); // Add each player name on a new line
		}
		return result.toString(); // Return the full string representation
	}
}
