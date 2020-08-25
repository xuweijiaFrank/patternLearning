package patternDesign.decoratorPattern.training.drink;

public class naicha extends Drink{

    public naicha(){
        this.desc = "奶茶";
    }

    @Override
    public double cost() {
        return 12;
    }
}
