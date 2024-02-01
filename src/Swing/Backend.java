package Swing;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

// Creating class Con for the connection with the database.
public class Backend {
    public static void main(String[] args) {

        
    }

    Connection connection;
    public Statement statement;
  

    public Backend() {
        try {
            String url = "jdbc:mysql://localhost:3306/java_users_database";
            String password = "";
            String username = "root";
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            if (connection != null) {
                System.out.println("CONNECTED!");
            }

        } catch (Exception e) {
            System.out.println("Connection Failed with the Database: Con.java " + e);
        }
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}