package spring.springExercise.Practice.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.Practice.Bean.Car;
import spring.springExercise.Practice.Bean.Owner;
import spring.springExercise.Practice.Config.Ex1Config;

public class Ex1Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Ex1Config.class);
        var car=contex.getBean(Car.class);
        var owner=contex.getBean(Owner.class);

        System.out.println(car);
        System.out.println(owner);
    }
}
