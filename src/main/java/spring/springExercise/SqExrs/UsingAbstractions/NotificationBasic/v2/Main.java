package spring.springExercise.SqExrs.UsingAbstractions.NotificationBasic.v2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var getService = context.getBean(NotificatoinService.class);
        getService.start();
    }
}
