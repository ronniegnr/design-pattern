package bd.com.ronnie.strategy;

public class LoudQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Loud Quack");
    }
}
