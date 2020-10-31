import java.util.Scanner;
class CircleDemo
{
	Scanner ss=new Scanner(System.in);
	double radius;
    double area;
    double perimeter;
	void set_radius()
	{
		System.out.println("enter the radius of the circle");
		this.radius=ss.nextDouble();
	}
	void set_area()
	{
		area=3.14*(Math.pow(radius,2));
		
	}
	void set_perimeter()
	{
		perimeter=(2*3.14*radius);

		
	}
	void display_details()
	{
		System.out.println("radius="+radius);
		System.out.println("area="+area);
  	    System.out.println("perimeter="+perimeter);
	}
}
class circle_main
{
	public static void main(String args[]) 
	{
		CircleDemo c1=new CircleDemo();
		c1.set_radius();
		c1.set_area();
		c1.set_perimeter();
		c1.display_details();
	}
}
		
