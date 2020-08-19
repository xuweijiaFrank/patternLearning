package patternDesign.commandPattern.command;

import patternDesign.commandPattern.things.Light;

public class LightOnCommand implements Command {
    Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}