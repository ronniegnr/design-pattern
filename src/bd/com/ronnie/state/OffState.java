package bd.com.ronnie.state;

class OffState extends State {

    OffState(Fan fan) {
        super(fan);
    }

    @Override
    void handleRequest() {
        System.out.println("Fan going to Low state");
        fan.setState(fan.getLowState());
    }

    @Override
    public String toString() {
        return "Fan in Off state";
    }
}
