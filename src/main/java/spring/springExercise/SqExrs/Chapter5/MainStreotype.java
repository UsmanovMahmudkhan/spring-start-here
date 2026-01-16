package spring.springExercise.SqExrs.Chapter5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainStreotype {
    public static void main(String[] args) {
        var container=new AnnotationConfigApplicationContext(Configuration.class);
        var userService=container.getBean(UserService.class);
        var commentService=container.getBean(CommentServicee.class);
        System.out.println(userService.getRepository()== commentService.repository());
    }
}
