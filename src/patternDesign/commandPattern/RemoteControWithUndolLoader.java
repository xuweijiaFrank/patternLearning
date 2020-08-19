package patternDesign.commandPattern;

import patternDesign.commandPattern.command.Command;
import patternDesign.commandPattern.command.LightOffCommand;
import patternDesign.commandPattern.command.LightOnCommand;
import patternDesign.commandPattern.command.MacroCommand;
import patternDesign.commandPattern.things.Light;

public class RemoteControWithUndolLoader {
    public static void main(String[] args){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen Room");
//        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff};
        MacroCommand marcoPartyOn = new MacroCommand(partyOn);
        MacroCommand marcoPartyOff = new MacroCommand(partyOff);


//        System.out.println(remoteControl);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(3, marcoPartyOn, marcoPartyOff);
        System.out.println(remoteControl);
//        remoteControl.onButtonWasPressed(0);
//        remoteControl.offButtonWasPressed(0);
//        remoteControl.onButtonWasPressed(1);
//        remoteControl.offButtonWasPressed(1);
//        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPressed(3);

    }
}
