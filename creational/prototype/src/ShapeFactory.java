import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<ShapeType, Shape> shapePrototypes = new HashMap<ShapeType, Shape>();

    static {
        shapePrototypes.put(ShapeType.RECTANGLE, new Rectangle());
        shapePrototypes.put(ShapeType.SQUARE, new Square());
    }

    public static Shape getShape(ShapeType shapeType, double...value) throws CloneNotSupportedException {
        double width = value.length>0 ? value[0] : 0;
        double height = value.length>1 ? value[1] : 0;
        Shape shape = (Shape)shapePrototypes.get(shapeType).clone();
        shape.setWidth(width);

        if(shapeType == ShapeType.RECTANGLE) {
            Rectangle rectangle = (Rectangle)shape;
            rectangle.setHeight(height);
            shape = rectangle;
        }

        return shape;
    }

}
