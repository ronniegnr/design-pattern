public abstract class Decorator implements Rifle {

    private Rifle rifle;

    public Decorator(Rifle rifle) {
        this.rifle = rifle;
    }

}
