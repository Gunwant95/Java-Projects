import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet.*;
import java.sql.*;

class cupanel1 extends JPanel
{
	JButton b1,b2,b3,b4,b5;
	cupanel1()
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

class cupanel2 extends JPanel
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JComboBox cb1;
	String blist1[]={"Male","Female"};
	cupanel2()
	{
		JLabel l1 = new JLabel("Customer No");
		JLabel l2 = new JLabel("Date");
		JLabel l3 = new JLabel("Customer Name");
		JLabel l4 = new JLabel("Birth Date");
		JLabel l5 = new JLabel("Address");
		JLabel l6 = new JLabel("Pin Code No");
		JLabel l7 = new JLabel("Age");
		JLabel l8 = new JLabel("City");
		JLabel l9 = new JLabel("Gender");
		JLabel l10 = new JLabel("Phone No");
		JLabel l11 = new JLabel("Email");

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
		add(l9);
		add(l10);
		add(l11);

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		t9 = new JTextField();
		t10 = new JTextField();
		t11 = new JTextField();
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);
		add(t11);

		l1.setBounds(70,80,80,20);
		t1.setBounds(210,80,70,20);
		l2.setBounds(420,80,80,20);
		t2.setBounds(470,80,80,20);
		l3.setBounds(70,140,80,20);
		t3.setBounds(210,140,140,20);
		l4.setBounds(400,140,80,20);
		t4.setBounds(470,140,80,20);
		l5.setBounds(70,200,140,20);
		t5.setBounds(210,200,140,20);
		l6.setBounds(400,200,90,20);
		t6.setBounds(470,200,90,20);
		l7.setBounds(70,250,130,20);
		t7.setBounds(210,250,130,20);
		l8.setBounds(400,250,100,20);
		t8.setBounds(470,250,100,20);
		l9.setBounds(70,300,100,20);
		cb1.setBounds(210,300,100,25);
		t9.setBounds(510,300,80,20);
		l10.setBounds(70,350,100,20);
		t10.setBounds(210,350,100,20);
		l11.setBounds(400,350,170,20);
		t11.setBounds(470,350,170,20);
	}
}

class Customer extends JFrame implements ActionListener
{
	Connection cn1;
	ResultSet rs1;
	Statement	st1;
	PreparedStatement pst1;
	cupanel1 p1;
	cupanel2 p2;

	Customer()
	{
		super("Customer Details");
		Container c1=getContentPane();
		c1.setLayout(null);
		p1=new cupanel1();
		p2=new cupanel2();
		p1.setBounds(5,450,900,500);
		p2.setBounds(5,5,900,900);
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
		p2.t9.setEnabled(true);
		p2.t10.setEnabled(true);
		p2.t11.setEnabled(true);
		setConnection();
		setSize(900,700);
		setVisible(true);
	}

	void setConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn1=DriverManager.getConnection("Jdbc:Odbc:surya");
			st1=cn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst1=cn1.prepareStatement("insert into Customer values(?,?,?,?,?,?,?,?,?,?,?)");
			rs1=st1.executeQuery("select * from Customer");
		}
		catch(SQLException e1)
		{
			String dialogtitle="Error!";
			String dialogmessage="sql Error!";
			int dialogtype=JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);
		}
		catch(Exception e1)
		{
			String dialogtitle="Error!";
			String dialogmessage="Connection could not made!";
			int dialogtype=JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);
		}
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
		p2.t9.setText(" ");
		p2.t10.setText(" ");
		p2.t11.setText(" ");
	}

	public void actionPerformed(ActionEvent a1)
	{
		String s1,s2;
		int custno,pincodeno,cage,aphno;
		String paydate,cdate,custname,cbdate,caddr,ccity,cgender,cemail;
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
				custno=Integer.parseInt(p2.t1.getText());
				cdate=p2.t2.getText();
				custname=p2.t3.getText();
				cbdate=p2.t4.getText();
				caddr=p2.t5.getText();
				pincodeno=Integer.parseInt(p2.t6.getText());
				cage=Integer.parseInt(p2.t7.getText());
				ccity=p2.t8.getText();
				cgender=p2.t9.getText();
				aphno=Integer.parseInt(p2.t10.getText());
				cemail=p2.t11.getText();

				pst1.setInt(1,custno);
				pst1.setString(2,cdate);
				pst1.setString(3,custname);
				pst1.setString(4,cbdate);
				pst1.setString(5,caddr);
				pst1.setInt(6,pincodeno);
				pst1.setInt(7,cage);
				pst1.setString(8,ccity);
				pst1.setString(9,cgender);	
				pst1.setInt(10,aphno);
				pst1.setString(11,cemail);
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
				Car cr1=new Car();
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
	public static void main(String args[])
	{
		Customer cu1=new Customer();
	}
}

