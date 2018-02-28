import java.util.*;
import java.io.*;
class Apple
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	float a[]=new float[7];
	String s[]=new String[7];
	float p=0;
	System.out.println("Enter the name of day and no. of apple sales");

	for(int i=0;i<7 ;i++)
	{
	s[i]=sc.next();
	a[i]=sc.nextFloat();
	p=p+a[i];
	}
	float avg;
	avg=p/7;
	System.out.println("Average sale of the day="+avg);
	}
}