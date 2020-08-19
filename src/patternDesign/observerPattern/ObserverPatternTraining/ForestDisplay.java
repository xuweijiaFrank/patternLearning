package patternDesign.observerPattern.ObserverPatternTraining;

public class ForestDisplay implements Observer, Display{
    private float tempautre;


    public ForestDisplay(WeatherData weatherData){
        weatherData.registerObersver(this);
    }


    @Override
    public void display() {
        System.out.println("温度是 : " + this.tempautre );
    }

    @Override
    public void update(float tempautre) {
        this.tempautre = tempautre;
        display();
    }
}
