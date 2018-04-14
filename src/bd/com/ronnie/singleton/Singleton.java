package bd.com.ronnie.singleton;

public class Singleton {

    private Singleton singleton;

    private Singleton() { }

    public Singleton getSingleton() {
        return this.singleton == null ? new Singleton() : this.singleton;
    }
}
