package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscribes;

    public User(String username) {
        this.username = username;
        this.subscribes = new ArrayList<>();
    }

    public List<User> getSubscribes() {
        return subscribes;
    }

    public String getUsername() {
        return username;
    }

    public void subscribe(User user){
        this.subscribes.add(user);
    }

    public boolean isSubscribe(User user){
        for (User users : subscribes){
            if (users.getUsername().equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

    public boolean isFriends(User user){
        return this.isSubscribe(user) && user.isSubscribe(this);
    }

    public void sendMessages(User user, String text){
        MessageDataBase.addNewMessage(this, user, text);
    }

    public String toString(){
        return username;
    }
}
