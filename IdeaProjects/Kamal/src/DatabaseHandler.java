import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class DatabaseHandler {
    private static final String URL = "jdbc:postgresql://localhost:5432/cargo_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

