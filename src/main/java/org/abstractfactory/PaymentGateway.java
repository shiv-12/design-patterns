package org.abstractfactory;

import org.abstractfactory.payment.Payment;
import org.abstractfactory.refund.Refund;

public interface PaymentGateway {

    Payment createPayment();

    Refund createRefund();

}
