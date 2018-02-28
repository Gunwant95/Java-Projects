import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		int c=0,i;

		for(i=1;i<=n;i++)
		{
			if(n%i==0)

				c++;
		}

		if(c==2)

		System.out.println(n+"is prime no");

		else

		System.out.println(n+"is not prime no");

	}
}
