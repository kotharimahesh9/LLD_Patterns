package dto;

import mediator.ChatMediator;
import mediator.IMediator;

public abstract class User {
    protected String name;
    protected long id;
    protected IMediator chatMediator;

    public User(String name, IMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
        this.id = name.hashCode();

    }

    public long getId(){
        return this.id;
    }
    public abstract void sendMessage(long from, long to, String message);
    public abstract void receiveMessage(String message);
    public abstract void broadcast(String message);
}
