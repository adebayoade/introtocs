package introtocs.practise;

public class BaseBall {
	
	// instance variables
	private String team1;
	private String team2;
	private static int totalGamesPlayed = 0;
	
	public BaseBall(String team1, String team2) {
		this.team1 = team1;
		this.team2 = team2;
		totalGamesPlayed++;
	}

	public static void main(String[] args) {
		BaseBall game1 = new BaseBall("Arsenal", "Chelsea");
		BaseBall game2 = new BaseBall("Madrid", "Bacelona");
		
		System.out.println(game1.getTeams());
		System.out.println(game2.getTeams());
	
		System.out.println(BaseBall.gamePlayed());
	}
	
	public static int gamePlayed() {
		return totalGamesPlayed;
	}
	
	public String getTeams( ) {
		return team1 + " versus " + team2;
	}
}

