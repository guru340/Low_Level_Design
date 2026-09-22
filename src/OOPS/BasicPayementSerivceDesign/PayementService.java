package OOPS.BasicPayementSerivceDesign;

import java.util.HashMap;

public class PayementService {

    HashMap<String,PayMentMethod> payMentMethod;

    PayementService(){
        payMentMethod=new HashMap<>();
    }
    public void addPayementMethod(String name,PayMentMethod pm){
        payMentMethod.put(name,pm);
    }
    public void makePayementMethod(String name){
        PayMentMethod payMentMethod1=payMentMethod.get(name);
        payMentMethod1.pay();
    }
}
