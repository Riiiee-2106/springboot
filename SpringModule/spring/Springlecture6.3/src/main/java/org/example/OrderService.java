package org.example;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Lazy
@Component
public class OrderService {

    PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService){ //CRAETE ORDERSERVICE BUT NOT ITS DEPENDENCY
//      put a proxy dependency in OrderService

        this.paymentService = paymentService;
//        System.out.println("order service created");
    }


    public void placeOrder(){
        paymentService.pay();
        System.out.println("placed order");

    }
}
