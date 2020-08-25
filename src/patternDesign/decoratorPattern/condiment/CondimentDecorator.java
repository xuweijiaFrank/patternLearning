package patternDesign.decoratorPattern.condiment;

import patternDesign.decoratorPattern.beverage.Beverage;

/**
 * 调料
 *
 */
public abstract class CondimentDecorator extends Beverage {
    // 所有的调料装饰着，都必须重新实现decription方法
    public abstract String getDescription();
}
