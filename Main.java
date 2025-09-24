class Main
{
	public static void main(String[] args)
	{
		// Create 5 team objects with different team names
		// The original 4 teams for the byzantine empires chariot races, representing the different social classes
		Team team1 = new Team("Venetoi");
		Team team2 = new Team("Prasinoi");
		Team team3 = new Team("Rhousioi");
		Team team4 = new Team("Leukoi");
		Team team5 = new Team("O agapimenos tou aftokratora"); // Greek: "The Emperor's favorite"

		// Assign rankings to each team
		team1.setRank(1); 
		team2.setRank(2);
		team3.setRank(3);
		team4.setRank(4);
		team5.setRank(5);

		// Add players to team1
		team1.addPlayer("Alexios");
		team1.addPlayer("Lucius");

		// Add players to team2
		team2.addPlayer("Gaius");
		team2.addPlayer("Cassius");

		// Add players to team3
		team3.addPlayer("Octavius");
		team3.addPlayer("Augustus");

		// Add players to team4
		team4.addPlayer("Flavius");
		team4.addPlayer("Brutus");

		// Add players to team5
		team5.addPlayer("Julius");
		team5.addPlayer("Aurelian");

		// Create an array containing all teams
		Team[] teams = {team1, team2, team3, team4, team5};

		// Loop through the array and print information about each team
		for (Team team : teams) 
		{
			System.out.println(team); // Calls the overridden toString() method of the Team class
		}
	}
}