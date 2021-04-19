package callback;

public class DatabasePersister implements Persister {
    @Override
    public void persist(String name) {
        System.out.println("Persisting " + name + " to database");
    }
}
