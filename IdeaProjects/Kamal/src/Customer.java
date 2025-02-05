import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
class Customer extends User {
    private String address;

    public Customer(int id, String name, String email, String address) {
        super(id, name, email);
        this.address = address;
    }
}

