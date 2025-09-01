package org.abstractfactory.factory;

import org.abstractfactory.PaymentGateway;
import org.abstractfactory.PaymentGatewayType;

public class PaymentGatewayFactory {

    private PaymentGatewayFactory() {

    }

    public static PaymentGateway getPaymentGateway(PaymentGatewayType type) {
        switch (type) {
            case PAYPAL:
                return new PaypalFactory();
            case RAZORPAY:
                return new RazorPayFactory();
            default:
                throw new IllegalArgumentException("Invalid Gateway Type!");

        }
    }
}
