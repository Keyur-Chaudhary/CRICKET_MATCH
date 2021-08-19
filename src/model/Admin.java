package model;
import java.util.*;

public class Admin {
	
	Match currentMatch;
	List<Team> teamList;
	ScoreCard scoreCard;
	
	public Admin()
	{
		currentMatch = null;
		teamList=new ArrayList<>();
	}
	
	
	public void createMatch(int teamNumber1,int teamNumber2)
	{	
		this.currentMatch = new Match(teamList.get(teamNumber1), teamList.get(teamNumber2));
	}
	
	public Player createPlayer(String playerName,Team playerTeam)
	{
		return new Player(playerName, playerTeam);
	}
	
	public void createTeams(String teamName,List<String> teamPlayers)
	{
		Team team=new Team(teamName);
		addTeamPlayers(team,teamPlayers);
		this.teamList.add(team);
	}
	
	public void addTeamPlayers(Team team,List<String> teamPlayers)
	{
		List<Player> teamPlayerList = new ArrayList<>();
		
		for(String teamPlayerName: teamPlayers)
		{
			teamPlayerList.add(new Player(teamPlayerName, team));	
		}
		
		team.setTeamPlayers(teamPlayerList);
	}
	
	public void createInitialScoreCard(int innings)
	{
		this.scoreCard=new ScoreCard(this.currentMatch, innings);
	}
	
	public void printTeam(int teamNumber)
	{
		System.out.println("Team Name: "+this.teamList.get(teamNumber).getTeamName());
		
		for(Player p: this.teamList.get(teamNumber).getTeamPlayers())
		{
			System.out.print(p.getPlayerName()+" ");
		}
		
		System.out.println();
		
	}
	
	public void showScoreCard(List<String> over,int innings)
	{
		this.scoreCard.updateBoard(over);
		
		System.out.println("Player_Name Score 4s 6s Balls");
		
		if(innings==1)
		{
			for(Player p: this.currentMatch.getTeam1().getTeamPlayers())
			{
				if(p.equals(this.scoreCard.frontPlayer)||p.equals(this.scoreCard.rearPlayer))
				System.out.print("*");	
				System.out.println(p.toString());
				
			}
			System.out.println("Total: "+this.currentMatch.getScoreTeam1()+"/"+this.currentMatch.getWicketTeam1());
			
			if(this.currentMatch.getCurrentOverBallsTeam1()==6)
			{	
				this.currentMatch.setOversCompletedTeam1(this.currentMatch.getOversCompletedTeam1()+1);
				this.currentMatch.setCurrentOverBallsTeam1(0);
				
				System.out.println("Over: "+this.currentMatch.getOversCompletedTeam1());
				
			}
			else
			{
				
				System.out.println("Over: "+this.currentMatch.getOversCompletedTeam1()+"."+this.currentMatch.getCurrentOverBallsTeam1());
				
			}
			
			
			
		}
		else
		{
			for(Player p: this.currentMatch.getTeam2().getTeamPlayers())
			{
				if(p.equals(this.scoreCard.frontPlayer)||p.equals(this.scoreCard.rearPlayer))
				System.out.print("*");	
				System.out.println(p.toString());
				
			}
			System.out.println("Total: "+this.currentMatch.getScoreTeam2()+"/"+this.currentMatch.getWicketTeam2());
			
			if(this.currentMatch.getCurrentOverBallsTeam2()==6)
			{	
				this.currentMatch.setOversCompletedTeam2(this.currentMatch.getOversCompletedTeam2()+1);
				this.currentMatch.setCurrentOverBallsTeam2(0);
				System.out.println("Over: "+this.currentMatch.getOversCompletedTeam2());
				
			}
			else
			{
				System.out.println("Over: "+this.currentMatch.getOversCompletedTeam2()+"."+this.currentMatch.getCurrentOverBallsTeam2());

				
			}
			
			
		}
		
		this.scoreCard.changeTheStrike();
		
		
		
	}
	
	public void ShowResult()
	{
		int team1score=this.currentMatch.getScoreTeam1();
		int team2score=this.currentMatch.getScoreTeam2();
		
		if(team1score>team2score)
		{
			this.currentMatch.setWinner(this.currentMatch.getTeam1());
			this.currentMatch.setLosser(this.currentMatch.getTeam2());
			
			System.out.println(this.currentMatch.getWinner().getTeamName()+" won the match by "+ (team1score-team2score)+ " run");
			
		}
		else if(team2score>team1score)
		{
			this.currentMatch.setWinner(this.currentMatch.getTeam2());
			this.currentMatch.setLosser(this.currentMatch.getTeam1());
			
			System.out.println(this.currentMatch.getWinner().getTeamName()+" won the match by "+ (this.currentMatch.getWinner().getTeamPlayers().size()-currentMatch.getWicketTeam2())+ " wickets");
			
			
		}
		
		
	}
	
}
