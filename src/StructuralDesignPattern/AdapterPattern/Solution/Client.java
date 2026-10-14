package StructuralDesignPattern.AdapterPattern.Solution;

public class Client {
    static void main() {
        NotificationService notificationService=new EmailNotificationSerivce();
        notificationService.send("customer@gmail.com","Order Confirmation","your Order has been Received");


        NotificationService notificationService1=new SendGridAdapter(new SendGridService());
        notificationService1.send("customer@gmail.com","Order Confirmation","your Order has been Received");

    }
}
