import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.sound.sampled.*;

class Loginlg extends JFrame implements ActionListener
{
	JLabel lblname,lblpass;
	JTextField txtname;
	JPasswordField txtpass;
	JButton btnlogin,btnexit,btnclear;
	JPanel jPanel1 = new JPanel();
	Connection con;
	Statement st;
	ResultSet rs;
	JLabel img = new JLabel("", new ImageIcon("MSN2.png"), JLabel.RIGHT);
	public Loginlg()
	{
	super("Login Screen");
	Container cp = getContentPane();
	cp.setLayout(null);
	setLayout(null);
	cp.setBackground(new Color(254, 223, 254));
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	lblname=new JLabel("Login Name      :");
	lblname.setBounds(680,560,100,25);
	add(lblname);

	lblpass=new JLabel("   Password      :");
	lblpass.setBounds(680,600,100,25);
	add(lblpass);

	txtname=new JTextField();
	txtname.setBounds(785,560,150,25);
	txtname.setToolTipText("Enter User name");
	add(txtname);

	txtpass=new JPasswordField();
	txtpass.setBounds(785,600,150,25);
	txtpass.setToolTipText("Enter your PASSWORD");
	txtpass.setEchoChar('*');
	add(txtpass);
	txtpass.addActionListener(this);

	btnlogin=new JButton("LOGIN");
	btnlogin.setBounds(662,650,75,25);
	btnlogin.addActionListener (this);
	btnlogin.setToolTipText("This button used for login");
	add(btnlogin);

	btnexit=new JButton("EXIT");
	btnexit.setBounds(770,650,75,25);
	btnexit.addActionListener (this);
	btnexit.setToolTipText("This button Exit the Login Screen");
	add(btnexit);

	btnclear=new JButton("CLEAR");
	btnclear.setBounds(872,650,75,25);
	btnclear.addActionListener (this);
	btnclear.setToolTipText("This button clear the text of TextBox");
	add(btnclear);


	jPanel1.setBounds(645,535,315,155);

	jPanel1.setLayout(null);
	jPanel1.setBorder(BorderFactory.createLoweredBevelBorder());
	cp.add(jPanel1);
	setConnection();

	cp.add(img);
	img.setBounds(-10, -10, 1034, 776);
	setSize(1034, 776);
	setLocation(-4,-5);

	setVisible(true);
	}
	public static void main(String args[])
	{
	     Loginlg ls=new Loginlg();
	}

	public void setConnection()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:surya");
			st = con.createStatement();
		}
		catch (Exception e)
		{
			String dt = " ERROR";
			String dm = " ERROR : " + e;
			int dtype = JOptionPane.ERROR_MESSAGE;

			JOptionPane.showMessageDialog((Component)null, dm, dt, dtype);
		}
	}


	public void actionPerformed(ActionEvent a)
	{
		String s1 = a.getActionCommand();

		if (s1.equals("EXIT"))
		{
			System.exit(0);
		}
		else
		if ((s1.equals("LOGIN"))||(a.getSource()==txtpass))
		{
		     boolean flag=true;
			try
			{
				String s2 = txtname.getText();
				String s3 = txtpass.getText();

				rs = st.executeQuery("select * from login order by userid desc");

				whileloop : while (rs.next())
				{
					if (s2.equals(rs.getString(2)))
					{
						if (s3.equals(rs.getString(3)))
						{
							flag = true;

							//Surya d=new Surya();
							setVisible(false);

							break whileloop;
						}
						else
						{
							String dt = "Error Message";
							String dm = "Invalid password";
							int dtype = JOptionPane.ERROR_MESSAGE;

							JOptionPane.showMessageDialog((Component)null, dm, dt, dtype);
							txtpass.setText("");
							txtpass.requestFocus();
						}
					}
					else
					{
						flag = false;
					}
				}

				if (flag == false)
				{
					String dt = "Error Message";
					String dm = "Invalid Login name";
					int dtype = JOptionPane.ERROR_MESSAGE;

					JOptionPane.showMessageDialog((Component)null, dm, dt, dtype);
					txtname.setText("");
					txtname.requestFocus();
				}
			}
			catch (Exception e)
			{
				String dt = "Error Message";
				String dm = "SQL ERROR : " + e;
				int dtype = JOptionPane.ERROR_MESSAGE;

				JOptionPane.showMessageDialog((Component)null, dm, dt, dtype);
			}
		}
		else
		if (s1.equals("CLEAR"))
		{
				txtname.setText("");
				txtpass.setText("");

				txtname.requestFocus();
		}
	}
}

