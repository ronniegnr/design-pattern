package bd.com.ronnie.factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
