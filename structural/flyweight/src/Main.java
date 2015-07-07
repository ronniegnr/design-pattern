public class Main {

    public static void main(String[] args) {
        Circle circle1 = (Circle) ShapeFactory.getCircle("BLUE");
        Circle circle2 = (Circle) ShapeFactory.getCircle("BLUE");
        Circle circle3 = (Circle) ShapeFactory.getCircle("RED");
    }

}
