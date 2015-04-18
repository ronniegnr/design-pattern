public class Main {

    public static void main(String[] args) {
        USACarFactory.buildCar(Model.LUXURY);
        USACarFactory.buildCar(Model.SEDAN);
        AsiaCarFactory.buildCar(Model.SMALL);
    }

}
