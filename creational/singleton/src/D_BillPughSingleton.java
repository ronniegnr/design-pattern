/**
 instance will be created only when it is needed. good solution.
*/
public class D_BillPughSingleton {

    private D_BillPughSingleton() { }

    private static class LazyHolder {
        private  static final D_BillPughSingleton instance = new D_BillPughSingleton();
    }

    public D_BillPughSingleton getInstance() {
        return LazyHolder.instance;
    }

}
