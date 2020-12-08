package patternDesign.statePattern;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("你已经插入了硬币了");
        gumballMachine.set
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你还没有差如果硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("没有投入过硬币，所以没有糖转出来");
    }

    @Override
    public void dispense() {
        System.out.println("没有投入过硬币，不能发放糖果");
    }
}
