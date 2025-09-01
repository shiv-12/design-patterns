package org.observer.subscriber;

import org.observer.Order;

public class InventorySubscriber implements Subscriber {


    @Override
    public void update(Order order) {
        System.out.println("InventorySubscriber called : " + order.getOrderDetails());
    }
}
