package info;
public class pack
{
	private int emp_no;
	private String name;
	private double sal;
	public pack(int a,String b,double s)
	{
		emp_no=a;
		name=b;
		sal=s;
	}
	public void disp()
	{
		System.out.println("Emp_no ="+emp_no);
		System.out.println("emp_name="+name);
		System.out.println("Salary="+sal);
	}
}