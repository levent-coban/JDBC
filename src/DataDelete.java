import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataDelete {
  
  public static void main(String[] args) throws SQLException {
    
    String dbUserName = "student";
    String dbPassword = "123";
    String dbName = "demo";
    String dbURL = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false";
    
    
    String sql = "DELETE FROM employees WHERE last_name='Doe' AND first_name='John' ";
    
    
    try (
      Connection connection = DriverManager.getConnection( dbURL, dbUserName, dbPassword );
      Statement statement = connection.createStatement();
    ) {
      statement.executeUpdate( sql );
    } catch ( Exception e ) {
      e.printStackTrace();
    }
    
  }
  
}
