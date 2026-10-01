package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//    we passed metadata of AppConfig - through reflection api's



       // OrderService order = context.getBean(OrderService.class);

//        AppConfig config = context.getBean(AppConfig.class);
//        config.demo();

//        UserService userService = context.getBean(UserService.class);
//        userService.setBeanName("userBean2"); //we can just see console output as userBean2 but the name is still the class name or whatever passed in component
//




        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));


context.close();  //preent in child interfcae


    }
}