package patternDesign.observerPattern.training;

public class ForestRecever implements Observer{
    Integer temptaure;

    ForestRecever(WeatherData weatherData){
        weatherData.register(this);

    }

    @Override
    public void update(Integer temptaure) {
        this.temptaure = temptaure;
        this.display();

    }

    @Override
    public void display() {
        System.out.println(" 温度 is "  + temptaure);
    }
}
