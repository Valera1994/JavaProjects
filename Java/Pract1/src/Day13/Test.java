package Day13;

public class Test {
    static void main() {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessages(user2, "Hello!");
        user1.sendMessages(user2, "How are you?");

        user2.sendMessages(user1, "I'm bigamous");
        user2.sendMessages(user1, "I see you");

        user3.sendMessages(user1, "You need to help?");

        user1.sendMessages(user3, "Yes");
        user1.sendMessages(user3, "He is a close");

        MessageDataBase.showDialog(user1, user3);
    }
}
