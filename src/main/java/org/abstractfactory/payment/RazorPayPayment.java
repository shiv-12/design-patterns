package org.abstractfactory.payment;

public class RazorPayPayment implements Payment {
    @Override
    public void pay(String orderId, Double amount) {
        System.out.println("RazorPayPayment Done! " + " OrderID : " + orderId + " Amount : " + amount);
    }
}
