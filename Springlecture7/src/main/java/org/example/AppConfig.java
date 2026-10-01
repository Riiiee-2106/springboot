package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {  //it is also a component - so we dont need to make its object

//    @Bean
//    public void OrderServiceBean(){
//
//    }


//    public void demo(){
//        System.out.println("demo");
//    }


//    @Bean(initMethod =  "start",destroyMethod =  "stop")
//    public CartService getCartBean(){
//        return new CartService();
//    }

}
