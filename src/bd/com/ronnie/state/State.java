package bd.com.ronnie.state;

abstract class State {

    Fan fan;

    public State(Fan fan) {
        this.fan = fan;
    }

    abstract void handleRequest();

    public abstract String toString();

}
