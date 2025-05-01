package creational.factory_method.factory;

import creational.factory_method.model.DigitalWalletPayment;
import creational.factory_method.model.Payment;

public class DigitalWalletFactory extends PaymentProcessorFactory{
    @Override
    public Payment initPaymentMethod() {
        return new DigitalWalletPayment();
    }
}
