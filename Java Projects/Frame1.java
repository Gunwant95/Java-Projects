import java.awt.event.*;
import java.applet.*;
import java.awt.*;
/*
<applet code="Frame1"width=300 height=50>
</applet>
*/
class Sample extends Frame
{
Sample(String title)
{
	super(title);
	MyWindowAdapter adapter=new MyWindowAdapter(this);
	addWindowListener(adapter);

}
public void paint(Graphics g)
{
	g.drawString("This is Frame Window",10,40);
}
}
class MyWindowAdapter extends WindowAdapter
{
	Sample sample;
	public MyWindowAdapter(Sample Sample)
	{
	this.sample=sample;
	}
	public void windowClosing(WindowEvent we)
	{
	sample.setVisible(false);
	}
}
class Frame1 extends Applet
{
	Frame f;
	public void init()
	{
	f=new Sample("A Frame Window title bar");
	f.setSize(300,300);
	f.setVisible(true);
	}

	public void paint(Graphics g)
	{
	g.drawString("This is an applet window",20,20);
	}
}

