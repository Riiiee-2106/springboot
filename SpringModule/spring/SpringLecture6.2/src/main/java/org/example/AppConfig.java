package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



//3.
@ComponentScan
@Configuration
public class AppConfig {


    //15.
    @Bean
    public OrderService getOrder(){
        return new OrderService();
    }


    //16.two different bean defn  - create two different object - (even in singleton)- one object per bean defn
    @Bean
    public OrderService getOrder2(){
        return  new OrderService();
    }





}
