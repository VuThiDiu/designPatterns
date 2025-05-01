package creational.factory_method.model;

public class CashPayment implements Payment {
    @Override
    public void printBill() {
        System.out.println("Pay by cash");
    }
}
