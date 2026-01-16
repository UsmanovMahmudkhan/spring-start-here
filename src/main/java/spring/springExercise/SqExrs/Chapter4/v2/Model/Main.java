package spring.springExercise.SqExrs.Chapter4.v2.Model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.SqExrs.Chapter4.v2.Config.ProjectCOnfig;
import spring.springExercise.SqExrs.Chapter4.v2.Service.CommentService;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(ProjectCOnfig.class);
        var getBean=contex.getBean(CommentService.class);
        getBean.publish(new Comment("Hello","Alex"));
    }
}
