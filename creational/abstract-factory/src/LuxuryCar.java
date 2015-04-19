public class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(Model.LUXURY, location);
        System.out.println("Creating: LUXURY, " + location);
    }

}
