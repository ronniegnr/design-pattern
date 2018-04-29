package bd.com.ronnie.command;

class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = () -> { };
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    void pressUndoButton() {
        undoCommand.execute();
    }
}
