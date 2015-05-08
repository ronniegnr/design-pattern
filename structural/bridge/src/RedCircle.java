public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(Circle circle) {
        System.out.println("Drawing RedCircle. " + circle.toString());
    }

}
