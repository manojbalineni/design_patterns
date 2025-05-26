package Mediator_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // don't send to sender
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
