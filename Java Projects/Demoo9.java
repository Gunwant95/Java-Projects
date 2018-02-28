import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class mypanel extends Panel
{
	public void paintComponent(Graphics g)
	{
		g.drawRect(100,5500,500,200);
	}
}

class Demoo9 extends Frame implements ActionListener
{
	Demoo9()
	{
	setVisible(true);
	setSize(400,400);
	setTitle("Demo9");
	setLayout(new FlowLayout());
	Button b=new Button("Hello");
	add(b);

	b.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
	TextField t=new TextField(5);
	add(t);
	//int x=getX();

	}

	public static void main(String ar[])
	{
	Demoo9 b=new Demoo9();
	}
}
