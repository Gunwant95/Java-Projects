import java.sql.*;
import java.io.*;

public class DBupdate
{
	public static void main(String rs[])
	{
		BufferedReader br=null;
		try
		{
	
		String u="jdbc:mysql://localhost/stud";
		String uname="root";
		String pas="root";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(u,uname,pas);
		Statement st=con.createStatement();

		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter record to update(isbn):");
		String isbn=br.readLine();
		System.out.print("Enter field to update");
		String field=br.readLine();
		System.out.print("Enter data");
		String data=br.readLine();
		String updateString=
		"update books set " + field + "='"+data+"' "+" where isbn=" + isbn;
	
		st.executeUpdate(updateString);

		con.close();
		
		System.out.println("Record updated");
		}

		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}	