package org.abstractfactory.payment;

public class PaypalPayment implements Payment {
    @Override
    public void pay(String orderId, Double amount) {
        System.out.println("PaypalPayment Done! " + " OrderID : " + orderId + " Amount : " + amount);
    }
}
