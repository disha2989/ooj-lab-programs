package cie;
import  java.util.Scanner;

public class student
{
	
	public String usn;
	public String name;
	public int sem;
	public void getdata()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the student usn");
		usn=ss.next();
		System.out.println("enter the name of the student");
		name=ss.next();
		System.out.println("enter the semester");
		sem=ss.nextInt();
	}
	public void printdata()
	{
		System.out.println("usn="+usn);
		System.out.println("name="+name);
		System.out.println("sem="+sem);
	}
}

