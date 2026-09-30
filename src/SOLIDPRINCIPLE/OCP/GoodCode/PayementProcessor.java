package SOLIDPRINCIPLE.OCP.GoodCode;

public class PayementProcessor {
    public void processPayment(PaymentMethod paymentMethod,double amount){
        paymentMethod.pay(amount);
    }
}
