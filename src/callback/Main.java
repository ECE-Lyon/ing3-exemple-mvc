package callback;

public class Main {

    public static void main(String[] args) {

        CallbackImpl callback = new CallbackImpl();
        Caller caller = new Caller(callback);
        // ...
        caller.trigger();
    }
}
