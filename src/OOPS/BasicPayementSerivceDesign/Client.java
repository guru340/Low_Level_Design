package OOPS.BasicPayementSerivceDesign;

public class Client {
    public static void main(String[] args) {
        PayementService ps = new PayementService();
        ps.addPayementMethod("PrateekDebitCard",new DebitCard("1234","Prateek Narang"));
        ps.addPayementMethod("PrateekCreditCard",new CreditCard("5678","Prateek Narang"));
        ps.addPayementMethod("PrateekUPI",new UPI("prateek27"));
        ps.addPayementMethod("PrateekWallet",new Wallets());
        ps.makePayementMethod("PrateekUPI");
        ps.makePayementMethod("PrateekDebitCard");
        ps.makePayementMethod("PrateekWallet");
    }
}
