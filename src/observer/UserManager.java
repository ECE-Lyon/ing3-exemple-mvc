package observer;

import java.util.Observable;

public class UserManager extends Observable {

    public void addUser(String name) {
        // Ne pas oublier d'appeler setChanged sinon aucun message n'est envoyé
        // aux observers
        setChanged();
        notifyObservers(name);
    }
}
