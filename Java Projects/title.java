import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

class  mypanel1 extends JPanel
{
	JLabel l1;
	Font f1;
	mypanel1()
	{
		setLayout(null);
		l1=new JLabel("***KAPADE MOTORS LTD.NASHIK***");
		l1.setBounds(100,100,600,100);
		add(l1);
		//l1.setBorder(BorderFactory.createLineBorder(Color.red),1);
		l1.setVerticalAlignment(JLabel.CENTER);
		l1.setFont(new java.awt.Font("Lucida Calligraphy",1,20));
		l1.setForeground(Color.white);
	}
}
class mypanel2 extends JPanel
{
	JButton bn;
	mypanel2()
	{
		bn=new JButton("NEXT");
		bn.setBounds(200,400,80,25);
		add(bn);
		bn.setMnemonic('n');
		//setBorder(BorderFactory.setLoweredBeveBorder());
	}
}
class title extends JFrame implements ActionListener
{
	mypanel1 p1;
	mypanel2 p2;
	title()
	{
		super("TITLE");
		p1=new mypanel1();
		p2=new mypanel2();
		p1.setBounds(1,50,1500,800);
		p2.setBounds(5,50,500,300);
		p1.setBackground(Color.black);
		p2.setBackground(Color.white);
		Container c1=getContentPane();
		c1.add(p1);
		c1.add(p2,"North");
		p2.bn.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent a1)
	{
		String s1;
		s1=a1.getActionCommand();
		if(s1.equals("NEXT"))
		{
			dispose();
			Main m=new Main();
		}
		p2.bn.setEnabled(true);
	}
	public static void main(String args[])
	{
		title t1=new title();
	}
}