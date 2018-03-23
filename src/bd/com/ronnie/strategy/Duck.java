package bd.com.ronnie.strategy;

public abstract class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void quack() {
        this.quackBehavior.quack();
    }

    public void fly() {
        this.flyBehavior.fly();
    }
}
