package bd.com.ronnie.strategy;

public class SpeedFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Speed Fly");
    }
}
