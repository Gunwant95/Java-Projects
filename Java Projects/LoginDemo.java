import javax.swing.*;
import javax.swing.JComponent.*;
import javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;

class LoginDemo extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1;

	LoginDemo()
	{
		setVisible(true);
		setSize(400,400);
		setLayout(new GridLayout(3,2,15,15));
		l1=new JLabel("User Name");
		add(l1);
		t1=new JTextField(10);
		add(t1);

		l2=new JLabel("Password");
		add(l2);


		p1=new JPasswordField(10);
		p1.setEchoChar('*');
		add(p1);
		b1=new JButton("Submit");
		add(b1);
		pack();

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(t1.getText().equals("Gunawant"))
		{
			char ch[]=p1.getPassword();
			String s=new String(ch);
			if(s.equals("KaPaDe"))

			JOptionPane.showMessageDialog(null, "valid username or password.");
			//JOptionPane.ShowMessageDialog(this,"Valid Login","MessageBox",JOptionPane.INFORMATION_MESSAGE);
			else

			//JOptionPane.ShowMessageDialog(this,"Invalid Password","MessageBox",JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");

		}
		else

			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		//JOptionPane.ShowMessageDialog(this,"Invalid Login","MessageBox",JOptionPane.ERROR_MESSAGE);

	}
	public static void main(String arg[])
	{
	new LoginDemo();
	}
}