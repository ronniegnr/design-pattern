public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return Math.pow(width, 2);
    }

    @Override
    public String toString() {
        return "SquarePeg{" +
                "width=" + width +
                ", area=" + getArea() +
                '}';
    }
}
