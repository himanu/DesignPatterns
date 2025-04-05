package observer.push;

import observer.push.publisher.Publisher;
import observer.push.publisher.WeatherController;
import observer.push.subscribers.Subscriber1;
import observer.push.subscribers.Subscriber2;

public class WeatherApp {
    public static void start() {
        Publisher weatherController = new WeatherController();
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        weatherController.addSubscriber(subscriber1);
        weatherController.addSubscriber(subscriber2);

        weatherController.somethingHasChanged("Himanshu");

        weatherController.removeSubscriber(subscriber1);

        weatherController.somethingHasChanged("Yadav");
    }
}
