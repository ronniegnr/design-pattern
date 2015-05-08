/*
instance of the class will be created much before it is actually required. this is called eager initialization.
this approach is good for small projects.
 */

public class A_EagerSignleton {

    private static volatile A_EagerSignleton instance = new A_EagerSignleton();

    private A_EagerSignleton() { }

    public static A_EagerSignleton getInstance() {
        return instance;
    }

}