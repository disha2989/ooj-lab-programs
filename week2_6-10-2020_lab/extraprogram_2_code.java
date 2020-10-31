import java.util.Scanner;
class Book{
	private String book_id;
	private String book_title;
	private int no_of_pages;
	private int year_of_pub;
	private String author;
	private String publisher;
	private double price;
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the details of the book");
		System.out.println("enter the book id");
		book_id=s.next();
		System.out.println("enter the book title");
		book_title=s.next();
		System.out.println("enter the number of pages");
		no_of_pages=s.nextInt();
		System.out.println("enter the year of publication");
		year_of_pub=s.nextInt();
		System.out.println("enter the author name");
		author=s.next();
		System.out.println("enter the publisher name");
		publisher=s.next();
		System.out.println("enter the price of the book");
		price=s.nextDouble();
	}
	void display_details()
	{
		System.out.println("book details");
		System.out.println("book id= "+book_id);
		System.out.println("book title= "+book_title);
		System.out.println("number of pages= "+no_of_pages);
		System.out.println("year of publication= "+year_of_pub);
		System.out.println("author= "+author);
		System.out.println("publisher name= "+publisher);
		System.out.println("price= "+price);
	}
	double return_price()
	{
		return price;
	}
	String return_author()
	{
		return author;// not "author"?
	}
	int return_year_of_pub()
	{
		return year_of_pub;
	}
	int return_no_of_pages()
	{
		return no_of_pages;
	}
}
class BookMain{
	public static void main(String args[])
	{
		int count=0;
		String check;
		boolean i,j,k;
		Scanner s=new Scanner(System.in);
		Book b1 =new Book();
		b1.getData();
		Book b2 =new Book();
		b2.getData();
		Book b3 =new Book();
		b3.getData();
				 System.out.println();
		//author name and displaying details
		System.out.println("enter the name of the author");
		check=s.next();
	    i=check.equals(b1.return_author());
        j=check.equals(b2.return_author());
        k=check.equals(b3.return_author());
        if(i==true)
        {
         System.out.println("\nThe details of the book written by "+check+" are as follows:");
         b1.display_details();
        }
        if(j==true)
        {
        System.out.println("\nThe details of the book written by "+check+" are as follows:");
        b2.display_details();
         }
        if(k==true)
         {
         System.out.println("\nThe details of the book written by "+check+" are as follows:");
         b3.display_details();
         }
				 System.out.println();
		//for most expensive book 
		 System.out.println("most expensive book");
		if(b1.return_price()>b2.return_price())
		{
			if(b1.return_price()>b3.return_price())
				b1.display_details();
			else
				b3.display_details();
		}
		else 
		{
			if(b2.return_price()>b3.return_price())
				b2.display_details();
			else
				b3.display_details();
		}
				 System.out.println();
		//count of books published in year 2020
		
		if(b1.return_year_of_pub()==2020)
		count++;
	    if(b2.return_year_of_pub()==2020)
		count++;
	    if(b3.return_year_of_pub()==2020)
		count++;
	    System.out.println("no of books published in the year 2020 is "+count);
				 System.out.println();
		//book details with least no of pages
	    System.out.println("details of book with least no.of pages is:");
		if(b1.return_no_of_pages()>b2.return_no_of_pages())
		{
			if(b2.return_no_of_pages()>b3.return_no_of_pages())
			    b3.display_details();
		    else
				b2.display_details();
		}
		else
		{
			if(b1.return_no_of_pages()>b3.return_no_of_pages())
			    b3.display_details();
		    else
				b1.display_details();				
		}
	}
}
