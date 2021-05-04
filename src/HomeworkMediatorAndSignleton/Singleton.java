package HomeworkMediatorAndSignleton;

import java.util.List;

public class Singleton {

    private static Singleton bot;

    private Singleton(){

    }

    public static Singleton getBot(){

        if(bot == null)
            bot = new Singleton();

        System.out.println("Bot is initializer");
        return bot;
    }

    public static boolean checkForBanWords(List<String> words){
        if(bot == null)
            return false;

        for (String word : words) {
            if(word.equals("cat"))
                return true;
        }

        return false;
    }

}
