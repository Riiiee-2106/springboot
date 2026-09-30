package org.example.payment;


import org.springframework.stereotype.Component;

@Component
public class CashPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("paying via cash");
    }
}
