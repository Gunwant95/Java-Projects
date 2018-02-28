import java.sql.*;

public class DemoDb
{
	public static void main(String aar[])
	{
		try
		{
		String u="jdbc:mysql://localhost/stud";
		String uname="root";
		String pass="root";

		String query="select * from stud";
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(u,uname,pass);
		Statement st=con.createStatement();
		
		st.executeUpdate("insert into books(isbn,title,author,publ)"+"values"+"('007160630','JAVA',"+"'HERBERT','Oracle'),"+"('032135668','Effective Java','Joshua',"+"'Addison')");
	
		System.out.println("Record added");
		con.close();

		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}