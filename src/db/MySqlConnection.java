package db;

import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/admindemo?" +
                    "user=root&password=");
            String q = " INSERT into users VALUES('kamlesh@widgetshubs.com','123456')";
            Statement statement = connection.createStatement();
            int rs = statement.executeUpdate(q);
            System.out.println(rs);
            System.out.println("Done");


//String qu = " INSERT into users VALUES (1,'XYZ@yopmail.com', '123456')";
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(qu);
//            PreparedStatement preparedStatement1 = connection.prepareStatement(" INSERT into users ( 'email' , 'password') VALUES ('XYZ@yopmail.com', '123456')");
//           ResultSet resultSet34= preparedStatement1.executeQuery();
//            while (resultSet34.next()) {
//                System.out.println(resultSet34.getString(1));
//            }
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
//            Statement statement = connection.createStatement();
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getString(2));
//            }
//          preparedStatement.execute();
//            System.out.println(preparedStatement.getFetchSize());

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
