package subscriber;

import dto.NotificationDTO;

public class Phone implements NotificationListener {
    public void getNotification(NotificationDTO notificationDTO) {
        System.out.println("PHONE " + notificationDTO);
    }
}
