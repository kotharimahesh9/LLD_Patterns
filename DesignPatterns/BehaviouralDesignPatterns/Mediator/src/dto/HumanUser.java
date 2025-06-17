package dto;

import mediator.IMediator;

public class HumanUser extends User{

    public HumanUser(String name, IMediator chatMediator){
        super(name, chatMediator);
    }
    @Override
    public void sendMessage(long from, long to, String message) {
        chatMediator.sendMessage(message, from, to);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name +  " Message Received : " + message);
    }

    @Override
    public void broadcast(String message) {
        chatMediator.broadcastMessage(message, this.id);
    }
}
