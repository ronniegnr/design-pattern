public abstract class Shape implements Cloneable {

    private ShapeType shapeType;
    private double width = 0.0;

    public ShapeType getShapeType() {
        return shapeType;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Object clone() throws CloneNotSupportedException {
        Object object = null;

        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return object;
    }

}
