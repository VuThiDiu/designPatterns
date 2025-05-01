package creational.factory_method.factory;

import creational.factory_method.model.CashPayment;
import creational.factory_method.model.Payment;

public class CashPaymentFactory extends PaymentProcessorFactory {
    @Override
    public Payment initPaymentMethod() {
        return new CashPayment();
    }
}
