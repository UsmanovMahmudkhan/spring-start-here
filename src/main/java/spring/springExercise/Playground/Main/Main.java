package spring.springExercise.Playground.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.springExercise.Playground.Bean.Car;
import spring.springExercise.Playground.Bean.Parrot;
import spring.springExercise.Playground.Bean.ParrotComponent;
import spring.springExercise.Playground.Bean.ParrotCustom;
import spring.springExercise.Playground.Config.ConfigApp;


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


        spring_contex.registerBean("CustomParrot", ParrotCustom.class,()->
        {
            ParrotCustom p=new ParrotCustom();
            p.setName("Custom Parrotttttttttt");
            return p;
        });

        System.out.println(spring_contex.getBean("CustomParrot", ParrotCustom.class).getName());



    }
}
