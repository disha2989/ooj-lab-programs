import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[];
		int b[];
		int c[];
		int odd=0,even=0;
		int sum=0,average=0,max,min;
		System.out.println("enter the number of elements in array A");
		int n=s.nextInt();
		a=new int[n];
		b=new int[n];
		c=new int[n];
		System.out.println("enter the elements of the array A");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			if(a[i]%2!=0)
			{
				b[odd]=a[i];
				odd++;
			}
			else
			{
				c[even]=a[i];
				even++;
			}
		}
		System.out.println("b elements");
		for(int i=0;i<odd;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("c elements");
		for(int i=0;i<even;i++)
		{
			System.out.println(c[i]);
		}
		for(int i=0;i<even;i++)
		{
			sum+=c[i];
		}
		average=sum/even;
		max=c[0];
		min=c[0];
		for(int i=0;i<even;i++)
		{

			if(c[i]>max)
			{
				max=c[i];
			}
			
			if(c[i]<min)
			{
				min=c[i];
			}
			
		}
		System.out.println("sum="+sum);
		System.out.println("average="+average);
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
}
			
	
