import java.sql.*;
public class studtable
{
	public static void main(String ar[])
	{
		DriverManager.getDriver(ds.getConnection().getMetaData().getURL()).getClass();
	/*
		DriverManager.getDriver(ds.getConnection().getMetaData().getURL().getClass());
		try
		{
		String Query="select * from stud where rno=20";
		Class.forName("com.mysql.jdbc.Driver");		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/stud","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		//rs.next();
		while(rs.next())
		{  
			System.out.println(rs.getString(1));  
		}  
	//	String rno=rs.getString(2);
	//	System.out.println(rno);
		con.close();
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
	*/
	}
}