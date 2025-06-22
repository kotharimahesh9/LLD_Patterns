package dto;

public class NotificationDTO {
    private String body;
    private String title;
    private String timestamp;

    public NotificationDTO(String body, String title, String timestamp){
        this.body = body;
        this.title = title;
        this.timestamp = timestamp;
    }

    public String getBody(){
        return this.body;
    }

    public String getTitle(){
        return this.title;
    }

    public String getTimestamp(){
        return this.timestamp;
    }

    public String toString(){
        return "[" + title + " , " + body + " , " + timestamp + "]";
    }
}
