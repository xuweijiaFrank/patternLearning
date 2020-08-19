package patternDesign.observerPattern;

//WeatherData
//
//getTemperature()
//getHumidity()
//getPressure()
//measurementsChanged()

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    /**
     * 通知每一个观察者
     */
    @Override
    public void notifyObserviers() {
        for(Observer observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
    * 当气象站得到更新观测值时，我们通知观察者
    */
    public void measuremenetsChanged(){
        notifyObserviers();
    }

    /**
     * 模拟气象站的天气改变了
     */
    public void setMeasuremenets(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuremenetsChanged();
    }
}
