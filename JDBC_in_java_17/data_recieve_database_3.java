package JDBC_in_java_17;

import java.sql.*;

public class data_recieve_database_3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/rahul123";
            String username = "root";
            String password = "rahul123";
//            String query="Select * from emp where id=?";
            String query="Select * from emp ";
            Connection con= DriverManager.getConnection(url, username, password);
           PreparedStatement pstmt = con.prepareStatement(query);
//           pstmt.setInt(1,5);

            ResultSet result=pstmt.executeQuery();
            while (result.next()){

                int id=result.getInt("id");
                String name=result.getString("name");
                String job_title=result.getString("job_title");
                int salary=result.getInt("salary");
                System.out.println();
                System.out.println("id : "+id);
                System.out.println("Name : "+name);
                System.out.println("Job Title : "+job_title);
                System.out.println("Salary : "+salary);

            }
            con.close();
            pstmt.close();
            result.close();
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        catch (SQLException e){
            System.out.println(e);
        }

    }
}
