import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


class myframe extends JFrame implements ActionListener
{	
	
	
	JTextField t1;
	JPasswordField t2;
	JLabel l1,l2,l3,img4;
	JButton b1,b2,b3;
	JPanel  jPanel1 = new JPanel();
	//JPanel  jPanel2 = new JPanel();
	//JPanel  jPanel3 = new JPanel();
	JLabel l4 = new JLabel("", new ImageIcon("b4.jpg"), JLabel.CENTER);			
	myframe()
	{
		super("Login Screen");
		setForeground(Color.red);
		img4=new JLabel(new ImageIcon("welcome1.gif"),JLabel.CENTER);
		img4.setBounds(375,20,200,100);
		add(img4);	
		l1=new JLabel("  User Name  :");
		l2=new JLabel("Password  :");
		t1=new JTextField(20);
		t2=new JPasswordField(20);
		//t2.setEchoChar('*');
		
		Container c = getContentPane();
		
		c.setLayout(null);
		setLayout(null);
		c.setBackground(new Color(254, 223, 254));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton b1=new JButton("Login");
		b1.setToolTipText("This Button is used for Login");

		JButton b2=new JButton("Exit");
		b2.setToolTipText("This Button Exit the Login screen");
	
		JButton b3=new JButton("Clear");	
		b3.setToolTipText("This Button Clear the text of textbox");
	
		t1.setToolTipText("Enter User name");
		t2.setToolTipText("Enter your Password");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setLayout(null);
		l1.setBounds(20,50,80,20);
		l2.setBounds(20,80,80,30);
		t1.setBounds(110,50,100,20);
		t2.setBounds(110,80,100,20);
		b1.setBounds(20,150,80,30);
		b2.setBounds(110,150,80,30);
		b3.setBounds(200,150,80,30);
		add(l1);
		add(t1);
		add(l2);
		add(l4);
		l4.setBounds(-10, -40, 1034, 790);
		add(t2);
		add(b1); add(b2); add(b3);
		
		//setBackground(Color.gray);
						
		setSize(1024,768);
		
		
		
		
		jPanel1.setBounds(0,0,315,155);
		
		jPanel1.setLayout(null);
		jPanel1.setBorder(BorderFactory.createLoweredBevelBorder());	
		c.add(jPanel1);
		c.add(l4);
		//setConnection();
		setVisible(true);
		
	}
				
	public void actionPerformed(ActionEvent a1)
	{
		
			String s1=a1.getActionCommand();
			if(s1.equals("Clear"))
			{	
				 t1.setText("");
	  	   	    	t2.setText(""); 
			 	t1.requestFocus();
				
			
			}else
			if(s1.equals("Exit"))
		 	{
    				   int res=JOptionPane.showConfirmDialog(null,"Do you want to exit?","EXIT",JOptionPane.YES_NO_OPTION);
   			   	   if(res==JOptionPane.YES_OPTION)
   			     	  {
       					 System.exit(0);
    			 	   }
       				t1.requestFocus();
   			 }
			else
			if(s1.equals("Login"))
			{
				dispose();
			}
		
			String s2=t1.getText();	
			String s3=t2.getText();		
			if(s2.equals("Vivek"))
			{
				if(s3.equals("Surya"));
				  JOptionPane.showMessageDialog(null,"CORRECT LOGIN");
				dispose();
				title t1=new title();
			}
			else  
		   	{
                    				dispose();
                  		        	String dialogtitle="Error!";
         	 	        		String dialogmessage="INCORRECT LOGIN. PLEASE REENTER  ! ";
         	   	     		int dialogtype=JOptionPane.ERROR_MESSAGE;
         	    	    		JOptionPane.showMessageDialog((Component)null,dialogmessage,dialogtitle,dialogtype);    
			}
			
			
		}	
		
		
	
	public static void main(String args[])
	{
		myframe f1=new myframe();
	}	
}
