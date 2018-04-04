package bd.com.ronnie.decorator;

abstract class Beverage {

    String description = "No Description";

    abstract double cost();

    public String getDescription() {
        return this.description;
    }
}
