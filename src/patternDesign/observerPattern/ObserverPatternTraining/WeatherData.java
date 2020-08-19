package patternDesign.observerPattern.ObserverPatternTraining;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> obs;
    private float temp;


    public WeatherData(){
        this.obs = new ArrayList<>();
    }


    @Override
    public void registerObersver(Observer o) {
        this.obs.add(o);

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifiyObserver() {
        for(Observer o : this.obs){
            o.update(this.temp);
        }

    }

    public void setMeasurement(float temp){
        this.temp = temp;
        this.notifiyObserver();
    }
}
