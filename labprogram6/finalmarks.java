import cie.*;
import see.*;

class finalmarks
{
	public static void main(String args[])
	{
		cie.internals ob1=new cie.internals();
		//cie.student ob3=new cie.student();
		see.externals ob2=new see.externals();
		//ob2.get_studdata();
		//ob2.print_studdata();
	
		//ob3.getdata();
		ob1.get_cie_marks();
		//ob1.print_cie_marks();
		ob2.get_see_marks();
		//ob2.print_see_marks();
		System.out.println("total marks:");
		for(int i=0;i<5;i++)
		{
			System.out.println("subject "+(i+1)+"="+(ob1.cie_marks[i]+ob2.see_marks[i]));
		}
	}
}		
