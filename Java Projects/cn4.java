import java.io.*;
import java.net.*;
public class cn4
{
	public static final int PORT=1222;
	public static void main(String ar[])throws Exception
	{
		ServerSocket s=new ServerSocket(PORT);
		System.out.println("jServer started");
		Socket c=s.accept();
		System.out.println("Connection accepted:"+c);
		BufferedReader in=new BufferedReader(new InputStreamReader(c.getInputStream()));
		PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())),true);
		String send;
		while(true)
		{
			String str=in.readLine();
			send=("Echo:"+str);
			out.println(send);
			System.out.println("echoing:"+str);
			if(str.equals("END"))
			break;
		}
		System.out.println("\n Closing Server");
		c.close();
		s.close();
	}
}
