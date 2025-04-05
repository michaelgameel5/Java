package main;
import java.sql.Connection;


public class DatabaseConnection {
    private static final String PASSWORD = "admin123";  // Vulnerability: S2068
    
    public Connection connect() {
        String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=" + PASSWORD;
        
    }
}
