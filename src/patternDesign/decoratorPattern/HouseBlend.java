package patternDesign.decoratorPattern;

/**
 * 主料，综合内容
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
