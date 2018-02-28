import java.util.*;
import java.lang.*;
class A
{
	public int a;
	A(int x)
	{
		a=x;
	}
}
class B extends A
{
	int b;
	B(int y,int x)
	{
		super(y);
		b=x;
	}
}
class C extends B
{
	int c;
	C(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}
	void disp()
	{
		System.out.println("value of a= "+a);
		System.out.println("value of b= "+b);
		System.out.println("value of c= "+c);
	}
	public static void main(String arg[])
	{
		C c=new C(10,20,30);
		c.disp();
	}
}
