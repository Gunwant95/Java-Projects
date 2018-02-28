import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class D7 extends JFrame implements ActionListener
{
	JMenuBar m;
	JMenu file,format,color;
	JMenuItem new1,close,exit,red,green;
	JTextArea t1;
	JScrollPane p;

	D7()
	{
			setVisible(true);
			setSize(400,400);
			setTitle("MenuBar");

			m=new JMenuBar();
			file=new JMenu("File");
			file.setMnemonic('f');
			format=new JMenu("Format");
			m.add(file);
			m.add(format);

			new1=new JMenuItem("New",new ImageIcon("java_logo.png"));

			new1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));

			close=new JMenuItem("Close");

			exit=new JMenuItem("Exit");

			file.add(new1);

			file.addSeparator();
			file.add(close);

			file.addSeparator();
			file.add(exit);

			color=new JMenu("Color");
			red=new JMenuItem("Red");
			green=new JMenuItem("Green");
			color.add(red);
			color.add(green);
			format.add(color);


			setJMenuBar(m);

			t1=new JTextArea();
			p=new JScrollPane(t1);
			add(p);
			validate();

			new1.addActionListener(this);
			close.addActionListener(this);
			exit.addActionListener(this);

			red.addActionListener(this);
			green.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==new1)
		{
				t1.setText(" ");
				t1.setBackground(Color.white);
				t1.setForeground(Color.black);
		}

		else if(obj==close)
		{
			setVisible(false);
		}

		else if(obj==exit)
		{
			System.exit(0);
		}

		else if(obj==red)
		{
				t1.setBackground(Color.red);
		}

		else if(obj==green)
		{
				t1.setForeground(Color.green);
		}
	}

	public static void main(String as[])
	{
		D7 d=new D7();
	}
}
