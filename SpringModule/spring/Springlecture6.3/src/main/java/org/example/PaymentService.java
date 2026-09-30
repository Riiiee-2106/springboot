package org.example;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


//@Lazy
@Component
@Lazy
public class PaymentService {

    OrderService orderService;

    public PaymentService(OrderService orderService){
//        System.out.println("payment service created");
        this.orderService = orderService;
    }


    public void pay(){
        System.out.println("payment successful");

    }
}
