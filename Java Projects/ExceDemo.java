class ExceDemo
{
	public static void main(String ar[])
	{
		int a,b,c;
		a=10;
		b=0;
		try
		{
			c=a/b;
			System.out.println("Division is="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("No is not divided by zero");
		}
	}
}