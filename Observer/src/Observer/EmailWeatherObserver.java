package Observer;

import Observable.WeatherStationObservable;

public class EmailWeatherObserver implements WeatherObserver{
    String email;
    WeatherStationObservable weatherStationObservable;

    public EmailWeatherObserver(String email, WeatherStationObservable weatherStationObservable){
        this.email = email;
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        double temperature = weatherStationObservable.getTemperature();
        sendEmail(email,temperature);
    }
    public void sendEmail(String email,Double temperature){
        System.out.println("Email Notification to "+email+": The temperature has been set to "+ temperature);

    }
}
