package OOPS.BasicPayementSerivceDesign;

abstract class Card implements PayMentMethod{
    private String CardNO;
    private String UserName;

    public Card(String cardNO, String userName) {
        CardNO = cardNO;
        UserName = userName;
    }

    public String getCardNO() {
        return CardNO;
    }

    public void setCardNO(String cardNO) {
        CardNO = cardNO;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
