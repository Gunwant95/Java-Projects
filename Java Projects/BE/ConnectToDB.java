import java.sql.*;
public class ConnectToDB
{
	public static void main(String ar[])
	{
		Connection conn=null;
		try
		{
			String url="jdbc:mysql://localhost/stud";
			String uname="root";
			String pass="root";
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection(url,uname,pass);
			System.out.println("Database Connection Successful");
	
			Statement st=conn.createStatement();	
			ResultSet rs=st.executeQuery("select * from stud");
			
			while(rs.next())
			{
				int rn=rs.getInt("rollno");
				String n=rs.getString("name");
				System.out.println(rn+" "+n);
			}
			rs.close();
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Connection failed");
		}
	finally
	{
		if(conn!=null)
		{
			try
			{
				conn.close();
				System.out.println("database conn closed");
			}
			catch(Exception e)
			{
				System.out.println("Database connection cannot be closed");
			}
		}
	}
	}
}