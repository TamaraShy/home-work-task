package homework11;

public class MessengerMain {

    public static void main(String[] args) {
        Telegram Telegram = new Telegram();
        Viber Viber = new Viber();
        WatsApp WatsApp = new WatsApp();
        User testUser = new User("Peter", Telegram, Viber, WatsApp);

        testUser.writeSomeText("User writing some text...");
        testUser.editSomeText("User editing message...");
        testUser.quoteSomeText("User quote message...");
        testUser.forwardSomeText("User forward message...");
        testUser.send();
    }
}