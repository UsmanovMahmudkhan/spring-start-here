package spring.springExercise.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.Bean.Car;
import spring.springExercise.Bean.Parrot;
import spring.springExercise.Bean.ParrotComponent;
import spring.springExercise.Config.ConfigApp;

public class Main {
    public static void main(String[] args) {
        var spring_contex= new AnnotationConfigApplicationContext(ConfigApp.class);

        var parrot= spring_contex.getBean("parrot",Parrot.class);

        System.out.println(parrot.getName());

        var infoP=spring_contex.getType("parrot");
        System.out.println(infoP);

        var car= spring_contex.getBean(Car.class);
        System.out.println(car.getName()+" "+car.getYear());

        var string_values=spring_contex.getBean(String.class);
        System.out.println(string_values);

        var age=spring_contex.getBean(Integer.class);
        System.out.println(age);

        var parrot2=spring_contex.getBean("secondParrot",Parrot.class);
        System.out.println(parrot2.getName());

        var component=spring_contex.getBean(ParrotComponent.class);
        System.out.println(component.getName());

    }
}
