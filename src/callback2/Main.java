package callback2;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        DatabasePersister databasePersister = new DatabasePersister();
        userManager.addListener(databasePersister);
        userManager.addListener(new FilePersister());

        userManager.addUser("Nicolas");
        userManager.removeListener(databasePersister);
        userManager.addUser("Pierre");

        UserManager userManager1 = new UserManager();
        userManager1.addListener(new Persister() {
            @Override
            public void persist(String name) {

            }
        });
    }
}
