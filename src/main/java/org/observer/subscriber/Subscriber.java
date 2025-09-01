package org.observer.subscriber;

import org.observer.Order;

public interface Subscriber {
    void update(Order order);
}
