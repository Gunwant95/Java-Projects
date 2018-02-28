package info;
public class pack2
{
	private int roll_no;
	private String name;
	public pack2(int r,String n)
	{
		roll_no=r;
		name=n;
	}
	public void show()
	{
		System.out.println("Student roll no is=" +roll_no);
		System.out.println("Student name is" +name);
	}
}