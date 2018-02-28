import java.io.*;
class Sample
{
	double p,r,i;

	int n;

	Sample(double a,int b,double c)
	{
		p=a;
		n=b;
		r=c;
	}

	void display()
	{
		i=(p*n*r)/100;

		System.out.println("Amount="+n);
		System.out.println("Principle="+p);
		System.out.println("Rate="+r);
		System.out.println("Interest="+i);
	}
}
class Tree
{
	public static void main(String args[])throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter amount");

		int n=Integer.parseInt(in.readLine());
		System.out.println("Enter principle");

		double p=Double.parseDouble(in.readLine());
		System.out.println("Enter rate");

		double r=Double.parseDouble(in.readLine());

		Sample s1=new Sample(p,n,r);

		s1.display();
	}
}
