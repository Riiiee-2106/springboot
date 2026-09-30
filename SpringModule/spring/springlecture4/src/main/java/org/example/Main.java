package org.example;

import org.example.notification.NotificationService;
import org.example.notification.PopUpService;

public class Main {
    public static void main(String[] args) {

//        object of notification service
        NotificationService notification = new PopUpService();
//        we can also pass FakeEmailService as in unit testing,
//        as OrderService can accept any kind of notification



//        object of class OrderService
//        OrderService order = new OrderService(notification);
//        calling method of orderservice class
//        order.placeOrder();


//        main gets lot of wiring - as of now we are not using springcore - we will discuss it later


//        don’t create your own dependencies, get your dependencies -
//        a class should ask what it needs, and not build everything itself
//        dependency injection - exists individually - we automate it through spring



        OrderService orderSer = new OrderService();
        orderSer.setNotification(notification);
    }
}

// ioc - inversion of control - in notes
