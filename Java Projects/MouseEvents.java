// Demonstrate the mouse event handlers.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

	public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener 
	{
		String msg = "";
		int mouseX = 0, mouseY = 0; // coordinates of mouse
		Button b1,b2;
		TextField tf1,tf2;
		
		public MouseEvents() 
		{
			b1=new Button();
			b2=new Button();
			tf1=new TextField(30);
			tf2=new TextField(30);
			setVisible(true);
			setSize(500,500);
			setLayout(new FlowLayout());
			add(b1);
			add(b2);
			add(tf1);
			add(tf2);
			b1.addMouseListener(this);
			b1.addMouseMotionListener(this);
			b2.addMouseListener(this);
			b2.addMouseMotionListener(this);
		}
		// Handle mouse clicked.
		public void mouseClicked(MouseEvent me) 
		{
			// save coordinates
			mouseX = 0;
			mouseY = 10;
			msg = "Mouse clicked.";
			tf1.setText(msg);
		}
		
		// Handle mouse entered.
		public void mouseEntered(MouseEvent me) 
		{
			// save coordinates
			mouseX = 0;
			mouseY = 10;
			msg = "Mouse entered.";
			
			tf2.setText("");
			tf2.setText(msg);
		}
	
		// Handle mouse exited.
		public void mouseExited(MouseEvent me) 
		{
			// save coordinates
			mouseX = 0;
			mouseY = 10;
			msg = "Mouse exited.";
			tf2.setText("");
			tf2.setText(msg);
		}
		
		// Handle button pressed.
		public void mousePressed(MouseEvent me) 
		{
			// save coordinates
			mouseX = me.getX();
			mouseY = me.getY();
			msg = "Down Mouse Pressed";
			tf1.setText("");
			tf1.setText(msg);
		}

		// Handle button released.
		public void mouseReleased(MouseEvent me) 
		{
			// save coordinates
			mouseX = me.getX();
			mouseY = me.getY();
			msg = "Up Mouse Released";
			tf1.setText("");
			tf1.setText(msg);
		}
		
		// Handle mouse dragged.
		public void mouseDragged(MouseEvent me) 
		{
				// save coordinates
			mouseX = me.getX();
			mouseY = me.getY();
			msg = "*";
			//showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
			tf1.setText("");
			tf1.setText("Dragging mouse at " + mouseX + ", " + mouseY);
			
		}

		// Handle mouse moved.
		public void mouseMoved(MouseEvent me) 
		{
			// show status
			//showStatus("Moving mouse at " + me.getX() + ", " +me.getY());
			tf1.setText("Moving mouse at " + me.getX() + ", " +me.getY());
		}
		
		// Display msg in applet window at current X,Y location.
		
		public static void main(String[] args){
			new MouseEvents();
		}
	}
