class StrDemo
{
	public static void main(String args[])
	{
		String pass="Amar";
		boolean x=pass.equals(args[0]);
		if(x)
		System.out.println("Login Successful");
		else
		System.out.println("Login Unsuccessful");
	}
}