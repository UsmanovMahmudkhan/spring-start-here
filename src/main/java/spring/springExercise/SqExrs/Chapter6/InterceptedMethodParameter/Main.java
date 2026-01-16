package spring.springExercise.SqExrs.Chapter6.InterceptedMethodParameter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Config.class);
        var service=container.getBean(Service.class);
        Comment comment=new Comment("Hello");
        String value=service.publish(comment);
        Logger.getLogger(Main.class.getName()).info("value: "+value);
    }
}
