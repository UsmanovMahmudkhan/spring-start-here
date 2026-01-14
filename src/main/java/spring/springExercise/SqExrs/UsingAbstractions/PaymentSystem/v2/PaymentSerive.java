package spring.springExercise.SqExrs.UsingAbstractions.PaymentSystem.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentSerive {
    @Autowired
    private PaymentMethod pay;

    public void process(){
        pay.pay(12);
    }
}
