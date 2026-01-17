package bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/bankdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Rupesh@p1234"; // apna mysql password

    public static Connection getConnection() {
        try {
            // MySQL JDBC Driver load
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection
            Connection con = DriverManager.getConnection(
                    URL, USER, PASSWORD
            );

            return con;

        } catch (Exception e) {
            System.out.println("Database connection failed ❌");
            e.printStackTrace();
            return null;
        }
    }
}
