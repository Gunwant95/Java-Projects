import info.*;
class pkgtest
{
	public static void main(String ar[])
	{
		pack p=new pack(10,"xyz",5000.0);
		pack2 p1=new pack2(50,"ABC");
		System.out.println("Employee data is...");
		p.disp();
		System.out.println("Student data is...");
		p1.show();
	}
}