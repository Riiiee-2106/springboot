package org.example;


import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component    //orderservice object needs to manage by spring framework this is told by component annotation
public class OrderService {


    private /*final we can make it final -- so dependency dont get changed*/ PaymentService paymentService;
//    paymentservice type variable pay
//    field injection
  /*  @Autowired  //feild injection is not recommended
    private PaymentService paymentService; */


    //setter
   /* @Autowired  //setter get called - when PaymentService obj created, ObjectService obj get created ,then call setter method,then dependency gets linked
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }*/


    //most recommended
//    if present one constructor autowire annotation is optional
    //    constructor passed dependency injection
//    spring pass payment service object to orderservice - using Autowire annotation - to do wiring
   @Autowired  /* inject paymentservice object into OrderService - work of spring ioc*/
    OrderService (@Qualifier("CardPayment") /*same name of qualifier as class name */PaymentService paymentService){  //when Objectservice obj get created and constrcutor called pass payment service obj in it
        this.paymentService = paymentService;

    }
    public void placeOrder(){
//        called method of type payment service
        paymentService.pay();
        System.out.println("order placed");
    }
}

//now when i have multiple component from overriden interface which one will orderservice map to

