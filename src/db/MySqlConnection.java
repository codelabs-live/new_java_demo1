package db;

import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/java?" +
            "user=root&password=");
            System.out.println("Done");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("select * from user");
//            System.out.println(rs.getString(1));
          preparedStatement.execute();
            System.out.println(preparedStatement.getFetchSize());

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
