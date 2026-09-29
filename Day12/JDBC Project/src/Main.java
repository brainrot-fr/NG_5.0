import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) {
    String url = "jdbc:mariadb://127.0.0.1:3306/practice";
    String username = "student";
    String password = "1234";
    // String query = "INSERT INTO users VALUES (16, 'Karthik','karthik@gmail.com', 'shadnagar');";
    String deleteQuery = "delete from users where ID=14;";

    try {
      Connection connection =
          DriverManager.getConnection(url, username, password);

      System.out.println("Connected successfully!");

      
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(deleteQuery);

      if (result == 1) {
          System.out.println("Query executed successfully.");
      }
      else if (result == 0) {
        System.out.println("Error while running query");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
