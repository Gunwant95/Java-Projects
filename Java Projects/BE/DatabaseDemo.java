import java.sql.*;

class DatabaseDemo
{
	public static void main(String ar[])
	{
		try
		{
		
		String url="jdbc:mysql://localhost/stud";
		String uname="root";
		String pass="root";
		String query="select * from stud";

		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
		String n=rs.getString("name");
		int rn=rs.getInt("rollno");
		
		System.out.println(rn+" "+n);
		}
		rs.close();
	
		con.close();
		}

		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}