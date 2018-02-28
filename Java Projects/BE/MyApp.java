import java. awt.*;
import javax. swing.*;
import java. applet.*;


/*
<applet code="MyApp.class" width=200 height=200>
</applet>
*/
class myPanel extends JPanel
{
	myPanel()
	{
		setBackground(Color.red);
		setForeground(Color.blue);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Hello",100,50);
	}
}

public class MyApp extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		cp.add(new myPanel());
	}
} 