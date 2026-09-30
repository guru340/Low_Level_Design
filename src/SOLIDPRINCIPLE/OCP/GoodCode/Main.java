package SOLIDPRINCIPLE.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PayementProcessor processor = new PayementProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod upi = new UPI();

        processor.processPayment(creditCard,100);
        processor.processPayment(upi,120);
    }
}