import java. awt.*;
import javax.swing.*;

class Mypanel extends JPanel
{	
	Mypanel()
	{
		setBackground(Color.green);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("E:\\kapade Bamnod\\scan\\newpic.jpg");
		g.drawImage(img,100,100,200,200,this);
		g.drawString("Sujata",100,100);
	}
}
class FontDemo extends JFrame
{
	FontDemo()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("First");
		Container cp=getContentPane();
		cp.add(new Mypanel());
	} 
	
	public static void main(String ar[])
	{
		new FontDemo();
	}
}