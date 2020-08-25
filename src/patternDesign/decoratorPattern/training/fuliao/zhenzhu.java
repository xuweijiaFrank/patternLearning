package patternDesign.decoratorPattern.training.fuliao;

import patternDesign.decoratorPattern.training.drink.Drink;

public class zhenzhu extends FuLiao{
    Drink drink;

    public zhenzhu(Drink drink){
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + ", 珍珠";
    }

    @Override
    public double cost() {
        return this.drink.cost() + 3;
    }
}
