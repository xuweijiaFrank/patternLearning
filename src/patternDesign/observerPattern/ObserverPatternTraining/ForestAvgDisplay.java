package patternDesign.observerPattern.ObserverPatternTraining;

public class ForestAvgDisplay implements Observer, Display{
    private float tempautre;


    public ForestAvgDisplay(WeatherData weatherData){
        weatherData.registerObersver(this);
    }


    @Override
    public void display() {
        System.out.println("平均温度是 : " + this.tempautre );
    }

    @Override
    public void update(float tempautre) {
        this.tempautre = tempautre;
        display();
    }
}
