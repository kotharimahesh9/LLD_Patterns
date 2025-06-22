package subscriber;

import dto.NotificationDTO;

public interface NotificationListener {
    public void getNotification(NotificationDTO notificationDTO);
}
