package cie;
import  java.util.Scanner;

public class internals extends student 
{
	
	public double cie_marks[]=new double[5];
	public void get_cie_marks()
	{
		getdata();
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the cie marks of 5 subjects");
		for(int i=0;i<5;i++)
		{
			cie_marks[i]=ss.nextDouble();
		}
	}
	public void print_cie_marks()
	{
		printdata();
		System.out.println("cie marks:");
		for(int i=0;i<5;i++)
		{
			System.out.println(cie_marks[i]);
		}
	}
}
		
