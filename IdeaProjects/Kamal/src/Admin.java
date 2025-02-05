import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }
}

