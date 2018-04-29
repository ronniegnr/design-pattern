package bd.com.ronnie.command;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, fanOnCommand, fanOffCommand);

        // lambda version - we do not need to Command interface to FanOffCommand, FanOnCommand, LightOffCommand, LightOnCommand
        //remoteControl.setCommand(0, light::on, light::off);
        //remoteControl.setCommand(1, fan::on, fan::off);

        remoteControl.pressOnButton(0);
        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(0);
        remoteControl.pressOffButton(1);
    }
}
