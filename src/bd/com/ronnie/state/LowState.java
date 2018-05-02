package bd.com.ronnie.state;

class LowState extends State {

    LowState(Fan fan) {
        super(fan);
    }

    @Override
    void handleRequest() {
        System.out.println("Fan going to High state");
        fan.setState(fan.getHighState());
    }

    @Override
    public String toString() {
        return "Fan in Low state";
    }
}
