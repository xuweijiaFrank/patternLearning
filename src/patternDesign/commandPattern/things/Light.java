package patternDesign.commandPattern.things;

public class Light {
    String lightName;

    public Light(String lightName) {
        this.lightName = lightName;
    }

    public void on() {
        System.out.println(this.lightName + " Light is on");
    }

    public void off() {
        System.out.println(this.lightName + " Light is off");
    }
}