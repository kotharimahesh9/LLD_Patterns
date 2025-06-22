package publisher;

import subscriber.NotificationListener;

public interface NotificationPublisher {

    public void registerUser(NotificationListener notificationListener);
    public void removeUser(NotificationListener notificationListener);
    public void notifyUsers();
}
