package org.example;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//5. create this
//23.@Component

@Component //24.
public class OrderService {
    //7.
    //29.feild injector

    //if this field is private how spring  inject this , when constructor is not working -->using reflection
    @Autowired
    private PaymentService paymentService; //create its bean definition and can inject in private feilds as well


    //30.Orderservice to get created payment service is not required as it may call default constructor , after creation there is field inejctionn

    //8.constructor
   public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //9.
    public void placeOrder(){
        paymentService.pay();
        System.out.println("order placed");

        //33.
        getOrderDetails(); // call method of orderservice here
    }

    //15.
    public void getOrderDetails(){
        System.out.println("here ! your order details");
    }



}
