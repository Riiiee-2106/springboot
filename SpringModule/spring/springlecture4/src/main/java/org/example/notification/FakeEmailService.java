package org.example.notification;

public class FakeEmailService implements NotificationService {

public void sendNotification(){
    System.out.println("dummy email send");
}
}
