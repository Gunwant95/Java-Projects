import java.io.*;
class Secure
{
	String pw="Security!!!";
	String s1;

	StringBuffer s2=new StringBuffer("Welcome");

	void get(String s)
	{
		s1=s;
		if(pw.equals(s1))
		{
			System.out.println("Good");
		}
		else
		{
			System.out.println("Incorrect password");
		}
	}

	void read()
	{
		String s3;
		s3=s2.append(pw);
		System.out.println("String ="+s3);
	}

	void reverse()
	{
		for(int i=pw.length()-1;i>0;i++)

		System.out.println("pw.charAt(i)");
	}

	void change()
	{
		String s4=pw.replace('!','*');
		System.out.println("String is="+s4);
	}
}

class Purpose
{
	public static void main(String args[])
	{
		Secure r1=new Secure();
		System.out.println("Enter the password");

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

		String n=in.readLine();
		r1.get(n);
		r1.read();
		r1.reverse();
		r1.change();
	}
}
