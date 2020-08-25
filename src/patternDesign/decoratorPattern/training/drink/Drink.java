package patternDesign.decoratorPattern.training.drink;

public abstract class Drink {
    public String desc = "unKnown";

    public String getDesc(){
        return desc;
    }

    public abstract double cost();
}
