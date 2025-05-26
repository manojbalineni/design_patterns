package Mediator_Design_Pattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User john = new ConcreteUser(chatRoom, "John");
        User alice = new ConcreteUser(chatRoom, "Alice");
        User bob = new ConcreteUser(chatRoom, "Bob");

        chatRoom.addUser(john);
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);

        john.send("Hello everyone!");
    }
}
