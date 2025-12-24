package spring.springExercise.SqExrs.Chapter3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.Playground.Config.ConfigApp;
import spring.springExercise.SqExrs.Chapter3.*;
import spring.springExercise.SqExrs.Chapter3.Bean.Parrot;
import spring.springExercise.SqExrs.Chapter3.Bean.Person;
import spring.springExercise.SqExrs.Chapter3.Bean.Person3;
import spring.springExercise.SqExrs.Chapter3.Configuration.Config;
import spring.springExercise.SqExrs.Chapter3.Configuration.Config3;

public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(Config.class);
        var parrot=context.getBean("p", Parrot.class);
        var person=context.getBean("person", Person.class);
        System.out.println(parrot.getName());
        System.out.println(person.getName()+"  "+person.getP());

        var contex3=new AnnotationConfigApplicationContext(Config3.class);
        var person3=contex3.getBean("person", Person3.class);
        System.out.println(person3.getName());
        System.out.println(person3.getParrot3().getName());
    }
}
