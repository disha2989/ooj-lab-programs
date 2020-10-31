import java.util.Arrays;//---for ascending order and descending
class cmdline
{
   public static void main(String sss[])
   {
	   int x=sss.length;
	   double array[]=new double[x];
	   for(int i=0;i<x;i++)
	   {
		   array[i]=Double.parseDouble(sss[i]);
	   }
	   Arrays.sort(array);
System.out.println("Elements of array sorted in ascending order: "); 	   
	   for (int i=0;i<x;i++)   
        {       
          System.out.println(array[i]);   
        }   
   }
}
