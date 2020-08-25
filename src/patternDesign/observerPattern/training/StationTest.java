package patternDesign.observerPattern.training;

public class StationTest {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        ForestRecever forest = new ForestRecever(weatherData);
        weatherData.tempChanged(100);
    }
}
