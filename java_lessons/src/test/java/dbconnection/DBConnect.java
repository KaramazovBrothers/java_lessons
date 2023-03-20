package dbconnection;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

    public static Connection connect;
    public static Statement statement;

    public static  void connect() {
        try {
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/aventus?user=admin&password=admin");
            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @SneakyThrows
    public static void closeConnection() {
        if(statement != null) {
            statement.close();
        }
        if(connect != null) {
            connect.close();
        }
    }

    @Test
    public void connectionTest() {
        connect();
        closeConnection();
    }
}
