public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "RoundHole{" +
                "radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}
