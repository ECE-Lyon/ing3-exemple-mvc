package callback2;

public class FilePersister implements Persister {
    @Override
    public void persist(String name) {
        System.out.println("Persisting " + name + " to file");
    }
}
