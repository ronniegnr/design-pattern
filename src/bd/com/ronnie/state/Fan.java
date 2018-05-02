package bd.com.ronnie.state;

public class Fan {

    private State offState;
    private State lowState;
    private State highState;
    private State state;

    Fan() {
        offState = new OffState(this);
        lowState = new LowState(this);
        highState = new HighState(this);
        state = offState;
    }

    void pullChain() {
        state.handleRequest();
    }

    State getOffState() {
        return offState;
    }

    public void setOffState(State offState) {
        this.offState = offState;
    }

    State getLowState() {
        return lowState;
    }

    public void setLowState(State lowState) {
        this.lowState = lowState;
    }

    State getHighState() {
        return highState;
    }

    public void setHighState(State highState) {
        this.highState = highState;
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
