package spring.springExercise.SqExrs.UsingAbstractions.PaymentSystem.v1;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private CreditCardPayment creditCardPayment;

    public void pay(CreditCardPayment creditCardPayment){
        System.out.println("Done payment"+creditCardPayment.getBalance());
    }
}
