package Observable;

import Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements WeatherStationObservable{

    public List<WeatherObserver> weatherObserverList = new ArrayList<>();
    double temperature = 28;

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObserverList.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObserverList.remove(weatherObserver);
    }

    @Override
    public void notifyObserver() {
        for(WeatherObserver weatherObserver: weatherObserverList){
            weatherObserver.update();
        }
    }

    @Override
    public void setTemperature(double temperature) {
           if(this.temperature!=temperature){
               this.temperature = temperature;
               notifyObserver();
           }
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }


}
