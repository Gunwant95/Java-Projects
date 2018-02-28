import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet.*;
import java.sql.*;

class ppanel1 extends JPanel
{
	JButton b1,b2,b3,b4,b5;
	ppanel1()
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

class ppanel2 extends JPanel
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JComboBox cb1;
	String blist1[]={"Cash","Cheque"};
	//JRadioButton r1,r2;
	ppanel2()
	{
		JLabel l1 = new JLabel("Payment No");
		JLabel l2 = new JLabel("Date of Payment");
		JLabel l3 = new JLabel("Customer No");
		JLabel l4 = new JLabel("Mode of Payment");
		JLabel l5 = new JLabel("Amount");
		JLabel l6 = new JLabel("Account No");
		JLabel l7 = new JLabel("Name of Bank");
		JLabel l8 = new JLabel("Name of Branch");

		cb1 = new JComboBox(blist1);
		add(cb1);
		//r1 = new JRedioButton("Cash");
		//r2 = new JRedioButton("Cheque");
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

		l1.setBounds(70,20,80,20);
		t1.setBounds(210,20,70,20);
		l2.setBounds(400,20,100,20);
		t2.setBounds(510,20,100,20);
		l3.setBounds(70,60,80,20);
		t3.setBounds(210,60,80,20);
		l4.setBounds(70,100,130,20);
		cb1.setBounds(210,100,100,25);
		t4.setBounds(510,100,80,20);
		l5.setBounds(70,140,90,20);
		t5.setBounds(210,140,90,20);
		l6.setBounds(70,180,110,20);
		t6.setBounds(210,180,110,20);
		l7.setBounds(70,220,130,20);
		t7.setBounds(210,220,130,20);
		l8.setBounds(70,260,170,20);
		t8.setBounds(210,260,170,20);
	}
}

class Payment extends JFrame implements ActionListener
{
	Connection cn1;
	ResultSet rs1;
	Statement	st1;
	PreparedStatement pst1;
	ppanel1 p1;
	ppanel2 p2;
	String s1,s2;
	// int Amount,AccountNo;

	Payment()
	{
		super("Payment Details");
		Container c1=getContentPane();
		c1.setLayout(null);
		p1=new ppanel1();
		p2=new ppanel2();
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

	void setConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn1=DriverManager.getConnection("Jdbc:Odbc:surya");
			st1=cn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst1=cn1.prepareStatement("insert into Payment values(?,?,?,?,?,?,?,?)");
			rs1=st1.executeQuery("select * from Payment");
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
	
	/*void show_fields()
	{
		try
		{
			p2.t1.setText(rs1.getString("payno"));
			p2.t2.setText(rs1.getString("paydate"));
			p2.t3.setText(rs1.getString("custno"));
			p2.t4.setText(rs1.getString("modeofpay"));
			p2.t5.setText(rs1.getString("amount"));
			p2.t6.setText(rs1.getString("accountno"));
			p2.t7.setText(rs1.getString("bankname"));
			p2.t8.setText(rs1.getString("branchname"));
		}
		catch(SQLException e1)
		{
			String dialogtitle="Error!";
			String dialogmessage="Connection could not made!";
			int dialogtype=JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);
		}
	}*/

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
		String s1,s2,s3;
		int payno,custno,amount,accno;
		String paydate,modeofpay,branchname,bankname;
		s1=a1.getActionCommand();
		s2=a1.getActionCommand();
		//s3=a1.getActionCommand();
		try
		{
			s2=String.valueOf(p2.cb1.getSelectedItem());
			if(a1.getSource()==p2.cb1)
			{
				p2.t4.setText(String.valueOf(p2.cb1.getSelectedItem()));
			}
			if(s1.equals("Save"))
			{
				setConnection();
				payno=Integer.parseInt(p2.t1.getText());
				paydate=p2.t2.getText();
				custno=Integer.parseInt(p2.t3.getText());
				modeofpay=p2.t4.getText();
				amount=Integer.parseInt(p2.t5.getText());
				accno=Integer.parseInt(p2.t6.getText());
				bankname=p2.t7.getText();
				branchname=p2.t8.getText();

				pst1.setInt(1,payno);
				pst1.setString(2,paydate);
				pst1.setInt(3,custno);
				pst1.setString(4,modeofpay);
				pst1.setInt(5,amount);
				pst1.setInt(6,accno);
				pst1.setString(7,bankname);	
				pst1.setString(8,branchname);
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
				Help h1=new Help();
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
		Payment p1=new Payment();
	}
}
