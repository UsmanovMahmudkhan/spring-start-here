package spring.springExercise.SqExrs.UsingAbstractions.NotificationBasic.v2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Config.class);
        var getService=contex.getBean(NotificatoinService.class);
        getService.start();
    }
}
