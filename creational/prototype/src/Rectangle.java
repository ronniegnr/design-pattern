public class Rectangle extends Shape {

    private double height = 0.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width='" + this.getWidth() + '\'' +
                "height='" + this.height + '\'' +
                '}';
    }

}
