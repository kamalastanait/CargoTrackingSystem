package service;

public class NotificationService {

    public void sendNotification(String message) {
        System.out.println("Notification: " + message);
    }

    // Перегруженный метод для отправки уведомления конкретному пользователю
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending notification to " + recipient + ": " + message);
    }

    // Симуляция разных типов уведомлений
    public void sendEmailNotification(String email, String subject, String body) {
        System.out.println("Sending email to " + email + " with subject: " + subject);
        System.out.println("Email body: " + body);
    }

    public void sendSMSNotification(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }

    public void sendPushNotification(String deviceToken, String message) {
        System.out.println("Sending push notification to device " + deviceToken + ": " + message);
    }
}
