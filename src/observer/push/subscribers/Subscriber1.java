package observer.push.subscribers;

public class Subscriber1 implements Subscriber {

    @Override
    public void publish(String message) {
        System.out.println("1: " + message);
    }
}
