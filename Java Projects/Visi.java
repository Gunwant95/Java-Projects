import java.util.*;
import java.lang.*;
class A
{
	int x;
}
class B extends A
{
	int y;
}
class C extends B
{
	int z;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Value for x");
		x=sc.nextInt();
		System.out.println("Value for y");
		y=sc.nextInt();
		System.out.println("Value for z");
		z=sc.nextInt();
	}
	void disp()
	{
		System.out.println("x=\t"+x+"y=\t"+y+"Z=\t"+z);	
	}
}
class Visi
{
	public static void main(String arp[])
	{
		C c1=new C();
		c1.input();
		c1.disp();
	}
}