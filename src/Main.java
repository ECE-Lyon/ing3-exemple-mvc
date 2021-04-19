import observer.DatabasePersister;
import observer.FilePersister;
import observer.UserManager;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        DatabasePersister databasePersister = new DatabasePersister();
        userManager.addObserver(databasePersister);
        userManager.addObserver(new FilePersister());

        userManager.addUser("Nicolas");
        userManager.deleteObserver(databasePersister);
        userManager.addUser("Pierre");

        userManager.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Persisting " + arg + " to custom persister");
            }
        });
        userManager.addUser("Paul");
    }
}
