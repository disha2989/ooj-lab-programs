package see;
import  java.util.Scanner;
import cie.*;

public class externals extends cie.student
{
	public double see_marks[]=new double[5];
	/*
	public void get_studdata()
	{
		cie.student.getdata();
	}
	public void print_studdata()
	{
		cie.student.printdata();
	}
	*/
		
	public void get_see_marks()
	{
		
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the see marks of 5 subjects");
		for(int i=0;i<5;i++)
		{
			see_marks[i]=ss.nextDouble();
		}
	}
	public void print_see_marks()
	{
		System.out.println("see marks:");
		for(int i=0;i<5;i++)
		{
			System.out.println(see_marks[i]);
		}
	}
}


