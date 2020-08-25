package patternDesign.observerPattern;

public class WeatherStationTest {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasuremenets(80, 65, 30.4f);
        weatherData.setMeasuremenets(85, 70, 29.5f);
    }
}

