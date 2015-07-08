public class Circle {

    private CircleData circleData;

    public Circle(int x, int y, int radius) {
        circleData = new CircleData(x, y, radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(circleData.getRadius(), 2);
    }

}
