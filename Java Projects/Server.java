import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


class Server
{
	public static void main(String ar[])throws IOException
	{
		String s2;
		ServerSocket s=new ServerSocket(1050);
		System.out.println("Created");
		Socket s1=s.accept();
		InputStream is=s1.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		while(true)
		{
		s2=br.readLine();
		if(s2.equals("stop"))
			break;
		System.out.println("From client:"+s2);
		}
	}
}
