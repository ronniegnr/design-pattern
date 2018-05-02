package bd.com.ronnie.state;

public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.pullChain();
        System.out.println(fan.toString());
        fan.pullChain();
        System.out.println(fan.toString());
        fan.pullChain();
        System.out.println(fan.toString());
    }
}
