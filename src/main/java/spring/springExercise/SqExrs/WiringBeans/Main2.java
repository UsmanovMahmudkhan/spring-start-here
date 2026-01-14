package spring.springExercise.SqExrs.WiringBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.SqExrs.WiringBeans.Bean.Parrot2;
import spring.springExercise.SqExrs.WiringBeans.Bean.Person2;
import spring.springExercise.SqExrs.WiringBeans.Configuration.Config2;

public class Main2 {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Config2.class);
        var parrot=contex.getBean("parrot2", Parrot2.class);
        var person2=contex.getBean("person2", Person2.class);
        System.out.println(parrot.getName());
        System.out.println(person2.getName()+" "+person2.getParrot().getName());
    }
}
