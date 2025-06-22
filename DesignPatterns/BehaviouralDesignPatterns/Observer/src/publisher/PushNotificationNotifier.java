package publisher;

import dto.NotificationDTO;
import subscriber.NotificationListener;

import java.util.ArrayList;
import java.util.List;

public class PushNotificationNotifier implements NotificationPublisher{
    List<NotificationListener> users;

    public PushNotificationNotifier(){
        users = new ArrayList<>();
    }
    public void registerUser(NotificationListener notificationListener){
        users.add(notificationListener);
    }
    public void removeUser(NotificationListener notificationListener){
        users.remove(notificationListener);
    }
    public void notifyUsers(){
        NotificationDTO notificationDTO = generateNotificationDTO();
        for(NotificationListener notificationListener: users){
            notificationListener.getNotification(notificationDTO);
        }
    }

    private NotificationDTO generateNotificationDTO(){
        return new NotificationDTO("PUSH Notification !", "PUSH Notification", "3287562874");
    }
}
