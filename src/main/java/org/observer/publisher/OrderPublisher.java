package org.observer.publisher;

import org.observer.Order;
import org.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class OrderPublisher {

    private final List<Subscriber> subscriberList;

    public OrderPublisher() {
        this.subscriberList = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        this.subscriberList.remove(subscriber);
    }

    public void notifySubscribers(Order order) {
        for (Subscriber subscriber : subscriberList)
            subscriber.update(order);
    }
}
