package JDBC_in_java_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert_data_into_database_2 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/rahul123";
        String username="root";
        String password="rahul123";
        String query="INSERT INTO emp (id, name, job_title, salary) VALUES (6, 'Laxman ji', 'Software Engineer', 18000);";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();

            int rowAffected= stmt.executeUpdate(query);
            if (rowAffected>0){
                System.out.println("Data insert successfully");
            }else {
                System.out.println("Data not inserted");
            }

            con.close();
            stmt.close();
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        catch (SQLException e){
            System.out.println(e);
        }


    }
}
