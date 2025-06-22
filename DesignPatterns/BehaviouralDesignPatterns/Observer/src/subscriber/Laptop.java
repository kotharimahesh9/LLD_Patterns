package subscriber;

import dto.NotificationDTO;

public class Laptop implements NotificationListener{
    public void getNotification(NotificationDTO notificationDTO){
        System.out.println("LAPTOP " + notificationDTO);
    }
}
