package JDBC_in_java_17;

import java.sql.*;

public class database_connection_estibalish_1 {
    public static void main(String[] args) {
        try {
                // Register JDBC driver
                 Class.forName("com.mysql.jdbc.Driver");

                // Open a connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul123", "root",
                        "rahul123");

                // Perform database operations
                System.out.println("connection successfully");
                // Close the connection
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
