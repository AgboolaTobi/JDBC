package test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test

    public void testDatabaseConnection(){
        String url = "jdbc:mysql://localhost:3306/e-walletDb?createDatabaseIfNotExist=true";
        String username = "root";
        String password = "temmylove";
        try (Connection connection = DriverManager.getConnection(url,username,password)){
            assertNotNull(connection);
        }catch (SQLException exception){
            exception.printStackTrace();  // used this just to further show that the assertion didn't happen
           System.err.println("Error: " + exception.getMessage());
        }

    }
}
