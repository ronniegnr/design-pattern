public class Main {

    public static void main(String[] args) {
        SquarePeg squarePeg = new SquarePeg(10);
        System.out.println(squarePeg);

        RoundHole roundHole = SquarePegAdapter.toRoundHole(squarePeg);
        System.out.println(roundHole);
    }
}
