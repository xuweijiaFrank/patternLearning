package patternDesign.commandPattern.command;

import patternDesign.commandPattern.things.Light;

public class LightOnCommand implements Command {
    Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        this.light.off();
    }

    public void execute() {
        this.light.on();
    }
}