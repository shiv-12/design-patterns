package org.abstractfactory;

import org.abstractfactory.factory.PaymentGatewayFactory;
import org.abstractfactory.payment.Payment;
import org.abstractfactory.refund.Refund;

public class Tester {
    public static void main(String[] args) {

        PaymentGateway paymentGateway = PaymentGatewayFactory.getPaymentGateway(PaymentGatewayType.PAYPAL);

        Payment payment = paymentGateway.createPayment();
        payment.pay("orderID:101", 300.0);   // Order ID, Amount

        Refund refund = paymentGateway.createRefund();
        refund.refund("orderID:101", 200.0);
    }
}

/*


If we have a group of products creation then we can make use of Abstract Factory Design Pattern

Requirements :

Your system needs to integrate with multiple payment providers (like Razorpay, PayPal, Stripe, etc.).

Each payment provider supports two related operations:
1. Payment – process the actual transaction.
2. Refund – initiate a refund for a past transaction.

Your goal is to design a system where:
1. The client code can easily switch between different payment providers (Razorpay, PayPal, Stripe)
without changing business logic.
2. The factory should produce both payment and refund objects for the selected provider.
3. Adding a new payment provider in the future should be easy (no massive changes in existing code).

*/