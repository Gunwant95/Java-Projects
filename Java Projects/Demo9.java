import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Demo9 extends Frame
{
	Demo9()
	{
	setVisible(true);
	setSize(400,400);
	setTitle("Demo");
	setLayout(new GridLayout(100,50));
	Button b=new Button("First");
	add(b);

	Button b2=new Button("Second");
	add(b2);
	Button b3=new Button("Third");
	add(b3);
	Button b4=new Button("Four");
	add(b4);
	//b.addActionListener(this);

	}

	public static void main(String args[])
	{
	Demo9 d=new Demo9();
	}
}
//public void actionPerformed(ActionEvent e)


