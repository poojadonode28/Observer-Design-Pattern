package Observer;

import Observable.WeatherStationObservable;

public class MobileWeatherObserver implements WeatherObserver{

    String number;
    WeatherStationObservable weatherStationObservable;

    public MobileWeatherObserver(String number,WeatherStationObservable weatherStationObservable){
        this.number = number;
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        double temperature = weatherStationObservable.getTemperature();
        sendMessage(number,temperature);
    }

    public void sendMessage(String number,Double temperature){
        System.out.println("Mobile Notification to "+number+": The temperature has been set to "+ temperature);

    }
}
