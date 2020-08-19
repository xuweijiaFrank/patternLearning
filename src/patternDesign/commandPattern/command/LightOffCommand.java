package patternDesign.commandPattern.command;

import patternDesign.commandPattern.things.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}