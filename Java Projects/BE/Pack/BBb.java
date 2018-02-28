package pa;
class AAa
{
	int a=10;
	void show()
	{
		System.out.println("\n a=" +a);
	}
}

 class BBb extends AAa
{
	int b=20;
	void disp()
	{
		System.out.println("\n b="+b);
	}
	
	public static void main(String ar[])
	{
		BBb b1=new BBb();
		b1.show();
		b1.disp();
	}
}