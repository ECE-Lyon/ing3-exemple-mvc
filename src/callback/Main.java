package callback;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        DatabasePersister databasePersister = new DatabasePersister();
        userManager.addListener(databasePersister);
        userManager.addListener(new FilePersister());

        userManager.addUser("Nicolas");
        userManager.removeListener(databasePersister);
        userManager.addUser("Pierre");

        userManager.addListener(new Persister() {
            @Override
            public void persist(String name) {

            }
        });
        userManager.addUser("Paul");
    }
}
