/*
Object will be created when it is required. it is called lazy initialization.
double checked locking is used here. without second null checking two thead can check first checking
and create two instaced inside synchronized block
*/
public class B_LazySingleton {

    private static volatile B_LazySingleton instance = null;

    private B_LazySingleton() { }

    public B_LazySingleton getInstance() {
        if(instance == null) {
            synchronized (B_LazySingleton.class) {
                if(instance == null) {
                    return new B_LazySingleton();
                }
            }
        }

        return instance;
    }

}
