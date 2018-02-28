import java.util. *;
import java.lang. *;
import java.util.Scanner;
class Mulcatch
{
	public static void main(String ar[])throws Exception
	{
		int pp,sp,profit,loss;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PP and SP");
		pp=sc.nextInt();
		sp=sc.nextInt();
		if(pp>sp)
		{
			loss=pp-sp;
			throw new Exception("Loss is"+loss);
		}
		else
		{
			profit=sp-pp;
			System.out.println("Profit is "+profit);
		}
	}
}