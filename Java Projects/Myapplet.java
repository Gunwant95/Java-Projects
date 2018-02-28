import java.applet.*;
<applet code="Myapplet.class" width=200 height=200>
</applet>
*/

public class Myapplet extends Applet
{
	int i=0,s=0,st=0,d=0;
	public void init()
	{
		i++;
		System.out.println("init call"+i+"times");
	}
	public void start()
	{
		s++;
		System.out.println("Start call"+st+"times");
	}
	public void stop()
	{
		st++;
		System.out.println("Stop call"+st+"times");
	}
	public void destroy()
	{
		d++;
		System.out.println("Distroy call"+d+"times");
	}
	public void paint(Graphics g)
	{
		g.drawString("init call"+i+"times",100,50);
		g.drawString("start call"+s+"times",100,70);
		g.drawString("stop call"+st+"times",100,90);
		g.drawString("destroy call"+d+"times",100,110);
	}
}
