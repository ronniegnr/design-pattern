package bd.com.ronnie.state;

class HighState extends State {

    HighState(Fan fan) {
        super(fan);
    }

    @Override
    void handleRequest() {
        System.out.println("Fan going to Off state");
        fan.setState(fan.getOffState());
    }

    @Override
    public String toString() {
        return "Fan in High state";
    }
}
