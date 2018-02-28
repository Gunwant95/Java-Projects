import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet.*;
import java.sql.*;       

class bpanel1 extends JPanel
{
	JButton b1,b2,b3,b4,b5;
	bpanel1()
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

class bpanel2 extends JPanel
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JComboBox cb1;
	String blist1[]={"Cash","Cheque"};
	bpanel2()
	{
		JLabel l1 = new JLabel("Booking No");
		JLabel l2 = new JLabel("Date of Booking");
		JLabel l3 = new JLabel("Customer No");
		JLabel l4 = new JLabel("Car No");
		JLabel l5 = new JLabel("Car Name");
		JLabel l6 = new JLabel("Mode of Payment");
		JLabel l7 = new JLabel("Amount");
		JLabel l8 = new JLabel("Account No");
		JLabel l9 = new JLabel("Bank Name");
		JLabel l10 = new JLabel("Branch Name");

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

		l1.setBounds(70,20,80,20);
		t1.setBounds(210,20,80,20);
		l2.setBounds(400,20,130,20);
		t2.setBounds(510,20,130,20);
		l3.setBounds(70,60,80,20);
		t3.setBounds(210,60,80,20);
		l4.setBounds(70,100,80,20);
		t4.setBounds(210,100,100,20);
		l5.setBounds(70,140,130,20);
		t5.setBounds(210,140,130,20);
		l6.setBounds(70,180,130,20);
		cb1.setBounds(210,180,90,25);
		t6.setBounds(510,180,80,20);
		l7.setBounds(70,220,110,20);
		t7.setBounds(210,220,110,20);
		l8.setBounds(70,260,130,20);
		t8.setBounds(210,260,130,20);
		l9.setBounds(70,300,170,20);
		t9.setBounds(210,300,170,20);
		l10.setBounds(70,340,170,20);
		t10.setBounds(210,340,170,20);
	}
}

class Booking extends JFrame implements ActionListener
{
	Connection cn1;
	ResultSet rs1;
	Statement	st1;
	PreparedStatement pst1;
	bpanel1 p1;
	bpanel2 p2;

	Booking()
	{
		super("Booking Details");
		Container c1=getContentPane();
		c1.setLayout(null);
		p1=new bpanel1();
		p2=new bpanel2();
		p1.setBounds(5,400,700,300);
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
		p2.t9.setEnabled(true);
		p2.t10.setEnabled(true);
		setConnection();
		setSize(700,500);
		setVisible(true);
	}

	void setConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn1=DriverManager.getConnection("Jdbc:Odbc:surya");
			st1=cn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst1=cn1.prepareStatement("insert into Booking values(?,?,?,?,?,?,?,?,?,?)");
			rs1=st1.executeQuery("select * from Booking");
		}
		catch(SQLException se1)
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
	}

	public void actionPerformed(ActionEvent a1)
	{
		String s1,s2,s3,s4;
		int bno,custno,carno,amount,accno;
		String bdate,carname,modeofpay,bankname,branchname;
		s1=a1.getActionCommand();
		s2=a1.getActionCommand();
		try
		{
			s2=String.valueOf(p2.cb1.getSelectedItem());
			if(a1.getSource()==p2.cb1)
			{
				p2.t6.setText(String.valueOf(p2.cb1.getSelectedItem()));
			}
			if(s1.equals("Save"))
			{
				setConnection();
				bno=Integer.parseInt(p2.t1.getText());
				bdate=p2.t2.getText();
				custno=Integer.parseInt(p2.t3.getText());
				carno=Integer.parseInt(p2.t4.getText());
				carname=(p2.t5.getText());
				modeofpay=(p2.t6.getText());
				amount=Integer.parseInt(p2.t7.getText());
				accno=Integer.parseInt(p2.t8.getText());
				bankname=(p2.t9.getText());
				branchname=(p2.t10.getText());

				pst1.setInt(1,bno);
				pst1.setString(2,bdate);
				pst1.setInt(3,custno);
				pst1.setInt(4,carno);
				pst1.setString(5,carname);
				pst1.setString(6,modeofpay);
				pst1.setInt(7,amount);
				pst1.setInt(8,accno);
				pst1.setString(9,bankname);	
				pst1.setString(10,branchname);
				pst1.executeUpdate();
				String dialogtitle="Massage!";
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
				Payment p1=new Payment();
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
		Booking b1=new Booking();
	}
}
