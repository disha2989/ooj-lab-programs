import java.util.Scanner;
class bill
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double rate[];
		int quantity[];
		double total_bill=0,final_bill;
		System.out.println("enter the number of items purchased");
		int n=s.nextInt();
		rate=new double[n];
		quantity=new int[n];
		System.out.println("enter the price per item");
		for(int i=0;i<n;i++)
		{
			rate[i]=s.nextDouble();
		}
		System.out.println("enter the quantities of item purchased");
		for(int i=0;i<n;i++)
		{
			quantity[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			total_bill+=rate[i]*(double)quantity[i];
		}
		if(total_bill>=10000)
		{
			final_bill=total_bill-(.05*total_bill);
		}
		else if(total_bill>=7500 && total_bill<10000)//else if---------important
		{
			final_bill=total_bill-(.03*total_bill);
		}
		else if(total_bill>=5000)
		{
			final_bill=total_bill-(.02*total_bill);
		}
		else 
		{
			final_bill=total_bill;
		}
			
		System.out.println("final bill amount="+final_bill);
	}
}
		
		
