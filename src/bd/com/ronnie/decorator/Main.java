package bd.com.ronnie.decorator;

public class Main {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost());

        Milk darkRoastMilk = new Milk(darkRoast);
        System.out.println(darkRoastMilk.getDescription() + " " + darkRoastMilk.cost());
    }
}
