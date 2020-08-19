package patternDesign.commandPattern.command;

import patternDesign.commandPattern.things.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        this.light.on();
    }

    @Override
    public void execute() {
        this.light.off();
    }
}