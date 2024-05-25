import java.util.ArrayList;
import java.util.List;

public class Chat implements Mediator{

    private List<User> users;

    public Chat() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
        user.mediator = this;
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users){
            if (u != user){
                u.receive(message);
            }
        }
    }

}
