package spring.springExercise.SqExrs.Chapter5.Singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(CommentService.class);
        var c1=contex.getBean("Comment1",Comment.class);
        var c2=contex.getBean("Comment1",Comment.class);
        System.out.println(c1==c2);

    }
}
