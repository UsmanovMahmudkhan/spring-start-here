package spring.springExercise.SqExrs.Chapter5.Eager_Instantiation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Config.class);
    }
}
