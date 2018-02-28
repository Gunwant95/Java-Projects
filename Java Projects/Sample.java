import java.util.*;
class Sample
{
	public static void main(String args[])	
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the no");
		x=sc.nextInt();
		if(x%2==0)
			System.out.println("x is Even no");
		else
			System.out.println("x is odd no");
	}
}