import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel
{

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.red);
		g.setColor(Color.yellow);
		g.drawString("Hello",100,50);
		g.drawOval(150,100,100,100);
		g.fillOval(150,100,100,100);
	}

}

class JFrameDemo1 extends JFrame
{

	JFrameDemo1()
	{
		setVisible(true);
		setSize(400,400);

		setTitle("Gunwant");
		Container cp=getContentPane();
		cp.add(new MyPanel());

	}
	public static void main(String args[])

	{
		new JFrameDemo1();
	}
}
