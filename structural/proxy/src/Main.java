public class Main {

    public static void main(String[] args) {
        ProxyFolder proxyFolder = new ProxyFolder(new User("username", "password"));
        proxyFolder.performOperation();
    }
}
