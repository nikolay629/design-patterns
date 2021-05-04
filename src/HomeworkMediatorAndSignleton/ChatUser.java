package HomeworkMediatorAndSignleton;


public class ChatUser extends User{

    public ChatUser(MessageInterface messageInterface, String name) {
        super(messageInterface, name);
        messageInterface.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " send: " + message);
        if(message.equals("addBot")){
            Singleton.getBot();
        }
        messageInterface.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received: " + message);
    }
}
