import java.util.Scanner;
class Student{
	String name;
	String usn;
	int array_credits[];
	double array_marks[];
	int n;
	void getStudentData()
	{
		System.out.println("enter the student details");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name");
		name=s.next();
		System.out.println("enter the student USN");
		usn=s.next();
		System.out.println("enter the number of subjects");
		n=s.nextInt();
		array_credits=new int[n];
		array_marks=new double[n];
		System.out.println("enter the credits of each subject");
		for(int i=0;i<n;i++)
		{
			array_credits[i]=s.nextInt();
		}
		System.out.println("enter the marks of each subject");
		for(int i=0;i<n;i++)
		{
			array_marks[i]=s.nextDouble();
		}
	}
	void calculate_SGPA()
	{
		double sgpa=0;
		double tot_credits=0;
		for(int i=0;i<n;i++)
		{
			tot_credits=tot_credits+array_credits[i];
			sgpa=sgpa+(array_credits[i]*array_marks[i]);
		}
		
		sgpa=sgpa/tot_credits;
		System.out.println("the total marks of the student is "+sgpa);
		if(sgpa>=90)
		System.out.println("sgpa= S ");
	    else if(sgpa>=80)
		System.out.println("sgpa= A ");
	    else if(sgpa>=70)
		System.out.println("sgpa= B ");
	    else if(sgpa>=60)
		System.out.println("sgpa= C ");
	    else if(sgpa>=50)
		System.out.println("sgpa= D ");
	    else if(sgpa>=40)
		System.out.println("sgpa= E ");
	    else
		System.out.println("sgpa= F ");
	}
	void display_details()
	{
		System.out.println("student details:");
		System.out.println("name= "+name);	
		System.out.println("usn= "+usn);
		System.out.println("marks obtained by the student are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array_marks[i]);
		}
	}
}
	

class stdmain{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.getStudentData();
		s1.display_details();
		s1.calculate_SGPA();
	}
}
			
			
