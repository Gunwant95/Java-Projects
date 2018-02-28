import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class colorPanel extends JFrame implements AdjustmentListener
{

	JLabel r,g,b;
	JScrollBar rs,gs,bs;
	JPanel color,scroll;

	colorPanel()
	{
		setVisible(true);
		setSize(400,400);
		scroll=new JPanel();
		scroll.setLayout(new GridLayout(3,2,15,15));
		r=new JLabel("Red");
		scroll.add(r);
		rs=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255);
		scroll.add(rs);

		g=new JLabel("green");
		scroll.add(g);

		gs=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255);
		scroll.add(gs);

		b=new JLabel("Blue");
		scroll.add(b);
		bs=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255);
		scroll.add(bs);

		add(scroll,"North");

		color=new JPanel();
		add(color,"Center");
		validate();

		rs.addAdjustmentListener(this);
		gs.addAdjustmentListener(this);
		bs.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent e)
	{
	r.setText("Red"+rs.getValue());
	g.setText("Green"+gs.getValue());
	b.setText("Blue"+bs.getValue());

	rs.setBackground(new Color(rs.getValue(),0,0));

	gs.setBackground(new Color(0,rs.getValue(),0));

	bs.setBackground(new Color(0,0,rs.getValue()));
	color.setBackground(new Color(rs.getValue(),gs.getValue(),bs.getValue()));

	}
	public static void main(String args[])
	{
			new colorPanel();
	}
}