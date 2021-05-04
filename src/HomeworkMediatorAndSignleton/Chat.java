package HomeworkMediatorAndSignleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chat implements MessageInterface{

    private List<User> users;

    public Chat(){
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(User user) {
        this.users.remove(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        if(Singleton.checkForBanWords(Arrays.stream(message.split(" ")).collect(Collectors.toList()))){
            System.out.println(user.name + " use ban word cat in your message!");
            removeUser(user);
            return;
        }
        this.users.forEach(u -> {
            if(u != user)
                u.receive(message);
        });
    }
}
