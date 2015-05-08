public class SquarePegAdapter {

    public static RoundHole toRoundHole(SquarePeg squarePeg) {
        return new RoundHole(squarePeg.getWidth()/2);
    }

}
