package spring.springExercise.Playground.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.Playground.Bean.Comment;
import spring.springExercise.Playground.Config.ConfigApp;

public class Main2 {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ConfigApp.class);
        var getBean=context.getBean(Comment.class);
        System.out.println(getBean.getContex());
    }
}
