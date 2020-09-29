import java.util.*;
public class Main
{
public static void main(String[] args) {
   
double a,b,c,d,r1,r2;
System.out.println("Enter the values of a,b and c");
Scanner sc = new Scanner(System.in);
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
d=(b*b)-(4*a*c);
if(d>0)
{
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Root1="+r1+"Root2="+r2);
}
else if(d==0)
{
r1=r2=-b/(2*a);
System.out.println("Root1=Root2="+r1);
}
else
{
System.out.println("There are no real solutionss for the given equation");
}
}}
