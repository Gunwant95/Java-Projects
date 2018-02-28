
import java.util.*;
class Item
{

	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	int code[]=new int[5];
	float price[]=new float[5];
	float a=0;
	System.out.println("Enter the code and price");
	for(int i=0;i<5;i++)
	{
	code[i]=sc.nextInt();
	price[i]=sc.nextFloat();
	a=a+price[i];

	System.out.println("Code is="+code[i]);
	System.out.println("price is="+price[i]);

	}

	float avg;
	avg=a/5;

	System.out.println("Average is="+avg);
	}
}
