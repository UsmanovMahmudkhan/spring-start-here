package spring.springExercise.SqExrs.SpringAOC.NO_Aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Config.class);
        var service=contex.getBean(Service.class);
        Comment comment=new Comment("Hello",129);
        service.publish(comment);
    }
}
