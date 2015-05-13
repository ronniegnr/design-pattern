public class ScopeDecorator extends Decorator {

    public ScopeDecorator(Rifle rifle) {
        super(rifle);
    }

    private String addScope() {
        return " + scope";
    }

    @Override
    public void fire() {
        System.out.println("firing from sniper rifle" + addScope()) ;
    }

}
