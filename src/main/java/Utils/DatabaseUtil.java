package Utils;

import org.testng.Assert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/LambdaTestPlayground";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Angela9448!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    public static void executeQuery(String query){
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            if(result>0){
                System.out.println("Successfully inserted");
            }else{
                System.out.println("Insertion failed!");
                Assert.assertTrue(false);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
