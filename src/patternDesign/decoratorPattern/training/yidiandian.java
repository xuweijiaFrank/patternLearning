package patternDesign.decoratorPattern.training;


import javafx.scene.paint.PhongMaterial;
import patternDesign.decoratorPattern.training.drink.Drink;
import patternDesign.decoratorPattern.training.drink.naicha;
import patternDesign.decoratorPattern.training.fuliao.hongdou;
import patternDesign.decoratorPattern.training.fuliao.zhenzhu;

public class yidiandian {
    public static void main(String[] args){
        Drink drink = new naicha();
        drink = new hongdou(drink);
        drink = new zhenzhu(drink);
        System.out.println(drink.getDesc() + " $" + drink.cost());
    }
}
