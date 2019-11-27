package homework11;

import lecture11.Message;

public class WatsApp extends Message {

    @Override
    public String writeMessage() {
        System.out.println("User write message ");
        return "Write by Whats App";
    }

    @Override
    public String editMessage() {
        System.out.println("User edit message ");
        return "Edit by Whats App";
    }

    @Override
    public String forwardMessage() {
        System.out.println("User forward message ");
        return "Forward by Whats App";
    }

    @Override
    public String quoteMessage() {
        System.out.println("User quote message ");
        return "Quote by Whats App";
    }

    @Override
    public String copyMessage() {
        System.out.println("User copy message ");
        return "Copy by Whats App";
    }

    @Override
    public void send() {
        System.out.println("Send by Whats App");
    }
}