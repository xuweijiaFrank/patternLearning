package patternDesign.observerPattern.ObserverPatternTraining;

public class WorkStation {
    public static void main(String[] args){
        WeatherData w = new WeatherData();
        ForestDisplay dis = new ForestDisplay(w);
        ForestAvgDisplay dis2 = new ForestAvgDisplay(w);
        w.setMeasurement(102);

    }
}
