import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:mysql://localhost:3306/STATEBUDGET?serverTimezone=UTC";
//Σύνδεση της java με mySQL
    public static Connection getConnection() throws SQLException {
        String user = "root";
        String pass = " ";  
        //Τα user και pass δεν αφορούν τον χρήστη της εφαρμογής είναι του mySQL server
        return DriverManager.getConnection(URL, user, pass);
    }
}
