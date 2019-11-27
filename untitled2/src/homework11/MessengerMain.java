package homework11;

public class MessengerMain {

    public static void main(String[] args) {
        Telegram Telegram = new Telegram();
        Viber Viber = new Viber();
        WatsApp WatsApp = new WatsApp();
        User testUser = new User("Pete", Telegram);

        testUser.writeSomeText("User writing some text...");
        testUser.send();
    }
}