public class USACarFactory {

    public static Car buildCar(Model model) {
        Car car = null;

        switch (model) {
            case SMALL:
                car = new SmallCar(Location.USA);
                break;
            case SEDAN:
                car = new SedanCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }

        return car;
    }

}
