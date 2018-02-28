import java.awt.*;
class Demo extends Frame
{
	Demo()
	{
	setVisible(true);
	setSize(400,400);
	setLayout(new GridLayout(3,2,15,15));
	Button b1=new Button("First");
	add(b1);
	Button b2=new Button("Second");
	add(b2);
	Button b3=new Button("Third");
	add(b3);
	Button b4=new Button("Four");
	add(b4);
	Button b5=new Button("Five");
	add(b5);
	Button b6=new Button("six");
	add(b6);
	validate();
	}
	public static void main(String ar[])
	{
		new Demo();
	}
}
