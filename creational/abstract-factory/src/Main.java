public class Main {

    public static void main(String[] args) {
        Car usaLuxuryCar = USACarFactory.buildCar(Model.LUXURY);
        Car usaSedanCar = USACarFactory.buildCar(Model.SEDAN);
        Car asianSmallCar = AsiaCarFactory.buildCar(Model.SMALL);

        System.out.println(usaLuxuryCar + " " + usaSedanCar + " " + asianSmallCar);
    }

}
