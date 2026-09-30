package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        by default our beans are eager
//        we can make them lazy


        OrderService order = context.getBean(OrderService.class);  //when we call the ioc container gets up
//        System.out.println("payment service not started yet");

        order.placeOrder();
     }
}