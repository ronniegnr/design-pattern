package bd.com.ronnie.command;

public class FanOffCommand implements Command {

    private Fan fan;

    FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }
}
