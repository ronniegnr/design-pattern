package bd.com.ronnie.command;

public class FanOnCommand implements Command {

    private Fan fan;

    FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}
