package spring.springExercise.SqExrs.WiringBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springExercise.SqExrs.WiringBeans.Bean.Parrot;
import spring.springExercise.SqExrs.WiringBeans.Configuration.Config5;

public class Main4 {
    public static void main(String[] args) {
//        var main_contex= new AnnotationConfigApplicationContext(Config4.class);
//        var person4=main_contex.getBean("personbek", Person4.class);
//        System.out.println(person4.getName());
//        System.out.println(person4.parrot4);


//        var contex=new AnnotationConfigApplicationContext(Config4.class);
//        var person5=contex.getBean("person5", Person5.class);
//        System.out.println(person5.getName());
//        System.out.println(person5.p5.getName());

        var contex=new AnnotationConfigApplicationContext(Config5.class);
        Parrot p=contex.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
