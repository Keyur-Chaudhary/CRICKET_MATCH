package model;

public class Player {
	
	private String playerName;
	private Team playerTeam;
	private int score,no_of_4s,no_of_6s,balls;
	
	public Player(String playerName, Team playerTeam)
	{
		this.playerName=playerName;
		this.playerTeam=playerTeam;
		this.score=0;
		this.no_of_4s=0;
		this.no_of_6s=0;
		this.balls=0;
	
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Team getPlayerTeam() {
		return playerTeam;
	}

	public void setPlayerTeam(Team playerTeam) {
		this.playerTeam = playerTeam;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNo_of_4s() {
		return no_of_4s;
	}

	public void setNo_of_4s(int no_of_4s) {
		this.no_of_4s = no_of_4s;
	}

	public int getNo_of_6s() {
		return no_of_6s;
	}

	public void setNo_of_6s(int no_of_6s) {
		this.no_of_6s = no_of_6s;
	}

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}
	
	@Override
	public String toString() {
		
		
		return this.playerName+"        "+this.score+"    "+this.no_of_4s+"    "+this.no_of_6s+"    "+this.balls;
		
	}

	
	
	
	

}
