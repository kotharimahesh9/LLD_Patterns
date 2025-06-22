package publisher;

import dto.NotificationDTO;
import subscriber.NotificationListener;

import java.util.ArrayList;
import java.util.List;

public class EmailNotifier implements NotificationPublisher{

    List<NotificationListener> users;

    public EmailNotifier(){
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
        return new NotificationDTO("EMAIL Notification !", "EMAIL Notification", "432562874");
    }
}
