package inserting_page;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connection {
    private static  String URL = "jdbc:mysql://localhost:3306/Earl_Harbor";
    private static  String USER = "root";
    private static  String PASSWORD = "12345";
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
            return null;
        }
    }
}
