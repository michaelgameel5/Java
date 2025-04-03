public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube and GitHub Actions!");
        System.out.println("First commit to SonarQube and GitHub Actions!");
        System.out.println("Second commit to SonarQube and GitHub Actions!");

        
    }
}

public class UserRepository {
    // SonarQube will flag: 'Prevent SQL injection'
    public User getUser(String username, Statement statement) throws SQLException {
        String query = "SELECT * FROM users WHERE username = '" + username + "'";  // Vulnerability: S3649
        return statement.executeQuery(query);
    }
}