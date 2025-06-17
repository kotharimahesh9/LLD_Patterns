import dto.HumanUser;
import dto.User;
import mediator.ChatMediator;
import mediator.IMediator;

public class Main {
    public static void main(String[] args) {
        IMediator chatMediator = new ChatMediator();
        User alice = new HumanUser("Alice", chatMediator);
        User bob = new HumanUser("Bob", chatMediator);
        User charlie = new HumanUser("Charlie", chatMediator);

        chatMediator.addUser(alice);
        chatMediator.addUser(bob);
        chatMediator.addUser(charlie);

        alice.sendMessage(alice.getId(), bob.getId(), "Hello Bob !");
        alice.sendMessage(alice.getId(), charlie.getId(), "Hello Charlie !");
        charlie.broadcast("Hello Guys !");
    }
}