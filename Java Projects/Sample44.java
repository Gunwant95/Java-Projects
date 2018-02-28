import java.util.Scanner;
import java.lang.String;
class Sample44
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int min=0;
		System.out.println("Enter No.");
		for(int i=0;i<5;i++)
		{
			 a[i]=sc.nextInt();
			min=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Minimum value is" +min);
	}
}