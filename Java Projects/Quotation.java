import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet.*;
import java.sql.*;

class qpanel1 extends JPanel
{
	JButton b1,b2,b3,b4,b5;
	qpanel1()
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

class qpanel2 extends JPanel
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JComboBox cb1;
	String blist1[]={"Bollero","Scorpio"};
	qpanel2()
	{
		JLabel l1 = new JLabel("Quotation No");
		JLabel l2 = new JLabel("Enquiry No");
		JLabel l3 = new JLabel("Model Name");
		JLabel l4 = new JLabel("Prize");
		JLabel l5 = new JLabel("RTO Tax");
		JLabel l6 = new JLabel("Insurance");
		JLabel l7 = new JLabel("Issentil Accesories");
		JLabel l8 = new JLabel("Total on road prize");

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
		
		l1.setBounds(70,20,90,20);
		t1.setBounds(210,20,90,20);
		l2.setBounds(70,60,90,20);
		t2.setBounds(210,60,90,20);
		l3.setBounds(70,100,90,20);
		t3.setBounds(210,100,90,20);
		cb1.setBounds(510,100,90,20);

		/*t3.setBounds(210,100,90,25);
		cb1.setBounds(510,100,80,20);*/

		l4.setBounds(70,150,80,20);
		t4.setBounds(210,150,80,20);
		l5.setBounds(70,200,90,20);
		t5.setBounds(210,200,90,20);
		l6.setBounds(70,240,110,20);
		t6.setBounds(210,240,90,20);
		l7.setBounds(70,280,130,20);
		t7.setBounds(210,280,90,20);
		l8.setBounds(70,320,130,20);
		t8.setBounds(210,320,90,20);
	}
}

class Quotation extends JFrame implements ActionListener
{
	Connection cn1;
	ResultSet rs1;
	Statement	st1;
	PreparedStatement pst1;
	qpanel1 p1;
	qpanel2 p2;

	Quotation()
	{
		super("Quotation");
		Container c1=getContentPane();
		c1.setLayout(null);
		p1=new qpanel1();
		p2=new qpanel2();
		p1.setBounds(5,350,700,300);
		p2.setBounds(5,5,1100,900);
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
			pst1=cn1.prepareStatement("insert into Quotation values(?,?,?,?,?,?,?,?)");
			rs1=st1.executeQuery("select * from Quotation");
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

	void show_fields()
	{
		try
		{
			p2.t1.setText(rs1.getString("qno"));
			p2.t2.setText(rs1.getString("custno"));
			p2.t3.setText(rs1.getString("carname"));
			p2.t4.setText(rs1.getString("prize"));
			p2.t5.setText(rs1.getString("rtotax"));
			p2.t6.setText(rs1.getString("insuno"));
			p2.t7.setText(rs1.getString("accprize"));
			p2.t8.setText(rs1.getString("onroad"));
		}
		catch(SQLException e1)
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
	}
	public void actionPerformed(ActionEvent a1)
	{
		String s1,s2;
		int qno,custno,prize,rtotax,insuno,accprize,onroad;
		String carname;
		s1=a1.getActionCommand();
		s2=a1.getActionCommand();
		try
		{
			s2=String.valueOf(p2.cb1.getSelectedItem());
			if(a1.getSource()==p2.cb1)
			{
				p2.t4.setText(String.valueOf(p2.cb1.getSelectedItem()));
			}
			if(s1.equals("Save"))
			{
				qno=Integer.parseInt(p2.t1.getText());
				custno=Integer.parseInt(p2.t2.getText());
				carname=p2.t3.getText();
				prize=Integer.parseInt(p2.t4.getText());
				rtotax=Integer.parseInt(p2.t5.getText());
				insuno=Integer.parseInt(p2.t6.getText());
				accprize=Integer.parseInt(p2.t7.getText());
				onroad=Integer.parseInt(p2.t8.getText());

				pst1.setInt(1,qno);
				pst1.setInt(2,custno);
				pst1.setString(3,carname);
				pst1.setInt(4,prize);
				pst1.setInt(5,rtotax);
				pst1.setInt(6,insuno);
				pst1.setInt(7,accprize);
				pst1.setInt(8,onroad);					
				pst1.executeUpdate();
				String dialogtitle="Message!";
				String dialogmessage="Your record has been successfully saved!";
				int dialogtype=JOptionPane.INFORMATION_MESSAGE;
			JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);
				p1.b1.setEnabled(true);
				Clear_all();
				setConnection();
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
				Booking q1=new Booking();
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
		Quotation q1=new Quotation();
	}
}

