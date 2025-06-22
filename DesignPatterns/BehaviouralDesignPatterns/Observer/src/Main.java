import publisher.EmailNotifier;
import publisher.NotificationPublisher;
import publisher.PushNotificationNotifier;
import publisher.SMSNotifier;
import subscriber.Laptop;
import subscriber.Phone;

public class Main {
    public static void main(String[] args) {
        // Ideally this should not be in the main function

        NotificationPublisher emailNotifier = new EmailNotifier();
        NotificationPublisher smsNotifier = new SMSNotifier();
        NotificationPublisher pushNotificationNotifier = new PushNotificationNotifier();

        emailNotifier.registerUser(new Laptop());
        smsNotifier.registerUser(new Phone());
        pushNotificationNotifier.registerUser(new Phone());
        Laptop laptop = new Laptop();
        pushNotificationNotifier.registerUser(laptop);

        emailNotifier.notifyUsers();
        smsNotifier.notifyUsers();
        pushNotificationNotifier.notifyUsers();

        pushNotificationNotifier.removeUser(laptop);
        emailNotifier.notifyUsers();
        smsNotifier.notifyUsers();
        pushNotificationNotifier.notifyUsers();

    }
}