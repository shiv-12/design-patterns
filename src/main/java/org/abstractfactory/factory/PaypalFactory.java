package org.abstractfactory.factory;

import org.abstractfactory.PaymentGateway;
import org.abstractfactory.payment.Payment;
import org.abstractfactory.payment.PaypalPayment;
import org.abstractfactory.refund.PaypalRefund;
import org.abstractfactory.refund.Refund;

public class PaypalFactory implements PaymentGateway {

    @Override
    public Payment createPayment() {
        return new PaypalPayment();
    }

    @Override
    public Refund createRefund() {
        return new PaypalRefund();
    }
}
