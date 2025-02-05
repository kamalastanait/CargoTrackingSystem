import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class NotificationService {
    public void sendNotification(String message) {
        System.out.println("Notification: " + message);
    }
}
