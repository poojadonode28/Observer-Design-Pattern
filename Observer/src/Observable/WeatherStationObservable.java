package Observable;

import Observer.WeatherObserver;

public interface WeatherStationObservable {

    public void addObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);

    public void notifyObserver();

    public void setTemperature(double temperature);

    public double getTemperature();


}
