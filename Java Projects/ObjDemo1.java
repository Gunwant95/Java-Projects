class Res
{
	int phy,che,math;
	Res(int p,int c,int m)
	{
		phy=p;
		che=c;
		math=m;
	}
	Res(){}
	void show()
	{
		System.out.println("Physics\t"+phy+"\tChemistry\t"+che+"\tMath\t"+math);
	}
	Res grace()
	{
		Res temp=new Res();
		temp.phy=phy+5;
		temp.che=che+5;
		temp.math=math+3;
		return(temp);
	}
}
class ObjDemo1
{
	public static void main(String args[])
	{
		Res r1=new Res(40,50,60);
		Res r2;
		r2=r1.grace();
		r1.show();
		r2.show();
	}
}