import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.applet.AppletContext.*;
import java.util.*;
import javax.swing.event.*;
import java.lang.reflect.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import  java.awt.image.ImageConsumer ;
import java.awt.image.ImageObserver;
import   java.applet.AudioClip;
import javax.swing.filechooser.FileView;
import java.net.*;
import java.util.zip.*;


class Trainy extends JFrame
{
	JInternalFrame jfq,jfq2;
	JFrame jf,jfs;
	JPanel jjp,jk;
	JToolBar tb;
	JButton b1,b2,b3,g1,g2,g3,jk1,jk2,jk3,jk4,jk5;
	JLabel jl,jl2,jl3,jl4,jl5,jl6,jl7,img,img2,jb;
	JComboBox main;
	ImageIcon image,image2;
	DefaultListModel mu,ku;
	JList jh;
	int vx,hx,ans=0;

	int jdk=1;


	Trainy()
	{
		if(jdk==1)
		{

			jdk++;

			jf=new JFrame("Virus Blocker");
			jf.setLayout(null);
			jf.setLocation(50,50);
			jf.setSize(570,670);
			jf.setVisible(true);

			jjp=new JPanel(null,true);
			jjp.setBounds(420,480,140,150);
			jf.add(jjp);

			image=new ImageIcon("Image/ScanStart.gif");
			image2=new ImageIcon("Image/Scan.gif");


			jfq2=new JInternalFrame();
			jfq2.setMaximizable(true);
			jfq2.hide();
			//jfq2.setSelected(true);
			jfq2.setClosable(true);
			jfq2.setTitle("Setting");
			jfq2.setLayout(null);
			jfq2.setLocation(410,319);
			jfq2.setSize(150,160);
			jfq2.setVisible(true);

			jfq=new JInternalFrame();
			jfq.setMaximizable(true);
			jfq.hide();
			//jfq.setSelected(true);
			jfq.setClosable(true);
			jfq.setResizable(true);
			jfq.setTitle("User Choice");
			jfq.setLayout(null);
			jfq.setLocation(410,25);
			jfq.setSize(150,290);
			jfq.setVisible(true);

			jf.add(jfq2);
			jf.add(jfq);

			tb=new JToolBar();
			tb.setBounds(0,1,400,30);
			jf.add(tb);

			img=new JLabel(image);
			img.setBounds(06,50,30,30);
			img.setVisible(false);
			jf.add(img);



			img2=new JLabel(image2);
			img2.setBounds(30,35,60,60);
			img2.setVisible(false);
			jjp.add(img2);

			jl=new JLabel("Scan File:  ");
			jl.setBounds(30,30,380,60);
			jl.setVisible(true);
			jf.add(jl);

			jl2=new JLabel("Last Infected File:");
			jl2.setBounds(30,90,380,60);
			jl2.setVisible(true);
			jf.add(jl2);


			jb=new JLabel();
			jb.setBounds(15,95,120,30);
			jjp.add(jb);


				 hx=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
				  vx=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;




			mu=new DefaultListModel();
			jh=new JList(mu);


			ku=new DefaultListModel();
			main=new JComboBox();
			main.addItem("Select Drive");

			jh.setForeground(Color.red);
			JScrollPane df=new JScrollPane(jh,vx,hx);


			b1=new JButton("View Log");
			b1.setBounds(0,1,100,30);
			tb.add(b1);


			b2=new JButton("View File Log");
			b2.setBounds(0,1,100,30);
			tb.add(b2);

			b3=new JButton("About");
			b3.setBounds(0,1,100,30);
			tb.add(b3);

			jl3=new JLabel("Scan Log");
			jl3.setBounds(10,450,400,60);
			jf.add(jl3);


			JPanel jk=new JPanel(null,true);

			jl4=new JLabel("Software: Virus Blocker 1.0.0.1");
			jl4.setBounds(20,20,400,30);
			jk.add(jl4);

			JLabel jl5=new JLabel("Database Version: 12.19.2010.9.16");
			jl5.setBounds(20,40,400,30);
			jk.add(jl5);


			JLabel jl6=new JLabel("Database By: E-Security");
			jl6.setBounds(20,60,400,30);
			jk.add(jl6);


			JLabel jl7=new JLabel("Update: Not Required");
			jl7.setBounds(20,80,150,30);
			jk.add(jl7);

			jk.setBounds(10,510,400,120);
			jf.add(jk);

			jk1=new JButton("Scan All Drive");
			jk1.setDefaultCapable(false);
			jk1.removeNotify();
			jk1.setBounds(10,10,120,30);
			jfq.add(jk1);


			g1=new JButton("Task Manager");
			g1.setDefaultCapable(false);
			g1.removeNotify();
			g1.setBounds(10,10,120,30);
			jfq2.add(g1);


			g2=new JButton("Empty Virus vault");
			g2.setDefaultCapable(false);
			g2.removeNotify();
			g2.setBounds(10,50,120,30);
			jfq2.add(g2);


			g3=new JButton("Setting");
			g3.setDefaultCapable(false);
			g3.removeNotify();
			g3.setBounds(10,90,120,30);
			jfq2.add(g3);

			jk2=new JButton("Scan System Drive");
			jk2.setBounds(10,50,120,30);
			jfq.add(jk2);


			jk3=new JButton("Scan User Drive");
			jk3.setBounds(10,90,120,30);
			jfq.add(jk3);

			main=new JComboBox();
			main.addItem("Select Drive");

			main.setBounds(10,130,120,30);
			jfq.add(main);



			jk4=new JButton("Scan Folder");
			jk4.setBounds(10,170,120,30);
			jfq.add(jk4);

			jk5=new JButton("Scan File");
			jk5.setBounds(10,210,120,30);
			jfq.add(jk5);

			g1.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{

			try{

			Runtime r=Runtime.getRuntime();
			r.exec("taskmgr.exe");
			ans=0;
			}catch(Exception fr){}
			//taskmgr m=new taskmgr();
			//m.setVisible(true);
			//m.setSize(580,520);
			//m.setLocation(30,30);
			}
			});

