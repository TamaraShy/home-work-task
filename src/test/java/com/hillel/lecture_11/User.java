package homework11;

public class User {
    private String name;
    private Messenger messenger;

    public User(String name, Telegram telegram, Viber viber, Messenger messenger) {
        this.name = name;
        this.messenger = messenger;
    }

    public void writeSomeText(String s) {
        System.out.println("User writing some text...");
        messenger.writeMessage();
    }

    public void editSomeText(String s) {
        System.out.println("User editing some text...");
        messenger.editMessage();
    }

    public void quoteSomeText(String s) {
        System.out.println("User qoute some message...");
        messenger.quoteMessage();
    }

    public void forwardSomeText(String s) {
        System.out.println("User forward some message...");
        messenger.forwardMessage();
    }

    public void send() {
        System.out.println("User send message");
        messenger.send();
    }
}