package patternDesign.commandPattern;

import patternDesign.commandPattern.command.GarageDoorOpenCommand;
import patternDesign.commandPattern.command.LightOnCommand;
import patternDesign.commandPattern.things.GarageDoor;
import patternDesign.commandPattern.things.Light;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("testLight");
        GarageDoor garageDoor = new GarageDoor();


        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
    }

}