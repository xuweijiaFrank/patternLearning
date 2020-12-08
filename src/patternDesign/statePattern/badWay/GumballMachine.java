package patternDesign.statePattern.badWay;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if (count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        switch (state){
            case HAS_QUARTER:
                System.out.println("你已经投入过钱了， 不能再投了");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("你投入了一枚钱");
                break;
            case SOLD_OUT:
                System.out.println("货物已经卖光");
                break;
            case SOLD:
                state = HAS_QUARTER;
                System.out.println("请稍等，交易成功");
                break;
            default:
                break;
        }
    }

    public void ejectQuarter(){
        switch (state){
            case HAS_QUARTER:
                System.out.println("退钱中");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("你没有投过钱，退不了");
                break;
            case SOLD_OUT:
                System.out.println("你没有投过钱，退不了");
                break;
            case SOLD:
                System.out.println("交易已成功，不能退了");
                break;
            default:
                break;
        }
    }

    public void turnCrank(){
        switch (state){
            case HAS_QUARTER:
                System.out.println("转ing");
                state = SOLD;
                break;
            case NO_QUARTER:
                System.out.println("你没有投过钱，转不了");
                break;
            case SOLD_OUT:
                System.out.println("已经没有东西了，不能转了");
                break;
            case SOLD:
                System.out.println("交易已成功，不能再转了");
                break;
            default:
                break;
        }
    }

    public void dispense(){
        //发放
        switch (state){
            case HAS_QUARTER:
                System.out.println("ERROR");
                break;
            case NO_QUARTER:
                System.out.println("ERROR");
                break;
            case SOLD_OUT:
                System.out.println("ERROR");
                break;
            case SOLD:
                System.out.println("发放中");
                count = count -1;
                if (count == 0){
                    System.out.println("Ops, 没有了");
                }else{
                    state = NO_QUARTER;
                }
                break;
            default:
                break;
        }
    }

    public String toString(){
        String currentState = "";
        switch (state){
            case HAS_QUARTER:
                currentState = "当前机器的状态： 已投币";
                break;
            case NO_QUARTER:
                currentState = "当前机器的状态： 没有投币";
                break;
            case SOLD_OUT:
                currentState = "当前机器的状态： 已卖光";
                break;
            case SOLD:
                currentState = "当前机器的状态： 已出货";
                break;
            default:
                break;
        }
        return currentState;
    }
}
