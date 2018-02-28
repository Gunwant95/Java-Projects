import java.awt.*;
class My extends Frame
{
	My()
	{
	setVisible(true);
	setSize(400,400);
	setTitle("GSK");
	Button b1=new Button("Add");
	add(b1);
	Button b2=new Button("Display");
	add(b2);
	}
	public static void main(String ar[])
	{
		My f=new My();
	}
}