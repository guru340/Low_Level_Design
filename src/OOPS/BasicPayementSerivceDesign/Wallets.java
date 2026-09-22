package OOPS.BasicPayementSerivceDesign;

public class Wallets implements PayMentMethod{
    @Override
    public void pay() {
        System.out.println("Making Payement via wallet");
    }
}
