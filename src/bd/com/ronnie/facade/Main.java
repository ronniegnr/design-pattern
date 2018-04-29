package bd.com.ronnie.facade;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(5);

        ShapeFacade shapeFacade = new ShapeFacade(rectangle, circle);
        shapeFacade.drawFlag();
    }
}
