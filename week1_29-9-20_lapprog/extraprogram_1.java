import java.util.Scanner;
class array2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int array[];
		int sum1=0,sum2=0;
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		array=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		for(int i=0;i<=n-1;i=i+2)//important (n-1)
		{
			sum1= sum1+array[i];
		}
		for(int i=1;i<=n;i=i+2)
		{
			sum2= sum2+array[i];
		}
		System.out.println("sum of even indices are "+sum1);
		System.out.println("sum of odd indices are "+sum2);
	}
}
		
			
