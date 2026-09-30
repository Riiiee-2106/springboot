package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//6.create this
//24. @Component

@Component //25.
public class PaymentService {


    //    12. introducing circular dependency
    //28.feild injector

    @Autowired
    OrderService orderService;
    //31.PaymentService to get created order service is not required as it may call default constructor , after creation there is field inejctionn

    //    13.
    public PaymentService(OrderService orderService) {
        this.orderService = orderService;
    }

    //10.
    public void pay() {
        System.out.println("payment done!");


     /*   //14.
        orderService.getOrderDetails();   not the work of pay method - not its responisibilty 32.*/
    }
}


//    26. framework dont know whose object to make first, if made payment object  , it stos and make orderservice obj , and then it again makes payment then framework got to know it was already making oayment object -->gives bean already making exception

//27. wether do feild or setter injector rather than construtcor}
