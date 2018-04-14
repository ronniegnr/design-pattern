package bd.com.ronnie.factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
