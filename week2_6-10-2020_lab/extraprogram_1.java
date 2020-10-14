import java.util.Scanner;
class Player{
	// not mentioning private or public is default
	 String id;
	 String name;
	 int no_of_matches_played;
	 double scores[];
	 double average=0;
	/*Player()// default constructor
	{
		System.out.println("inside default constructor");
		id="ab1";
		name="xxx";
		no_of_matches_played=1;
		scores=new double[no_of_matches_played];
		for(int i=0;i<no_of_matches_played;i++)
		{
			scores[i]=10;
		}
	}*/
	Player(String i,String n,int p)
	{
		//System.out.println("inside parameterized constructor");
		id=i;
		name=n;
		no_of_matches_played=p;
		scores=new double[no_of_matches_played];
		// not needed for(int i=0;i<no_of_matches_played;i++)
		
	}
	void getPlayerData()
	{
		System.out.println("enter the player details:");
		Scanner xx=new Scanner(System.in);
		System.out.println("enter the id of the player ");
		id=xx.next();
		System.out.println("enter the name of the player ");
		name=xx.next();
		System.out.println("enter the no of matches played by player ");
		no_of_matches_played=xx.nextInt();
		System.out.println("enter the scores in the matches played");
		scores=new double[no_of_matches_played];
		for(int i=0;i<no_of_matches_played;i++)
		{
			scores[i]=xx.nextDouble();
		}
	}
	double calculate_average_scores()
	{
		for(int i=0;i<no_of_matches_played;i++)
		{
		average=average+scores[i];
		}
		average=average/no_of_matches_played;
		return average;
	}
	void display_details()
	{
		System.out.println("player details:");
		System.out.println("player id: "+id);
		System.out.println("player name: "+name);
		System.out.println("no of matches played: "+no_of_matches_played);
		System.out.println("scores:");
		for(int i=0;i<no_of_matches_played;i++)
		{
			System.out.println(scores[i]);
		}
		System.out.println("average score: "+average);
	}
}
class playermain{
	public static void main(String args[])
	{
		Player p1=new Player("14","disha",8);
		Player p2=new Player("20","me",6);
		p1.getPlayerData();
		double x=p1.calculate_average_scores();
		p2.getPlayerData();
		double y=p2.calculate_average_scores();
		if(x>y)
		{
			p1.display_details();
		}
		else
		{
			p2.display_details();
		}
		// also mention equal to condition.
	}
}
		
	
	
		
		
		
