package helper;

import java.sql.*;

public class dbConnection {

    public String getUsername() {

        String username = "";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arbiminanda", "arbiminanda", "admin");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name FROM `user`;");
            resultSet.next();
            username = resultSet.getString("name");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return username;

    }

}
