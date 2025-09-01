package org.abstractfactory.refund;

public class RazorPayRefund implements Refund {
    @Override
    public void refund(String orderId, Double amount) {
        System.out.println("RazorPayRefund Done! " + " OrderID : " + orderId + " Amount : " + amount);
    }
}
