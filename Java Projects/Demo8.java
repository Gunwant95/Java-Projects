import java.awt.*;

class Demo8 extends Frame

{
	Demo8()
	{


	setVisible(true);
	setSize(400,400);
	setBackground(Color.yellow);
	setForeground(Color.red);
	//f.setResizable(false);
	setTitle("Gunawant");
	setLocation(100,100);
	}

	public void paint(Graphics g)
	{
		g.drawString("Hie! How are you?",50,30);
		g.drawArc(50,50,100,100,0,180);
		g.drawLine(50,150,200,150);
		g.setColor(Color.red);
		g.drawOval(100,200,100,50);
		g.fillOval(100,200,100,50);
		g.setColor(Color.blue);
		g.drawRect(200,200,100,100);
		g.fillRect(200,300,200,100);
		g.drawRoundRect(300,300,50,50,10,10);
		g.fillRoundRect(300,300,50,50,10,10);
}



public static void main(String ar[])
{
	new Demo8();
}
}