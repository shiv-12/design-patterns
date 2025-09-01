package org.abstractfactory.refund;

public class PaypalRefund implements Refund {
    @Override
    public void refund(String orderId, Double amount) {
        System.out.println("PaypalRefund Done! " + " OrderID : " + orderId + " Amount : " + amount);
    }
}
