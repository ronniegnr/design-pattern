/*
static blocks executed during the loading of the class.
*/

public class C_StaticBlockSingleton {

    private static volatile C_StaticBlockSingleton instance;

    static {
        instance = new C_StaticBlockSingleton();
    }

    private C_StaticBlockSingleton() { }

    public C_StaticBlockSingleton getInstace() {
        return instance;
    }

}
