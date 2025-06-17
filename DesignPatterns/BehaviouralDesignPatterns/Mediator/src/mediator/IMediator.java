package mediator;

import dto.User;

public interface IMediator {

    public void addUser(User user);
    public void removeUser(User user);
    public void sendMessage(String message, long from, long to);
    public void broadcastMessage(String message, long from);
}
