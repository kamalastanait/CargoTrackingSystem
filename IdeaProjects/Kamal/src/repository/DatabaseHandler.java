package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler {
    private static final String URL = "jdbc:postgresql://localhost:5432/cargo_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    private static Connection connection; // Единственное соединение (Singleton)

    // Подключение к БД (синглтон)
    public Connection connect() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Database connected successfully!");
            } catch (SQLException e) {
                System.err.println("Database connection failed: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return connection;
    }

    // Закрытие соединения
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
                connection = null;
            } catch (SQLException e) {
                System.err.println("Failed to close the database connection: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
