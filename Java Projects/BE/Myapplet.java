import java. awt.*;
import java. applet.*;
/*
<applet code="Myapplet.class" width=200 height=200>
</applet>
*/

public class Myapplet extends Applet
{
	int i=0,s=0,st=0,d=0;
	public void init()
	{
		i++;
		System.out.println("Init call times" +i);
	}

	public void start()
	{
		s++;
		System.out.println("Start call" +s +"times");
	}
	
	public void stop()
	{
		st++;
		System.out.println("Stop call" +st +"times");
	}

	public void destroy()
	{
		d++;
		System.out.println("Destroy call" +d +"times");
	}

	public void paint(Graphics g)
	{
		g.drawString("Init call" +i+ "times");
		g.drawString("Start call" +s+ "times");
		g.drawString("stop call" +st+ "times");
		g.drawString("Destroy call" +d+ "times");
	}
}

public void paint(Graphics g)
	{
		g.drawString("Init call" +i+ "times");
		g.drawString("Start call" +s+ "times");
		g.drawString("stop call" +st+ "times");
		g.drawString("Destroy call" +d+ "times");
	}

