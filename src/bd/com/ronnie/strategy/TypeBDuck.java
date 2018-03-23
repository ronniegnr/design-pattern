package bd.com.ronnie.strategy;

public class TypeBDuck extends Duck {

    public TypeBDuck() {
        this.flyBehavior = new SlowFly();
        this.quackBehavior = new MuteQuack();
    }
}
