/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package earl.harbor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Saif
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/earl_harbor";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    // Method to return the database connection
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Register JDBC driver (optional for some versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.print("success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("error");
        }
        return connection;
    }
}


