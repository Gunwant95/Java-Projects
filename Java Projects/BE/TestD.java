import java.sql.*;

public class TestD
{
	public static void main(String ar[])
	{
		try
		{
			Driver d=(Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Connection Works");
		}
		catch(Exception e)
		{
			System.out.println("Connection Failed");
		}
	}
} 