import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Help extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1,l2,l3,l4,l5;
	JPanel p1,p2;
	Container cp=getContentPane();
	public Help()
	{
		super("Help");
		p1 = new JPanel();
		p2 = new JPanel();
		b1 = new JButton("Home");
		p1.add(b1);
		b1.addActionListener(this);
		b1.setBounds(200,400,80,25);
		l1 = new JLabel();
		l1.setText("For Further Details Related To 'Car Selling and Anslysis System' Please Contact To Gunawant S. Kapade At Bamnod....!");
		l1.setBounds(350,250,600,100);
		p2.add(l1);
		getContentPane().add(p1);
		getContentPane().add(p2);
		p1.setBounds(90,260,500,60);
		p2.setBounds(20,130,540,450);
		setSize(700,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str;
		str = e.getActionCommand();
		if(str.equals("Home"))
		{
			dispose();
			Main m=new Main();
		}
	}
	public static void main(String args[])
	{
		Help h1=new Help();
	}
}
