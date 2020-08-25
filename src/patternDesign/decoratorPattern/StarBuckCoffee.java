package patternDesign.decoratorPattern;

import patternDesign.decoratorPattern.condiment.Milk;
import patternDesign.decoratorPattern.condiment.Mocha;
import patternDesign.decoratorPattern.beverage.Beverage;
import patternDesign.decoratorPattern.beverage.Espresso;
import patternDesign.decoratorPattern.beverage.HouseBlend;

public class StarBuckCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
