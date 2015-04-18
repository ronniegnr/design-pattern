public class SmallCar extends Car {

    public SmallCar(Location location) {
        super(Model.SMALL, location);
        System.out.println("Creating: SMALL, " + location);
    }

}
