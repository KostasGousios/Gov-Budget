import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    // Δημιουργεί τo SQLite database file 
    private static final String URL = "jdbc:sqlite:statebudget.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}

