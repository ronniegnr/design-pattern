package bd.com.ronnie.facade;

public class ShapeFacade {

    private Shape rectangle;
    private Shape circle;

    public ShapeFacade(Shape rectangle, Shape circle) {
        this.rectangle = rectangle;
        this.circle = circle;
    }

    void drawFlag() {
        System.out.println("Drawing Flag");
        rectangle.draw();
        circle.draw();
    }
}
