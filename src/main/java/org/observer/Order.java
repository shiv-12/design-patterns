package org.observer;

public class Order {
    private final String orderDetails;

    public Order(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderDetails() {
        return orderDetails;
    }
}
