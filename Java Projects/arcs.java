import java.awt.*;
import java.applet.*;
public class arcs extends Applet
{
public void paint(Graphics g)
{
	g.fillArc(10,50,70,70,0,75);
	g.drawArc(100,50,70,70,0,75);
	g.drawArc(10,100,70,80,0,175);
	g.fillArc(100,100,70,90,0,270);
	g.drawArc(200,80,80,80,0,180);
}
}