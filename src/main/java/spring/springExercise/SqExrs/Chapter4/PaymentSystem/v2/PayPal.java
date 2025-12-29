package spring.springExercise.SqExrs.Chapter4.PaymentSystem.v2;

import org.springframework.stereotype.Component;

@Component
public class PayPal implements PaymentMethod
{
    @Override
    public void pay(double price) {
        System.out.println("Paypal method: "+price);
    }
}
