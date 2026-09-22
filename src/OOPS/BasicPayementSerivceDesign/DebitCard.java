package OOPS.BasicPayementSerivceDesign;

public class DebitCard extends Card {
    public DebitCard(String CardNo,String userName) {
        super(CardNo,userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payement Via Debit card");
    }
}
