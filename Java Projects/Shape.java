import java.util.*;
class Shape
{

	static int side,len,breadth;

	static double area;

	public static void main(String args[])
	{

	int n;
	Scanner input=new Scanner(System.in);
	Shape side=new Shape();

	System.out.println("Enter no");

	n=input.nextInt();
	Shape.area(n);

	Shape rect=new Shape();
	System.out.println("Enter the length and breadth");

	int a=input.nextInt();

	int b=input.nextInt();

	Shape.area(a,b);

	}

	static void area(int a)
	{

	side=a;

	area=side*side;

	System.out.println("Area of Square"+area);

	}

	static void area(int x,int y)
	{

		len=x;
		breadth=y;

		area=len*breadth;
		System.out.println("Area of rectangle is"+area);
	}
}
