package patternDesign.commandPattern;

import patternDesign.commandPattern.command.Command;
import patternDesign.commandPattern.command.NoCommand;

public class RemoteControl {
    // 定义一个插槽
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onConmand, Command offCommand){
        onCommands[slot] = onConmand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------Remote Control --------------\n");
        for(int i=0; i< onCommands.length; i++){
           stringBuffer.append("[slot" + i + "] " + onCommands[i].getClass().getName() + "     " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
