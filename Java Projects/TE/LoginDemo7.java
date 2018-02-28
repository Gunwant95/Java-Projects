import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.JComponent.*;
import javax.swing.JOptionPane.*;
class LoginDemo7 extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1;

	LoginDemo7()
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
		if(t1.getText().equals("Admin7"))
		{
			char ch[]=p1.getPassword();
			String s=new String(ch);
			if(s.equals("Admin7"))
			{
			JOptionPane.showMessageDialog(null, "valid username or password.");
			//JOptionPane.ShowMessageDialog(this,"Valid Login","MessageBox",JOptionPane.INFORMATION_MESSAGE);
			Proj pr=new Proj();
			}
			else

//			JOptionPane.ShowMessageDialog(this,"Invalid Password","MessageBox",JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");

		}
		else

			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		//JOptionPane.ShowMessageDialog(this,"Invalid Login","MessageBox",JOptionPane.ERROR_MESSAGE);

	}
	public static void main(String arg[])
	{
	new LoginDemo7();
	}
}



class Proj extends Frame implements ActionListener
{
	JButton b1,b2,b3;
	JLabel l1;
	Proj()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("Project");
		setLayout(new FlowLayout());
		b1=new JButton("Algo");
		add(b1);
		b2=new JButton("MATH");
		add(b2);
		b3=new JButton("EXIT");
		add(b3);
		l1=new JLabel("Choose one of Those");
		add(l1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		LoginDemo7 ll=new LoginDemo7();

		if(e.getSource()==b1)
		{
			ListDemo d=new ListDemo();
			setBackground(Color.red);
			add(new myPanel());
			validate();
		}
		else if(e.getSource()==b2)
		{
			ListDemo1 d1=new ListDemo1();
			setBackground(Color.blue);
			add(new myPanel1());
			validate();
		}
		else
		{
		  	setBackground(Color.green);
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		new Proj();
	}
}

class myPanel extends JPanel implements ListSelectionListener
{
	JList list;
	JScrollPane pane;
	String str[]={"Cpp1","Cpp2","Cpp3","Cpp4","Cpp5","Cpp6","Cpp7","Cpp8","Cpp9","Cpp10","Cpp11"},s1=" ";
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
	if(list.getSelectedValue()=="Cpp1")
	{
	setForeground(Color.blue);

	g.drawString("Aim Performing simple arithmetic operations using c++ class and object",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1	Start",100,160);

	g.drawString("2 Create a class with two data members as private",100,190);

	g.drawString("3	Create two member functions as public members,one for taking input form user through keyboard and for performing various arith op.on data members",100,210);

	g.drawString("4	First get the values for the data members through member function",100,240);

	g.drawString("5	Perform various operations like addition, subtraction, multiplication and division",100,270);

	g.drawString("6	Finally display the result of various operations",100,300);

	g.drawString("7	Stop",100,330);

	}

	if(list.getSelectedValue()=="Cpp2")
	{
	setForeground(Color.blue);

	g.drawString("Aim: Demonstrate the use parameterized constructor by passing different types of parameters to the constructor",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1.Start",100,160);

	g.drawString("2.Create a class with two data members as private",100,190);

	g.drawString("3.Create parameterized constructor of the same class and amember functions as public members",100,210);

	g.drawString("4.First get the values for the data members through constructor by creating the objects",100,240);

	g.drawString("5.Call the member function of the class by using object and the dot operator",100,270);

	g.drawString("6Finally display the result",100,300);

	g.drawString("7	Stop",100,330);

	}

	if(list.getSelectedValue()=="Cpp3")
	{
	setForeground(Color.blue);

	g.drawString("Aim: To calculate the area of rectangle, triangle and sphere using function overloading and class and objec",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1.Start",100,160);

	g.drawString("2.Create a class with three data members for area of triangle, rectangle and sphere as private",100,190);

	g.drawString("3.Create 3 member functions each for area calculation as public",100,210);

	g.drawString("4.First get the values for the data members through object creation",100,240);

	g.drawString("5.Call the member functions to perform area calculations",100,270);

	g.drawString("6.Finally display the area of triangle",100,300);

	g.drawString("7.Finally display the area of rectangle",100,330);

	g.drawString("8.Finally display the area of sphere",100,360);

	g.drawString("9.Stop",100,390);
	}

	if(list.getSelectedValue()=="Cpp4")
	{
	setForeground(Color.blue);

	g.drawString("Aim: Demonstrate the overloading of unary operators using the concept of member functions",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1.Start",100,160);

	g.drawString("2.Create a class with three data members as private",100,190);

	g.drawString("3.Create two member functions as public members , one for taking the input form the user through keyboard and other for displaying the values",100,210);

	g.drawString("4.Create the operator function to be overloaded",100,240);

	g.drawString("5.First get the values for the data members through member function",100,270);

	g.drawString("6.Call the operator function for overloading",100,300);

	g.drawString("7.Finally display the result of overloading unary operator",100,330);

	g.drawString("8.Stop",100,360);
	}

	if(list.getSelectedValue()=="Cpp5")
	{
	setForeground(Color.blue);

	g.drawString("Aim: Demonstrate the overloading of binary operators using the concept of member functions",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1.Start",100,160);

	g.drawString("2.Create a class with two data members as private",100,190);

	g.drawString("3.Create constructors for initialization of the objects as well as various operator functions for binary operators",100,210);

	g.drawString("4.Define the operator functions",100,240);

	g.drawString("5.First get the values for the data members through constructor functions",100,270);

	g.drawString("6.Perform various operations like addition, subtraction, multiplication and division with calling of operator functions",100,300);

	g.drawString("7.Finally display the result of various binary operators to be overloaded",100,330);

	g.drawString("8.Stop",100,360);
	}

	if(list.getSelectedValue()=="Cpp6")
	{
	setForeground(Color.blue);

	g.drawString("Aim: Demonstrate the use of multilevel inheritance and hybrid inheritance by taking suitable example",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1.Start",100,160);

	g.drawString("2.Create a class say student with some public, protected and private members",100,190);

	g.drawString("3.Create another class say marks inheriting class student",100,210);

	g.drawString("4.Create another class say result that inherits the class marks. So class result contains the members of class students and marks with its own members",100,240);

	g.drawString("5.Create two member functions as public members, one for taking the input form the user through keyboard and other for performing operations on data members",100,270);

	g.drawString("6.First get the values for the data members through member function",100,300);

	g.drawString("7.Perform various operations",100,330);

	g.drawString("8.Finally display the result how the multilevel inheritance achieved in c++",100,360);

	g.drawString("9.Stop",100,390);

	}

	if(list.getSelectedValue()=="Cpp7")
	{
	setForeground(Color.blue);

	g.drawString("Aim: To swap the numbers using the concept of function template",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1	Start",100,160);

	g.drawString("2	Create a class template with single parameter",100,190);

	g.drawString("3	Create function swap with template members",100,210);

	g.drawString("4	Define the swap function for swapping of two values with temporary variable",100,240);

	g.drawString("5	Call the swap function from main function for two integer values & for two floating point values",100,270);

	g.drawString("6	Finally display the values before swapping & after swapping",100,300);

	g.drawString("7	Stop",100,330);
	}

	if(list.getSelectedValue()=="Cpp8")
	{
	setForeground(Color.blue);

	g.drawString("Aim: To calculate factorial of a given number using copy constructor",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString(" 1: Start the program",100,160);

	g.drawString(" 2: Declare the class name as Copy with data members and member functions",100,190);

	g.drawString(" 3: The constructor Copy() with argument to assign the value",100,210);

	g.drawString(" 4: To call the function calculate() do the following steps",100,240);

	g.drawString(" 5: For i=1 to numberdo",100,270);

	g.drawString(" 6: Calculate fact=fact*i to assign to fact",100,300);

	g.drawString(" 7: Increment the value as 1",100,330);

	g.drawString(" 8: Return the value fact",100,360);

	g.drawString(" 9: Print the result",100,390);

	g.drawString("10: Stop",100,420);
	}

	if(list.getSelectedValue()=="Cpp9")
	{
	setForeground(Color.blue);

	g.drawString("Aim: Demonstrate the overloading of binary + operator using the concept of member function for concatenation of two strings",100,100);

	g.drawString("Algorithm:",100,130);

	g.drawString("1	Start",100,160);

	g.drawString("2	Create a class with string variable",100,190);

	g.drawString("3	Create input function for initialization of the objects as well as operator functions for binary +operator for concatenation of strings",100,210);

	g.drawString("4	Define the operator + function",100,240);

	g.drawString("5	First get the values for the 2 strings through member functions",100,270);

	g.drawString("6	Perform addition of the 2 entered string using + operator",100,300);

	g.drawString("7	Finally display the result of binary operator to be overloaded",100,330);

	g.drawString("8	Stop",100,360);
	}

	if(list.getSelectedValue()=="Cpp10")
	{
	setForeground(Color.blue);

	g.drawString("Aim: Demonstrate the overloading of unary operators using the concept of friend function",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1.Start",100,160);

	g.drawString("2.Create a class with three data members as private",100,190);

	g.drawString("3.Create two member functions as public members, one for taking the input form the user through keyboard and other for displaying the values",100,210);

	g.drawString("4.Create the operator function to be overloaded as a friend for a class",100,240);

	g.drawString("5.First get the values for the data members through member function",100,270);

	g.drawString("6.Call the friend operator function for overloading",100,300);

	g.drawString("7.Finally display the result of overloading unary operator",100,330);

	g.drawString("8.Stop",100,360);
	}

	if(list.getSelectedValue()=="Cpp11")
	{
	setForeground(Color.blue);

	g.drawString("Aim: Perform the run time polymorphism using virtual functions",100,100);

	g.drawString("Algorithm",100,130);

	g.drawString("1	Start",100,160);

	g.drawString("2	Create two classes with same member function and one class can inherit publically to other",100,190);

	g.drawString("3	Make base class function virtual",100,210);

	g.drawString("4	Declare the base class pointer and it can hold the address of object of derived class",100,240);

	g.drawString("5	Through the pointer call the member function of derived class to achieve run time polymorphism",100,270);

	g.drawString("6	Finally display the result of various operations",100,300);

	g.drawString("7	Stop",100,330);

	}
}
}

class ListDemo extends JFrame
{
	ListDemo()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("Algorithm");
		add(new myPanel());
		validate();
	}
}




class myPanel1 extends JPanel implements ListSelectionListener
{
	JList list;
	JScrollPane pane;
	String str[]={"Trig.Form.","Trig.Arith.","Trig.Ratio","Factorization","Defactoriz","Coordinate Geo.","Line Form","Limit"},s1=" ";
	myPanel1()
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
	if(list.getSelectedValue()=="Trig.Form.")
	{
		setForeground(Color.blue);
		g.drawString("1. Sin^2@+cos^2@=1",100,100);
		g.drawString("2. 1+tan^2@=sec^2@",100,140);
		g.drawString("3. 1+cot^2@=cosec^2@",100,180);
		g.drawString("4. tan@=sin@/cos@",100,220);
		g.drawString("5. cot@=cos@/sin@",100,260);
		g.drawString("6. tan@.cot@=1",100,300);
		g.drawString("7. cos@.sec@=1",100,340);
		g.drawString("8. sin@.cosec@=1",100,380);
	}

	if(list.getSelectedValue()=="Trig.Arith.")
	{
		setForeground(Color.blue);
		g.drawString(" 1. sin(A+B)=sinA.cosB+cosA.sinB",100,100);
		g.drawString(" 2. sin(A-B)=sinA.cosB-cosA.sinB",100,130);
		g.drawString(" 3. cos(A+B)=cosA.cosB-sinA.sinB",100,160);
		g.drawString(" 4. cos(A-B)=cosA.cosB+sinA.sinB",100,190);
		g.drawString(" 5. tan(A+B)=tanA+tanB/1-tanA.tanB",100,220);
		g.drawString(" 6. tan(A-B)=tanA-tanB/1+tanA.tanB",100,250);
		g.drawString(" 7. sin2A=2sinA.cosA",100,280);
		g.drawString(" 8. cos2A=cos^2A-sin^2A",100,310);
		g.drawString(" 9. 2cos^2A=1+cos2A",100,340);
		g.drawString("10. 2sin^2A=1-cos2A",100,370);
		g.drawString("11. tan2A=2tanA/1-tan^2A",100,400);
		g.drawString("12. sin2A=2tanA/1+tan^2A",100,430);
		g.drawString("13. cos2A=1-tan^2A/1+tan^2A",100,460);
		g.drawString("14. sin3A=3sinA.4sin^3A",100,490);
		g.drawString("15. cos3A=4cos^3A-3cosA",100,515);
		g.drawString("16. tan3A=3tanA-tan^3A/1-3tan^2A",100,540);
		g.drawString("17. sinA=2sinA/2.cosA/2",100,565);
		g.drawString("18. cosA=cos^2A/2-sin^2A/2",100,590);
		g.drawString("19. 2cos^2A/2=1+cos^2A",100,615);
		g.drawString("20. 2sin^2A/2=1-cos^2A",100,640);
	}

	if(list.getSelectedValue()=="Trig.Ratio")
	{
		setForeground(Color.blue);
		g.drawString(" 1. sin(-@)=-sin@",100,100);
		g.drawString(" 2. cos(-@)=cos@", 100,140);
		g.drawString(" 3. tan(-@)=-tan@",100,180);
		g.drawString(" 4. cosec(-@)=-cosec@",100,220);
		g.drawString(" 5. sec(-@)=sec@",100,260);
		g.drawString(" 6. cot(-@)=-cot@",100,300);
	}

	if(list.getSelectedValue()=="Factorization")
	{
		setForeground(Color.blue);
		g.drawString(" 1. sinC+sinD=2sin(C+D/2).cos(C-D/2)",100,100);
		g.drawString(" 2. sinC-sinD=2cos(C+D/2).sin(C-D/2)",100,140);
		g.drawString(" 3. cosC+cosD=2cos(C+D/2).cos(C-D/2)",100,180);
		g.drawString(" 4. cosC-cosD=-2sin(C+D/2).sin(C-D/2)",100,220);
		g.drawString(" 5. cosC-cosD=2sin(C+D/2).sin(D-C/2)",100,260);
	}

	if(list.getSelectedValue()=="Defactoriz")
	{
		setForeground(Color.blue);
		g.drawString(" 1. 2sinA.cosB=sin(A+B)+sin(A-B)",100,100);
		g.drawString(" 2. 2cosA.sinB=sin(A+B)-sin(A-B)",100,140);
		g.drawString(" 3. 2cosA.cosB=cos(A+B)-cos(A-B)",100,180);
		g.drawString(" 4. -2sinA.sinB=cos(A+B)-cos(A-B)",100,220);
		g.drawString(" 5. 2sinA.sinB=cos(A-B)-cos(A+B)",100,260);
	}

	if(list.getSelectedValue()=="Coordinate Geo.")
	{
		setForeground(Color.blue);
		g.drawString(" 1. A Square has all sides equals,diagonal equal.",100,100);
 		g.drawString(" 2. A Rectangle has opposite sides equal,diagonal  equal.",100,140);
		g.drawString(" 3. A Parallologram has opposite sides equal but diagonal unequal.",100,180);
		g.drawString(" 4. A Rhombus has all sides equal but diagonal unequal.",100,220);
		g.drawString(" 5. Section Formula for Internal division:->",100,260);
		g.drawString("    1) x=mx2+nx1/m+n    2) y=my2+ny1/m+n ",100,300);
		g.drawString(" 6. Section Formula for External division:->",100,340);
		g.drawString("    1) x=mx2-nx1/m-n    2) y=my2-ny1/m-n ",100,380);
		g.drawString(" 7. Midpoint Formula:->",100,420);
		g.drawString("    1) x=x1+x2/2        2) y=y1+y2/2 ",100,460);
		g.drawString(" 8. Centroid of a triangle:-> ",100,500);
		g.drawString("    1) x=x1+x2+x3/3     2) y=y1+y2+y3/3 ",100,540);

	}

	if(list.getSelectedValue()=="Line Form")
	{
		setForeground(Color.blue);
		g.drawString(" 1. The general eq. of line is ax+by+c=0 ",100,100);
		g.drawString(" 2. Parallel line=m1=m2",100,140);
		g.drawString(" 3. Perpendicular line=m1*m2=1 ",100,180);
		g.drawString(" 4. Slope point form:->y-y1=m(x-x1) ",100,220);
		g.drawString(" 5. Two intercept form:-> x/a+y/b=1 ",100,260);
		g.drawString(" 6. x-Intercept=-c/a",100,300);
		g.drawString(" 7. Y-Intercept=-c/b",100,340);
	}

	if(list.getSelectedValue()=="Limit")
	{
		setForeground(Color.blue);
		g.drawString(" 1. lim x = a where x->a",100,100);
		g.drawString(" 2. lim x^n = a^n where x->a",100,130);
		g.drawString(" 3. lim k = k where x->a and k=constant",100,160);
		g.drawString(" 4. lim sin x = sin a",100,190);
		g.drawString(" 5. If lim f(x)=l and lim g(x)=m",100,220);
		g.drawString("    1)lim [f(x) ± g(x)]=lim f(x) ± lim g(x)",100,250);
		g.drawString("    2)lim [k*f(x)]=k*lim f(x)",100,280);
		g.drawString("    3)lim [f(x)*g(x)]=lim f(x)*lim g(x)",100,310);
		g.drawString("    4)lim f(x)/g(x)= lim f(x)/lim g(x).where x->a",100,340);

	}
}
}

class ListDemo1 extends JFrame
{
	ListDemo1()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("Formula");
		add(new myPanel1());
		validate();
	}
}

