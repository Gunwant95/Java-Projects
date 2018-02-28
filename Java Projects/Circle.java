class Circle
{
	double pi=3.14;
	double area;
	int r;
	
	public static void main(String args[])
	{
	
	Circle c=new Circle();
	
	c.getdata(5);
	c.putdata();
	}
	
	void getdata(int r1)
	{
	
		r=r1;
		area=pi*r*r;
	}
	
	void putdata()
	{
		System.out.println("Area of circle="+area);
	}
}