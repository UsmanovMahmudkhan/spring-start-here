package spring.springExercise.Practice.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.Practice.Bean.Owner2;
import spring.springExercise.Practice.Config.Ex2Config;

public class Ex2Main {
    public static void main(String[] args) {
        var contex= new AnnotationConfigApplicationContext(Ex2Config.class);
        var owner=contex.getBean(Owner2.class);
        System.out.println(owner.getCar2().getName());
    }
}
