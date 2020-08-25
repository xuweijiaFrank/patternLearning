package patternDesign.decoratorPattern.beverage;


/**
 * 主料， Espresso
 */
public class Espresso extends Beverage{

    public Espresso(){
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
