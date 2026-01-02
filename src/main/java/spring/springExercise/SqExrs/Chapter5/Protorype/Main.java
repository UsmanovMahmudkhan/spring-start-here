package spring.springExercise.SqExrs.Chapter5.Protorype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Config.class);
        var v1=contex.getBean(Comment.class);
        var v2=contex.getBean(Comment.class);

        System.out.println(v1==v2);
    }
}
