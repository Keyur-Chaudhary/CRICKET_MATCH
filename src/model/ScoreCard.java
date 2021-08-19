package model;
import java.util.*;

public class ScoreCard {
	Match match;
	int inningNumber;
	List<Player> battingOrder;
	Player frontPlayer,rearPlayer;
	
	public ScoreCard(Match match, int inningsNumber) {
		    
		    this.match = match;
		    this.inningNumber=inningsNumber;
		
		    if(this.inningNumber == 1)
		    	this.battingOrder = new ArrayList<>(this.match.getTeam1().getTeamPlayers());
		    else
		    	this.battingOrder = new ArrayList<>(this.match.getTeam2().getTeamPlayers());
		    
			this.frontPlayer = this.battingOrder.remove(0);
			this.rearPlayer = this.battingOrder.remove(0);
	}
	
	public void changeTheStrike()
	{
		Player tempPlayer=this.frontPlayer;
		this.frontPlayer=this.rearPlayer;
		this.rearPlayer=tempPlayer;
		
	}

	public void updateBoard(List<String> over)
	{
		
		for(String ball: over)
		{
			if(ball.equals("W"))
			{		
				if(this.inningNumber==1)
					{
						this.match.setWicketTeam1(this.match.getWicketTeam1()+1);
						this.match.setCurrentOverBallsTeam1(this.match.getCurrentOverBallsTeam1()+1);
					}
				else
					{
						this.match.setWicketTeam2(this.match.getWicketTeam2()+1);
						this.match.setCurrentOverBallsTeam2(this.match.getCurrentOverBallsTeam2()+1);
					}
				
				this.frontPlayer.setBalls(this.frontPlayer.getBalls()+1);
		
				if(!this.battingOrder.isEmpty())
					this.frontPlayer=this.battingOrder.remove(0);
				else
					break;
			}
			else if(ball.equals("Wd")||ball.equals("Nb"))
			{
				if(this.inningNumber==1)
					this.match.setScoreTeam1(this.match.getScoreTeam1()+1);
				else
					this.match.setScoreTeam2(this.match.getScoreTeam2()+1);
			}
			else
			{
				if(this.inningNumber==1)
					{
						this.match.setScoreTeam1(this.match.getScoreTeam1()+Integer.parseInt(ball));
						this.match.setCurrentOverBallsTeam1(this.match.getCurrentOverBallsTeam1()+1);
					}
				else
					{
						this.match.setScoreTeam2(this.match.getScoreTeam2()+Integer.parseInt(ball));
						this.match.setCurrentOverBallsTeam2(this.match.getCurrentOverBallsTeam2()+1);
					}
				
				this.frontPlayer.setScore(this.frontPlayer.getScore()+Integer.parseInt(ball));
				this.frontPlayer.setBalls(this.frontPlayer.getBalls()+1);
				
				if(ball.equals("1")||ball.equals("3"))
				changeTheStrike();
				else if(ball.equals("4"))
				this.frontPlayer.setNo_of_4s(this.frontPlayer.getNo_of_4s()+1);
				else if(ball.equals("6"))
				this.frontPlayer.setNo_of_6s(this.frontPlayer.getNo_of_6s()+1);
			
			
			}
			
			
		}
		
		
		
	}
	
	

}
