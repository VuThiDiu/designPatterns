package creational.factory_method.model;

public class DigitalWalletPayment implements Payment{
    @Override
    public void printBill() {
        System.out.println("Payment by digital wallet");
    }
}
