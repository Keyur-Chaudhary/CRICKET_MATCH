package model;

public class Match {
	
	 private Team team1;
	 private Team team2;
	 private Team winner;
	 private Team losser;
	 private int scoreTeam1;
	 private int scoreTeam2;
	 private int wicketTeam1;
	 private int wicketTeam2;
	 private int oversCompletedTeam1;
	 private int currentOverBallsTeam1;
	 private int oversCompletedTeam2;
	 private int currentOverBallsTeam2;



	public int getOversCompletedTeam1() {
		return oversCompletedTeam1;
	}


	public void setOversCompletedTeam1(int oversCompletedTeam1) {
		this.oversCompletedTeam1 = oversCompletedTeam1;
	}


	public int getCurrentOverBallsTeam1() {
		return currentOverBallsTeam1;
	}


	public void setCurrentOverBallsTeam1(int currentOverBallsTeam1) {
		this.currentOverBallsTeam1 = currentOverBallsTeam1;
	}


	public int getOversCompletedTeam2() {
		return oversCompletedTeam2;
	}


	public void setOversCompletedTeam2(int oversCompletedTeam2) {
		this.oversCompletedTeam2 = oversCompletedTeam2;
	}


	public int getCurrentOverBallsTeam2() {
		return currentOverBallsTeam2;
	}


	public void setCurrentOverBallsTeam2(int currentOverBallsTeam2) {
		this.currentOverBallsTeam2 = currentOverBallsTeam2;
	}


	public Match(Team team1, Team team2)
	 {
		 this.team1=team1;
		 this.team2=team2;
		 
	 }


	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public Team getWinner() {
		return winner;
	}
	public void setWinner(Team winner) {
		this.winner = winner;
	}
	public Team getLosser() {
		return losser;
	}
	public void setLosser(Team losser) {
		this.losser = losser;
	}
	public int getScoreTeam1() {
		return scoreTeam1;
	}


	public void setScoreTeam1(int scoreTeam1) {
		this.scoreTeam1 = scoreTeam1;
	}


	public int getScoreTeam2() {
		return scoreTeam2;
	}


	public void setScoreTeam2(int scoreTeam2) {
		this.scoreTeam2 = scoreTeam2;
	}


	public int getWicketTeam1() {
		return wicketTeam1;
	}


	public void setWicketTeam1(int wicketTeam1) {
		this.wicketTeam1 = wicketTeam1;
	}


	public int getWicketTeam2() {
		return wicketTeam2;
	}


	public void setWicketTeam2(int wicketTeam2) {
		this.wicketTeam2 = wicketTeam2;
	}
 
	
}
