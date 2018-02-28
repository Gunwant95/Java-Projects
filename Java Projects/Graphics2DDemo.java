import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class myPanel extends JPanel
{

	myPanel()
	{

		setBackground(Color.red);
		setForeground(Color.green);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g1=(Graphics2D)g;
		Ellipse2D.Float e1=new Ellipse2D.Float();
		e1.setFrame(100,100,100,20);
		g1.draw(e1);


		Rectangle2D.Float r=new Rectangle2D.Float(100,100,30,30);
		g1.draw(r);

}
}

class Graphics2DDemo extends JFrame
{
		Graphics2DDemo()
		{
			setVisible(true);
			setSize(200,349);

			Container cp=getContentPane();

			cp.add(new myPanel());
	}

	public static void main(String args[])
	{
		new Graphics2DDemo();
}
}