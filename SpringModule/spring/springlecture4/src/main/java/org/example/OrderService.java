package org.example;

import org.example.notification.NotificationService;

public class OrderService {

//    we can say OrderService is dependent on EmailService
//    EmailService object needs to be created to call method of OrderService

//    EmailService is a dependency of OrderService

//    when we add dependencies in our code - we say we add dependencies,
//    similarly we make object of EmailService in OrderService and call it in method of OrderService


//    this creates tight coupling - it is not loosely coupled
//    OrderService is creating its own dependency

//    OrderService can send different kinds of notification,
//    so if I need to change the notification type I need to always come back to OrderService
//    to create and change its own dependencies

//    it is also creating object of its own dependencies

//    is a concrete class -- EmailService

//    we should moreover work on interfaces more - so let’s say we make Notification as an interface
//    and many notifications - say EmailService, SMSService etc implement it


//    design rule - open close principle of SOLID principle breaks
//    object of class EmailService

//    EmailService notification = new EmailService();


//    now we can pass any notification
//    NotificationService notification = new PopUpService();

//    this may remove half of tight coupling

//    but still breaks design principle as, we are still creating object in this class

//    it should only consist of only OrderService related methods and variables

//    2 design principles break -
//    Single Responsibility
//    Factory work - as creating notification object
//    Open/Closed principle


//    function of OrderService class
//    public void placedOrder(){
//        System.out.println("order placed");
//        calling sendNotification method of class EmailService
//        notification.sendNotification();
//    }


//    one service can depend on other service but we don’t want to create its object in other service
//    OrderService is business logic class - so object creation is not its work

//    let’s create object in say Main as of now
//    and pass it as in constructor of OrderService
//    this is known as injecting dependencies



    //    declare Object of notification service
    NotificationService notification;

//    constructor passed injection dependencies
//    just expecting notification, no need to know which concrete notification is being used
//    so we are injecting the dependency from Main to OrderService

//    there are three types of dependency injection - constructor, setter and field (will discuss later)


    //    setter
    public void setNotification(NotificationService notification){
        this.notification = notification;
    }

//    field injection we will discuss in Spring
//    field injection is possible when the instance variable is not private.
//    but in most cases, instance variables should be private,
//    so direct field injection is not recommended


    OrderService(){

    }


    OrderService(NotificationService notification){
        this.notification = notification;
    }

    //    method of OrderService
    void placeOrder(){
        System.out.println("order placed");
        notification.sendNotification();
    }

//    now both principles get corrected


//    benefit -
//    better unit test, earlier when OrderService was making object of NotificationService - both the services need to work
//    now when we test - we just need to work with OrderService - using fake cases

//    OrderService independent
}
