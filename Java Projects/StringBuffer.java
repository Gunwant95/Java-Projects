import java.util.*;
import java.io.*;

public class StringBuffer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="java";
		int l,f=0,ctr=0;
		l=s.length();

		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='a')
			{
				f=1;
				ctr++;
			}
		}

		if(f==1)
		{
			System.out.println("The no. of A is="+ctr);
		}
		else
			System.out.println("No. is not found");
	}
}