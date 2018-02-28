import java.awt.*;
import java.awt.event.*;
class windowDemo extends Frame
{
	windowDemo()
	{
	setvisible(true);
	setSize(400,400);
	setTitle("windowDemo");
	wa a=new wa();
	addWindowListener(a);

	}
class wa extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
	System.out.println("Window is Closing");
	System.exit(0);
	}
}
}

class Demoo
{
	public static void main(String ar[])
	{
	new windowDemo();
	}

}
