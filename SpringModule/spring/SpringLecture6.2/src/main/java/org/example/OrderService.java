package org.example;

//stateless class

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//4.
//@Component
@Scope("singleton")
public class OrderService {


//    6.
    public OrderService (){
        System.out.println("order service created");
    }


//5.
    public void placeOrder(){
        System.out.println("order placed");
    }
}
