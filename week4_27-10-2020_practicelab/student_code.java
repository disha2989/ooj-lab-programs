import java.util.Scanner;
class Student
{
	String usn;
	String name;
	int sem;
	void getdata1()
	{
		System.out.println("enter the usn");
		Scanner ss=new Scanner(System.in);
		usn=ss.next();
		System.out.println("enter the name");
		name=ss.next();
		System.out.println("enter the semester");
		sem=ss.nextInt();
	}
	void print_student_data()
	{
		System.out.println("usn- "+usn);
		System.out.println("name- "+name);
		System.out.println("sem- "+sem);
		
	}
}
class Test extends Student
{
	int n;
	double array_credits[];
	double array_cie[];
	void getdata2()
	{
	System.out.println("enter the number of courses");
	Scanner ss=new Scanner(System.in);
	n=ss.nextInt();
	array_cie=new double[n];
	array_credits=new double[n];
	System.out.println("enter the credits of "+n+" courses");//make into one loop
		for(int i=0;i<n;i++)
		{
			array_credits[i]=ss.nextDouble();
		}
	System.out.println("enter the cie marks of "+n+" courses (out of 50)");
		for(int i=0;i<n;i++)
		{
			array_cie[i]=ss.nextDouble();
		}
	}
	int return_n()
	{
		return n;
	}
	void print_ciemarks()
	{
		System.out.println("cie marks");
		for(int i=0;i<n;i++)
		{
			System.out.println(array_cie[i]);
		}
	}
	void print_credits()
	{
		System.out.println("credits");
		for(int i=0;i<n;i++)
		{
			System.out.println(array_credits[i]);
		}
	}
	
}
class Exam extends Test
{
	double array_see[];
	void getdata3()
	{
		n=return_n();
	    array_see=new double[n];
		System.out.println("enter the see marks of "+n+" courses(out of 50)");
		Scanner ss=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			array_see[i]=ss.nextDouble();
		}
	}
	void print_seemarks()
	{
		System.out.println("see marks");
		for(int i=0;i<n;i++)
		{
			System.out.println(array_see[i]);
		}
	}
		
}
class Results extends Exam
{
	int points[];
	double total[];
	char grade;
	double sum=0,grade_points=0;
	void calculate_grade()
	{
	n=return_n();
	total=new double[n];
	points=new int[n];
	for(int i=0;i<n;i++)
	{
		total[i]=array_cie[i]+array_see[i];
		if(total[i]>=90)
		{	
		points[i]=10;
		System.out.println("grade= S ");
		}
	    else if(total[i]>=80)
		{
		points[i]=9;
		System.out.println("sgpa= A ");
		}
	    else if(total[i]>=70)
		{
		points[i]=8;
		System.out.println("sgpa= B ");
		}
	    else if(total[i]>=60)
		{
		points[i]=7;
		System.out.println("sgpa= C ");
		}
	    else if(total[i]>=50)
		{
		points[i]=6;
		System.out.println("sgpa= D ");
		}
	    else if(total[i]>=40)
		{
		points[i]=5;
		System.out.println("sgpa= E ");
		}
	    else
		{
		points[i]=4;
		System.out.println("sgpa= F ");
		}
	}	
		
  }
	void calculate_result()
	{
	    	
		for(int i=0;i<n;i++)
		{
			sum=sum+(array_credits[i]);
		}
		for(int i=0;i<n;i++)
		{
			grade_points=grade_points+(points[i]*array_credits[i]);
		}
		grade_points=grade_points/sum;
		System.out.println("sgpa="+grade_points);
	}
}

class exprog1_main
{
	public static void main(String args[])
	{
		int x;
		System.out.println("enter the number of students");
		Scanner ss=new Scanner(System.in);
	    x=ss.nextInt();
		
		Results r[]=new Results[x];//references
		for(int i=0;i<x;i++)
		{
			r[i]=new Results();// actual object is created
			r[i].getdata1();
			r[i].getdata2();
			r[i].getdata3();
			System.out.println("Student details are as follows");
			r[i].print_student_data();
			r[i].print_ciemarks();
			r[i].print_credits();
			r[i].print_seemarks();
			r[i].calculate_grade();
			r[i].calculate_result();
		}
	}
}
	
	
