import java.util.Scanner;
class quadratic{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		double a,b,c,d,r1,r2;
		a =s.nextDouble();
		b =s.nextDouble();
		c =s.nextDouble();
		d=(b*b)-(4*a*c);
		if (d>0)
		{
			System.out.println("the quadratic equation has real and distinct roots");
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("roots are "+r1+" and "+r2);
	    }else if(d==0){
			System.out.println("the quadratic equation has real and equal roots");
			r1=-b/(2*a);
			r2=r1;
			System.out.println("roots are "+r1+" and "+r2);
		}else{
			System.out.println("the quadratic equation has imaginary roots");
		}
	}
}
			
			
			
			
