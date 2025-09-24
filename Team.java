import java.util.ArrayList;

class Team
{
	private String teamName;
	private int rank;
	private ArrayList<String> playerNames = new ArrayList<>();

	public Team(String teamName)
	{
		this.teamName = teamName;
	}

	public void setRank(int rank)
	{
		this.rank = rank;
	}

	public void addPlayer(String playerName)
	{
		playerNames.add(playerName);
	}

	public String toString()
	{
		StringBuilder result = new StringBuilder();
		result.append("Hold: ").append(this.teamName).append(" : ").append(this.rank).append("\n");
		result.append("Players:\n");
		for (String player : playerNames)
		{
			result.append(player).append("\n");
		}
		return result.toString();
	}
}
