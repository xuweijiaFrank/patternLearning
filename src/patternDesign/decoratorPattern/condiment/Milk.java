package patternDesign.decoratorPattern.condiment;

import patternDesign.decoratorPattern.beverage.Beverage;

/**
 * 添加的料
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 1.00 + beverage.cost();
    }
}
