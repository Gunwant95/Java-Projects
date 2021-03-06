import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet.*;
import java.sql.*;

class epanel1 extends JPanel
{
	JButton b1,b2,b3,b4,b5;
	epanel1()
	{
		b1=new JButton("Save");
		b2=new JButton("Clear");
		b3=new JButton("Exit");
		b4=new JButton("Next");
		b5=new JButton("Home");
		b1.setMnemonic('s');
		b2.setMnemonic('c');
		b3.setMnemonic('x');
		b4.setMnemonic('n');
		b5.setMnemonic('h');
		add(b1); add(b2);
		add(b3); add(b4);
		add(b5); 
		b1.setToolTipText("Save current record");
		b1.setToolTipText("View record");
		b1.setToolTipText("Clear record");
		b1.setToolTipText("Go to next record");
		b1.setToolTipText("Go to home");
	}
}

class epanel2 extends JPanel
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	JComboBox cb1;
	String blist1[]={"Bollero","Scorpio"};
	epanel2()
	{
		JLabel l1 = new JLabel("Enquiry No");
		JLabel l2 = new JLabel("Enquiry Date");
		JLabel l3 = new JLabel("Customer No");
		JLabel l4 = new JLabel("Name");
		JLabel l5 = new JLabel("Address");
		JLabel l6 = new JLabel("Pin Code No");
		JLabel l7 = new JLabel("Phone No");
		JLabel l8 = new JLabel("Email");

		cb1 = new JComboBox(blist1);
		add(cb1);
		setLayout(null);
		add(l1);
		add(l2);
		add(l3); 
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		
		l1.setBounds(70,80,80,20);
		t1.setBounds(210,80,70,20);
		l2.setBounds(400,80,80,20);
		t2.setBounds(510,80,100,20);
		l3.setBounds(70,140,80,20);
		t3.setBounds(210,140,80,20);
		l4.setBounds(70,170,120,20);
		t4.setBounds(210,170,120,20);
		l5.setBounds(70,200,150,20);
		t5.setBounds(210,200,150,20);
		l6.setBounds(400,200,80,20);
		t6.setBounds(510,200,100,20);
		l7.setBounds(70,230,80,20);
		t7.setBounds(210,230,80,20);
		l8.setBounds(70,260,150,20);
		t8.setBounds(210,260,150,20);
		//cb1.setBounds(210,290,110,25);
	}
}

class Enquiry extends JFrame implements ActionListener
{
	Connection cn1;
	ResultSet rs1;
	Statement	st1;
	PreparedStatement pst1;
	epanel1 p1;
	epanel2 p2;

	Enquiry()
	{
		super("Enquiry Details");
		Container c1=getContentPane();
		c1.setLayout(null);
		p1=new epanel1();
		p2=new epanel2();
		p1.setBounds(5,350,700,300);
		p2.setBounds(5,5,900,700);
		p1.setBackground(Color.black);
		p2.setBackground(Color.white);
		c1.add(p1); c1.add(p2);
		p1.b1.addActionListener(this);
		p1.b2.addActionListener(this);
		p1.b3.addActionListener(this);
		p1.b4.addActionListener(this);
		p1.b5.addActionListener(this);
		p2.cb1.addActionListener(this);

		p2.t1.setEnabled(true);
		p2.t2.setEnabled(true);
		p2.t3.setEnabled(true);
		p2.t4.setEnabled(true);
		p2.t5.setEnabled(true);
		p2.t6.setEnabled(true);
		p2.t7.setEnabled(true);
		p2.t8.setEnabled(true);
		setConnection();
		setSize(700,500);
		setVisible(true);
	}

	

	void Clear_all()
	{
		p2.t1.setText(" ");
		p2.t2.setText(" ");
		p2.t3.setText(" ");
		p2.t4.setText(" ");
		p2.t5.setText(" ");
		p2.t6.setText(" ");
		p2.t7.setText(" ");
		p2.t8.setText(" ");
	}
	
	public void actionPerformed(ActionEvent a1)
	{
		String s1,s2;
		int enqno,custno,pincodeno,cphno;
		String edate,custname,caddr,cemail;
		s1=a1.getActionCommand();
		s2=a1.getActionCommand();
		try
		{	
			s2=String.valueOf(p2.cb1.getSelectedItem());
			if(a1.getSource()==p2.cb1)
			{
				p2.t9.setText(String.valueOf(p2.cb1.getSelectedItem()));
			}
			if(s1.equals("Save"))
			{	
				setConnection();
				enqno=Integer.parseInt(p2.t1.getText());
				edate=p2.t2.getText();
				custno=Integer.parseInt(p2.t3.getText());
				custname=p2.t4.getText();
				caddr=p2.t5.getText();
				pincodeno=Integer.parseInt(p2.t6.getText());
				cphno=Integer.parseInt(p2.t7.getText());
				cemail=p2.t8.getText();

				pst1.setInt(1,enqno);
				pst1.setString(2,edate);
				pst1.setInt(3,custno);
				pst1.setString(4,custname);
				pst1.setString(5,caddr);
				pst1.setInt(6,pincodeno);
				pst1.setInt(7,cphno);
				pst1.setString(8,cemail);

				pst1.executeUpdate();
				String dialogtitle="Message!";
				String dialogmessage="Your record has been successfully saved!";
				int dialogtype=JOptionPane.INFORMATION_MESSAGE;
				JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);
				p1.b1.setEnabled(true);
				Clear_all();
				
			}
			else
			if(s1.equals("Clear"))
			{
				Clear_all();
			}
			else
			if(s1.equals("Exit"))
			{
				System.exit(0);
			}
			else
			if(s1.equals("Next"))
			{
				dispose();
				Customer c1=new Customer();
			}
			else
			if(s1.equals("Home"))
			{
				dispose();
				Main m=new Main();
			}
	
		
		}
		catch(Exception e1)
		{
			String dialogtitle="Error!";
			String dialogmessage="Connection could not made!";
			int dialogtype=JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);
		}
	}
	public void setConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn1=DriverManager.getConnection("jdbc:odbc:surya");
			st1=cn1.createStatement();
			pst1=cn1.prepareStatement("insert into Enquiry values(?,?,?,?,?,?,?,?)");
			rs1=st1.executeQuery("select * from Enquiry");
		}
		catch(Exception e1)
		{
			String dialogtitle="Error!";

			String dialogmessage="sql Error!";
			int dialogtype=JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);
		}
	}
	
	
	public static void main(String args[])
	{
		 Enquiry e1=new Enquiry();
	}
}