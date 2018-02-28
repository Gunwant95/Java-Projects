import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class J2 extends Frame implements ActionListener
{
	int res,x,y,z;
	Label l,l1;
	Button b;
	TextField t,t2,t3;

	J2()
	{
	setVisible(true);
	setSize(400,400);
	setTitle("Java2");
	setLayout(new GridLayout(3,2));
	l=new Label("No1");
	add(l);
	t=new TextField(4);
	add(t);
	l1=new Label("No2");
	add(l1);
	t2=new TextField(4);
	add(t2);
	b=new Button("Res");
	add(b);
	t3=new TextField(4);
	add(t3);
	b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	x=(Integer.parseInt(t.getText()));
	y=(Integer.parseInt(t2.getText()));
	res=(x+y);
	e.setbackgroundColor(Color.red);


	}
	public static void main(String ar[])
	{
	new J2();
	}
}
