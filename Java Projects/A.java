import java.awt.*;
import java.lang.*;
import java.util.*;
import java.applet.*;
public class A extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0;i<=4;i++)
		{
			if((i%2)==0)
			{
				g.drawOval(200,i*60+10,50,30);
				g.setColor(Color.green);
			}
			else
			{
				g.drawRect(50,50,50,50);
			}
		}
	g.drawOval(40,40,120,150);
	g.drawOval(57,75,30,20);
	g.drawOval(110,75,30,20);
	g.fillOval(68,91,10,10);
	g.fillOval(121,81,10,10);
	g.drawOval(85,100,30,30);
	g.fillArc(60,125,80,40,180,180);
	g.drawOval(25,92,15,30);
	g.drawOval(160,92,15,30);
	}
}