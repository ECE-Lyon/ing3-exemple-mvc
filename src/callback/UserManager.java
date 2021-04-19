package callback;

import java.util.HashSet;
import java.util.Set;

public class UserManager {
    private final Set<Persister> persisters = new HashSet<>();

    public void addListener(Persister persister) {
        persisters.add(persister);
    }

    public void removeListener(Persister persister) {
        persisters.remove(persister);
    }

    public void addUser(String name) {
        for (Persister persister : persisters) {
            persister.persist(name);
        }
    }
}
