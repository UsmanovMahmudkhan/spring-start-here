package spring.springExercise.SqExrs.UsingAbstractions.PaymentSystem.v2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Config.class);
        var service=container.getBean(PaymentSerive.class);
        service.process();
    }
}
