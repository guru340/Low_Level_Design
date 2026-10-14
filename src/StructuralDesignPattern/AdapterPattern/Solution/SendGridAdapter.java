package StructuralDesignPattern.AdapterPattern.Solution;

public class SendGridAdapter implements NotificationService {
    public SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }


    @Override
    public void send(String to, String subject, String body) {
//        Adapter Method -> conver parameters and calls to SendGrid Method
        sendGridService.send(to,subject,body);
    }
}
