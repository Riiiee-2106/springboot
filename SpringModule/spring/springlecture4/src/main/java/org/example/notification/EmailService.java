package org.example.notification;

public class EmailService implements  NotificationService{

@Override
//    method of emailService class
    public void sendNotification(){
        System.out.println("email notification send");
    }
}
