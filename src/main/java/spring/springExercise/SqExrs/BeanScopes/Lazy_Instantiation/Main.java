package spring.springExercise.SqExrs.BeanScopes.Lazy_Instantiation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Config.class);
        var getComment=container.getBean(Comment.class);
    }
}
