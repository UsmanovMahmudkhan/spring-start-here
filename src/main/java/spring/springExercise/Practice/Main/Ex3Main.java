package spring.springExercise.Practice.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.Practice.Bean.Car3;
import spring.springExercise.Practice.Config.Ex3Config;

public class Ex3Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Ex3Config.class);
        contex.registerBean("Car", Car3.class,()->{
            Car3 car=new Car3("Mersedes");
            return car;
        });

        System.out.println(contex.getBean(Car3.class).getName());
    }
}
