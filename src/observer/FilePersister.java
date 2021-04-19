package observer;

import java.util.Observable;
import java.util.Observer;

public class FilePersister implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Persisting " + (String) arg + " to file");
    }
}
