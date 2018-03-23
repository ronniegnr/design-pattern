package bd.com.ronnie.strategy;

public class SlowFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Slow Fly");
    }
}
