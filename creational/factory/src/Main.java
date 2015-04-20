public class Main {

    public static void main(String[] args) {
        Car smallCar = CarFactory.buildCar(Model.SMALL);
        Car sedanCar = CarFactory.buildCar(Model.SEDAN);
        Car luxurycar = CarFactory.buildCar(Model.LUXURY);

        System.out.println(smallCar + " " + sedanCar + " " + luxurycar);
    }

}
