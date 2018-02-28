import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.util.*;
import java.lang.*;


class Demo10 extends Applet
{
	public void paint(Graphics g)
	{

		//g.setBackground(Color.red);
		g.drawString("Hello",100,200);
		//g.setForeground(Color.green);
		g.drawCirc("100,200,50,100");
	}
}