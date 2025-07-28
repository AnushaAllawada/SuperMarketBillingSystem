import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class Sample { 
public static void main(String[] args) throws  
ClassNotFoundException{ 
try 
{ 
Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.cj.
 jdbc.Driver 
Connection 
con=DriverManager.getConnection("jdbc:mysql://localhost:330
 6/test","root",""); 
if (con != null) { 
System.out.println("Connected"); 
      } 
  } catch (SQLException ex) { 
      ex.printStackTrace(); 
  } 
} 
} 
