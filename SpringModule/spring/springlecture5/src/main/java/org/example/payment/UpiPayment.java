package org.example.payment;

public class UpiPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("paying via upi");
    }
}
