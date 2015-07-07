import java.util.HashMap;

public class ShapeFactory {

    private static HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        if(circleMap.containsKey(color)) {
            System.out.println("reusing object");
            return circleMap.get(color);
        }
        else {
            System.out.println("creating new object");
            return circleMap.put(color, new Circle(color));
        }
    }

}
