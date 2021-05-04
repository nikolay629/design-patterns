package HomeworkMediatorAndSignleton;

public abstract class User {
    protected MessageInterface messageInterface;
    protected String name;

    public User(MessageInterface messageInterface, String name){
        this.messageInterface = messageInterface;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);

}
