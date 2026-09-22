package OOPS.BasicPayementSerivceDesign;

public class UPI implements PayMentMethod{
    public String getUPIid() {
        return UPIid;
    }

    public void setUPIid(String UPIid) {
        this.UPIid = UPIid;
    }

    public UPI(String UPIid) {
        this.UPIid = UPIid;
    }

    private String UPIid;

    @Override
    public void pay() {
        System.out.println("Making Payement  via UPI"+UPIid);
    }
}
