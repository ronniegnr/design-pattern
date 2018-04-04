package bd.com.ronnie.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    double cost() {
        return 10;
    }
}
