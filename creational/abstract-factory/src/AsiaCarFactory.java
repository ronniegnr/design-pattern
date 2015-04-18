public class AsiaCarFactory {

    public static Car buildCar(Model model) {
        Car car = null;
        switch (model) {
            case SMALL:
                car = new SmallCar(Location.ASIA);
                break;
            case SEDAN:
                car = new SedanCar(Location.ASIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
        }
        return car;
    }

}
