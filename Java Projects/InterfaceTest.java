class InterfaceTest
{
	int x;
	class Inner
	{
		int y;
		Inner(int a)
		{
			y=a;
		}
		void dip()
		{
			System.out.println("x= "+x);
			System.out.println("Y= "+y);
		}
	}
	void out()
	{
		Inner obj=new Inner(10);
		obj.dip();
	}
	public static void main(String ar[])
	{
		InterfaceTest o=new InterfaceTest();
		o.out();
		o.y=20;
		System.out.println(o.y);
	}
}