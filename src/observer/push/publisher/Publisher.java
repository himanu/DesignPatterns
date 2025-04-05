package observer.push.publisher;

import observer.push.subscribers.Subscriber;

public interface Publisher {
    void addSubscriber(Subscriber s);

    void removeSubscriber(Subscriber s);

    void somethingHasChanged(String message);
}
