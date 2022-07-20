package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
  public   Connection connection ;
 public  void getConnection(){
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost/demo1?" +
                 "user=root&password=");
     }catch (SQLException | ClassNotFoundException e){
         System.out.println(e);
     }
    }
}
