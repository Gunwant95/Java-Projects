// Demonstrate some virtual key codes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class KeyEvents1 extends JFrame implements KeyListener 
{
	String msg = "";
	int X = 10, Y = 20; // output coordinates
	TextField tf,tf2,tf3;
	KeyEvents1() 
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		tf= new TextField(20);
		tf2= new TextField(20);
		tf3= new TextField(20);
		tf.addKeyListener(this);
		add(tf);
		add(tf2);
		add(tf3);
		tf.requestFocus(); // request input focus
	}
	
	public void keyPressed(KeyEvent ke) 
	{
		tf2.setText(msg);
		int key = ke.getKeyCode();
		switch(key) 
		{
			
			case KeyEvent.VK_F1:msg += "<F1>";
						break;
			case KeyEvent.VK_F2:msg += "<F2>";
						break;
			case KeyEvent.VK_F3:msg += "<F3>";
						break;
			case KeyEvent.VK_PAGE_DOWN:msg += "<PgDn>";
						break;
			case KeyEvent.VK_PAGE_UP:msg += "<PgUp>";
						break;
			case KeyEvent.VK_LEFT:msg += "<Left Arrow>";
						break;
			case KeyEvent.VK_RIGHT:msg += "<Right Arrow>";
						break;
		}
	}
	
	public void keyReleased(KeyEvent ke) 
	{
			//showStatus("Key Released");
			tf2.setText(msg);
	}
	
	public void keyTyped(KeyEvent ke) 
	{
			msg += ke.getKeyChar();
			tf2.setText(msg);
		
	}
	
	public static void main(String[] args){
		new KeyEvents1();
	}
	
}

