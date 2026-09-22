package OOPS.BasicPayementSerivceDesign;

public class CreditCard extends Card{
    public CreditCard(String CardNo,String userName) {
        super(CardNo,userName);
    }

    @Override
    public void pay() {
        System.out.println("Making Payement via Credit Card");
    }
}
