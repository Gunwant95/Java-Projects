import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class Client
{
	public static void main(String ar[])throws IOException
	{
		String s1;
		Socket s=new Socket("127.0.0.1",1050);
		System.out.println("Client created");
		OutputStream os=s.getOutputStream();
		PrintWriter p=new PrintWriter(os,true);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter the message");
			s1=br.readLine();
			p.println(s1);
		}
	}
}