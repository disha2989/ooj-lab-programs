import java.util.Scanner;

abstract class solid
{
abstract void surface_area();
abstract void volume();
}

class cylinder extends solid
{
	double a,b;
	void surface_area()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enetr the radius of the cylinder");
		a=ss.nextDouble();
		System.out.println("enetr the height of the cylinder");
		b=ss.nextDouble();
        System.out.println("surface area of cylinder="+((2*3.14*a*b)+(2*3.14*Math.pow(a,2))));		
	}
	void volume()
	{	
		System.out.println("volume="+(3.14*Math.pow(a,2)*b));
	}
}
class cone extends solid
{
	double a,b,c;
	void surface_area()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enetr the radius of the cone");
		a=ss.nextDouble();
		System.out.println("enetr the height of the cone");
		b=ss.nextDouble();
		System.out.println("enetr the slant height of the cone");
		c=ss.nextDouble();
        System.out.println("surface area of cone="+(3.14*Math.pow(a,2)+3.14*a*c));		
	}
	void volume()
	{	
		System.out.println("volume="+((3.14*Math.pow(a,2)*b)/3));
	}
	
}
	
class shape_main
{
	public static void main(String args[])
	{
		cylinder cy=new cylinder();
		cy.surface_area();
		cy.volume();
		cone co=new cone();
		co.surface_area();
		co.volume();
	}
}
		
		
//surface_area of cylinder---2 pi rh+2pi rsquare
//volume===pr rsquare h
		
//surface aarea of cone===pi rquare+ pi r l(whre l is rootover rsquare+hsquare)
//volume-1/38pi rsqaure h	
