package contoller;
import model.Admin;
import java.util.*;

public class PlayCricketMatch {

	public static void main(String[] args) {
		
		Admin admin = new Admin();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers of players of each team:");
		int number_of_players = Integer.parseInt(sc.nextLine());
		System.out.println("Enter numbers of overs:");
		int number_of_overs = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter batting order of team1:");
		
		List<String> playersTeam1=new ArrayList<String>();
		
		for(int i=0;i<number_of_players;i++)
		{
			playersTeam1.add(sc.nextLine());
		}
		
		System.out.println("Enter batting order of team2:");
		
		List<String> playersTeam2=new ArrayList<String>();
		
		for(int i=0;i<number_of_players;i++)
		{
			playersTeam2.add(sc.nextLine());
		}
		
		admin.createTeams("MI", playersTeam1);
		admin.createTeams("CSK", playersTeam2);
		admin.createMatch(0,1);
		
		//First inning
		admin.createInitialScoreCard(1);
		System.out.println("Batting of team1: ");
		for(int i=0;i<number_of_overs;i++)
		{
			int no_balls=6;
			List<String> over = getOver(sc,no_balls);
			admin.showScoreCard(over,1);
		
		}
		
		//Second inning
		admin.createInitialScoreCard(2);
		System.out.println("Batting of team2: ");
		for(int i=0;i<number_of_overs;i++)
		{
			int no_balls=6;
			List<String> over = getOver(sc,no_balls);
			admin.showScoreCard(over,2);
		
		}
		
		admin.ShowResult();
		
		
	
	

	}
	
	public static List<String> getOver(Scanner sc,int no_balls)
	{
		List<String> over = new ArrayList<String>();
		
		while(no_balls>0&&sc.hasNextLine())
			{
			String ball=sc.nextLine();
			
			if((!ball.equals("Wd"))&&(!ball.equals("Nb")))
				no_balls--;
			
			over.add(ball);
			
		}
		
		return over;
		
	}

}
