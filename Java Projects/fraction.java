class fraction
{
	float num,den,frac;

	fraction()
	{
		num=7.8f;
		den=6.7f;
	}

	fraction(float a)
	{

		num=a;
		den=a;
	}

	fraction(float a,float b)
	{
		num=a;
		den=b;
	}
	void display()
	{

		frac=num/den;
		System.out.println("Numerator="+num);
		System.out.println("Denominator="+den);
		System.out.println("Fraction="+frac);
	}
	public static void main(String args[])
	{
		fraction f1,f2,f3;

		f1=new fraction();
		f2=new fraction(6.9f);
		f3=new fraction(2.3f,5.6f);

		f1.display();
		f2.display();
		f3.display();
	}
}