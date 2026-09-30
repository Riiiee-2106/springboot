package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //this is configuration class
@ComponentScan("org.example")//we can write it without paxkage name as well , but it willl seach in appconfig parent package only/*pass package name("org.example") ,so all classes will be searched within this package and sub package - having component annotation*/ //which components to manage - component scanned by this class
public class AppConfig {

//    if i dont have component in paymentservice - we will get error , as dependency will not pass and wiring will not happen with orderservice
//    if i dont pass package name by default it will search in same package where appconfig present


    @Bean //we created a object - store it in ioc container and manage it
    public User createUser(){
        return new User("Aditya",28);
    }


    /*
    @Bean
    public CardPayment createCardPayment(){
        return new CardPayment();
    }


    @Bean
    @Primary
    public CardPayment createUpiPayment(){
        return new UpiPayment();
    }


    @Bean
    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }



//    when feild injecting - without autowired annotation in setter
    @Bean
    public OrderService createOrderService(){
        PaymentService payment = createCardPayment();
        OrderService order = new OrderService();
        order.setPaymentService(payment);
        return order;
    }



     @Bean  - autowired in setter
    public OrderService createOrderService(PaymentsService paymentService){
        return new OrderService();
    }

    */


//    what if i make component and bean of same thing  - priority will be given to --->@Bean

}

