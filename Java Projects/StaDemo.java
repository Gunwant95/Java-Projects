class I
{
	String In;
	float r,amt;
	int qa;
	static float total;
	static int count;
	I(String i,float f,int q)
	{
		In=i;	
		r=f;
		qa=q;
	amt=r*qa;
	total=total+amt;
	count++;
	}
	void show()
	{
		System.out.println("Name\t"+In+"Rate\t"+r+"Quantity\t"+qa+"Amount\t"+amt);
	}
	static void sho()
	{
		System.out.println("Total is of \t"+count+"Item is\t"+total);
	}
}
class StaDemo
{
	public static void main(String ar[])
	{
		I a=new I("parleG",5.5f,4);
		I b=new I("Kitkat",10,5);
		a.show();
		b.show();
		I.sho();
	}
}
	