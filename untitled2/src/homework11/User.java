package homework11;

public class User {
    private String name;
    private Messenger messenger;

    public User(String name, Messenger messenger) {
        this.name = name;
        this.messenger = messenger;
    }

    public void writeSomeText(String s) {
        System.out.println("User writing some text...");
        messenger.writeMessage();
    }

    public void send() {
        System.out.println("User send message");
        messenger.send();
    }
}