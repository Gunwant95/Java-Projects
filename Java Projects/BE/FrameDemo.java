import java. awt.*;

class FrameDemo extends Frame
{
	Image img;
	FrameDemo()
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension d=tk.getScreenSize();
		int sh=d.height;
		int sw=d.width;
		setLocation(sw/4,sh/4);
		setSize(sw/2,sw/2);
		setVisible(true);
		img=tk.getImage("E:\\Kapade Bamnod\\scan\\newpic.jpg");
		setIconImage(img);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img,100,100,200,200,Color.red,this);
	}
	public static void main(String ar[])
	{
		new FrameDemo();
	}
}