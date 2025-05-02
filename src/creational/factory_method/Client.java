package creational.factory_method;

import creational.factory_method.factory.DigitalWalletFactory;
import creational.factory_method.factory.PaymentProcessorFactory;

public class Client {
    public static void main(String[] args) {
        PaymentProcessorFactory factory = new DigitalWalletFactory();
        factory.pay();
    }
}
