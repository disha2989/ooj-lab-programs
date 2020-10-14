import java.util.Scanner;
class array{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int array[];
		int positive=0,negative=0,zero=0;
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		array=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the array elements");
			array[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]>0)
				positive++;
			else if(array[i]<0)
				negative++;
			else
				zero++;
		}
		System.out.println("positive numbers = "+positive);
		System.out.println("negative numbers = "+negative);
		System.out.println("Zero = "+zero);
	}
}
