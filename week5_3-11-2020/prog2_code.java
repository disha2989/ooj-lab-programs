import java.util.Scanner;
abstract class shape
{
	
	int i,j;
	abstract void printArea();
}
class Rectangle extends shape
{
	
	void printArea()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		i=ss.nextInt();
		System.out.println("enter the breadth of the rectangle");
		j=ss.nextInt();
        System.out.println("area of the rectangle="+(i*j));
		
		
	}
}
class Triangle extends shape
{
	
	void printArea()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the base length of the triangle");
		i=ss.nextInt();
		System.out.println("enter the height of the triangle");
		j=ss.nextInt();
        System.out.println("area of the triangle="+(0.5*i*j));
		
	}
}
class Circle extends shape
{

	void printArea()
	{
			Scanner ss=new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		i=ss.nextInt();
        System.out.println("area of the circle="+(3.14*i*i));
		
		
	}
}
class shape_main
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.printArea();
		Triangle t=new Triangle();
		t.printArea();
		Circle c=new Circle();
		c.printArea();
		
		
	}
}


	
