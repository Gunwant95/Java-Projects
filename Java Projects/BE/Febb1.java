import java.awt.*;
import java.lang.*;
import java.awt.event.*;
class Febb1 extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Febb1()
	{
	setVisible(true);
	setSize(400,400);
	setLayout(new FlowLayout());
	setTitle("Mohit");

	b1=new Button("Mohit");
	add(b1);

	b2=new Button("Hitali");
	add(b2);

	b3=new Button("Yash");
	add(b3);

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		setBackground(Color.red);

		else if(e.getSource() == b2)
		setBackground(Color.green);

		else
		setBackground(Color.blue);
	}

	public static void main(String ar[])	
	{
		new Febb1();
	}
}