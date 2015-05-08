/**
 * Bil Pugh idea with ReadResolve and serialVersionID customization
 */
public class F_SuggestedSingleton {

    private static final long serialVersionID = 1L;

    private F_SuggestedSingleton() { }

    private static class LazyHolder {
        private static final F_SuggestedSingleton instance = new F_SuggestedSingleton();
    }

    private F_SuggestedSingleton getInstane() {
        return LazyHolder.instance;
    }

    protected Object readResolve() {
        return getInstane();
    }

}