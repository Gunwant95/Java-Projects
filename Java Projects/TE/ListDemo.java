import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class myPanel extends JPanel implements ListSelectionListener
{
	JList list;
	JScrollPane pane;
	String str[]={"C","Cpp","Java","CAM",".net"},s1=" ";
	myPanel()
	{
	list=new JList(str);
	list.setVisibleRowCount(2);
	pane=new JScrollPane(list);
	//list.setSelectionModel(ListSelectionModel.SINGLE_SELECTION);
	list.setSelectionBackground(Color.red);
	list.setSelectionForeground(Color.yellow);
	add(pane);
	list.addListSelectionListener(this);
}
public void valueChanged(ListSelectionEvent e)
{
	s1=(String)list.getSelectedValue();
	repaint();
}
public void paintComponent(Graphics g)
{
	super.paintComponent(g);
	g.drawString("PROJECT of Multiple Function"+s1,100,100);
}
}

class ListDemo extends JFrame
{
	ListDemo()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("MOHINI");
		add(new myPanel());
		validate();
	}

	public static void main(String args[])
	{
			new ListDemo();
	}
}
