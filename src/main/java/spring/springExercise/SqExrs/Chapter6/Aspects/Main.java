package spring.springExercise.SqExrs.Chapter6.Aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Config.class);
        var service=container.getBean(CommentService.class);
        Comment comment=new Comment("Hello");
        service.publish(comment);
    }
}
