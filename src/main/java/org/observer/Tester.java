package org.observer;

import org.observer.publisher.OrderPublisher;
import org.observer.subscriber.NotificationSubscriber;
import org.observer.subscriber.InventorySubscriber;
import org.observer.subscriber.Subscriber;

public class Tester {
    public static void main(String[] args) {
        OrderPublisher orderPublisher = new OrderPublisher();

        Subscriber inventory = new InventorySubscriber();
        Subscriber notification = new NotificationSubscriber();

        orderPublisher.addSubscriber(inventory);
        orderPublisher.addSubscriber(notification);
        orderPublisher.notifySubscribers(new Order("Order ID : 1001"));

        // Remove notification subscriber
        orderPublisher.removeSubscriber(notification);

        orderPublisher.notifySubscribers(new Order("Order ID : 1002"));
    }
}
