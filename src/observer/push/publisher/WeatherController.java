package observer.push.publisher;

import observer.push.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherController implements Publisher {
    List<Subscriber> subscribers;

    public WeatherController() {
        this.subscribers = new ArrayList<>();
    }
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
        System.out.println("Added");
    }

    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
        System.out.println("Removed ");
    }

    public void somethingHasChanged(String message) {
        subscribers.forEach((subscriber -> subscriber.publish(message)));
    }

}
