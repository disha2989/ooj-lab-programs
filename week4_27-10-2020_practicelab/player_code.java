import java.util.Scanner;

abstract class player
{
String name;
int no_of_matches_played;
double average;
abstract void getdata();
//abstract void cal_average(String,int,int);
}
class batsman extends player
{
	int runs_scored;
	//int array1[];---but dosent match type of the function
	void getdata()
	{
		Scanner xx=new Scanner(System.in);
	System.out.println("enter the name of the batsman");
	name=xx.next();
	System.out.println("enter the no of matches played");
	no_of_matches_played=xx.nextInt();
	//array1=new int[no_of_matches_played];
	System.out.println("enter the no of runs scored by the batsman");
	runs_scored=xx.nextInt();
	/*for(int i=0;i<no_of_matches_played;i++)
	{
		runs_scored=xx.nextInt();
		array1[i]=runs_scored;
	}
	*/
	}
	void cal_average(String nme,int matches,int number)
	{
		System.out.println("name="+nme);
		System.out.println("no_of_matches_played="+matches);
		System.out.println("number of runs scored="+number);
		System.out.println("average="+(double) number/matches); 
	}
	
}
class bowler extends player 
{
	int runs_given;
	void getdata()
	{
		Scanner xx=new Scanner(System.in);
	System.out.println("enter the name of the bowler");
	name=xx.next();
	System.out.println("enter the no of matches played");
	no_of_matches_played=xx.nextInt();
	System.out.println("enter the no of runs scored by the bowler");
	runs_given=xx.nextInt();
	}
	void cal_average(String nm,int matches,int number)
	{
		System.out.println("name="+nm);
		System.out.println("no_of_matches_played="+matches);
		System.out.println("number of runs scored="+number);
		System.out.println("average="+(double) number/matches); 
	}
	
	
	
}

class player_main
{
	public static void main(String args[])
	{
		int m,n;
		Scanner xx=new Scanner(System.in);
	    System.out.println("enter the no of batsman");
		m=xx.nextInt();
		batsman bat[]=new batsman[m];//array of references
		for(int i=0;i<m;i++)
	  {
	     bat[i]=new batsman(); //actual object is created
		 bat[i].getdata();
		 bat[i].cal_average(bat[i].name,bat[i].no_of_matches_played,bat[i].runs_scored);
	  }
	  System.out.println("enter the no of bowler");
	  n=xx.nextInt();
	  bowler bow[]=new bowler[n];
	  for(int i=0;i<n;i++)
	  {
	     bow[i]=new bowler(); 
		 bow[i].getdata();
		 bow[i].cal_average(bow[i].name,bow[i].no_of_matches_played,bow[i].runs_given);
	  }
	}
}
	  


