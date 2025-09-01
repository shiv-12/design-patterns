package org.abstractfactory.factory;


import org.abstractfactory.PaymentGateway;
import org.abstractfactory.payment.Payment;
import org.abstractfactory.payment.RazorPayPayment;
import org.abstractfactory.refund.RazorPayRefund;
import org.abstractfactory.refund.Refund;

public class RazorPayFactory implements PaymentGateway {

    @Override
    public Payment createPayment() {
        return new RazorPayPayment();
    }

    @Override
    public Refund createRefund() {
        return new RazorPayRefund();
    }
}
