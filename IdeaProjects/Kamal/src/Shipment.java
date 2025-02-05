import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class Shipment {
    private int id;
    private int cargoId;
    private int customerId;
    private String deliveryDate;

    public Shipment(int id, int cargoId, int customerId, String deliveryDate) {
        this.id = id;
        this.cargoId = cargoId;
        this.customerId = customerId;
        this.deliveryDate = deliveryDate;
    }
}
