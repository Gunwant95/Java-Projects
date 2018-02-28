public class Visi11
{
	int l,b,h;
	public int get_vol()
	{
		return(l*b*h);
	}
	Visi11()
	{
		this(10,10);
		System.out.println("Finished with COnstructor");
	}
	Visi11(int ll,int bb)
	{
		this(ll,bb,10);
		System.out.println("Finished Constructor 2");
	}
	Visi11(int ll,int bb,int hh)
	{
		l=ll;
		h=hh;
		b=bb;
		System.out.println("This is a Third constructor");
	}
	public static void main(String ar[])
	{
		Visi11 v1,v2;
		v1=new Visi11();
		v2=new Visi11(10,20);
		System.out.println("Volume of cube1 is\t"+v1.get_vol());
		System.out.println("Volume of cube2 is\t"+v2.get_vol());
	}
}
		