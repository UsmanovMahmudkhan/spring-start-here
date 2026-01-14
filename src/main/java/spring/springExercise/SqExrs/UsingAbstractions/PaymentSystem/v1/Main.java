package spring.springExercise.SqExrs.UsingAbstractions.PaymentSystem.v1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Config.class);
        var credit=new CreditCardPayment(5000);
        var payment=container.getBean(PaymentService.class);
        payment.pay(credit);
    }
}
