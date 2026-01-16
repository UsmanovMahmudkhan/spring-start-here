package spring.springExercise.SqExrs.Chapter6.AnnotationInterceptedMethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Config.class);
        var service=container.getBean(Services.class);
        service.delete(new Comment("Helloooo"));
    }
}
