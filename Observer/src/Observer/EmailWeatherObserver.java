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
        sendEmail(email);
    }
    public void sendEmail(String email){
        System.out.println("Email sent successfully to user: "+email);
    }
}
