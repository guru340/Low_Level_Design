package StructuralDesignPattern.AdapterPattern.Problem;

public class Client {
    static void main() {
        NotificationService notificationService=new EmailNotificationSerivce();
        notificationService.send("customer@gmail.com","Order Confirmation","your Order has been Received");

    }
}
