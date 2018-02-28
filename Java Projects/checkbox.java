import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class checkbox extends Applet implements ItemListener
{
	String msg="";
	Checkbox Idea,Reliance,Airtel,Vodafone;
	public void init()
	{
	Idea=new Checkbox("Idea Cellular",null,true);
	Reliance=new Checkbox("Reliance");
	Airtel=new Checkbox("Airtel");
	Vodafone=new Checkbox("Vodafone");
	add(Idea);
	add(Reliance);
	add(Airtel);
	add(Vodafone);
	Idea.addItemListener(this);
	Reliance.addItemListener(this);
	Airtel.addItemListener(this);
	Vodafone.addItemListener(this);
	}

	public void itemStateChangedI(ItemEvent ie)
	{
	repaint();
	}
	public void paint(Graphics g)

	{
	msg="Current state";
	g.drawString(msg,6,80);
	msg="Idea cellular:"+Idea.getState();

	g.drawString(msg,6,100);
	msg="Reliance cellular:"+Reliance.getState();

	g.drawString(msg,6,120);
	msg="Airtel cellular:"+Airtel.getState();

	g.drawString(msg,6,140);
	msg="Vodafone cellular:"+Vodafone.getState();

	g.drawString(msg,6,160);
	}
}

