
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 
public class test {
    
    public static void main(String[] args)
    {
          try 
            {
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/apatewniki", "root", "");
                 
                 Statement stmt = (Statement) con.createStatement();
                 
                 String name = "talre";
                 int phone = 123123;
                 
                 String insert ="INSERT INTO testtable VALUES ('"+ name + "', " + phone + ")";
                 stmt.executeUpdate(insert);
                 System.out.println("asdasdasd");
            }
            catch (Exception e) 
            {  
                
                           System.out.println("aa");

            }
    }
   
     
}
