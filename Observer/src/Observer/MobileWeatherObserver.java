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
        sendMessage(number);
    }

    public void sendMessage(String number){
        System.out.println("Message sent successfully to user: "+number);

    }
}
