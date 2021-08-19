package model;
import java.util.*;

public class Team {
	private String teamName;
	private List<Player> teamPlayers;
	
	
	public Team(String teamName)
	{
		this.teamName=teamName;
	}
	
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Player> getTeamPlayers() {
		return teamPlayers;
	}

	public void setTeamPlayers(List<Player> teamPlayers) {
		this.teamPlayers = teamPlayers;
	}

	
	

}
