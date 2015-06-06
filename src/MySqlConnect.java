
import java.sql.*;
import javax.swing.*;




public class MySqlConnect {
   
    
  public  static Connection ConnectDB() 
         {
            try 
            {
                Login log = new Login();
                Class.forName("com.mysql.jdbc.Driver");
                Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost/apatewniki", "root", "");
                return Conn;
            }
            catch (Exception e) 
            {  
               
                JOptionPane.showMessageDialog(null, "Make sure you have a database", "Could not Connect to database", JOptionPane.ERROR_MESSAGE);

                return null;

            }
        }
    
}
