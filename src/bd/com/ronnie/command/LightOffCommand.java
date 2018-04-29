package bd.com.ronnie.command;

public class LightOffCommand implements Command {

    private Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
