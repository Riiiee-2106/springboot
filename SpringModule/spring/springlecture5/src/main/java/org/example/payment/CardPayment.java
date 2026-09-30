package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CardPayment")/*give priority to cardPaymnet bean when injecting */
public class CardPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("paying via card");
    }
}
