package observer;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        DatabasePersister databasePersister = new DatabasePersister();
        userManager.addObserver(databasePersister);
        userManager.addObserver(new FilePersister());

        userManager.addUser("Nicolas");
        userManager.deleteObserver(databasePersister);
        userManager.addUser("Pierre");
    }
}
