package HomeworkMediatorAndSignleton;

public interface MessageInterface {

    void addUser(User user);
    void removeUser(User user);
    void sendMessage(String message, User user);

}
