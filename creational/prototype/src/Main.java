public class Main {

    public static void main(String[] args) {
        try {
            Rectangle rectangle = (Rectangle)ShapeFactory.getShape(ShapeType.RECTANGLE, 10, 20);
            System.out.println(rectangle.toString());

            Square square = (Square)ShapeFactory.getShape(ShapeType.SQUARE, 10);
            System.out.println(square.toString());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
