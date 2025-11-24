package spring.springExercise.exe2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex=new AnnotationConfigApplicationContext(Config.class);
        Student s= contex.getBean(Student.class);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
