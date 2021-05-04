package HomeworkMediatorAndSignleton;


public class Messenger {
    public static void main(String[] args) {
        MessageInterface chat = new Chat();
        User user1 = new ChatUser(chat, "Nikolay");
        User user2 = new ChatUser(chat, "Kristian");
        User user3 = new ChatUser(chat, "Stanislav");

        user1.send("addBot");
        user3.send("Hello");
        user2.send("Hello cat");
        user1.send("Bye");
    }
}
