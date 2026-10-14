package StructuralDesignPattern.AdapterPattern.Problem;

public class SendGridService {
    void send(String recipiant,String title,String Content){
        System.out.println("Sending Email via SendGrid"+recipiant);
        System.out.println("Title "+title);
        System.out.println("Content" +Content);
    }
}
