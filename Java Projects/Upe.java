class Em
{
	int bs,da;
	Em()
	{}
	Em(int b,int a)
	{
		bs=b;
		da=a;
	}
	void op()
	{
		System.out.println("B is\t"+bs+"\t Da is\t"+da);
	}
	void sum(Em a,Em b)
	{
		bs=a.bs+b.bs;
		da=a.da+b.da;
	}
	void greater(Em a)
	{
		System.out.println("Values of greater package");
		if((bs+da)>(a.bs+a.da))
			op();
		else
			a.op();
	}
}
class Upe
{
	public static void main(String ar[])	
	{
		Em e1=new Em(2000,1500);
		Em e2=new Em(6000,2000);
		Em e3=new Em();
		e3.sum(e1,e2);
		e1.greater(e2);
		e1.op();
		e2.op();
		e3.op();
	}
}