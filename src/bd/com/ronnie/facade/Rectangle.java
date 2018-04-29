package bd.com.ronnie.facade;

public class Rectangle implements Shape {

    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with Width "  + width + " and Height " + height);
    }
}
