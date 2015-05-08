public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(Circle circle) {
        System.out.println("Drawing GreenCircle. " + circle.toString());
    }

}
