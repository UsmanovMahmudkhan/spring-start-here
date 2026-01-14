package spring.springExercise.SqExrs.UsingAbstractions.PaymentSystem.v2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PayPal implements PaymentMethod
{
    @Override
    public void pay(double price) {
        System.out.println("Paypal method: "+price);
    }
}
