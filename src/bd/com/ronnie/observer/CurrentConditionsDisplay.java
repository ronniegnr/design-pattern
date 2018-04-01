package bd.com.ronnie.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
            "temp=" + temp +
            ", humidity=" + humidity +
            ", pressure=" + pressure +
            '}');
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
