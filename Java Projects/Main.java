import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b5,b6,b7,b8;
	JPanel p1,p2;
	Font f1;
	public Main()
	{
		setTitle("SALE SYSTEM OF FOUR WHEELER");
		p1=new JPanel();
		p2=new JPanel();
		l1=new JLabel();
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b5=new JButton();
		b6=new JButton();
		b7=new JButton();
		b8=new JButton();

		l1.setFont(new java.awt.Font("Lucida Calligraphy",1,25));
		Container contentPane= getContentPane();
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.white);
		p1.setBackground(Color.black);
		p1.setLayout(null);
		l1.setForeground(new Color(153,51,2));
		l1.setText("SALE SYSTEM OF FOUR WHEELER");
		getContentPane().add(l1);
		l1.setBounds(200,20,450,60);
		contentPane.add(p1);
		p1.setBounds(40,100,800,70);
		
		b1.setFont(new Font("Arial",0,12));
		b1.setText("Add Enquiry");
		b1.addActionListener(this);
		p1.add(b1);
		b1.setBounds(0,0,100,30);
		b1.setMnemonic(KeyEvent.VK_C);
		b1.setToolTipText("Click For CarEnquiry");
		
		b2.setFont(new Font("Arial",0,12));
		b2.setText("Customer");
		b2.addActionListener(this);
		p1.add(b2);
		b2.setBounds(340,0,100,30);
		b2.setToolTipText("Click For Customer Informtion");
		
		b3.setFont(new Font("Arial",0,12));
		b3.setText("Car");
		b3.addActionListener(this);
		p1.add(b3);
		b3.setBounds(220,0,100,30);
		b3.setToolTipText("Click For Car Informtion");
	
		b5.setFont(new Font("Arial",0,12));
		b5.setText("New Quotation");
		b5.addActionListener(this);
		p1.add(b5);
		b5.setBounds(460,0,100,30);
		b5.setToolTipText("Click To New Quotation Information");

		b6.setFont(new Font("Arial",0,12));
		b6.setText("Booking");
		b6.addActionListener(this);
		p1.add(b6);
		b6.setBounds(590,0,100,30);
		b6.setToolTipText("Click To Book New Car");

		b7.setFont(new Font("Arial",0,12));
		b7.setText("Payment");
		b7.addActionListener(this);
		p1.add(b7);
		b7.setBounds(700,0,100,30);
		b7.setToolTipText("Option For Payment");

		b8.setFont(new Font("Arial",0,12));
		b8.setText("Help");
		b8.addActionListener(this);
		p1.add(b8);
		b8.setBounds(110,0,100,30);
		b8.setToolTipText("Click For Helpl Informtion");
		setVisible(true);
		setSize(900,500);
	}
	public static void main(String args[])
	{
		Main m=new Main();
		//m.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str;
		str=e.getActionCommand();
		
		if(str.equals("Add Enquiry"))
		{
			dispose();
			Enquiry e1=new Enquiry();
		}
		else
		if(str.equals("Customer"))
		{
			dispose();
			Customer cu1=new Customer();
		}
		else
		if(str.equals("Car"))
		{
			dispose();
			Car cr1=new Car();
		}
		else
		if(str.equals("New Quotation"))
		{
			dispose();
			Quotation q1=new Quotation();
		}
		else
		
		if(str.equals("Booking"))
		{
			dispose();
			Booking b1=new Booking();
		}
		else
		if(str.equals("Payment"))
		{
			dispose();
			Payment p1=new Payment();
		}
		else
		if(str.equals("Help"))
		{
			dispose();
			Help hl=new Help();
		}
	}
}