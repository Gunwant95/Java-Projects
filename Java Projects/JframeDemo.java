import java.awt.*;
import javax.swing.*;

class JframeDemo extends JFrame
{
	JframeDemo()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("Gunawant");

		Container cp=getContentPane();
		cp.setBackground(Color.red);
	}

	public static void main(String args[])
	{
		new JframeDemo();
	}
}
