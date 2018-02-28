// import the necessary packages
import java.awt.*;
import java.awt.event.*;
// implements ActionListener 'coz we need to handle action events
public class validator extends Frame implements ActionListener
{
        Label namL, ageL;
        TextField namT, ageT;
        Button k, rst;
        String msg = "Press OK after entering info!"; //string declaration & initialization
        Dimension d = null;

        //class constructor
        public validator()
        {
                setLayout(new FlowLayout());
                setBackground(new Color(192, 192, 192));
                setFont(new Font("Times New Roman", Font.BOLD, 14));
	
                namL = new Label("YOUR NAME:");
                ageL = new Label("AGE:");

                namT = new TextField(12);
                ageT = new TextField(8);

                //add all the labels, buttons and textfields to the appwindow
                //order of adding is important
                add(namL);
                add(namT);
                add(ageL);
                add(ageT);

                k = new Button("OK");
                rst = new Button("RESET");

                add(k);
                add(rst);

                // register to receive action events
                k.addActionListener(this);
                rst.addActionListener(this);

                // add window handle to handle window closing event
                addWindowListener(new MyWindowAdapter());
        }
        public static void main(String args[])
        {
                // Create an object instance
                validator newVali = new validator();
                newVali.setSize(new Dimension(400, 155));
                newVali.setTitle("An AWT-based Validator Application");
                newVali.setVisible(true);
        }
	public void actionPerformed(ActionEvent ae)
	{
                String str = ae.getActionCommand(), nam = namT.getText();
                int age;
                msg = "";

                        if(str.equals("OK")) //check to see which button was pressed
                        {
                                try // handle exceptions
                                {
                                        //first check to see whether the name field is empty
                                        if(nam.equals("")){msg = "Name field cannot be empty";reset();}
                                        // check each charater whether it is a valid charater or whitespace
                                        for(int i = 0; i<nam.length(); i++)
                                        {
                                                if((Character.isLetter(nam.charAt(i)))||(Character.isWhitespace(nam.charAt(i))))
                                                ; // do nothing
                                                else
                                                {
                                                        msg = "Illegal character in Name field";
                                                        reset();
                                                }
                                        }
                                        // check to see whether the name field is having characters more than 30.
                                        if(nam.length() > 30){msg = "Name field out-of-bounds";reset();}
                                }catch(NumberFormatException NFE){msg = "";reset();}

                                try
                                {
                                        // convert the entered string in age field to integer
                                        age = Integer.parseInt(ageT.getText());
                                        if((age<1)|(age>150)){msg = "Age field out-of-bounds";reset();}
                                }catch(NumberFormatException NFE)
                                 {
                                        if(msg == "")
                                                msg = "Illegal age field state";
                                        else
                                                msg += "";
                                                reset();
                                 }
                             
                                repaint();
                        }
                        else if (str.equals("RESET")) // is button RESET pressed?
                        {
                                msg = "";
                                reset();
                        }
        }
        public void paint(Graphics g)
        {
                //get size and store in d
                d = size();
                g.drawRect(6, 24, d.width - 13, d.height - 30);
                g.drawString("YOUR NAME:     " + namT.getText(), 10, 100);
                g.drawString("AGE              :      " + ageT.getText(), 10, 120);
                g.drawString("MESSAGE     :      " + msg, 10, 140);
        }
        public void reset()
        {
                // empty both textfields
                namT.setText("");
                ageT.setText("");
                repaint();
        }
}
	
class MyWindowAdapter extends WindowAdapter
{
        public void windowClosing(WindowEvent we)
        {
                // exit zero for normal program termination
                System.exit(0);
        }                                       
}
