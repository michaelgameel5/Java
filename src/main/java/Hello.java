package main.java;
import java.sql.Connection;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube and GitHub Actions!");
        System.out.println("First commit to SonarQube and GitHub Actions!");
        System.out.println("Second commit to SonarQube and GitHub Actions!");

        
    }
}

public class DatabaseConnection {

    private static final String PASSWORD = "admin123";  // Vulnerability: S2068
    
    public Connection connect() {
        String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=" + PASSWORD;
        
    }
}