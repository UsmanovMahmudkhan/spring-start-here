package spring.springExercise.SqExrs.Chapter3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.Playground.Config.ConfigApp;
import spring.springExercise.SqExrs.Chapter3.*;
import spring.springExercise.SqExrs.Chapter3.Bean.Parrot;
import spring.springExercise.SqExrs.Chapter3.Bean.Person;

public class Main {
    public static void main(String[] args) {
        var contex= new AnnotationConfigApplicationContext(ConfigApp.class);
        var parrot=contex.getBean("p", Parrot.class);
        var person=contex.getBean("person", Person.class);
        System.out.println(parrot.getName());
        System.out.println(person.getName()+"  "+person.getP());
    }
}
