import java.sql.*;
import javax.swing.*;

public class sqliteconnection {
	
    static Connection conn =null;
	public static Connection dbconnector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			conn =DriverManager.getConnection("jdbc:sqlite:empoyee.sqlite");
			conn.close(); 
			conn =DriverManager.getConnection("jdbc:sqlite:empoyee.sqlite"); 
			return conn;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			JOptionPane.showMessageDialog(null, "kljdfklgj");
		
		return null;
		}
	}
	
	
	public static Connection workdbconnector()
	{
		try{
		Class.forName("org.sqlite.JDBC");
		Connection conn =DriverManager.getConnection("jdbc:sqlite:D:\\config.sqlite"); 
	    return conn;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		
		return null;
		}
	}

	public static void main(String []d){
		Thread clock=new Thread()
		{

public void run()
{
	try { 
		
		for(;;)
		{		
			System.out.println(9);	
			              								              
			sleep(1/1000000);
		}
	} catch (InterruptedException e) {
	
	}		
}
};
  clock.start(); 

	}

}
