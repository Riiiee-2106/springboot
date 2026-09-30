package org.example;

//import org.example.simple.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //2. context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        //11.
        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();


        //19.
//        A a = new A(new B()); -->wrong



        //22.
      //23.  A a = new A(); // create circular dependency - as A B CONSTRUCTOR gets called many times and stack gets full
    }


}