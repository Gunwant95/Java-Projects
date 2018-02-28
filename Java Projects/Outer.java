interface A
{
	void disp();
}
class Outer
{
	public static void main(String ar[])
	{
		A ref=new A()
			{
				public void disp()
				{
					System.out.println("From anonymous disp");
				}
			};
		ref.disp();
	}
}