			b3.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
			try{
			JFrame jfc=new JFrame("About Us");
			jfc.setVisible(true);
			jfc.setLocation(100,100);
			jfc.setSize(400,470);
			jfc.setLayout(null);


			ImageIcon gh=new ImageIcon("Image/lvback.gif");
			JLabel jl=new JLabel(gh);
			jl.setBounds(60,20,160,140);
			jfc.add(jl);

			JTextArea rr=new JTextArea("About Us");
			rr.setBackground(Color.black);
			rr.setForeground(Color.red);
			rr.setBounds(20,170,400,280);
			rr.setEditable(false);

			JScrollPane hhq=new JScrollPane(rr,vx,hx);

			jfc.add(rr);




					rr.setText(rr.getText()+"\n\rSoftware Name:Virus Blocker 1.0.0.1 \n");
					//try{Thread.sleep(2000);}catch(Exception hy){}
					rr.setText(rr.getText()+"Version Info: 1.0.0.1 \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Author: Gunawant S.Kapade \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Tester: Tushar R.Deore \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Beta Version Tester: Ganesh G.Gavit \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"DFD Concept: Lokesh Tayde \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Database By: E-Security \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Realising Date: 1 Jan 2014 \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Test Start: 13 Jan 2014 \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Test Complete: 27 Jan 2014 \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Requirement: JDK 1.6 \n");
					//Thread.sleep(2000);
					rr.setText(rr.getText()+"Feedback on: \n");
					rr.setText(rr.getText()+"           1.Gunawant1995@gmail.com \n");
					rr.setText(rr.getText()+"           2.www.e-security.co.in   \n");
					//Thread.sleep(4000);

			}catch(Exception gt){}

			}
			});

		}

	}

	public static void main(String args[])
	{
		new Trainy();
	}
}