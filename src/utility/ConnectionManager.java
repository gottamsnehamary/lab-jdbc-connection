package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	
	public Connection getConnection() throws Exception 
	{
		/*Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con= null;
		
	con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","SYSTEM","Edition11g");
	
		return con;*/
		
Properties prop=loadPropertiesFile();
{
		
		String driver = prop.getProperty("driver");
		String url= prop.getProperty("url");
		String user=prop.getProperty("username");
		String password=prop.getProperty("password");
		 Class.forName(driver);
		 Connection con;
		 con=DriverManager.getConnection(url,user,password);
		 
		 return con;
		 

	}
	}
		
public static Properties loadPropertiesFile() throws Exception
{
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	
} 
	
}
