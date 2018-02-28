import java.io.*;
import java.util.*;
import java.lang.*;
class Tender
{
	String name;
	int cost;
	Tender()
	{
		name=null;
		cost=0;
	}
	Tender(String s,int a)
	{
		name=s;
		cost=a;
	}
	void disp()
	{
		System.out.println("Company name="+name+"Cost="+cost);
	}
}
class Tedemo
{


	public static void main(String args[])throws Exception
	{
		Tender T[]=new Tender[5];
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int c,temp,min=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Company name");
			s=b.readLine();
			System.out.println("Enter the Cost");
			c=Integer.parseInt(b.readLine());
			T[i]=new Tender(s,c);

		}
		for(int i=0;i<5;i++)
		{
			if(T[i].cost<min)
			{

				min=T[i].cost;
				temp=i;
			}
		}
		System.out.println("Company having minimum cost=");
		T.disp();
	}
}