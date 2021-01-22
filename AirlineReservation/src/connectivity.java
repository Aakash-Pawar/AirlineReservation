
import java.sql.*;
public class connectivity 
{

	Connection cn;
	Statement st;
	public connectivity() 
	{
		
		// TODO Auto-generated constructor stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql:///airlinedb","root","Aakki@0702");
			st=cn.createStatement();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
