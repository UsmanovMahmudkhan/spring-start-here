package spring.springExercise.SqExrs.UsingAbstractions.PaymentSystem.v2;

import org.springframework.stereotype.Component;

@Component
public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double price) {
        System.out.println("Credit Payment: "+price);
    }
}
