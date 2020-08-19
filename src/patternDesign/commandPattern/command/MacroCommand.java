package patternDesign.commandPattern.command;

public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void undo() {

    }

    @Override
    public void execute() {
        for(Command command: commands){
            command.execute();
        }
    }
}
