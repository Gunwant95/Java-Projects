class Time1
{
	int hr;
	int min;
	Time1(int h,int m)
	{
		hr=h;
		min=m;
	}
	Time1()
	{}
	void disp()
	{
		System.out.println("Hours\t"+hr+"\tMinute"+min);
	}
	void add(Time1 a,Time1 b)
	{
		min=a.min+b.min;
		hr=min/60;
		min=min%60;
		hr=hr+a.hr+b.hr;
	}
	Time1 add(Time1 a)
	{
		Time1 temp=new Time1();
		temp.min=min+a.min;
		temp.hr=temp.min/60;
		temp.min=temp.min%60;	
		temp.hr=temp.hr+hr+a.hr;
		return(temp);
	}
}
class ObjDemo
{
	public static void main(String arhs[])
	{
		Time1 t1=new Time1(2,35);
		Time1 t2=new Time1(1,45);
		Time1 t3=new Time1();
		t3.add(t1,t2);
		t1.disp();
		t2.disp();
		t3.disp();
		Time1 t4;
		t4=t1.add(t2);
		t4.disp();
	}
}