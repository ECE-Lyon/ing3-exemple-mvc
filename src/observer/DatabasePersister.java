package observer;

import java.util.Observable;
import java.util.Observer;

public class DatabasePersister implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        // Obligation de caster...
        System.out.println("Persisting " + (String) arg + " to database");
    }
}
