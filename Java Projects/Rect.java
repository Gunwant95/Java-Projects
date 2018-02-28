class Rect1
{
	int len,br;
	Rect1(int l,int b)
	{
		len=l;
		br=b;
	}
	void disp()
	{
		System.out.println("Len\t"+len+"\tBreath"+br);
	}
}
class Rect
{
	public static void main(String rr[])
	{
		Rect1[] r=new Rect1[4];
		int i;
		r[0]=new Rect1(10,20);
		r[1]=new Rect1(3,4);
		r[2]=new Rect1(4,6);
		r[3]=new Rect1(200,100);
		for(i=0;i<r.length;i++)
			r[i].disp();
	}
}