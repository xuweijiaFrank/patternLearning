package patternDesign.commandPattern.things;

public class GarageDoor {
    public GarageDoor(){

    };

    public void up(){
        System.out.println("GarageDoor is up");
    }

    public void down(){
        System.out.println("GarageDoor is down");
    }

    public void stop(){
        System.out.println("GarageDoor is stop");
    }

    public void lightOn(){
        System.out.println("GarageDoor is lightOn");
    }

    public void lightOff(){
        System.out.println("GarageDoor is lightOff");
    }
}
