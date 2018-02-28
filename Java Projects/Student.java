class Student
{
	String name;
	int roll_no;
	static int sub1,sub2;
	void get(String n,int r,int s1,int s2)
	{
		name=n;
		roll_no=r;
		sub1=s1;
		sub2=s2;
	}

	void display()
	{

	System.out.println("Roll no is="+roll_no);
	System.out.println("Name is="+name);
	System.out.println("Sub1 and sub2="+sub1+" "+sub2);
	float per;

	int total;

	total=sub1+sub2;

	per=total/2;
	System.out.println("Total="+total);
	System.out.println("Percentage="+per);
	}
	public static void main(String args[])
	{

		Student s=new Student();
		s.get("xyz",44,67,87);

		s.display();

	}
}
