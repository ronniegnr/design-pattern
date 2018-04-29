package bd.com.ronnie.facade;

public class Circle implements Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with Width "  + radius);
    }
}
