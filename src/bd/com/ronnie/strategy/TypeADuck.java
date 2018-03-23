package bd.com.ronnie.strategy;

public class TypeADuck extends Duck {

    public TypeADuck() {
        this.flyBehavior = new SpeedFly();
        this.quackBehavior = new LoudQuack();
    }
}
