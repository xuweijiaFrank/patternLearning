package patternDesign.observerPattern.training;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers;
    Integer temp;

    WeatherData(){
        observers = new ArrayList<>();
    }

    public void tempChanged(Integer temp){
        this.temp = temp;
        this.notification();
    }

    @Override
    public void notification() {
        for(Observer o: this.observers){
            o.update(this.temp);
        }

    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

}
