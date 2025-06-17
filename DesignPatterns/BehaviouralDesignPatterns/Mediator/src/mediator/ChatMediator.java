package mediator;

import dto.User;

import java.util.HashMap;
import java.util.Map;

public class ChatMediator implements IMediator{

    private Map<Long, User> userMap;

    public ChatMediator(){
        userMap = new HashMap<>();
    }

    public void addUser(User user){
        userMap.put(user.getId(), user);
    }

    public void removeUser(User user){
        if(userMap.containsKey(user.getId())){
            userMap.remove(user.getId());
        }
    }
    public void sendMessage(String message, long from, long to){
        User receivingUser = userMap.get(to);
        receivingUser.receiveMessage(message);
    }

    @Override
    public void broadcastMessage(String message, long from) {
        for(long userId: userMap.keySet()){
            if(userId != from){
                User u = userMap.get(userId);
                u.receiveMessage(message);
            }
        }
    }
}
