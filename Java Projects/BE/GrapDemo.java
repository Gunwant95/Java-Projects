import javax. swing.*;
import java. awt.*;

import java. awt.geom.*;

class myPanel extends JPanel
{
	myPanel()
	{
		setBackground(Color.black);
		setForeground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g1=(Graphics2D) g;
		Ellipse2D.Float e1=new Ellipse2D.Float();
		
		e1.setFrame(100,100,100,50);
		g1.draw(e1);
		
	 	Rectangle2D.Float r=new Rectangle2D.Float(100,100,100,100);
		g1.draw(r);
	}
}

class GrapDemo extends JFrame
{
	GrapDemo()
	{
		setVisible(true);
		setSize(400,400);
		Container cp=getContentPane();
		cp.add(new myPanel());
	}

	public static void main(String ar[])
	{
		new GrapDemo();
	}
}