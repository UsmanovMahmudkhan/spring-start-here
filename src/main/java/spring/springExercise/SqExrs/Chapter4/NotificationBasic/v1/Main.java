package spring.springExercise.SqExrs.Chapter4.NotificationBasic.v1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Config.class);
        var email=contex.getBean(Email.class);
        email.send();
    }
}
