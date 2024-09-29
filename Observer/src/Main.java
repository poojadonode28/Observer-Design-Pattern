import Observable.WeatherStationObservable;
import Observable.WeatherStationObservableImpl;
import Observer.EmailWeatherObserver;
import Observer.MobileWeatherObserver;
import Observer.WeatherObserver;

public class Main {
    public static void main(String[] args) {

        WeatherStationObservable weatherStationObservable = new WeatherStationObservableImpl();


        WeatherObserver mobileObserver = new MobileWeatherObserver("9087657",weatherStationObservable);
        WeatherObserver emailObserver = new EmailWeatherObserver("pooja@gmail.com",weatherStationObservable);

        weatherStationObservable.addObserver(mobileObserver);
        weatherStationObservable.addObserver(emailObserver);

        weatherStationObservable.setTemperature(89);
        System.out.println("-------------------------------------------------------------------------------------------------");
        weatherStationObservable.setTemperature(76);




    }
}