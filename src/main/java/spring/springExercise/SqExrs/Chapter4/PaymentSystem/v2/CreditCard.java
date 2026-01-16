package spring.springExercise.SqExrs.Chapter4.PaymentSystem.v2;

import org.springframework.stereotype.Component;
import spring.springExercise.SqExrs.Chapter4.PaymentSystem.v1.PaymentService;

@Component
public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double price) {
        System.out.println("Credit Payment: "+price);
    }
}
