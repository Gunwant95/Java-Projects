import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.JComponent.*;
import javax.swing.JOptionPane.*;

class Logi11 extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1;

	Logi11()
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
			//Proj pp=new Proj();
			else

			JOptionPane.ShowMessageDialog(this,"Invalid Password","MessageBox",JOptionPane.ERROR_MESSAGE);
			//JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");

		}
		else

			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		//JOptionPane.ShowMessageDialog(this,"Invalid Login","MessageBox",JOptionPane.ERROR_MESSAGE);

	}
	public static void main(String arg[])
	{
	Logi11 a=new Logi11();
	}
}

/*
class Proj extends Frame implements ActionListener
{
	JButton b1,b2;
	JLabel l1;
	Proj()
	{
	setVisible(true);
	setSize(400,400);
	setTitle("GUNAWANT");
	setLayout(new FlowLayout());
	b1=new JButton("DS Algo");
	add(b1);
	b2=new JButton("MATH");
	add(b2);
	//b3=new Button("EXIT");
	//add(b3);
	l1=new JLabel("Choose one of Those");
	add(l1);
	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		//LoginDemo1 ll=new LoginDemo1();
		if(e.getSource()==b2)
			setBackground(Color.blue);
		else
		//if(e.getSource()==b1)
			//ListDemo d=new ListDemo();
			setBackground(Color.red);
			add(new myPanel());
			validate();
		//else if(e.getSource()==b2)
			//setBackground(Color.blue);
		//else
			//setBackground(Color.green);
			//System.exit(0);
	}
	/*public static void main(String args[])
	{
		new Proj();
	}

}

class myPanel extends JPanel implements ListSelectionListener
{
	JList list;
	JScrollPane pane;
	String str[]={"C","Cpp","Java","CAM",".net"},s1=" ";
	myPanel()
	{
	list=new JList(str);
	list.setVisibleRowCount(2);
	pane=new JScrollPane(list);
	//list.setSelectionModel(ListSelectionModel.SINGLE_SELECTION);
	list.setSelectionBackground(Color.red);
	list.setSelectionForeground(Color.yellow);
	add(pane);
	list.addListSelectionListener(this);
	}
	public void valueChanged(ListSelectionEvent e)
	{
		s1=(String)list.getSelectedValue();
		repaint();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("PROJECT of Multiple Function"+s1,100,100);
	}
}
*/
