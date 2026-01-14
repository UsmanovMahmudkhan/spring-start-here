package spring.springExercise.SqExrs.BeanScopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Config.class);
        var v1=container.getBean("commentSerice",CommentSerice.class);
        var v2=container.getBean("commentSerice",CommentSerice.class);
        System.out.println(v1==v2);
    }
}
