package observer.push.subscribers;

public class Subscriber2 implements Subscriber{
    // subscriber can also store instance pf publisher
    @Override
    public void publish(String message) {
        System.out.println("2: " + message);
    }
}
