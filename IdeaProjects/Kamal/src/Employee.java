import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class Employee extends User {
    private String position;

    public Employee(int id, String name, String email, String position) {
        super(id, name, email);
        this.position = position;
    }
}

