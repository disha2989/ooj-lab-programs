import java.util.Scanner;
class Book{
	private String name;
	private String author;
	private double price;
	private int num_pages;
	Book()
	{
		name="xxx";
		author="yyy";
		price=10.00;
		num_pages=10;
	}
	Book(String na,String a,double p,int n)
	{
		name=na;
		author=a;
		price=p;
		num_pages=n;
	}
	void getData()
	{
		Scanner xx=new Scanner(System.in);
		System.out.println("enter the book name");
		name=xx.next();
		System.out.println("enter the author name");
		author=xx.next();
		System.out.println("enter the price");
		price=xx.nextDouble();
		System.out.println("enter the no. of pages");
		num_pages=xx.nextInt();
	}
	/*void displayDetails()
	{
		System.out.println("book name="+name);
		System.out.println("book author= "+author);
		System.out.println("price= "+price);
		System.out.println("no. of pages= "+num_pages);
	}
	*/
	public String toString()
	{
		return ("details:book name="+name+" author="+author+" price="+price+" no.of pages="+num_pages);
	}
}
class bookMain
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
        int n;  
        System.out.println("Enter the number of books");
        n=sc.nextInt();
        Book[] ob=new Book[n];
        for(int i=0;i<n;i++)
        {
			ob[i]=new Book();
			//ob[i]=new Book("awesome","me",200.99,200);
			ob[i].getData();
			System.out.println(ob[i]);
		}
		
	}
}
