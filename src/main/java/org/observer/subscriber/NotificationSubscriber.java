package org.observer.subscriber;

import org.observer.Order;

public class NotificationSubscriber implements Subscriber {

    @Override
    public void update(Order order) {
        System.out.println("NotificationSubscriber called : " + order.getOrderDetails());

    }
}
