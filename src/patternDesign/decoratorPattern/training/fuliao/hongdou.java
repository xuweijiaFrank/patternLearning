package patternDesign.decoratorPattern.training.fuliao;

import patternDesign.decoratorPattern.training.drink.Drink;

public class hongdou extends FuLiao{
    Drink drink;

    public hongdou(Drink drink){
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + ", 红豆";
    }

    @Override
    public double cost() {
        return this.drink.cost() + 2;
    }
}
