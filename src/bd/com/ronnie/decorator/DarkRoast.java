package bd.com.ronnie.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    double cost() {
        return 15;
    }
}
