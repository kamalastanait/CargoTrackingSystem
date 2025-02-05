import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class Location {
    private String city;
    private String country;

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
