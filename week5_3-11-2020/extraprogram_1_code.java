import java.util.Scanner;
class person
{
	String name;
	void set_person()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the name of the person");
		name=ss.next();
	}
	void print_person()
	{
		System.out.println("name="+name);
	}
}
class employee extends person
{
	int emp_id;
	void set_employee()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the employee id");
		emp_id=ss.nextInt();
	}
	void print_emp_id()
	{
		System.out.println("employee id="+emp_id);
	}
}
class student extends person
{
	int student_id;
	void set_student_id()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the student id");
		student_id=ss.nextInt();
	}
	void print_student_id()
	{
		System.out.println("student id="+student_id);
	}
}
class teaching extends employee
{
	double salary_1;
	void set_salary_1()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the salary of teaching employees");
		salary_1=ss.nextDouble();
	}
	void print_salary_1()
	{
		System.out.println("salary of teaching employees="+salary_1);
	}
}
class non_teaching extends employee
{
   double salary_2;
	void set_salary_2()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the salary of non-teaching employees");
		salary_2=ss.nextDouble();
	}
	void print_salary_2()
	{
		System.out.println("salary of non-teaching employees="+salary_2);
	} 
}
class ug extends student
{
   double marks_1;
   void set_marks_1()
   {
	   Scanner ss=new Scanner(System.in);
	   System.out.println("enter the marks of ug student");
	   marks_1=ss.nextDouble(); 
   }
   void print_marks_1()
   {
	   System.out.println("marks of ug student="+marks_1);
   }
}
class pg extends student
{
	double marks_2;
	void set_marks_2()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the marks of pg student");
	   marks_2=ss.nextDouble();
	   
   }
   void print_marks_2()
   {
	   System.out.println("marks of pg student="+marks_2);
   }

}

class hybrid_main
{
	public static void main(String args[])
	{
		System.out.println();
		teaching t1=new teaching();
		t1.set_person();
		t1.set_employee();
		t1.set_salary_1();
		t1.print_person();
		t1.print_emp_id();
		t1.print_salary_1();
		non_teaching t2=new non_teaching();
		System.out.println();
		t2.set_person();
		t2.set_employee();
		t2.set_salary_2();
		t2.print_person();
		t2.print_emp_id();
		t2.print_salary_2();
		ug s1=new ug();
		System.out.println();
		s1.set_person();
		s1.set_student_id();
		s1.set_marks_1();
		s1.print_person();
		s1.print_student_id();
		s1.print_marks_1();
		pg s2=new pg();
		System.out.println();
		s2.set_person();
		s2.set_student_id();
		s2.set_marks_2();
		s2.print_person();
		s2.print_student_id();
		s2.print_marks_2();
	}
		
}
