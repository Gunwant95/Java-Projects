import java.awt.*;
import javax.swing.*;

class myPanel extends JPanel
{
	myPanel()
	{

		setBackground(Color.green);

	}

	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);
		Toolkit tk=Toolkit.getDefaultToolkit();

		Image img=tk.getImage("Water lilies.jpg");
		g.drawImage(img,100,199,200,100,this);

	}
}

class ImageDemo extends JFrame
{
		ImageDemo()
		{
			setVisible(true);
			setSize(300,600);

			Container cp=getContentPane();

			cp.add(new myPanel());

		}
	public static void maiN(String args[])
	{
		new ImageDemo();
	}
}