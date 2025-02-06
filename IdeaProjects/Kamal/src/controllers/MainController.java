package controllers;
import models.Customer;
import repository.UserRepository;
import repository.DatabaseHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainController {
    private final DatabaseHandler databaseHandler;
    private final UserRepository userRepository;
    private final Scanner scanner;

    public MainController() {
        this.databaseHandler = new DatabaseHandler();
        this.userRepository = new UserRepository();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) throws SQLException {
        MainController mainController=new MainController();
        mainController.run();
    }

    public void run() throws SQLException {
        System.out.println("Hello and welcome!");

        Connection connection = databaseHandler.connect();
        try (Statement stmt = connection.createStatement()) {
            System.out.println("Enter id:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Фикс бага с `nextInt()`

            System.out.println("Enter name:");
            String name = scanner.nextLine();

            System.out.println("Enter email:");
            String email = scanner.nextLine();

            Customer customer = new Customer(id, name, email);
            userRepository.saveCustomer(customer);

            stmt.executeUpdate("INSERT INTO admins (id, name, email) VALUES ('" + id + "', '" + name + "', '" + email + "')");

            System.out.println("Customer saved successfully!");
        }
    }
}
