package spring.springExercise.SqExrs.Chapter4.PaymentSystem.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.Chapter4.PaymentSystem.v1.CreditCardPayment;

@Service
public class PaymentSerive {
    @Autowired
    private PaymentMethod pay;

    public void process(){
        pay.pay(12);
    }
}
