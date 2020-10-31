import java.util.Scanner;
class age{
int years;
int months;
String name;
void getdata()
{
Scanner ss=new Scanner(System.in);
System.out.println("enter the name of person");
this.name=ss.next();
System.out.println("enter the age of 1st person(years and months old)");
this.years=ss.nextInt();
this.months=ss.nextInt();
}
age elder_calculation(age z)
{
	age temp=new age();
	if(this.years>z.years)
	{
		temp.name=this.name;
	}
	else if(this.years<z.years)
	{
		temp.name=z.name;
	}
	else
	{
		if(this.months>z.months)
			temp.name=this.name;
		if(this.months<z.months)
            temp.name=z.name;
	}
	return temp;
}
public String toString()
	{
		return ("the eldest person is:"+name);
	}
}
class age_main
{
	public static void main(String args[])
	{
		age a1=new age();
		a1.getdata();
		age a2=new age();
		a2.getdata();
		age a3=new age();
		a3=a1.elder_calculation(a2);
		System.out.println(a3);
		
	}
}
