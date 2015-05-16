public class Main {

    public static void main(String[] args) {
        SniperRifle rifle = new SniperRifle();
        rifle.fire();

        ScopeDecorator scopedSniperRifle = new ScopeDecorator(rifle);
        scopedSniperRifle.fire();
    }
}
