package bd.com.ronnie.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing Dough " + dough);
        System.out.println("Putting Sauce " + sauce);
        System.out.println("Adding Toppings " + String.join(", ", toppings));
    }

    public void bake() {
        System.out.println("Baking for 30 minutes.");
    }

    public void cut() {
        System.out.println("Cutting in 8 pieces.");
    }

    public void box() {
        System.out.println("Place pizza in official box.");
    }
}
