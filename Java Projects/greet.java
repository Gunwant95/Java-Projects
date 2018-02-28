import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class smile extends JFrame implements ActionListener
{

JPanel b,all,v_1,c;
JLabel val1,val2,lblRes;
JTextField val_1,val_2;
JButton cal,clr;


public smile()
	{
setTitle("Greetings 1.0");
setSize(350,250);
setLocation(200,200);
setDefaultCloseOperation(EXIT_ON_CLOSE);

v_1=new JPanel();
lblRes = new JLabel();
b =new JPanel();

	all=new JPanel(new FlowLayout(FlowLayout.CENTER,380,25));

val1=new JLabel("Enter your name  ");

val_1=new JTextField(10);


	cal=new JButton("Greet");
		clr=new JButton("Clear");
	}

	public void init()
	{
		setLayout(new BorderLayout());
v_1.add(val1);
v_1.add(val_1);
		b.add(cal);
		b.add(clr);
        cal.setToolTipText("Click here to Greet the Person");
all.add(v_1);
all.add(lblRes);

         add(b,BorderLayout.SOUTH);
		add(all,BorderLayout.CENTER);
		cal.addActionListener(this);
		clr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{

			if(cal==e.getSource())
			{
                   String str= val_1.getText();


                lblRes.setText("Hello "+str
                            +" Welcome to STI College ." );
			}

			else if(clr==e.getSource())
			{
				val_1.setText("");
               lblRes.setText("");
		}
	}
}



class greet
{
	public static void main(String args[])
	{
       smile person =new smile();
        person.init();
	    person.setVisible(true);
        person.setResizable(false);
        person.setLocation(200,200);
}
}


