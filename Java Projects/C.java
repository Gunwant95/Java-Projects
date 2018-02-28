import java.util.*;
import java.lang.*;
final class A
{
	final void disp()
	{
		System.out.println("This method is final method");
	}
}
class C extends A
{
	void disp()
	{
		System.out.println("Illegal");
	}
	public static void main(String ar[])
	{
		C c=new C();
		c.disp();
	}
}				