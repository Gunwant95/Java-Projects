import java.awt.*;
class DemoFrame extends Frame
{
	DemoFrame()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("Ganesh");

	}	
	public void paint(Graphics g)
	{
		g.drawString("Hello",100,100);
		g.drawArc(10,20,100,100,30,30);
		g.drawRect(50,50,40,40);
	}
	public static void main(String[] args) 
	{
		new DemoFrame();
	}
}
