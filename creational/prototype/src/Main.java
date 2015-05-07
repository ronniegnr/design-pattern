public class Main {

    public static void main(String[] args) {
        try {
            PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE);
            PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
