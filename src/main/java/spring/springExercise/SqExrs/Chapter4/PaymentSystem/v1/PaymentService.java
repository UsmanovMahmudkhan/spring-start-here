package spring.springExercise.SqExrs.Chapter4.PaymentSystem.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PaymentService {

    private CreditCardPayment creditCardPayment;

    public void pay(CreditCardPayment creditCardPayment){
        System.out.println("Done payment"+creditCardPayment.getBalance());
    }
}
