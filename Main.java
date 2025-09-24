class Main
{
	public static void main(String[] args)
	{
		Team team1 = new Team("Venetoi");
		Team team2 = new Team("Prasinoi");
		Team team3 = new Team("Rhousioi");
		Team team4 = new Team("Leukoi");
		Team team5 = new Team("O agapimenos tou aftokratora");

		team1.setRank(1); 
		team2.setRank(2);
		team3.setRank(3);
		team4.setRank(4);
		team5.setRank(5);

		team1.addPlayer("Alexios");
		team1.addPlayer("Lucius");

		team2.addPlayer("Gaius");
		team2.addPlayer("Cassius");

		team3.addPlayer("Octavius");
		team3.addPlayer("Augustus");

		team4.addPlayer("Flavius");
		team4.addPlayer("Brutus");

		team5.addPlayer("Julius");
		team5.addPlayer("Aurelian");


		Team[] teams = {team1, team2, team3, team4, team5};

		for (Team team : teams) 
		{
			System.out.println(team);
		}
	}
}