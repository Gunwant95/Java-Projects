class Reverse
{
	public static void main(String ars[])
	{

	int rem,result=0,no=352;

	System.out.println("Before reverse of no is="+no);

	while(no>0)
	{

	rem=no%10;
	result=result*10+rem;
	no=no/10;
	}

	System.out.println("After reverse of no"+result);
}
}