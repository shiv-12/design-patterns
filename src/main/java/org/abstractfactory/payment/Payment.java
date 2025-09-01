package org.abstractfactory.payment;

public interface Payment {
    void pay(String orderID, Double amount);
}
