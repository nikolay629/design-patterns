package HomeworkMediatorAndSignleton;

import java.util.Scanner;

public class Messenger {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        MessageInterface chat = new Chat();
//        Singleton singleton;

        User user1 = new ChatUser(chat, "Nikolay");
        User user2 = new ChatUser(chat, "Kristian");
        User user3 = new ChatUser(chat, "Stanislav");

        user1.send("addBot");
        user3.send("Hello");
        user2.send("Hello cat");
        user1.send("hi");
//        String message = scanner.nextLine();
//
//        while(!message.equals("bye")){
//            if(message.equals("addBot")){
//                singleton = Singleton.getBot();
//            }
//            user1.send(message);
//            message = scanner.nextLine();
//        }
//        user1.send(message);
    }
}
