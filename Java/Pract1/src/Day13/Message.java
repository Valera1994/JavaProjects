package Day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User receiver, User sender, String text) {
        this.date = new Date();
        this.receiver = receiver;
        this.sender = sender;
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public User getReceiver() {
        return receiver;
    }

    public User getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\nTO: " + receiver +
                "\nON: " + date + "\n" + text + "\n";
    }
}
