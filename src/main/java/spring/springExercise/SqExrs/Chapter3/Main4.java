package spring.springExercise.SqExrs.Chapter3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.SqExrs.Chapter3.Bean.Person4;
import spring.springExercise.SqExrs.Chapter3.Configuration.Config4;

public class Main4 {
    public static void main(String[] args) {
        var main_contex= new AnnotationConfigApplicationContext(Config4.class);
        var person4=main_contex.getBean("personbek", Person4.class);
        System.out.println(person4.getName());
        System.out.println(person4.parrot4);
    }
}
