package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

public class Main {
    public static void main(String[] args) {
//        2.

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


//        7.
        OrderService order1 = context.getBean(OrderService.class);

//        8.
        OrderService order2 = context.getBean(OrderService.class);


        //14.
        OrderService order3 = new OrderService(); //other object ,but spring makes one object - if made singletone


//       9. will two different objects will be made or same?

//        10.
        System.out.println(order1 == order2);

    }
}