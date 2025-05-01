package creational.factory_method.factory;

import creational.factory_method.model.Payment;

public abstract class PaymentProcessorFactory {
    public abstract Payment initPaymentMethod();
    public void pay(){
        Payment payment = initPaymentMethod();
        payment.printBill();
    }

}
