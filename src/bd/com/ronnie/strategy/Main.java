package bd.com.ronnie.strategy;

public class Main {
    public static void main(String[] args) {
        TypeADuck aDuck = new TypeADuck();
        aDuck.fly();
        aDuck.quack();

        TypeBDuck bDuck = new TypeBDuck();
        bDuck.fly();
        bDuck.quack();
    }
}
