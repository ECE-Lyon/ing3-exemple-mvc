package observer;

import java.util.Observable;

public class UserManager extends Observable {
    public void addUser(String name) {
        setChanged();
        notifyObservers(name);
    }
}
