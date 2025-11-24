package spring.springExercise.exe1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Product p=contex.getBean(Product.class);
        String s=contex.getBean(String.class);
        Integer i=contex.getBean(Integer.class);
        System.out.println(p.name);
        System.out.println(s);
        System.out.println(i);

        Car car=contex.getBean("lambo",Car.class);

        System.out.println(car.getName());
        System.out.println(car.getName());

        Car myCar=contex.getBean("car4",Car.class);
        System.out.println(myCar.getYear());
    }
}
