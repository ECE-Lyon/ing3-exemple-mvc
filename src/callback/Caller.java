package callback;

public class Caller {

    // Ici on ne connait que l'interface de l'objet qui gère le callback
    // Découplage fort
    private Callback callback;

    public Caller(Callback callback) {
        this.callback = callback;
    }

    public void trigger() {
        this.callback.doSomething();
    }
}
