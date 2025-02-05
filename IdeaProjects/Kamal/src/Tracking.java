import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class Tracking {
    private int cargoId;
    private String location;
    private String status;

    public Tracking(int cargoId, String location, String status) {
        this.cargoId = cargoId;
        this.location = location;
        this.status = status;
    }
}

